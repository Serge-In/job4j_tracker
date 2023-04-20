package ru.job4j.enumeration;

public enum Status {
    // ACCEPTED("Принят"),

    ACCEPTED("Принят") {
        private String message = "Автомобиль принят на СТО";

        @Override
        public String getMessage() {
            return message;
        }
    },
    WAIT_FOR_PAYMENT("Ожидает оплату") {
        private String message = "Автомобиль ожидает оплату";

        @Override
        public String getMessage() {
            return message;
        }
    },
    IN_WORK("В работе") {
        private String message = "Автомобиль в работе";

        @Override
        public String getMessage() {
            return message;
        }
    },
    WAITING("Ожидание") {
        private String message = "Автомобиль ожидает запчасти";

        @Override
        public String getMessage() {
            return message;
        }
    },
    FINISHED("Работы завершены") {
        /**
         * 2.
         *          Далее в тело каждого из значений мы добавили по переменной message и по методу getMessage(),
         *          который переопределяет абстрактный метод из Status,
         *          возвращая переменную message.
         *          Таким образом, каждое значение - это отдельный объект со своим поведением.
         */
        private String message = "Все работы завершены";

        @Override
        public String getMessage() {
            return message;
        }
    };

    private String info;

    Status(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }

    /**
     *  1.
     *  Сначала в перечисление Status мы добавили абстрактный метод getMessage(),
     *  который обязывает каждое значение перечисления переопределить этот метод:
     * @return
     */
    public abstract String getMessage();
}

