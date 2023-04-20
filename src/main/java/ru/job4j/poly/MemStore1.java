package ru.job4j.poly;

public class MemStore1 extends FileStore1 {
    private String[] mem = new String[100];
    private int size = 0;

    public MemStore1() {
        super(null);
    }

    @Override
    public void save(String data) {
        mem[size++] = data;
    }

    @Override
    public String read() {
        StringBuilder buff = new StringBuilder();
        for (int i = 0; i < size; i++) {
            buff.append(mem[i]);
        }
        return buff.toString();
    }
}