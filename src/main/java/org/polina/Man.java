package org.polina;

public class Man implements Human {

    private int age;

    public Man(int ageParam) {
        this.age = ageParam;
    }

    @Override
    public int getAge() {
        return age;
    }
}
