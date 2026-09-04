package io.github.olive325;

public class Main {
    public static void main(String[] args) {
        Person olivia = new Person(21, "Olivia", "Zavala Sherby");

        System.out.println(olivia.getAge());
        olivia.setAge(22);
        System.out.println(olivia.getAge());

        Person[] peopleArray = new Person[5];

        peopleArray[0] = olivia;
        peopleArray[1] = new Person(20, "Cynthia", "Beams");
        peopleArray[2] = new Person(20, "Winn", "Pipes");
        peopleArray[3] = new Person(21, "Ben", "Butler");
        peopleArray[4] = new Person(20, "Rashid", "Hong");

        for (Person person : peopleArray){
            System.out.println("Here is a new person shown below");
            System.out.println(person.getFirstName());
        }




    }
}