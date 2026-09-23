package com.example.RestAPI.models;

import jakarta.persistence.*;

@Entity 
public class User {
    @Id 
    @GeneratedValue(strategy = GenerationType.IDENTITY) //id will be unique for each user 
    private long id; 

    @Column 
    private String firstName;

    @Column 
    private String lastName;

    @Column 
    private int age;

    @Column 
    private String occupation;

    //Create getters and setters for our member fields.

    //1. ID
    public long getId(){
        return id;
    }

    public void setId(long id){
        this.id = id;
    }

    //2. Firstname 
    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String firstName){
        this.firstName = firstName;
    }

    //3. LastName 
    public String getLastName(){
        return lastName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    //4. AGE 
    public int getAge(){
        return age;
    }

    public void setAge(int age){
        this.age = age;
    }

    //5. Occupation 
    public String getOcuupation(){
        return occupation;
    }

    public void setOccupation(String occupation){
        this.occupation = occupation;
    }

}
