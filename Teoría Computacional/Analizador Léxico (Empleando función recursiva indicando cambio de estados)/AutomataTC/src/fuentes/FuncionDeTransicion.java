package fuentes;

public class FuncionDeTransicion {
    Metodos m = new Metodos();
    Estados e=new Estados();
    public void cambioDeEstado(String s, int a, int b){
       if(b < s.length()){
       Character c = s.charAt(b);    
       b++;
       switch(a){
           case 0:
               e.q0(c, s, a, b);
               break;
            case 1:
                e.q1(c, s, a, b);
                break;
            case 2:
                e.q2(c, s, a, b);
                break;
            case 3:
                e.q3(c, s, a, b);
                break;
            case 4:
                e.q4(c, s, a, b);
                break;
            case 5:
                e.q5(c, s, a, b);
                break;
            case 6:
                e.q6(c, s, a, b);
                break;
            case 7:
                e.q7(c, s, a, b);
                break;
            case 8:
                e.q8(c, s, a, b);
                break;
            case 9:
                e.q9(c, s, a, b);
                break;
            case 10:
                e.q10(c, s, a, b);
                break;
            case 11:
                e.q11(c, s, a, b);
                break;
            default:
                break;
        }
   }
       else{
           switch(a){
               case 1:
                   m.esperar();
                   System.out.println("Formato de número entero válido");
                   break;
               case 3:
                   m.esperar();
                   System.out.println("Número '0', formato válido");
                   break;
               case 5:
                   m.esperar();
                   System.out.println("Formato de número real válido");
                   break;
               case 8:
                   m.esperar();
                   System.out.println("Formato de número real con exponente válido");
                   break;
               case 9:
                   m.esperar();
                   System.out.println("Formato de número octal válido");
                   break;
               case 11:
                   m.esperar();
                   System.out.println("Formato de número hexadecimal válido");
                   
           }
       }
   }
       
}
