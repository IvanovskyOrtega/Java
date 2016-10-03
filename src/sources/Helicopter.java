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
public class Helicopter extends Airplane{

    @Override
    public void takeOff() {
        System.out.println("Motors on...\nThe helix is spinning :D\nTaking off...");
    }

    @Override
    public void land() {
        System.out.println("The helix spinning speed is getting lower...\nLanding...");
    }
    
}
