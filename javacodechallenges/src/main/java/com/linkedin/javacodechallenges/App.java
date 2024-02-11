package com.linkedin.javacodechallenges;

public class App {
    public static void main(String[] args) {
        Person person1 = new Person("laksh", "vudu");
        person1.setAge(34);
        System.out.println(person1.introduceYourself());
    }
}
