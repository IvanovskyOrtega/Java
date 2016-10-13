/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sources;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Team {
    ArrayList<SoccerPlayer> team = new ArrayList<>();
    Scanner input = new Scanner(System.in);
    public void addPlayer(){
        SoccerPlayer player = new SoccerPlayer("",0,0,"","",0,0);
        System.out.println("Enter player name: ");
        String name = input.nextLine();
        player.setName(name);
        System.out.println("Enter the player age: ");
        int age = input.nextInt();
        player.setAge(age);
        System.out.println("Enter the player number: ");
        int number = input.nextInt();
        player.setNumber(number);
        input.nextLine();
        System.out.println("Enter the player position: ");
        String position = input.nextLine();
        player.setPosition(position);
        System.out.println("Enter the player nationality: ");
        String nationality = input.nextLine();
        player.setNationality(nationality);
        System.out.println("Enter the player height (m): ");
        double height = Double.parseDouble(input.nextLine());
        player.setHeight(height);
        System.out.println("Enter the player weight (kg): ");
        double weight = Double.parseDouble(input.nextLine());
        player.setWeight(weight);
        team.add(player);
    }
    
    public void searchByPosition(String position){
        for(int i = 0 ; i < team.size() ; i++){
            if(position.equals(team.get(i).getPosition()));
                System.out.println(""+team.get(i));
        }
    }

    public ArrayList<SoccerPlayer> getTeam() {
        return team;
    }

    public Team() {
    }
}