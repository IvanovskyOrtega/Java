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
/*
    public class Airplane extends Objectimplements Flyer{

    @Override
    public void takeOff() {
        System.out.println("");
    }

    @Override
    public void land() {
       
    }

    @Override
    public void fly() {
       
    }
    
}
Clases: Métodos codificados 100%
Interfaz: Métodos codificados 0%
Clase abstracta: combinación de las anteriores.
*/
public abstract class Airplane extends Vehicle implements Flyer{
    //abstract indica que hay al menos un método sin código
    @Override
    public void fly(){
        System.out.println("**** Flying ****");
    }
}
/*
Poner "implements" antes de "extends" genera un error.
*/