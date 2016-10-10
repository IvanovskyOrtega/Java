package sources;

import java.util.ArrayList;

public class Cliente {
      private String nombre;
      private ArrayList<Cuenta> cuentas = new ArrayList<>();
      private int numCuentas;

    public Cliente(String nombre) {
        this.nombre = "Ivan";
    }

    public Cuenta obtenerCuenta(int index){
        return cuentas.get(index);
    } 
    public void agregarCuenta(Cuenta cuenta){
       cuentas.add(cuenta);
    }
    public int getNumCuentas() {
        return numCuentas;
    }
    public void obtenerInfo() {
            int a = cuentas.size();
            for (int i = 0; i < a; i++) {
                System.out.println("Cuenta "+i+":\n\tSaldo: "+cuentas.get(i).consultar());
        }
    }

    @Override
    public String toString() {
        return "Cliente{" + "nombre=" + nombre + ", cuentas=" + cuentas.toString() + ", numCuentas=" + numCuentas + '}';
    }
    
}
