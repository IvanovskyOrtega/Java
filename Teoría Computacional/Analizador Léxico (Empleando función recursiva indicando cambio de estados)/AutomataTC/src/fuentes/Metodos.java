package fuentes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Metodos{
  public void esperar(){
     try{
        Thread.sleep(500);
     }catch(InterruptedException e){}
   }
  public void leerArchivoTxt(String direction){//File direction as an argument
        try{
            FuncionDeTransicion funcion = new FuncionDeTransicion();
            BufferedReader bf = new BufferedReader(new FileReader(direction));
            String bfRead;
            String s1;
            ArrayList<Character> cadena = new ArrayList<>();
            Alfabeto a = new Alfabeto();
            int numTokens = 0;
            int numLineas = 0;
            System.out.println("Que hongo bro, soy tu automata xdxdxd");
            System.out.println("Voy a chambear :U");
            while((bfRead = bf.readLine()) != null){
                StringTokenizer st = new StringTokenizer (bfRead);
                numLineas++;
                while (st.hasMoreTokens())
                {
                    cadena.clear();
                    s1 = st.nextToken();
                    numTokens++;
                    for(int i=0; i<s1.length();i++){
                        cadena.add(s1.charAt(i));
                    }
                    if(a.numeros.containsAll(cadena)==true){
                        System.out.println ("Palabra " + numTokens + " es: " + s1 + "\n\tEn la lìnea: "+numLineas);
                        funcion.cambioDeEstado(s1, 0, 0);
                    }
                    else{
                        System.out.println(s1+" <------ Esto no es para mi :V");
                    }
                }
            }
        }catch(Exception e)
        {
            System.err.println("File not found");
        }
    }
}
