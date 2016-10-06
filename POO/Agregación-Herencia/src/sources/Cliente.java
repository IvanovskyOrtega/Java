package sources;

import java.util.ArrayList;

public class Cliente {
      private String nombre;
      private ArrayList<Cuenta> cuentas = new ArrayList<>();
      private int numCuentas;

    public Cliente(String nombre) {
        this.nombre = "ivan";
    }

    public String obtenerCuenta(int index){
        return cuentas.get(index).toString();
    } 
    public void agregarCuenta(Cuenta cuenta){
       cuentas.add(cuenta);
        
    }
    public int getNumCuentas() {
        return numCuentas;
    }
    public void obtenerInfo() {
            System.out.println(""+cuentas.toString());  
    }
     
}
