package practica2;

/**
 *
 * @author Ivan Ortega Victoriano
 */
public class Practica2 {
    public static void main(String[] args) {
        int op;
        int pot=0;
        Operations ob;
        ob = new Operations();
        do{
            System.out.print("OPERACIONES CON ALFABETOS\n");
            System.out.print("Menú:\n");
            System.out.print("(1)Ingresar alfabeto\n");
            System.out.print("(2)Generar Lenguajes L1 y L2\n");
            System.out.print("(3)Generar L1 U L2\n");
            System.out.print("(4)Generar L1L2\n");
            System.out.print("(5)Generar L1-L2 y L2-L1\n");
            System.out.print("(6)Generar potencia de L1 o L2\n");
            System.out.print("(7)Generar CURP con datos ingresados\n");
            System.out.print("(8)Generar CURP random\n");
            System.out.print("(9)Validar CURP\n");
            System.out.print("(10)Salir\n");
            System.out.print("\n\nIngresa tu seleccion: ");
            op = ob.input.nextInt();
            switch(op){
                case 1:
                    ob.readAlphabet();
                    break;
                case 2:
                    ob.generateLanguage();
                    break;
                case 3:
                    ob.generateJoint();
                    break;
                case 4:
                    ob.generateConcat();
                    break;
                case 5:;
                    ob.generateDifference();
                    break;
                case 6:
                    ob.generatePower();
                    break;
                case 7:
                    ob.generateCURP();
                    break;
                case 8:
                    ob.generateRandomCURP();
                    break;
                case 9:
                    ob.readCurp();
                    break;
                case 10:
                    break;
                default:
                    System.out.println("Selección no válida.");
                    System.out.println("Por favor ingrese una opción válida.\n");
                    break;
            }
        }while(op!=10);
    }
}
