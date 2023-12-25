package ru.job4j.collection;

import java.util.HashSet;
import java.util.List;

/**
 * 2023-12-25
 * 3. Модели данных и HashSet. [#218530]
 *  представим, что в банковской системе (class Account), есть рассылка (NotifyAccount). Наш клиент подписался на разные рассылки.
 *  Может быть такая ситуация, что клиент должен получить сразу несколько писем.
 *  Чтобы система не спамила нашего клиента, там нужно оставить только уникальных клиентов для отправки.
 *  То есть если клиент должен получить уведомление по разным подпискам, мы будем упаковывать их в одно письмо.
 *  1. Реализуйте метод ru.job4j.collection.NotifyAccount.sent.
 *  Решение этой задачи сводится к преобразованию List в Set. HashSet устранит дубликаты клиентов банка самостоятельно.
 */

public class NotifyAccount {
    public static HashSet<Account> sent(List<Account> accounts) {
        return new HashSet<>(accounts);
    }
}