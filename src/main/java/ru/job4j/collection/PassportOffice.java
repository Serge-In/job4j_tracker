package ru.job4j.collection;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * 2023-12-26
 * 1. Паспорт и жители [#212656]
 * Модель данных - Citizen
 * Сервис должен проверять, что гражданина с таким паспортом еще нет, а так же возможность получить информацию о гражданине по его паспорту.
 * Метод add вернет true, если пользователя еще нет в HashMap. Если он уже есть, то вернуть false
 * Для решения этой задачи Вам потребуются методы Map.containsKey(key) и Map.get(key).
 * Метод containsKey() проверяет содержит ли map переданный ключ.
 */
public class PassportOffice {
    private Map<String, Citizen> citizens = new HashMap<>();

    public boolean add(Citizen citizen) {
        boolean result = false;
        if (!citizens.containsKey(citizen.getPassport())) {
            citizens.put(citizen.getPassport(), citizen);
            result = true;
        }
        return result;
    }

    public Citizen get(String passport) {
        return citizens.get(passport);
    }
}
