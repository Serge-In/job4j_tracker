package ru.job4j.stream.map;

import java.util.List;
import java.util.Map;

/**
 * 2024-03-24
 * 17. Путь от циклов к Stream API. [#24260]
 * переделать реализацию так, чтобы в ней не использовались циклы. Используйте для реализации Stream API.
 */
public class BankService {
    private final Map<User, List<Account>> users;

    public BankService(Map<User, List<Account>> users) {
        this.users = users;
    }

    public User findByPassport(String passport) {
        for (User user : users.keySet()) {
            if (user.passport().equals(passport)) {
                return user;
            }
        }
        return null;
    }

    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> accounts = users.get(user);
            for (Account account : accounts) {
                if (account.requisite().equals(requisite)) {
                    return account;
                }
            }
        }
        return null;
    }
}
