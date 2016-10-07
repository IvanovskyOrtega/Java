package sources;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.StringTokenizer;
import java.util.regex.Pattern;

public class Automata {
    public void readTxtFile(String direction){//File direction as an argument
        try{
            System.out.println("Que hongo soy tu automata :v");
            System.out.println("Vamos a chambear xdxdxd");
            BufferedReader bf = new BufferedReader(new FileReader(direction));
            String bfRead;
            String s1 ;
            Alphabet A=new Alphabet();
            int numTokens = 0;
            int numLines = 0;
            while((bfRead = bf.readLine()) != null){
                StringTokenizer st = new StringTokenizer (bfRead);
                while (st.hasMoreTokens())
                {
                    s1 = st.nextToken();
                    numTokens++;
                    numLines++;
                    int i;
                    boolean a = false;
                    for(i = 0 ; i < s1.length() ; i++){
                        if (A.alphabet.contains(s1.charAt(i)) == false){
                                break;
                        }
                        else
                            a = true;
                    }
                    if(a == true){
                        System.out.println ("Palabra " + numTokens + " es: " + s1);
                    if(decimalExponent(s1))
                        System.out.println("Notacion decimal con exponencial válida :v");
                    else if(decimal(s1))
                        System.out.println("Notación decimal válida :v");
                    else if(decimalWithoutExponent(s1))
                        System.out.println("Notación decimal sin exponente válida :v");
                    else if(hexadecimal(s1))
                        System.out.println("Notación hexadecimal válida v:");
                    else if (octal(s1))
                        System.out.println("Notación octal válida :^)");
                    else 
                        System.out.println("Notación inválida en línea: "+numLines+" Palabra: "+s1 );
                    }
                else
                        System.out.println( s1 +"<--------  Esto no es para mi :v ");
            }
        }
        }
        catch(Exception e)
        {
            System.err.println("File not found");
        }
    }
    public boolean decimalExponent(String a){
        boolean b;
        String regex = "[-+]?"+"[0-9]*"+"[.]?"+"[0-9]+"+"[E]"+"[-+]?"+"[0-9]+";
        Pattern patron = Pattern.compile(regex);
        b = patron.matcher(a).matches();
        return b;
    }
    public boolean decimalWithoutExponent(String a){
        boolean b;
        String regex = "[-+]?"+"[0-9]*"+"[.]"+"[0-9]+";
        Pattern patron = Pattern.compile(regex);
        b = patron.matcher(a).matches();
        return b;
    }
    public boolean decimal(String a){
        boolean b;
        String regex = "[-+]?"+"[1-9]"+"[0-9]+";
        Pattern patron = Pattern.compile(regex);
        b = patron.matcher(a).matches();
        return b;
    }
    public boolean hexadecimal(String a){
        boolean b;
        String regex = "[-+]?"+"[0]"+"[x]"+"[0-9A-F]+";
        Pattern patron = Pattern.compile(regex);
        b = patron.matcher(a).matches();
        return b;
    }
    public boolean octal(String a){
        boolean b;
        String regex = "[-+]?"+"[0]"+"[0-7]+";
        Pattern patron = Pattern.compile(regex);
        b = patron.matcher(a).matches();
         return b;
    }
}

