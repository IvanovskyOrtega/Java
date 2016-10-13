package fuentes;

public class FuncionDeTransicion {
    Metodos m = new Metodos();
    Estados e=new Estados();
    public boolean cambioDeEstado(String s, int a, int b, int n){
       if(b < s.length()){
       Character c = s.charAt(b);    
       b++;
       switch(a){
           case 0:
               return e.q0(c, s, a, b, n);
            case 1:
               return e.q1(c, s, a, b, n);
            case 2:
                return e.q2(c, s, a, b, n);
            case 3:
                return e.q3(c, s, a, b, n);
            case 4:
                return e.q4(c, s, a, b, n);
            case 5:
                return e.q5(c, s, a, b, n);
            case 6:
                return e.q6(c, s, a, b, n);
            case 7:
                return e.q7(c, s, a, b, n);
            case 8:
                return e.q8(c, s, a, b, n);
            case 9:
                return e.q9(c, s, a, b, n);
            case 10:
                return e.q10(c, s, a, b, n);
            case 11:
                return e.q11(c, s, a, b, n);
            default:
                return false;
        }
   }
       else{
           switch(a){
               case 1:
                   System.out.println("Formato de número entero válido");
                   return true;
               case 3:
                   System.out.println("Número '0', formato válido");
                   return true;
               case 5:
                   System.out.println("Formato de número real válido");
                   return true;
               case 8:
                   System.out.println("Formato de número real con exponente válido");
                   return true;
               case 9:
                   System.out.println("Formato de número octal válido");
                   return true;
               case 11:
                   System.out.println("Formato de número hexadecimal válido");
                   return true;
               default:
                   return false;
                   
           }
       }
   }
       
}