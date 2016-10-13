/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import sources.SoccerPlayer;

/**
 *
 * @author alumno
 */
public class TestSoccerPlayer {
    public static void main(String[] args) {
         SoccerPlayer player = new SoccerPlayer("Michael Ballack",39,13,"Front","German",1.88,85);
         System.out.println("Name: "+player.getName());
         System.out.println("Age: "+player.getAge());
         System.out.println("Nationality: "+player.getNationality());
         System.out.println("Number: "+player.getNumber());
         System.out.println("Position: "+player.getPosition());
         System.out.println("Height: "+player.getHeight());
         System.out.println("Weight: "+player.getWeight());
    }
}
