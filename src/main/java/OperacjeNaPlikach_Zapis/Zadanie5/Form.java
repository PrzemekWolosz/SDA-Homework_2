package OperacjeNaPlikach_Zapis.Zadanie5;

public class Form {

    private int age;
    private int high;
    private String sex;
    private int earnings;
    private String occupation;
    private String citizenship;

    public Form(int age, int high, String sex, int earnings, String occupation, String citizenship) {
        this.age = age;
        this.high = high;
        this.sex = sex;
        this.earnings = earnings;
        this.occupation = occupation;
        this.citizenship = citizenship;
    }

    public int getAge() {
        return age;
    }

    public int getHigh() {
        return high;
    }

    public String getSex() {
        return sex;
    }

    public int getEarnings() {
        return earnings;
    }

    public String getOccupation() {
        return occupation;
    }

    public String getCitizenship() {
        return citizenship;
    }
}
