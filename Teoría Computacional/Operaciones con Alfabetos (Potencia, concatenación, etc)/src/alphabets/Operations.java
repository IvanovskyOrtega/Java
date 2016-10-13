package alphabets;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.TreeSet;
import java.util.Set;

/**
 *
 * @autor Ivan Ortega Victoriano
 */
public class Operations{
    public Scanner input;
    /**
     * Este campo contiene los símbolos del alfabeto en un Array de tipo char
     */
    private char alphabet[];
    /**
     * Este campo contiene los símbolos del alfabeto en un conjunto
     */
    public ArrayList<Character> eAlphabet= new ArrayList<>();
    /**
     * Este campo contiene los simbolos de la cadena Z en un conjunto
     */
    public Set stringZ = new TreeSet();
    /**
     * Este campo contiene los elementos de una potencia del alfabeto de forma 
     * auxiliar para elevarlo a potencias mayores a 1.
     */
    public ArrayList<String> aux = new ArrayList<>();
    /**
     * Este campo contiene los elementos de la potencia del alfabeto
     */
    public ArrayList<String> powAlphabet = new ArrayList<>();
    private String w1 = "";
    private String w2 = "";
    private String w3;
    private String w4;
    private String inverse;
    private String z;
    private String sub;
    private int i;
    private int j;
    private int k;
    private int l;
    private int p;
    public int x;
    /**
     * Este campo contiene los caracteres de la cadena w1 que no pertenenen al 
     * conjunto de símbolos del alfabeto.
     */
    public Set characters1 = new TreeSet();
    /**
     * Este campo contiene los caracteres de la cadena w2 que no pertenenen al 
     * conjunto de símbolos del alfabeto.
     */
    public Set characters2 = new TreeSet();
    
    public Operations() {
        this.input = new Scanner(System.in);
    }
    /**
     * Este método captura los elementos que formarán el alfabeto.
     */
    public void readAlphabet(){
         int n;
         if(eAlphabet.isEmpty())
                 System.out.println("Nuevo alfabeto :D !!!\n");
             else{
                 eAlphabet.clear();
                 alphabet = new char[0];
                 System.out.println("Se ha eliminado el alfabeto anterior!!! :D\n");
             }
         do{
             System.out.println("Ingresa el número de símbolos de tu alfabeto: ");
             n=input.nextInt();
             if(n<3){
                 System.out.println("La cantidad ingresada no es válida.\nIngrese un numero mayor que 3.\n");
             }
             else{
                 alphabet = new char[n];
                 String symbol;
                 input.nextLine();
                 for(i=0;i<n;i++){
                     j=0;
                     System.out.println("Ingresa el símbolo "+(i+1));
                     symbol = input.nextLine();
                     alphabet[i] = symbol.charAt(0);
                     eAlphabet.add(alphabet[i]);
                     if(i>0){
                         if(alphabet[i]==alphabet[i-1]){
                             System.out.println("Ya has ingresado este símbolo.");
                             System.out.println("Vuelve a Intentarlo.");
                             System.out.println("Procura no repetir simbolos.\n");
                             j=-1;
                             eAlphabet.clear();
                             break;
                         }
                     }
                 }
                 if(j!=-1)
                    System.out.println("Tu alfabeto es Σ = "+Arrays.toString(alphabet)+"\n");
             }
         }while(n<3||j==-1);
    }
    /**
     * Este método captura dos cadenas ingresadas por el usuario. 
     */
    public void readStrings(){
         if(eAlphabet.isEmpty())
             System.out.println("No has ingresado un alfabeto!!!\n");
         else{
             w1 = "";
             w2 = "";
             input.nextLine();
             do{
                 characters1.clear();
                 System.out.println("Ingresa la cadena w1:");
                 w1 = input.nextLine();
                 j=0;
                 for(i=0;i<w1.length();i++){
                    if(eAlphabet.contains(w1.charAt(i))==false){
                         j=-1;
                         characters1.add(w1.charAt(i));
                    }     
                }
                if(j==-1){
                     System.out.println("La cadena no es válida.");
                     System.out.print("Los caractéres "+Arrays.toString(characters1.toArray())+" no están en tu alfabeto\n");
                     System.out.println("Ingresa una cadena válida.\n");
                }
                else
                     System.out.println("Cadena válida :D\n");
            }while(j==-1);
             do{
                 characters2.clear();
                 System.out.println("Ingresa la cadena w2:");
                 w2 = input.nextLine();
                 j=0;
                 for(i=0;i<w2.length();i++){
                     if(eAlphabet.contains(w2.charAt(i))==false){
                         j=-1;
                         characters2.add(w2.charAt(i));
                    }     
                }
                 if(j==-1){
                     System.out.println("La cadena no es válida.");
                     System.out.print("Los caractéres "+Arrays.toString(characters2.toArray())+" no están en tu alfabeto\n");
                     System.out.println("Ingresa una cadena válida.\n");
                }
                 else
                     System.out.println("Cadena válida :D\n");
            }while(j==-1);
        }   
    }
    
    /**
     * Este método genera la concatenación de la cadena w1 y w2 a una potencia p
     */
    public void concatenation(){
        if(eAlphabet.isEmpty()||w1.length()==0||w2.length()==0)
            System.out.println("No se han ingresado las cadenas o el alfabeto!!!\n");
        else{
             w3="";
             System.out.println("Ingrese la potencia de la concatenación: ");
             p = input.nextInt();
             if(p>0){
                 for(i=0;i<p;i++)
                {
                    w3 += w1.concat(w2);
                }
                 System.out.println("La cadena (w1w2)^"+p+" es: "+w3);
                 System.out.println("Y su longitud es: "+w3.length()+"\n");
            }
             else if(p<0){
                 inverse = "";
                 w4 = w1.concat(w2);
                 for(i=w4.length()-1;i>=0;i--){
                     inverse += w4.charAt(i);
                }
                 for(i=p;i<0;i++)
                {
                    w3 += inverse;
                }
                 System.out.println("La cadena (w1w2)^("+p+") es: "+w3);
                 System.out.println("Y su longitud es: "+w3.length()+"\n");
            }
             else if(p==0){
                 System.out.println("La cadena (w1w2)^"+p+" es:  λ");
                 System.out.println("Y su longitud es: 0\n");
            }
        }
    }
    
    /**
     * Este método regresa el número de ocurrencias de un caracter en una cadena.
     */
    public void occurrences(){
         char s;
         if(w1.length()!=0&&eAlphabet.isEmpty()==false){
             k=0;
             input.nextLine();
             System.out.println("Ingresa el simbolo para obetener su número de ocurrencias en w1:");
             s = input.nextLine().charAt(0);
             if(eAlphabet.contains(s)){
                 for(i=0;i<w1.length();i++){
                     if(s==w1.charAt(i))
                         k++;
                 }
                 System.out.println("El número de ocurrencias de "+s+" es: "+k+"\n");
             }
             else{
                 System.out.println("Tu alfabeto no contiene el simbolo '"+s+"'\n");
             }
                 
         }
         else
             System.out.println("Primero ingresa el alfabeto y luego las cadenas!!!!\n");
         
    }
    /**
     * Este método captura una cadena Z y determina si es prefijo, sufijo,
     * subcadena, prefijo propio, sufijo propio o subcadena propia de 
     * la cadena (w1w2)^p
     */
    public void readZ(){
        if(eAlphabet.isEmpty()||w3.isEmpty()||w1.isEmpty()||w2.isEmpty())
               System.out.println("Primero ingresa el alfabeto, luego las cadenas y realiza la concatenaciòn!!!");
        else{
            input.nextLine();
            do{
            j=0;
            k=0;
            l=0;
            System.out.println("Ingresa la cadena z:");
            z = input.nextLine();
            for(i=0;i<z.length();i++){
                stringZ.add(z.charAt(i));
            }
            k=z.length();
            if(eAlphabet.containsAll(stringZ))
                    j=1;
                else
                    j=-1;
            if(j==-1)
                System.out.println("La cadena no es vàlida");
            else{
                if(z.length()==0)
                    System.out.println("La cadena z = λ, es un sufijo, prefijo y subcadena (w1w2)^"+p);
                else if(z.equals(w3)){
                     System.out.println("Las cadena z="+z+" es iguak a (w1w2)^"+p);
                     System.out.println("Ademàs es un prefijo, sufijo y subcadena de (w1w2)^"+p);
                }
                else if(k>w3.length())
                    System.out.println("La cadena: "+z+", no es nada de la cadena (w1w2)^"+p);
                else if(k<w3.length()){
                    for(i=1; i<(w3.length()-k);i++){
                        sub = w3.substring(i, i+k);
                         if(z.equals(sub)){
                            System.out.println("La cadena z="+z+" es un subcadena propia de (w1w2)^"+p+"\n");
                            break;
                        }
                    }
                    for(i=0; i<(w3.length()-k);i++){
                        sub = w3.substring(i, i+k);
                         if(z.equals(sub)){
                            l=1;
                            break;
                        }
                    }
                    if(l!=1){
                        for(i=0; i<(w3.length()-k);i++){
                             sub = w3.substring(i, i+k);
                             if(!z.equals(sub)){
                                 System.out.println("La cadena z = "+z+" no es nada de la cadena (w1w2)^"+p+"\n");
                                 break;
                            }
                        }
                    }
                    if(w3.startsWith(z)){
                        System.out.println("La cadena z="+z+" es un prefijo propio y subcadena de (w1w2)^"+p+"\n");
                        }
                    else if(w3.endsWith(z)){
                        System.out.println("La cadena z="+z+" es un sufijo propio y subcadena de (w1w2)^"+p+"\n");
                        }
                }
                
            }
            }while(j==-1);   
        }
    }
    /**
     * Este método genera la potencia de un alfabeto
     * @param A: ArrayList que contiene los elementos de la potencia k (k<n)
     * @param B: Array List que contiene a los simbolos del alfabeto
     */
    public void generarPotencia(ArrayList<String> A, ArrayList<Character> B){
        aux.clear();
        if(powAlphabet.isEmpty()){
            for(i=0;i<eAlphabet.size();i++){
                aux.add(eAlphabet.get(i).toString());
            }
        }
        else{
            for(i=0;i<powAlphabet.size();i++){
                for(j=0;j<eAlphabet.size();j++){
                    aux.add(powAlphabet.get(i)+eAlphabet.get(j).toString());
                }
            }
        }
        
        x-=1;
        if(x<=0){
            powAlphabet.clear();
            powAlphabet.addAll(aux);
            aux.clear();
            for(i=0; i<powAlphabet.size();i++)
                System.out.println(powAlphabet.get(i)+",");
            powAlphabet.clear();
        }
        else{
            powAlphabet.clear();
            powAlphabet.addAll(aux);
            generarPotencia(powAlphabet, eAlphabet);
        }
    }
}
