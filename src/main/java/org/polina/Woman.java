package org.polina;

public class Woman implements Human {

    private int age;

    public Woman(int desiredAge) {
        this.age = 18;
    }

    @Override
    public int getAge() {
        return age;
    }
}
