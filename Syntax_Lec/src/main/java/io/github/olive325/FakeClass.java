package io.github.olive325;

public class FakeClass {
    public int age;
    public String firstName;
    public String lastName;

    public void Fake(int age, String firstName, String lastName){
        this.age = age;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getAge() {
       return this.age;
    }
}
