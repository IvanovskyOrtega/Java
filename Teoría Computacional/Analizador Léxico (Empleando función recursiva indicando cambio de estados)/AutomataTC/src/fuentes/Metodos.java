package fuentes;

import java.io.BufferedReader;
import java.io.FileReader;
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
            String s1 ;
            int numTokens = 0;
            while((bfRead = bf.readLine()) != null){
                StringTokenizer st = new StringTokenizer (bfRead);
                while (st.hasMoreTokens())
                {
                    s1 = st.nextToken();
                    numTokens++;
                    System.out.println ("Palabra " + numTokens + " es: " + s1);
                    funcion.cambioDeEstado(s1, 0, 0);
                }
            }
        }catch(Exception e)
        {
            System.err.println("File not found");
        }
    }
}