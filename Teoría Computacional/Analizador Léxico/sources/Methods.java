package sources;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.StringTokenizer;
import java.util.regex.Pattern;

public class Methods {
    public void readTxtFile(String direction){//File direction as an argument
        try{
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
                    System.out.println(""+matchStrings(s1));
                }
            }
        }catch(Exception e)
        {
            System.err.println("File not found");
        }
    }
    public String matchStrings(String a){
        boolean b=false;
        if(a.charAt(0)=='-'){
            if(a.charAt(1)=='.'||(a.charAt(1)=='0'&&a.charAt(2)=='.')||a.charAt(1)!='0'){
                String regex = "[-]{1}"+"[0-9]*"+"[.]?"+"[0-9]*"+"[E]?"+"[-]?"+"[0-9]*";
                Pattern patron = Pattern.compile(regex);
                b = patron.matcher(a).matches();
            }
        }
        if(b==true)
            return "Notacion valida";
        else
            return "Notacion invalida";
    }
}
