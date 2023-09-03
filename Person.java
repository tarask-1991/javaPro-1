package org.example;

public class Person {


        String name;
        int age;
        double height;
        double weight;
        int money;

           public Person (String name,    int age,  double height,  double weight,  int money) {
            this.name = name;
            this.age = age;
            this.height = height;
            this.weight = weight;
            this.money = money;
        }

//        public void drift() {
//            System.out.println("Супер-крутой дрифт...");
//        }

        public void getInfo() {
            System.out.println();
            System.out.println("Info about person:");
            System.out.println("Name" + name);
            System.out.println("Age" + age);
            System.out.println("Height: " + height);
            System.out.println("Weight: " + weight);
            System.out.println("Money: " + money);
            System.out.println();
        }

        public void work() {
            if (age < 18 ){
                System.out.println(" Under 18 ");
            }
            if (age > 18 || age < 65){
                System.out.println(" Working ");
            }
            else {
                System.out.println("More than 65" );
            }

        }

        public int getMoney () {
               return money;
        }

        public void setMoney (int money){
               this.money = money;
        }


}
