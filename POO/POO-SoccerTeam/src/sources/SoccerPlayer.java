/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sources;

/**
 *
 * @author alumno
 */
public class SoccerPlayer {
     private String name;
     private int age;
     private int number;
     private String position;
     private String nationality;
     private double height;
     private double weight;

    public SoccerPlayer(String name, int age, int number, String position, String nationality, double height, double weight) {
        this.name = name;
        this.age = age;
        this.number = number;
        this.position = position;
        this.nationality = nationality;
        this.height = height;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getNumber() {
        return number;
    }

    public String getPosition() {
        return position;
    }

    public String getNationality() {
        return nationality;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
     
}