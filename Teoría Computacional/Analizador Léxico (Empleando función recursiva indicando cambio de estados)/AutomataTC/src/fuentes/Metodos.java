package fuentes;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Metodos{
     public ArrayList<String> aceptados = new ArrayList<>();
     public ArrayList<String> noAceptados = new ArrayList<>();
     
  public void esperar(){
     try{
        Thread.sleep(0);
     }catch(InterruptedException e){}
   }
  public void leerArchivoTxt(String direccion){//File direction as an argument
        try{
            FuncionDeTransicion funcion = new FuncionDeTransicion();
            BufferedReader bf = new BufferedReader(new FileReader(direccion));
            String bfRead;
            String s1;
            GenerarInforme I= new GenerarInforme();
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
                    if(a.alfabeto.containsAll(cadena)==true){
                        m.esperar();
                        System.out.println ("\nPalabra #" + numTokens + 
                                " En la lìnea: "+numLineas+" es: " + s1 );
                        if(funcion.cambioDeEstado(s1, 0, 0, numLineas)== true)
                            aceptados.add("Palabra: "+s1+" Número de línea: "+numLineas);
                        else
                            noAceptados.add("Palabra: "+s1+" Número de línea: "+numLineas);
                    }
                    else{
                        m.esperar();
                        System.out.println("\n"+s1+" <------ Esto no es para mi!!!");
                    }
                    
                }
            }
            System.out.println("Informe final:\n");
            System.out.println("Números aceptados:\n");
            for(int i = 0 ; i < aceptados.size() ; i++ )
                System.out.println("\t"+aceptados.get(i));
            System.out.println("Números no aceptados:\n");
            for(int i = 0 ; i < noAceptados.size() ; i++ )
                System.out.println("\t"+noAceptados.get(i));
            I.generarInforme(aceptados,noAceptados);
        }catch(Exception e)
        {
            System.err.println("No se ha encontrado el archivo :/, "
                    + "\nAsegurate de especificar correctamente la ruta");
        }
    }
}