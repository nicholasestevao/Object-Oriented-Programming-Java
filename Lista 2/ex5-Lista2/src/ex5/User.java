/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex5;

/**
 *
 * @author isaac
 */
public class User {
    private String name;
    private int age;
    private Photo photo;
    
    User(String name, int age, Photo photo) {
        this.name = name;
        this.age = age;
        this.photo = photo;
    }
    
    public String getName() {
        return name;
    }
    
    public int getAge()  {
        return age;
    }
    
    public Photo getPhoto() {
        return photo;
    }
    
    public void showUser() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Path of photo: " + photo.getPath());
        System.out.println("Data of photo: " + photo.getData().showData());
    }
} 
