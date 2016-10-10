package fuentes;

public class FuncionDeTransicion {
    Metodos m = new Metodos();
    public void cambioDeEstado(String s, int a, int b){
       if(b < s.length()){
       Character c = s.charAt(b);    
       b++;
       switch(a){
           case 0:
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
                        System.out.println("q0 ---> q1");
                        m.esperar();
                        cambioDeEstado(s,1,b);
                        break;
                    case '0':
                        m.esperar();
                        System.out.println("q0 ---> q3");
                        m.esperar();
                        cambioDeEstado(s,3,b);
                        break;
                    case '+':
                    case '-':
                        m.esperar();
                        System.out.println("q0 ---> q2");
                        m.esperar();
                        cambioDeEstado(s,2,b);
                        break;
                    case 'A':
                    case 'B':
                    case 'C':
                    case 'D':
                    case 'E':
                    case 'F':
                    case 'x':
                    default:
                        m.esperar();
                        System.out.println("q0 ---> M");
                        System.out.println("Formato inválido o cadena no soportada");
                        m.esperar();
                        break;
               }
               break;
            case 1:
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
                        System.out.println("q1 ---> q1");
                        m.esperar();
                        cambioDeEstado(s,1,b);
                        break;
                    case '.':
                        m.esperar();
                        System.out.println("q1 ---> q4");
                        m.esperar();
                        cambioDeEstado(s,4,b);
                        break;
                    case 'A':
                    case 'B':
                    case 'C':
                    case 'D':
                    case 'E':
                    case 'F':
                    case 'x':   
                    default:
                        m.esperar();
                        System.out.println("q0 ---> M");
                        System.out.println("Formato inválido o cadena no soportada");
                        m.esperar();
                        break;
                }
                break;
            case 2:
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
                        System.out.println("q2 ---> q1");
                        m.esperar();
                        cambioDeEstado(s,1,b);
                        break;
                    case '.':
                        m.esperar();
                        System.out.println("q2 ---> q4");
                        m.esperar();
                        cambioDeEstado(s,4,b);
                        break;
                    case '0':
                        m.esperar();
                        System.out.println("q2 ---> q3");
                        m.esperar();
                        cambioDeEstado(s,3,b);
                        break;
                    case 'A':
                    case 'B':
                    case 'C':
                    case 'D':
                    case 'E':
                    case 'F':
                    case 'x':    
                    default:
                        m.esperar();
                        System.out.println("q2 ---> M");
                        System.out.println("Formato inválido o cadena no soportada");
                        m.esperar();
                        break;
                }
                break;
            case 3:
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
                        System.out.println("q3 ---> q9");
                        m.esperar();
                        cambioDeEstado(s,9,b);
                        break;
                    case 'x':
                        m.esperar();
                        System.out.println("q3 ---> q10");
                        m.esperar();
                        cambioDeEstado(s,10,b);
                        break;
                    case '.':
                        m.esperar();
                        System.out.println("q3 ---> q4");
                        m.esperar();
                        cambioDeEstado(s,4,b);
                        break;
                    case 'A':
                    case 'B':
                    case 'C':
                    case 'D':
                    case 'E':
                    case 'F':
                    case '8':
                    case '9':
                    default:
                        m.esperar();
                        System.out.println("q2 ---> M");
                        System.out.println("Formato inválido o cadena no soportada");
                        m.esperar();
                        break;
                }
                break;
            case 4:
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
                        System.out.println("q4 ---> q5");
                        m.esperar();
                        cambioDeEstado(s,5,b);
                        break;
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
                        System.out.println("q4 ---> M");
                        System.out.println("Formato inválido o cadena no soportada");
                        m.esperar();
                        break;
                }
                break;
            case 5:
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
                        System.out.println("q5 ---> q5");
                        m.esperar();
                        cambioDeEstado(s,5,b);
                        break;
                    case 'E':
                        m.esperar();
                        System.out.println("q5 ---> q6");
                        m.esperar();
                        cambioDeEstado(s,6,b);
                        break;
                    case 'A':
                    case 'B':
                    case 'C':
                    case 'D':
                    case '.':
                    case 'F':
                    case 'x':
                    default: 
                        m.esperar();
                        System.out.println("q5 ---> M");
                        System.out.println("Formato inválido o cadena no soportada");
                        m.esperar();
                        break;
                }
                break;
            case 6:
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
                        System.out.println("q6 ---> q8");
                        m.esperar();
                        cambioDeEstado(s,8,b);
                        break;
                    case '+':
                    case '-':
                        m.esperar();
                        System.out.println("q6 ---> q7");
                        m.esperar();
                        cambioDeEstado(s,7,b);
                        break;
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
                        System.out.println("q6 ---> M");
                        System.out.println("Formato inválido o cadena no soportada");
                        m.esperar();
                        break;
                }
                break;
            case 7:
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
                        System.out.println("q7 ---> q8");
                        m.esperar();
                        cambioDeEstado(s,8,b);
                        break;
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
                        System.out.println("q7 ---> M");
                        System.out.println("Formato inválido o cadena no soportada");
                        m.esperar();
                        break;
                }
                break;
            case 8:
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
                        System.out.println("q8 ---> q8");
                        m.esperar();
                        cambioDeEstado(s,8,b);
                        break;
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
                        System.out.println("q8 ---> M");
                        System.out.println("Formato inválido o cadena no soportada");
                        m.esperar();
                        break;
                }
                break;
            case 9:
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
                        System.out.println("q9 ---> q9");
                        m.esperar();
                        cambioDeEstado(s,9,b);
                        break;
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
                    default: 
                        m.esperar();
                        System.out.println("q9 ---> M");
                        System.out.println("Formato inválido o cadena no soportada");
                        m.esperar();
                        break;
                }
                break;
            case 10:
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
                        System.out.println("q10 ---> q11");
                        m.esperar();
                        cambioDeEstado(s,11,b);
                        break;
                    case 'x':
                    case '.':
                    default: 
                        m.esperar();
                        System.out.println("q9 ---> M");
                        System.out.println("Formato inválido o cadena no soportada");
                        m.esperar();
                        break;
                }
                break;
            case 11:
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
                        System.out.println("q11 ---> q11");
                        m.esperar();
                        cambioDeEstado(s,11,b);
                        break;
                    case 'x':
                    case '.':
                    default: 
                        m.esperar();
                        System.out.println("q11 ---> M");
                        System.out.println("Formato inválido o cadena no soportada");
                        m.esperar();
                        break;
                }
                break;
            default:
                break;
        }
   }
       else{
           switch(a){
               case 1:
                   System.out.println("Formato de número entero válido");
                   break;
               case 3:
                   System.out.println("Número '0', formato válido");
                   break;
               case 5:
                   System.out.println("Formato de número real válido");
                   break;
               case 8:
                   System.out.println("Formato de número real con exponente válido");
                   break;
               case 9:
                   System.out.println("Formato de número octal válido");
                   break;
               case 11:
                   System.out.println("Formato de número hexadecimal válido");
                   
           }
       }
   }
       
}

