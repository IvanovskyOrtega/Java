package practica2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
import java.util.TreeSet;
import java.util.regex.Pattern;

/**
 * @author Ivan Ortega Victoriano
 */
public class Operations {
    
    public ArrayList<Character> eAlphabet = new ArrayList<>();
    public ArrayList<String> language1 = new ArrayList<>();
    TreeSet l1 = new TreeSet();
    public ArrayList<String> language2 = new ArrayList<>();
    TreeSet l2 = new TreeSet();
    TreeSet l1Ul2 = new TreeSet();
    TreeSet l1minusl2 = new TreeSet();
    TreeSet l2minusl1 = new TreeSet();
    public ArrayList<String> l1l2 = new ArrayList<>();
    public ArrayList<String> languagePow = new ArrayList<>();
    public ArrayList<String> aux = new ArrayList<>();
    public ArrayList<String> inverses = new ArrayList<>();
    public ArrayList<String> nombresH = new ArrayList<>(Arrays.asList("JUAN", 
            "PEDRO", "ENRIQUE","IVAN","HUGO","MIGUEL", "ROBERTO", "ALEJANDRO", 
            "ANDRES", "JULIO", "ALFREDO", "FERNANDO", "PANCRACIO", "BRUNO", 
            "EMMANUEL", "DAVID"));
    public ArrayList<String> nombresM = new ArrayList<>(Arrays.asList("EMILIA",
            "PETRONILA", "JACINTA", "EMMA", "VICTORIA", "NANCY", "OLIVIA", 
            "ERIKA", "BRITANNY", "NICOLE", "BERTHA", "ANA", "PAOLA", "ITZEL", 
            "LAURA"));
    public ArrayList<String> apellidos = new ArrayList<>(Arrays.asList("ORTEGA", 
            "VICTORIANO", "HERNANDEZ", "GODINEZ","PEREZ","LOPEZ","ROJAS",
            "UCHIHA","UZUMAKI","HATAKE","HARUNO","HYUUGA","MONROY","ROJAS",
            "ROMERO","SAD", "BLANCO","CHONG","TECHO","TECLA","ENRIQUEZ","BENITEZ",
            "NIETO","NEGRETE","INFANTE","FERNANDEZ","BERMUDEZ","WAIFU","HUSBANDO"));
    public int dias[] = new int[]{1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,1,18,19,
        20,21,22,23,24,25,26,27,28,29,30,31};
    public int meses[] = new int[]{1,2,3,4,5,6,7,8,9,10,11,12};
    public int años[] = new int[]{1910,1926,1930,1937,1940,1947,1951,1954,1963,
        1969,1976,1978,1980,1983,1987,1990,1996,2000,2004,2007,2012,2014,2016};
    public ArrayList<String> claves = new ArrayList<>(Arrays.asList("AS","BC",
            "BS","CC","CL","CM","CS","CH",
            "DF","DG","GT","GR","HG","JC","MC","MN","MS","NT","NL","OC","PL",
            "QT","QR","SP","SL","SR","TC","TS","TL","VZ","YN","ZS","NE"));
    public ArrayList<Character> curpElem = new ArrayList<>();
    private char alphabet[];
    public Scanner input = new Scanner(System.in);
    private int i,j;
    private int power;
    
    public void readAlphabet(){
        int n,op,c1,c2;
        String s1,s2;
        if(eAlphabet.isEmpty())
            System.out.println("Nuevo alfabeto :D !!!\n");
        else{
            eAlphabet.clear();
            alphabet = new char[0];
            System.out.println("Se ha eliminado el alfabeto anterior!!! :D\n");
        }
        System.out.println("Como desea agregar los elementos del alfabeto?");
        System.out.println("1) Por rangos\n2) Por nùmero de elementos");
        op = input.nextInt();
        
        if(op==1){
            input.nextLine();
            System.out.println("Ingresa el primer caracter (a-z):");
            s1 = ""+input.nextLine().charAt(0);
            System.out.println("Ingresa el segundo caracter (a-z):");
            s2 = ""+input.nextLine().charAt(0);
            c1 = s1.charAt(0);
            c2 = s2.charAt(0);
            for(i=c1;i<=c2;i++){
                eAlphabet.add((char) i);
            }
            System.out.println("Tu alfabeto es: "+eAlphabet.toString());
        }
        
        else{
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
    }
    public void generateLanguage(){
        if(eAlphabet.isEmpty()==false){
            int elements1, elements2;
            int length1, length2;
            int index1, index2;
            String word;
            Random  rnd = new Random();
            do{
                System.out.println("Ingresa la cantidas de palabras que va a contener el Lenguaje 1:");
                elements1 = input.nextInt();
                if(elements1>0){
                    do{
                        System.out.println("Ingresa la longitud de las palabras del Lenguaje 1:");
                        length1 = input.nextInt();
                        for(i=0;i<elements1;i++){
                            word = "";
                            for(j=0;j<length1;j++){
                                index1 = rnd.nextInt(eAlphabet.size());
                                word += eAlphabet.get(index1);
                            }
                            language1.add(word);
                            l1.add(word);
                        }
                    }while(length1<=0);
                }
            }while(elements1<=0);
            do{
                System.out.println("Ingresa la cantidas de palabras que va a contener el Lenguaje 2:");
                elements2 = input.nextInt();
                if(elements2>0){
                    do{
                        System.out.println("Ingresa la longitud de las palabras del Lenguaje 2:");
                        length2 = input.nextInt();
                        for(i=0;i<elements2;i++){
                            word= "";
                            for(j=0;j<length2;j++){
                                index2 = rnd.nextInt(eAlphabet.size());
                                word += eAlphabet.get(index2);
                            }
                            language2.add(word);
                            l2.add(word);
                        }
                    }while(length2<=0);
                }
            }while(elements2<=0);
            System.out.println("El Lenguaje L1 = "+language1.toString());
            System.out.println("El Lenguaje L2 = "+language2.toString());
        }
        else
            System.out.println("Primero ingresa un Alfabeto!!!!");
    }
    
    public void generateJoint(){
        if(l1.isEmpty()==false&&l2.isEmpty()==false||eAlphabet.isEmpty()==false){
            l1Ul2.clear();
            l1Ul2.addAll(l1);
            l1Ul2.addAll(l2);
            System.out.println("L1UL2 = "+l1Ul2.toString());
        }
        else
            System.out.println("Primero ingresa un alfabeto y luego los lenguajes!!!");
    }
    
    public void generateConcat(){
        if(l1.isEmpty()==false&&l2.isEmpty()==false||eAlphabet.isEmpty()==false){
            l1l2.clear();
            String concat;
            for(i=0;i<language1.size();i++){
                for(j=0;j<language2.size();j++){
                    concat = language1.get(i).concat(language2.get(j));
                    l1l2.add(concat);
                }
            }
            System.out.println("L1L2 = "+l1l2.toString());
        }
        else
            System.out.println("Primero ingresa un alfabeto y luego los lenguajes!!!");
    }
    
    public void generateDifference(){
        if(l1.isEmpty()==false&&l2.isEmpty()==false||eAlphabet.isEmpty()==false){
            l1minusl2.clear();
            l2minusl1.clear();
            l1minusl2.addAll(l1);
            l1minusl2.removeAll(l2);
            l2minusl1.addAll(l2);
            l2minusl1.removeAll(l1);
            System.out.println("L1-L2 = "+l1minusl2.toString());
            System.out.println("L2-L1 = "+l2minusl1.toString());
        }
        else
            System.out.println("Primero ingresa un alfabeto y luego los lenguajes!!!");
    }
    
    public void generatePower(){
        int op;
        if(l1.isEmpty()==false&&l2.isEmpty()==false||eAlphabet.isEmpty()==false){
            do{
                System.out.println("Que lenguaje deseas elevar a una potencia?");
                op = input.nextInt();
                if(op==1){
                    do{
                        System.out.println("Ingresa la potencia de tu lenguaje: ");
                        power = input.nextInt();
                        if(power==0)
                            System.out.println("L1^0= {}");
                        else if(power>0)
                            generatePosLanguagePower(languagePow, language1);
                        else if(power<0)
                            generateNegLanguagePower(languagePow, language1);
                    }while(op<-5||op>5);
                    
                }
                if(op==2){
                    do{
                        System.out.println("Ingresa la potencia de tu lenguaje: ");
                        power = input.nextInt();
                        if(power==0)
                            System.out.println("L2^0= {}");
                        else if(i>0)
                            generatePosLanguagePower(languagePow, language2);
                        else if(power<0)
                            generateNegLanguagePower(languagePow, language2);
                    }while(op<-5||op>5);
                    
                }
            }while(op<1||op>2);
        }
        else
            System.out.println("Primero ingresa un alfabeto y luego los lenguajes!!!");
    }
    
    public void generatePosLanguagePower(ArrayList<String> A, ArrayList<String> B){
        aux.clear();
        if(A.isEmpty()){
            for(i=0;i<B.size();i++){
                aux.add(B.get(i));
            }
        }
        else{
            for(i=0;i<A.size();i++){
                for(j=0;j<B.size();j++){
                    aux.add(A.get(i)+B.get(j));
                }
            }
        }
        
        power-=1;
        if(power<=0){
            A.clear();
            A.addAll(aux);
            aux.clear();
            System.out.println("La potencia de tu alfabeto es: "+Arrays.toString(A.toArray()));
            A.clear();
        }
        else{
            A.clear();
            A.addAll(aux);
            generatePosLanguagePower(A, B);
        }
    }
    
    public void generateNegLanguagePower(ArrayList<String> A, ArrayList<String> B){
        aux.clear();
        String cad;
        String inverse;
        if(A.isEmpty()){
            for(i=0;i<B.size();i++){
                cad = B.get(i);
                inverse = "";
                for(j=cad.length()-1;j>=0;j--){
                    inverse += cad.charAt(j);
                }
                aux.add(inverse);
                inverses.add(inverse);
            }
        }
        else{
            for(i=0;i<A.size();i++){
                for(j=0;j<B.size();j++){
                    aux.add(A.get(i)+B.get(j));
                }
            }
        }
        
        power+=1;
        if(power>=0){
            A.clear();
            A.addAll(aux);
            aux.clear();
            System.out.println("La potencia de tu alfabeto es: "+Arrays.toString(A.toArray()));
            A.clear();
        }
        else{
            A.clear();
            A.addAll(aux);
            generateNegLanguagePower(A, inverses);
        }
    }
    public void generateCURP(){
        String nombres[];
        String nombre;
        String apPaterno;
        String apMaterno;
        String curp="";
        String n;
        String año, mes, diaN;
        int numN;
        int añoNac;
        int mesNac;
        int diaNac;
        int genero;
        int efId;
        if(curpElem.isEmpty())
            System.out.println("Creación de un nuevo curp :D");
        boolean dia = true;
        boolean curpValido;
        do{
            System.out.println("Cuantos nombres tienes?:");
            numN = input.nextInt();
            nombres = new String[numN];
        }while(numN<=0);
        input.nextLine();
        for(i=0;i<numN;i++){
            System.out.println("Ingresa el nombre "+(i+1));
            nombre = input.nextLine();
            nombres[i] = nombre;
        }
        System.out.println("Ingresa tu apellido paterno:");
        apPaterno = input.nextLine();
        System.out.println("Ingresa tu apellido materno:");
        apMaterno = input.nextLine();
        do{
            System.out.println("Ingresa tu año de nacimiento:");
            añoNac = input.nextInt();
        }while(añoNac>2016||añoNac<1900);
        do{
            System.out.println("Ingresa tu mes de nacimiento:");
            mesNac = input.nextInt();
        }while(mesNac<0||mesNac>12);
        do{
            System.out.println("Ingresa tu día de nacimiento:");
            diaNac = input.nextInt();
            switch (mesNac) {
                case 4:
                case 6:
                case 9:
                case 11:
                    dia = !(diaNac<1||diaNac>30);
                    break;
                case 1:
                case 3:
                case 7:
                case 8:
                case 10:
                case 12:
                    dia = !(diaNac<1||diaNac>31);
                    break;
                case 2:
                    if(añoNac%4==0)
                        dia = !(diaNac<1||diaNac>29);
                    else if(añoNac%4!=0)
                        dia = !(diaNac<1||diaNac>28);
                    break;
                default:
                    break;
            }
        }while(dia==false);
        do{
            System.out.println("Selecciona tu género: \n(1) Hombre\n(2) Mujer");
            System.out.println("Ingresa tu seleccion:");
            genero = input.nextInt();
        }while(genero<1||genero>2);
        do{
            System.out.println("Selecciona la clave de tu entidad federativa de nacimiento: ");
            System.out.println(
                    " Entidad federativa       Clave\n" +
                    "(1)  Aguascalientes 	AS\n" +
                    "(2)  Baja California 	BC\n" +
                    "(3)  Baja California Sur 	BS\n" +
                    "(4)  Campeche 	        CC\n" +
                    "(5)  Coahuila 	        CL\n" +
                    "(6)  Colima                CM\n" +
                    "(7)  Chiapas               CS\n" +
                    "(8)  Chihuahua             CH\n" +
                    "(9)  Distrito Federal 	DF\n" +
                    "(10) Durango               DG\n" +
                    "(11) Guanajuato            GT\n" +
                    "(12) Guerrero              GR\n" +
                    "(13) Hidalgo               HG\n" +
                    "(14) Jalisco               JC\n" +
                    "(15) México                MC\n" +
                    "(16) Michoacán             MN\n" +
                    "(17) Morelos               MS\n" +
                    "(18) Nayarit               NT\n" +
                    "(19) Nuevo León            NL\n" +
                    "(20) Oaxaca                OC\n" +
                    "(21) Puebla                PL\n" +
                    "(22) Querétaro             QT\n" +
                    "(23) Quintana Roo          QR\n" +
                    "(24) San Luis Potosí 	SP\n" +
                    "(25) Sinaloa               SL\n" +
                    "(26) Sonora        	SR\n" +
                    "(27) Tabasco               TC\n" +
                    "(28) Tamaulipas            TS\n" +
                    "(29) Tlaxcala      	TL\n" +
                    "(30) Veracruz              VZ\n" +
                    "(31) Yucatán               YN\n" +
                    "(32) Zacatecas     	ZS\n" +
                    "(33) Nacido Extranjero 	NE\n");
            System.out.println("Ingresa tu seleccion: ");
            efId = input.nextInt();
        }while(efId<1||efId>33);
        curpElem.add(apPaterno.charAt(0));
        for(i=1;i<apPaterno.length();i++){
            if(apPaterno.charAt(i)=='A'||apPaterno.charAt(i)=='E'||apPaterno.charAt(i)=='I'||apPaterno.charAt(i)=='O'||apPaterno.charAt(i)=='U'){
                curpElem.add(apPaterno.charAt(i));
                break;
            } 
        }
        curpElem.add(apMaterno.charAt(0));
        n = nombres[nombres.length-1];
        curpElem.add(n.charAt(0));
        año = String.valueOf(añoNac);
        curpElem.add(año.charAt(2));
        curpElem.add(año.charAt(3));
        if(mesNac<10){
            mes = String.valueOf(mesNac);
            curpElem.add('0');
            curpElem.add(mes.charAt(0));
        }
        else if(mesNac>=10){
            mes = String.valueOf(mesNac);
            curpElem.add(mes.charAt(0));
            curpElem.add(mes.charAt(1));
        }
        if(diaNac<10){
            diaN = String.valueOf(diaNac);
            curpElem.add('0');
            curpElem.add(diaN.charAt(0));
        }
        else if(diaNac>=10){
            diaN = String.valueOf(diaNac);
            curpElem.add(diaN.charAt(0));
            curpElem.add(diaN.charAt(1));
        }
        if(genero==1)
            curpElem.add('H');
        else 
            curpElem.add('M');
        curpElem.add(claves.get(efId-1).charAt(0));
        curpElem.add(claves.get(efId-1).charAt(1));
        for(i=1;i<apPaterno.length();i++){
            if(apPaterno.charAt(i)!='A'&&apPaterno.charAt(i)!='E'&&apPaterno.charAt(i)!='I'&&apPaterno.charAt(i)!='O'&&apPaterno.charAt(i)!='U'){
                curpElem.add(apPaterno.charAt(i));
                break;
            } 
        }
        for(i=1;i<apMaterno.length();i++){
            if(apMaterno.charAt(i)!='A'&&apMaterno.charAt(i)!='E'&&apMaterno.charAt(i)!='I'&&apMaterno.charAt(i)!='O'&&apMaterno.charAt(i)!='U'){
                curpElem.add(apMaterno.charAt(i));
                break;
            } 
        }
        for(i=1;i<n.length();i++){
            if(n.charAt(i)!='A'&&n.charAt(i)!='E'&&n.charAt(i)!='I'&&n.charAt(i)!='O'&&n.charAt(i)!='U'){
                curpElem.add(n.charAt(i));
                break;
            } 
        }
        curpElem.add('0');
        curpElem.add('1');
        for(i=0; i<curpElem.size();i++)
            curp += ""+curpElem.get(i);
        curpValido = validateCURP(curp);
        if(curpValido==true)
            System.out.println("La CURP: "+curp+" es válida!!!");
        else
            System.out.println("La CURP: "+curp+" no es válida :/");
    }
    
    public void generateRandomCURP(){
        curpElem.clear();
        Random rnd = new Random();
        int gen, posN, posAP, posAM, posAño, posMes, posDia, posClave;
        String name;
        String curp = "";
        gen = rnd.nextInt()*1;
        boolean curpValido;
        boolean dia=true;
        posAP = rnd.nextInt(apellidos.size());
        String apPaterno = apellidos.get(posAP);
        curpElem.add(apPaterno.charAt(0));
        for(i=1;i<apPaterno.length();i++){
            if(apPaterno.charAt(i)=='A'||apPaterno.charAt(i)=='E'||apPaterno.charAt(i)=='I'||apPaterno.charAt(i)=='O'||apPaterno.charAt(i)=='U'){
                curpElem.add(apPaterno.charAt(i));
                break;
            } 
        }
        posAM = rnd.nextInt(apellidos.size());
        String apMaterno = apellidos.get(posAM);
        curpElem.add(apMaterno.charAt(0));
        if(gen==1){
            posN = rnd.nextInt(nombresH.size());
            name = nombresH.get(posN);
            curpElem.add(name.charAt(0));
        }
            
        else{
            posN = rnd.nextInt(nombresM.size());
            name = nombresM.get(posN);
            curpElem.add(name.charAt(0));
        }
        posAño = rnd.nextInt(años.length);
        int añoNac = años[posAño];
        String año = String.valueOf(añoNac);
        curpElem.add(año.charAt(2));
        curpElem.add(año.charAt(3));
        posMes = rnd.nextInt(meses.length);
        int mesNac = meses[posMes];
        String mes;
        if(mesNac<10){
            mes = String.valueOf(mesNac);
            curpElem.add('0');
            curpElem.add(mes.charAt(0));
        }
        else if(mesNac>=10){
            mes = String.valueOf(mesNac);
            curpElem.add(mes.charAt(0));
            curpElem.add(mes.charAt(1));
        }
        posDia = rnd.nextInt(dias.length);
        String diaN;
        int diaNac = dias[posDia];
        if(diaNac<10){
            diaN = String.valueOf(diaNac);
            curpElem.add('0');
            curpElem.add(diaN.charAt(0));
        }
        else if(diaNac>=10){
            diaN = String.valueOf(diaNac);
            curpElem.add(diaN.charAt(0));
            curpElem.add(diaN.charAt(1));
        }
        if(gen==1)
            curpElem.add('H');
        else 
            curpElem.add('M');
        posClave = rnd.nextInt(claves.size());
        curpElem.add(claves.get(posClave).charAt(0));
        curpElem.add(claves.get(posClave).charAt(1));
        for(i=1;i<apPaterno.length();i++){
            if(apPaterno.charAt(i)!='A'&&apPaterno.charAt(i)!='E'&&apPaterno.charAt(i)!='I'&&apPaterno.charAt(i)!='O'&&apPaterno.charAt(i)!='U'){
                curpElem.add(apPaterno.charAt(i));
                break;
            } 
        }
        for(i=1;i<apMaterno.length();i++){
            if(apMaterno.charAt(i)!='A'&&apMaterno.charAt(i)!='E'&&apMaterno.charAt(i)!='I'&&apMaterno.charAt(i)!='O'&&apMaterno.charAt(i)!='U'){
                curpElem.add(apMaterno.charAt(i));
                break;
            } 
        }
        for(i=1;i<name.length();i++){
            if(name.charAt(i)!='A'&&name.charAt(i)!='E'&&name.charAt(i)!='I'&&name.charAt(i)!='O'&&name.charAt(i)!='U'){
                curpElem.add(name.charAt(i));
                break;
            } 
        }
        curpElem.add('0');
        curpElem.add('1');
        for(i=0; i<curpElem.size();i++)
            curp += ""+curpElem.get(i);
        curpValido = validateCURP(curp);
        if(curpValido==true){
            System.out.println("Nombre: "+name+"\nApellido Paterno: "+apPaterno);
            System.out.println("Apellido Materno: "+apMaterno+"\nAño Nac.: "+añoNac);
            System.out.println("Dia Nac.: "+diaNac+"\nMes Nac.: "+mesNac);
            System.out.println("Entidad de Nac.:"+claves.get(posClave));   
            System.out.println("La CURP: "+curp+" es válida!!!");   
            switch (mesNac) {
                case 4:
                case 6:
                case 9:
                case 11:
                    dia = !(diaNac<1||diaNac>30);
                    break;
                case 1:
                case 3:
                case 7:
                case 8:
                case 10:
                case 12:
                    dia = !(diaNac<1||diaNac>31);
                    break;
                case 2:
                    if(añoNac%4==0)
                        dia = !(diaNac<1||diaNac>29);
                    else if(añoNac%4!=0)
                        dia = !(diaNac<1||diaNac>28);
                    break;
                default:
                    break;
        }
            if(dia==false)
                System.out.println("La expresión regular de la CURP es válida, sin embargo la fecha de nacimiento no es válida :/");
        }
        
        else
            System.out.println("La CURP: "+curp+" no es válida :/");
    }
     
    public void readCurp(){
        input.nextLine();
        System.out.println("Ingresa el curp:");
        String curp = input.nextLine();
        boolean validez;
        validez = validateCURP (curp);
        if(validez==true)
            System.out.println("La CURP ingresada es válida!!!");
        else
            System.out.println("La CURP ingresada no es válida!!!");
    }
    
    public boolean validateCURP(String curp)
    { 
        String regex =
            "[A-Z]{1}[AEIOU]{1}[A-Z]{2}[0-9]{2}" +
            "(0[1-9]|1[0-2])(0[1-9]|1[0-9]|2[0-9]|3[0-1])" +
            "[HM]{1}" +
            "(AS|BC|BS|CC|CS|CH|CL|CM|DF|DG|GT|GR|HG|JC|MC|MN|MS|NT|NL|OC|PL|QT|QR|SP|SL|SR|TC|TS|TL|VZ|YN|ZS|NE)" +
            "[B-DF-HJ-NP-TV-Z]{3}" +
            "[0-9A-Z]{1}[0-9]{1}$";
    Pattern patron = Pattern.compile(regex);
        return patron.matcher(curp).matches();
    }
}
