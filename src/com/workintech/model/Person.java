package com.workintech.model;

public class Person {
 String firstName;
 String lastName;
 int age;
 String gender;
 double workExperience;
 boolean ableToTravel;


 public Person(String firstName, String lastName, int age){
     this.firstName = firstName;
     this.lastName = lastName;
     this.age = age;
 }

 public Person(String firstName, String lastName, int age, String gender, double workExperience, boolean ableToTravel){
     this(firstName,lastName,age);
     this.gender = gender;
     this. workExperience = workExperience;
     this.ableToTravel = ableToTravel;
 }

    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public int getAge(){
        return age;
    }

    public boolean isTeen(int age){
        if(age >=13 && age <=19){
            return true;
        } else{
            return false;
        }
    }





}
