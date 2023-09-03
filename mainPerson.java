package org.example;

public class mainPerson {
    public static void main(String[] args) {

        Person person1 = new Person("Tom",20, 181, 85, 4900);
        Person person2 = new Person ("Lina", 25, 170, 63, 4700);
        Person person3 = new Person ("Ron",30,178,75, 4800);

        System.out.println(person1.getMoney());
        person2.setMoney(5300);
        person1.age = 48;
        System.out.println(person2.getMoney());


    }

}
