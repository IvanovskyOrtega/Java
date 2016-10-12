package fuentes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Metodos{
  public void esperar(){
     try{
        Thread.sleep(250);
     }catch(InterruptedException e){}
   }
  public void leerArchivoTxt(String direccion){//File direction as an argument
        try{
            FuncionDeTransicion funcion = new FuncionDeTransicion();
            BufferedReader bf = new BufferedReader(new FileReader(direccion));
            String bfRead;
            String s1;
            ArrayList<Character> cadena = new ArrayList<>();
            Alfabeto a = new Alfabeto();
            Metodos m = new Metodos();
            int numTokens = 0;
            int numLineas = 0;
            System.out.println("ANALIZADOR LÉXICO");
            System.out.println("Leyendo el archivo: "+direccion+" ...");
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
                        m.esperar();
                        System.out.println ("\nPalabra #" + numTokens + 
                                " En la lìnea: "+numLineas+" es: " + s1 );
                        funcion.cambioDeEstado(s1, 0, 0);
                    }
                    else{
                        m.esperar();
                        System.out.println("\n"+s1+" <------ Esto no es para mi!!!");
                    }
                }
            }
        }catch(Exception e)
        {
            System.err.println("No se ha encontrado el archivo :/, "
                    + "\nAsegurate de especificar correctamente la ruta");
        }
    }
}
