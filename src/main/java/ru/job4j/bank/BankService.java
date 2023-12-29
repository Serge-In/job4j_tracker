package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 2023-12-26
 * 3. Банковские переводы [#10038]
 * метод Map.putIfAbsent
 * позволяет проверить, если ли такой ключ в карте или нет и если его нет, то произвести вставку данных.
 * Этот метод позволяет уменьшить количество кода
 * метод List.contains
 * позволяет проверить содержит ли наш список элемент, который мы передаем в качестве аргумента в этот метод.
 * При этом метод возвращает true, когда в списке такой элемент присутствует, а иначе метод вернет false.
 * Для корректной работы этого метода для модели данных, объекты которой хранятся в этом списке должны быть переопределены методы equals() и hashcode().
 */

public class BankService {
    /**
     * @field
     * Map<User, List<Account>> users
     * содержит всех пользователей системы с привязанными к ним счетами
     */
    private final Map<User, List<Account>> users = new HashMap<>();

    /**
     *  @method void addUser(
     *  User user)
     *  добавить пользователя в систему.
     *  Чтобы добавить пользователя в систему можно использовать метод Map.put.
     *  Этот метод принимает один параметр: пользователя, т.е. объект класса User.
     *  По умолчанию к этому user нужно добавить пустой список - new ArrayList<Account>()
     *  В методе должна быть проверка, что такого пользователя еще нет в системе
     *  Если он есть, то нового добавлять не надо.
     */
    public void addUser(User user) {
        List<Account> userAccounts = new ArrayList<>();
        users.putIfAbsent(user, userAccounts);
    }

    /**
     * @method void deleteUser(
     * String passport)
     * позволит удалить пользователя из системы.
     * Согласно переопределенному equals и hashcode у User, их сравнение происходит по полю passport.
     * Для удаления Вам понадобится метод remove по ключу (вернет объект)
     */

    public void deleteUser(String passport) {
        users.remove(new User(passport, ""));
    }

    /**
     * @method void addAccount(
     * String passport,
     * Account account)
     * должен добавить новый счет к пользователю
     * Первоначально пользователя нужно найти по паспорту. Для этого нужно использовать метод findByPassport.
     * После этого мы получим список всех счетов пользователя и добавим новый счет к ним.
     * В этом методе должна быть проверка, что такого счета у пользователя еще нет.
     */
    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> userAccounts = users.get(user);
            if (!userAccounts.contains(account)) {
                userAccounts.add(account);
                users.put(user, userAccounts);
            }
        }
    }

    /**
     * @method User findByPassport(
     * String passport)
     * ищет пользователя по номеру паспорта
     * Здесь нужно использовать перебор всех элементов через цикл for-earch и метод Map.keySet.
     * Если ничего не найдено - метод должен вернуть null
     */
    public User findByPassport(String passport) {
        for (User user : users.keySet()) {
            if (user.getPassport().equals(passport)) {
                return user;
            }
        }
        return null;
    }

    /**
     * @method Account findByRequisite(
     * String passport,
     * String requisite)
     * ищет счет пользователя по реквизитам
     * 1 Сначала нужно найти пользователя по паспорту с помощью метода findByPassport.
     * 2 Потом получить список счетов этого пользователя и в нем найти нужный счет.
     * Поскольку метод findByPassport может вернуть null, то прежде чем получать список аккаунтов,
     * требуется проверить что метод findByPassport вернул отличное от null значение.
     */
    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> userAccounts = users.get(user);
            for (Account userAccount : userAccounts) {
                if (userAccount.getRequisite().equals(requisite)) {
                    return userAccount;
                }
            }
        }
        return null;
    }

    /**
     * @method transferMoney(
     * String sourcePassport,
     * String sourceRequisite,
     * String destinationPassport,
     * String destinationRequisite,
     * double amount)
     * Предназначен для перечисления денег с одного счёта на другой счёт
     * Если счёт не найден или не хватает денег на счёте sourcePassport (с которого переводят), то метод должен вернуть false.
     */
    public boolean transferMoney(String sourcePassport, String sourceRequisite,
                                 String destinationPassport, String destinationRequisite,
                                 double amount) {
        Account sourceAccount = findByRequisite(sourcePassport, sourceRequisite);
        Account destinationAccount = findByRequisite(destinationPassport, destinationRequisite);
        if (sourceAccount != null && destinationAccount != null) {

            double sourceBalance = sourceAccount.getBalance();
            if (sourceBalance >= amount) {
                sourceAccount.setBalance(sourceBalance - amount);
                destinationAccount.setBalance(destinationAccount.getBalance() + amount);
                return true;
            }
        }
        return false;
    }

    /**
     * @method List<Account> getAccounts(
     * User user)
     */
    public List<Account> getAccounts(User user) {
        return users.get(user);
    }
}