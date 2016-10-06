package sources;
public class SeaPlane extends Airplane {
    
    @Override
    public void takeOff(){
        System.out.println("Turbines advancing...\nTaking off...");
    }
     @Override
    public void land(){
         System.out.println("Landing...\nAdvancing...");
    }
    
}
/*
Para poder crear un objeto completo, se definen los métodos heredados de Airplane, ya que estos en 
principio no tienen codigo. De tal forma que para no hacer una clase abstracta, simplemente sea
class.
*/