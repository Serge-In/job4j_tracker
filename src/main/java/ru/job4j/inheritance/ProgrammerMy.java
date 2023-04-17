package ru.job4j.inheritance;

public class ProgrammerMy extends EngineerMy {
    private String programLang;

    public ProgrammerMy() {
    }

    public ProgrammerMy(String programLang, boolean degree, int experience) {
        super(degree, experience);
        this.programLang = programLang;
    }

    public static void main(String[] args) {
        ProgrammerMy pr1 = new ProgrammerMy();
        System.out.println("pr1.degree = " + pr1.isDegree());
        System.out.println("pr1.programLang = " + pr1.getExperience());
        System.out.println("pr1.programLang = " + pr1.programLang);

        ProgrammerMy pr2 = new ProgrammerMy("Java", false, 0);
        System.out.println("pr2.degree = " + pr2.isDegree());
        System.out.println("pr2.programLang = " + pr2.getExperience());
        System.out.println("pr2.programLang = " + pr2.programLang);
    }
}
