package ru.job4j.inheritance;

public class EngineerMy extends ProfessionMy {

    private int experience;

    public int getExperience() {
        return experience;
    }

    public EngineerMy() {
        this(false, 0);
    }

    public EngineerMy(boolean degree, int experience) {
        super(degree);
        this.experience = experience;
    }
}
