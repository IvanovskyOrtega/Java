package fuentes;

public class Estados {
    Metodos m = new Metodos();
    public boolean q0(Character c,String s, int a, int b, int n){
        FuncionDeTransicion F=new FuncionDeTransicion();
        switch(c){
                    case '1':
                    case '2':
                    case '3':
                    case '4':
                    case '5':
                    case '6':
                    case '7':
                    case '8':
                    case '9':
                        m.esperar();
                        System.out.println("δ(q0, "+c+" ) ---> q1");
                        m.esperar();
                        return F.cambioDeEstado(s,1,b,n);
                    case '0':
                        m.esperar();
                        System.out.println("δ(q0, "+c+" ) ---> q3");
                        m.esperar();
                        return F.cambioDeEstado(s,3,b,n);
                    case '+':
                    case '-':
                        m.esperar();
                        System.out.println("δ(q0, "+c+" ) ---> q2");
                        m.esperar();
                        return F.cambioDeEstado(s,2,b,n);
                    case 'A':
                    case 'B':
                    case 'C':
                    case 'D':
                    case 'E':
                    case 'F':
                    case 'x':
                    default:
                        m.esperar();
                        System.out.println("δ(q0, "+c+" ) ---> M");
                        System.out.println("Formato inválido o cadena no soportada");
                        m.esperar();
                        return F.cambioDeEstado(s,12,b,n);
        }
    }
    public boolean q1(Character c,String s, int a, int b, int n){
       FuncionDeTransicion F=new FuncionDeTransicion();
       switch(c){
                    case '1':
                    case '2':
                    case '3':
                    case '4':
                    case '5':
                    case '6':
                    case '7':
                    case '8':
                    case '9':
                    case '0':
                        m.esperar();
                        System.out.println("δ(q1, "+c+" ) ---> q1");
                        m.esperar();
                        return F.cambioDeEstado(s,1,b,n);
                    case '.':
                        m.esperar();
                        System.out.println("δ(q1, "+c+" ) ---> q4");
                        m.esperar();
                        return F.cambioDeEstado(s,4,b,n);
                    case ';':
                        if(b == s.length())
                            return F.cambioDeEstado(s,1,b,n);//Cierra inicialización de variable
                        else{
                            m.esperar();
                            System.out.println("δ(q1, "+c+" )  ---> M");// Mal cierre en la variable
                            System.out.println("Formato inválido o cadena no soportada");
                            m.esperar();
                            return F.cambioDeEstado(s,12,b,n);
                        }
                    case 'A':
                    case 'B':
                    case 'C':
                    case 'D':
                    case 'E':
                    case 'F':
                    case 'x':
                    case '+':
                    case '-':
                    default:
                        m.esperar();
                        System.out.println("δ(q1, "+c+" ) ---> M");
                        System.out.println("Formato inválido o cadena no soportada");
                        m.esperar();
                        return F.cambioDeEstado(s,12,b,n);
                }
    }
    public boolean q2(Character c,String s, int a, int b, int n){
        FuncionDeTransicion F=new FuncionDeTransicion();
        switch(c){
                    case '1':
                    case '2':
                    case '3':
                    case '4':
                    case '5':
                    case '6':
                    case '7':
                    case '8':
                    case '9':
                        m.esperar();
                        System.out.println("δ(q2, "+c+" ) ---> q1");
                        m.esperar();
                        return F.cambioDeEstado(s,1,b,n);
                    case '.':
                        m.esperar();
                        System.out.println("δ(q2, "+c+" ) ---> q4");
                        m.esperar();
                        return F.cambioDeEstado(s,4,b,n);
                    case '0':
                        m.esperar();
                        System.out.println("δ(q2, "+c+" ) ---> q3");
                        m.esperar();
                        return F.cambioDeEstado(s,3,b,n);
                    case 'A':
                    case 'B':
                    case 'C':
                    case 'D':
                    case 'E':
                    case 'F':
                    case 'x':
                    case '+':
                    case '-':
                    default:
                        m.esperar();
                        System.out.println("δ(q2, "+c+" ) ---> M");
                        System.out.println("Formato inválido o cadena no soportada");
                        m.esperar();
                        return F.cambioDeEstado(s,12,b,n);
                }
    }
    public boolean q3(Character c,String s, int a, int b, int n){
        FuncionDeTransicion F=new FuncionDeTransicion();
        switch(c){
                    case '1':
                    case '2':
                    case '3':
                    case '4':
                    case '5':
                    case '6':
                    case '7':
                    case '0':
                        m.esperar();
                        System.out.println("δ(q3, "+c+" ) ---> q9");
                        m.esperar();
                        return F.cambioDeEstado(s,9,b,n);
                    case 'x':
                        m.esperar();
                        System.out.println("δ(q3, "+c+" ) ---> q10");
                        m.esperar();
                        return F.cambioDeEstado(s,10,b,n);
                    case '.':
                        m.esperar();
                        System.out.println("δ(q3, "+c+" ) ---> q4");
                        m.esperar();
                        return F.cambioDeEstado(s,4,b,n);
                    case ';':
                        if(b == s.length())
                            return F.cambioDeEstado(s,3,b,n);//Cierra inicialización de variable
                        else{
                            m.esperar();
                            System.out.println("δ(q3, "+c+" )  ---> M");// Mal cierre en la variable
                            System.out.println("Formato inválido o cadena no soportada");
                            m.esperar();
                            return F.cambioDeEstado(s,12,b,n);
                        }
                    case 'A':
                    case 'B':
                    case 'C':
                    case 'D':
                    case 'E':
                    case 'F':
                    case '8':
                    case '9':
                    case '+':
                    case '-':
                    default:
                        m.esperar();
                        System.out.println("δ(q3, "+c+" ) ---> M");
                        System.out.println("Formato inválido o cadena no soportada");
                        m.esperar();
                        return F.cambioDeEstado(s,12,b,n);
                }
    }
    public boolean q4(Character c,String s, int a, int b, int n){
        FuncionDeTransicion F=new FuncionDeTransicion();
        switch(c){
                    case '1':
                    case '2':
                    case '3':
                    case '4':
                    case '5':
                    case '6':
                    case '7':
                    case '8':
                    case '9':
                    case '0':
                        m.esperar();
                        System.out.println("δ(q4, "+c+" ) ---> q5");
                        m.esperar();
                        return F.cambioDeEstado(s,5,b,n);
                    case 'A':
                    case 'B':
                    case 'C':
                    case 'D':
                    case 'E':
                    case 'F':
                    case 'x':
                    case '.':
                    case '+':
                    case '-':
                    default: 
                        m.esperar();
                        System.out.println("δ(q4, "+c+" ) ---> M");
                        System.out.println("Formato inválido o cadena no soportada");
                        m.esperar();
                        return F.cambioDeEstado(s,12,b,n);
                }
    }
    public boolean q5(Character c,String s, int a, int b, int n){
        FuncionDeTransicion F=new FuncionDeTransicion();
        switch(c){
                    case '1':
                    case '2':
                    case '3':
                    case '4':
                    case '5':
                    case '6':
                    case '7':
                    case '8':
                    case '9':
                    case '0':
                        m.esperar();
                        System.out.println("δ(q5, "+c+" ) ---> q5");
                        m.esperar();
                        return F.cambioDeEstado(s,5,b,n);
                    case 'E':
                        m.esperar();
                        System.out.println("δ(q5, "+c+" ) ---> q6");
                        m.esperar();
                        return F.cambioDeEstado(s,6,b,n);
                    case ';':
                        if(b == s.length())
                            return F.cambioDeEstado(s,5,b,n);//Cierra inicialización de variable
                        else{
                            m.esperar();
                            System.out.println("δ(q5, "+c+" )  ---> M");// Mal cierre en la variable
                            System.out.println("Formato inválido o cadena no soportada");
                            m.esperar();
                            return F.cambioDeEstado(s,12,b,n);
                        }
                    case 'A':
                    case 'B':
                    case 'C':
                    case 'D':
                    case '.':
                    case 'F':
                    case 'x':
                    case '+':
                    case '-':
                    default: 
                        m.esperar();
                        System.out.println("δ(q5, "+c+" ) ---> M");
                        System.out.println("Formato inválido o cadena no soportada");
                        m.esperar();
                        return F.cambioDeEstado(s,12,b,n);
                }
    }
    public boolean q6(Character c,String s, int a, int b, int n){
        FuncionDeTransicion F=new FuncionDeTransicion();
        switch(c){
                    case '1':
                    case '2':
                    case '3':
                    case '4':
                    case '5':
                    case '6':
                    case '7':
                    case '8':
                    case '9':
                    case '0':
                        m.esperar();
                        System.out.println("δ(q6, "+c+" ) ---> q8");
                        m.esperar();
                        return F.cambioDeEstado(s,8,b,n);
                    case '+':
                    case '-':
                        m.esperar();
                        System.out.println("δ(q6, "+c+" ) ---> q7");
                        m.esperar();
                        return F.cambioDeEstado(s,7,b,n);
                    case 'A':
                    case 'B':
                    case 'C':
                    case 'D':
                    case 'E':
                    case 'F':
                    case 'x':
                    case '.':
                    default: 
                        m.esperar();
                        System.out.println("δ(q6, "+c+" ) ---> M");
                        System.out.println("Formato inválido o cadena no soportada");
                        m.esperar();
                        return F.cambioDeEstado(s,12,b,n);
                }
    }
    public boolean q7(Character c,String s, int a, int b, int n){
        FuncionDeTransicion F=new FuncionDeTransicion();
        switch(c){
                    case '1':
                    case '2':
                    case '3':
                    case '4':
                    case '5':
                    case '6':
                    case '7':
                    case '8':
                    case '9':
                    case '0':
                        m.esperar();
                        System.out.println("δ(q7, "+c+" ) ---> q8");
                        m.esperar();
                        return F.cambioDeEstado(s,8,b,n);
                    case 'A':
                    case 'B':
                    case 'C':
                    case 'D':
                    case 'E':
                    case 'F':
                    case 'x':
                    case '.':
                    case '+':
                    case '-':
                    default: 
                        m.esperar();
                        System.out.println("δ(q7, "+c+" ) ---> M");
                        System.out.println("Formato inválido o cadena no soportada");
                        m.esperar();
                        return F.cambioDeEstado(s,12,b,n);
                }
    }
    public boolean q8(Character c,String s, int a, int b, int n){
        FuncionDeTransicion F=new FuncionDeTransicion();
        switch(c){
                    case '1':
                    case '2':
                    case '3':
                    case '4':
                    case '5':
                    case '6':
                    case '7':
                    case '8':
                    case '9':
                    case '0':
                        m.esperar();
                        System.out.println("δ(q8, "+c+" ) ---> q8");
                        m.esperar();
                        return F.cambioDeEstado(s,8,b,n);
                    case ';':
                        if(b == s.length())
                            return F.cambioDeEstado(s,8,b,n);//Cierra inicialización de variable
                        else{
                            m.esperar();
                            System.out.println("δ(q8, "+c+" )  ---> M");// Mal cierre en la variable
                            System.out.println("Formato inválido o cadena no soportada");
                            m.esperar();
                            return F.cambioDeEstado(s,12,b,n);
                        }
                    case 'A':
                    case 'B':
                    case 'C':
                    case 'D':
                    case 'E':
                    case 'F':
                    case 'x':
                    case '.':
                    case '+':
                    case '-':
                    default: 
                        m.esperar();
                        System.out.println("δ(q8, "+c+" ) ---> M");
                        System.out.println("Formato inválido o cadena no soportada");
                        m.esperar();
                        return F.cambioDeEstado(s,12,b,n);
                }
    }
    public boolean q9(Character c,String s, int a, int b, int n){
        FuncionDeTransicion F=new FuncionDeTransicion();
        switch(c){
                    case '1':
                    case '2':
                    case '3':
                    case '4':
                    case '5':
                    case '6':
                    case '7':
                    case '0':
                        m.esperar();
                        System.out.println("δ(q9, "+c+" ) ---> q9");
                        m.esperar();
                        return F.cambioDeEstado(s,9,b,n);
                    case ';':
                        if(b == s.length())
                            return F.cambioDeEstado(s,9,b,n);//Cierra inicialización de variable
                        else{
                            m.esperar();
                            System.out.println("δ(q9, "+c+" )  ---> M");// Mal cierre en la variable
                            System.out.println("Formato inválido o cadena no soportada");
                            m.esperar();
                            return F.cambioDeEstado(s,12,b,n);
                        }
                    case 'A':
                    case 'B':
                    case 'C':
                    case 'D':
                    case 'E':
                    case 'F':
                    case 'x':
                    case '.':
                    case '8':
                    case '9':
                    case '+':
                    case '-': 
                    default: 
                        m.esperar();
                        System.out.println("δ(q9, "+c+" ) ---> M");
                        System.out.println("Formato inválido o cadena no soportada");
                        m.esperar();
                        return F.cambioDeEstado(s,12,b,n);
                }
    }
    public boolean q10(Character c,String s, int a, int b, int n){
        FuncionDeTransicion F=new FuncionDeTransicion();
        switch(c){
                    case '1':
                    case '2':
                    case '3':
                    case '4':
                    case '5':
                    case '6':
                    case '7':
                    case '8':
                    case '9':    
                    case '0':
                    case 'A':
                    case 'B':
                    case 'C':
                    case 'D':
                    case 'E':
                    case 'F':
                        m.esperar();
                        System.out.println("δ(q10, "+c+" ) ---> q11");
                        m.esperar();
                        return F.cambioDeEstado(s,11,b,n);
                    case 'x':
                    case '.':
                    case '+':
                    case '-':
                    default: 
                        m.esperar();
                        System.out.println("δ(q10, "+c+" ) ---> M");
                        System.out.println("Formato inválido o cadena no soportada");
                        m.esperar();
                        return F.cambioDeEstado(s,12,b,n);
                }
    }
    public boolean q11(Character c,String s, int a, int b, int n){
        FuncionDeTransicion F=new FuncionDeTransicion();
        switch(c){
                    case '1':
                    case '2':
                    case '3':
                    case '4':
                    case '5':
                    case '6':
                    case '7':
                    case '8':
                    case '9':    
                    case '0':
                    case 'A':
                    case 'B':
                    case 'C':
                    case 'D':
                    case 'E':
                    case 'F':
                        m.esperar();
                        System.out.println("δ(q11, "+c+" ) ---> q11");
                        m.esperar();
                        return F.cambioDeEstado(s,11,b,n);
                    case ';':
                        if(b == s.length())
                            return F.cambioDeEstado(s,11,b,n);//Cierra inicialización de variable
                        else{
                            m.esperar();
                            System.out.println("δ(q11, "+c+" )  ---> M");// Mal cierre en la variable
                            System.out.println("Formato inválido o cadena no soportada");
                            m.esperar();
                            return F.cambioDeEstado(s,12,b,n);
                        }
                    case 'x':
                    case '.':
                    case '+':
                    case '-':    
                    default: 
                        m.esperar();
                        System.out.println("δ(q11, "+c+" ) ---> M");
                        System.out.println("Formato inválido o cadena no soportada");
                        m.esperar();
                        return F.cambioDeEstado(s,12,b,n);
                }
    }
}