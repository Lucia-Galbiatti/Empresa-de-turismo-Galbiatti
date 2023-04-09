import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;
import Controlador.Turismo;
import Modelo.DatosCliente;

public class Aplicacion {

    public static void main(String[] args) {
        Turismo turismo = new Turismo(new ArrayList<>());
        DatosCliente clienteDePrueba=new DatosCliente();

      int opcion;
        do{
            opcion = turismo.Menu();
            switch(opcion){
                case 1:
                    System.out.println("¿A que tipo de alojamiento desea Ingresar?");
                    System.out.println("1-Cabaña");
                    System.out.println("2-Hotel");
                    System.out.println("3-Carpa");
                    Scanner sc = new Scanner(System.in);
                    Integer valor = sc.nextInt();
                    turismo.opcion1(valor);
                    break;
                case 2:
                    System.out.println("Los Alojamientos almacenados son los siguientes:");
                    turismo.mostrarAlojamientos();
                    break;
                case 3:
                    System.out.println("Ingrese nombre del cliente a quien quiere buscar: ");
                    Scanner sc1 = new Scanner(System.in);
                    String cliente = sc1.next() ;
                    turismo.buscarCliente(cliente);
                    break;
                case 4:
                    System.out.println("Ingrese el nombre del cliente del cual quiere calcular el adicional: ");
                    Scanner sc2 = new Scanner(System.in);
                    String cliente2 = sc2.next() ;
                    turismo.calcularTotalAdicional(cliente2);
                    break;
                case 5:
                    System.out.println("Ingrese el nombre del cliente del cual quiere calcular el posible descuento");
                    Scanner sc3 = new Scanner(System.in);
                    String cliente3 = sc3.next() ;
                    turismo.bonoDescuento(cliente3);
                    break;
                case 6:
                    System.out.println("¿De que tipo de alojamiento quiere saber la cantidad? ");
                    System.out.println("1-Cabaña");
                    System.out.println("2-Hotel");
                    System.out.println("3-Carpa");
                    Scanner sc4 = new Scanner(System.in);
                    Integer Valor4 = sc4.nextInt();
                    turismo.buscarAlojamientoEspecifico(Valor4);
                    break;
                case 7:
                    System.out.println("Ingrese el nombre del cliente del cual desea saber el total a cancelar: ");
                    Scanner sc5 = new Scanner(System.in);
                    String cliente5 = sc5.next() ;
                    turismo.calcularTOTAL(cliente5);
                    break;
                case 8:
                    System.out.println("Ingrese el nombre del cliente para saber si se le aplica un incremento al valor base");
                    Scanner sc6 = new Scanner(System.in);
                    String cliente6 = sc6.next() ;
                    turismo.aumentoValorBase(cliente6);
                    break;
                case 9:
                    System.out.println("Vuelva pronto! :)");
                    System.exit(0);
            }

        }while(opcion !=9); //repetir


    }


    }
