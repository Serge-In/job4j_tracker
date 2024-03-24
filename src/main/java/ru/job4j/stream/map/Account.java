package ru.job4j.stream.map;

public record Account(String requisite, double balance) {
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Account{");
        sb.append("requisite='").append(requisite).append('\'');
        sb.append(", balance=").append(balance);
        sb.append('}');
        return sb.toString();
    }
}
