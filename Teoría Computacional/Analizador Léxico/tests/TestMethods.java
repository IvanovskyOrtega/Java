package tests;

import sources.Methods;

public class TestMethods

{

    public static void main (String[] args) throws java.io.IOException{
        Methods method = new Methods();
        method.readTxtFile("C:\\Users\\ivano\\Desktop\\numeros.txt");
    }
}