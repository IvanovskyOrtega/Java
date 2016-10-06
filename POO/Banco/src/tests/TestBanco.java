
package tests;

import java.util.Scanner;
import sources.Banco;
import sources.Cliente;
import sources.Cuenta;

public class TestBanco {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Banco bancomer = new Banco();
        for (int i = 0; i < 2; i++) {
            System.out.println("Nombre del cliente:");
             String name = input.nextLine();
             Cliente c1 = new Cliente(name);
             System.out.println("Numero de cuenta:");
             String numCuenta = input.nextLine();
             c1.setNumCuenta(numCuenta);
             System.out.println("Saldo inicial de la cuenta:");
             double saldoInicial = input.nextDouble();
             Cuenta micuenta = new Cuenta(saldoInicial);
             bancomer.agregarCliente(c1.getNombre(),c1.getNumCuenta(),micuenta);
             input.nextLine();
        }
        bancomer.imprimir();
    }
    
}
