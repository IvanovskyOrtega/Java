package tests;

import java.util.ArrayList;
import java.util.Scanner;
import sources.Cliente;
import sources.Cuenta;
import sources.CuentaDeAhorros;
import sources.CuentaDeCheques;

public class TestCliente {
    public static void main(String[] args) {
        int numC;
        Scanner in = new Scanner(System.in);
        System.out.println("Cuantos clientes desea agregar?");
        numC = in.nextInt();
        ArrayList<Cliente> clientes = new ArrayList<>();
        for (int i = 0; i < numC; i++) {
            in.nextLine();
            System.out.println("Ingresa el nombre del cliente:");
            String nombre = in.nextLine();
            Cliente c = new Cliente(nombre);
            Cuenta c1 = new Cuenta(1000);
            CuentaDeAhorros c2 = new CuentaDeAhorros(c1.consultar(),0.05);
            CuentaDeCheques c3 = new CuentaDeCheques(c1.consultar(),5000);
            c.agregarCuenta(c1);
            c.agregarCuenta(c2);
            c.agregarCuenta(c3);
            clientes.add(c);
        }
        for (int i = 0; i < numC; i++) {
            clientes.get(i).obtenerInfo();
        }
        System.out.println("Retirar $500");
        clientes.get(0).obtenerCuenta(0).retirar(500);
        for (int i = 0; i < numC; i++) {
            clientes.get(i).obtenerInfo();
        }
    }
}
