package ru.job4j.enumeration;

public class CarService {
    public static void main(String[] args) {

        Status volvo = Status.IN_WORK;
        System.out.println(volvo.getClass()); /*ru.job4j.enumeration.Status*/

        Status ford = Status.ACCEPTED;
        System.out.println(ford.toString().getClass()); /*java.lang.String*/

        Status vaz = Status.ACCEPTED;
        System.out.println("vaz.getInfo() = " + vaz.getInfo());

        Status bmw = Status.WAIT_FOR_PAYMENT;

        Order order = new Order(1, "Mercedes-Benz GLS", Status.IN_WORK);
        System.out.println("Заказ-наряд №" + order.getNumber() + " на автомобиль " + order.getCar()
                           + ", статус ремонта: " + order.getStatus().getInfo() + ", подробности: " + order.getStatus().getMessage());

        /*метод values() получает массив, содержащий список значений из класса Status:*/
        Status[] statuses = Status.values();

        /* name() - возвращает имя константы (значения) в том же виде, в каком оно объявлено.
          ordinal() - возвращает порядковый номер константы (значения), по которому её экземпляр находится в перечислении (нумерация с нуля).*/
        for (Status s : statuses) {
            System.out.println("Название статуса: " + s.name() + ", Порядковый номер статуса: " + s.ordinal());
        }
        /* valueOf() - получает объект типа класса перечисления по его строковому представлению.*/
        System.out.println("Status.valueOf(\"ACCEPTED\") = " + Status.valueOf("ACCEPTED")); //Status.valueOf("ACCEPTED") = ACCEPTED

        /**
         * Если в классе Status нет такого значения (константы),
         * то будет выброшено исключение IllegalArgumentException.
         * Имя константы должно полностью совпадать, включая регистр.
         * Например, String accepted = "accepted"; вызовет исключение
         *
         * Методы values() и valueOf() не имеют полной реализации в классе Enum, они добавляются в программу на этапе её компиляции.
         *
         * так как значения enum не меняются, то при работе с ними можно использовать оператор switch.
         */

        String accepted = "ACCEPTED";
        Status status = Status.valueOf(accepted);
        switch (status) {
            case ACCEPTED:
                System.out.println("Статус: Автомобиль принят на СТО");
                break;
            case IN_WORK:
                System.out.println("Статус: Автомобиль в работе");
                break;
            case WAITING:
                System.out.println("Статус: Автомобиль ожидает запчасти");
                break;
            case FINISHED:
                System.out.println("Статус: Все работы завершены");
                break;
            default:
        }
    }
}
