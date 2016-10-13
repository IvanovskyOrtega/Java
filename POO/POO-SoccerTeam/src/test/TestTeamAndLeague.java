/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.util.Scanner;
import sources.Team;

/**
 *
 * @author alumno
 */
public class TestTeamAndLeague {
    public static void main(String[] args) {
         int op;
        Team team = new Team();
        Scanner input = new Scanner(System.in);
        do{
            System.out.println("What would you like to do?");
            System.out.println("1) Add a player to the team\n2) Show team players");
            System.out.println("3)Exit\n Enter your selection: ");
            op = input.nextInt();
            switch(op){
                case 1:
                    team.addPlayer();
                    break;
                case 2:
                    team.getTeam();
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Not a valid option!!!");
                    break;
            }
        }while(op!=3);
    }
}
