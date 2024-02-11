package com.linkedin.javacodechallenges;

public class Person {
  String firstName;
  String lastName;
  int age;

  public Person(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }

  public int getAge() {
    return this.age;
  }

  public void setAge(int age) {
    this.age = age;
  }

  public String introduceYourself() {
    return "Hi, I am " + firstName + "," + lastName + ". I am " + age + " years old.";
  }

}