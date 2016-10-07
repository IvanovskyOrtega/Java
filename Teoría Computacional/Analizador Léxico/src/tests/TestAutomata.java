package tests;

import sources.Automata;

public class TestAutomata

{

    public static void main (String[] args) throws java.io.IOException{
        Automata method = new Automata();
        method.readTxtFile("/home/alumno/Escritorio/numeros");
    }
}
//Código de prueba
/*
package numeros;

public class Numeros{
    public static void main(String [] args){
        int a = 56 ;
        int b = 0x65484AFE ;
        double c= 0.12548136 ;
        double d = 15.98147458E-98574;
        int e = 068742;
        int f = 0625134;
        double g = 0.15141.21512;
        int h = 0xAEIOU;
}
}
*/