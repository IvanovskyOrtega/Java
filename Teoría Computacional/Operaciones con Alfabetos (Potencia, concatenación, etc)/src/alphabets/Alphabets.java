package alphabets;

/**
 *
 * @author Ivan Ortega Victoriano
 */
public class Alphabets {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int op;
        int pot=0;
        Operations ob;
        ob = new Operations();
        do{
             System.out.print("OPERACIONES CON ALFABETOS\n");
             System.out.print("Menú:\n");
             System.out.print("1)Ingresar alfabeto\n");
             System.out.print("2)Ingresar cadenas w1 y w2\n");
             System.out.print("3)Generar potencia de w1w2\n");
             System.out.print("4)Ocurrencias de un simbolo en w1\n");
             System.out.print("5)Leer cadena z\n");
             System.out.print("6)Potencia del alfabeto\n");
             System.out.print("7)Salir\n");
             System.out.print("\n\nIngresa tu seleccion: ");
             op = ob.input.nextInt();
             switch(op){
                 case 1:
                     ob.readAlphabet();
                     break;
                 case 2:
                     ob.readStrings();
                     break;
                 case 3:
                     ob.concatenation();
                     break;
                 case 4:
                     ob.occurrences();
                     break;
                 case 5:
                     ob.readZ();
                     break;
                 case 6:
                     if(ob.eAlphabet.isEmpty())
                         System.out.println("Primero Ingresa un alfabeto!!!!");
                     else{
                         System.out.println("Ingresa la potencia del alfabeto:");
                         ob.x = ob.input.nextInt();
                         System.out.print("La potencia del alfabeto es Σ^"+ob.x+" = {\n");
                         if(ob.x==0)
                             System.out.print("λ\n}\n");
                         else if(ob.x < 0)
                             System.out.println("No es una potencia válida!!!");
                         else{
                             ob.generarPotencia(ob.powAlphabet, ob.eAlphabet);   
                             System.out.println("}");  
                         } 
                    }
                     break;
                 case 7:
                     break;
                 default:
                     System.out.println("Selección no válida.");
                     System.out.println("Por favor ingrese una opción válida.\n");
                     break;
             }
        }while(op!=7);
        
    }
    
}

