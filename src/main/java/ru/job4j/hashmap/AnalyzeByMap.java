package ru.job4j.hashmap;

import java.util.*;

/**
 * 2023-12-29
 * 4. Аттестация [#504878]
 * Класс AnalyzeByMap получает статистику по аттестатам
 */

public class AnalyzeByMap {
    /**
     * Метод averageScore() - вычисляет общий средний балл
     */
    public static double averageScore(List<Pupil> pupils) {
        double res = 0D;
        double sumScore = 0D;
        for (Label label : averageScoreByPupil(pupils)) {
            sumScore += label.score();
            res = sumScore / pupils.size();
        }
        return res;
    }

    /**
     * Метод averageScoreByPupil() - вычисляет средний балл по каждому ученику.
     * То есть берем одного ученика и считаем все его баллы за все предметы и делим на количество предметов.
     * Возвращает список из объекта Label (имя ученика и средний балл).
     */
    public static List<Label> averageScoreByPupil(List<Pupil> pupils) {
        List<Label> list = new ArrayList<>();

        if (pupils.size() != 0) {
            double sumScorePupil = 0D;
            for (Pupil pupil : pupils) {
                if (pupil.subjects().size() != 0) {
                    for (Subject subject : pupil.subjects()) {
                        sumScorePupil += subject.score();
                    }
                    Label label = new Label(pupil.name(), sumScorePupil / pupil.subjects().size());
                    list.add(label);
                    sumScorePupil = 0D;
                }
            }
        }
        return list;
    }

    /**
     * Метод averageScoreBySubject() - вычисляет средний балл по каждому предмету.
     * Например, собираем все баллы учеников по предмету география и делим на количество учеников.
     * Возвращает список из объектов Label (название предмета и средний балл).
     * чтобы реализовать данный метод, нам необходимо будет собрать временную
     * Map<String, Integer> (в качестве реализации используем LinkedHashMap) -
     * в качестве ключа используем название предмета, в качестве значения - сумма баллов по этому предмету, которую мы получим у каждого ученика.
     * Созданный объект добавляем в результирующий список, его мы и вернем в конце метода.
     */
    public static List<Label> averageScoreBySubject(List<Pupil> pupils) {
        Map<String, Double> mapSubject = new LinkedHashMap<>();
            double sumSubjScore;
            for (Pupil pupil : pupils) {
                for (Subject subject : pupil.subjects()) {
                    if (!mapSubject.containsKey(subject.name())) {
                        mapSubject.put(subject.name(), (double) subject.score());
                    } else {
                        sumSubjScore = mapSubject.get(subject.name()) + subject.score();
                        mapSubject.put(subject.name(), sumSubjScore);
                    }
                }
            }
            List<Label> list = new ArrayList<>();
            for (String key : mapSubject.keySet()) {
                list.add(new Label(key, mapSubject.get(key) / pupils.size()));
            }
            return list;
    }

    /**
     * Метод bestStudent() - возвращает лучшего ученика.
     * Лучшим считается ученик с наибольшим суммарным баллом по всем предметам.
     * Возвращает объект Label (имя ученика и суммарный балл).
     * мы сортируем список с помощью Comparator.naturalOrder() (именно для этой цели у Label реализован интерфейс Comparable).
     * Поскольку нам нужен в итоге лучший студент - то в качестве результата мы возвращаем последний элемент из списка
     */
    public static Label bestStudent(List<Pupil> pupils) {
        List<Label> list = new ArrayList<>();
        double sumScorePupil = 0D;
        for (Pupil pupil : pupils) {
                for (Subject subject : pupil.subjects()) {
                    sumScorePupil += subject.score();
                }
                Label label = new Label(pupil.name(), sumScorePupil);
                list.add(label);
                sumScorePupil = 0D;
        }
        list.sort(Comparator.naturalOrder());
        return list.get(list.size() - 1);
}

    /**
     * Метод bestSubject() - возвращает предмет с наибольшим баллом для всех студентов.
     * Возвращает объект Label (имя предмета, сумма баллов каждого ученика по этому предмету).
     * в этом методе, как и в методе averageScoreBySubject() , нам необходимо собрать временную карту.
     * Далее эту карту перебираем в виде пар ключ-значение и создаем объекты типа Label -
     * в качестве первого параметра используем ключ, для второго - значение карты.
     * После этого мы сортируем список с помощью Comparator.naturalOrder()
     * и в итоге возвращаем последний элемент из полученного списка
     */
    public static Label bestSubject(List<Pupil> pupils) {

        Map<String, Double> mapSubject = new LinkedHashMap<>();
        double sumSubjScore;
        for (Pupil pupil : pupils) {
            for (Subject subject : pupil.subjects()) {
                if (!mapSubject.containsKey(subject.name())) {
                    mapSubject.put(subject.name(), (double) subject.score());
                } else {
                    sumSubjScore = mapSubject.get(subject.name()) + subject.score();
                    mapSubject.put(subject.name(), sumSubjScore);
                }
            }
        }
        List<Label> list = new ArrayList<>();
        for (String key : mapSubject.keySet()) {
            list.add(new Label(key, mapSubject.get(key)));
        }
        list.sort(Comparator.naturalOrder());
        return list.get(list.size() - 1);
    }
}