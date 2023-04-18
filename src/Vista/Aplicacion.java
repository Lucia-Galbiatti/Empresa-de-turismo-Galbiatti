package Vista;

import java.awt.*;
import java.util.ArrayList;
import java.util.Scanner;
import Controlador.Turismo;
import Modelo.DatosCliente;

public class Aplicacion {

    public static void main(String[] args) {
        Turismo turismo = new Turismo(new ArrayList<>());


      int opcion;
        do{
            opcion = turismo.Menu();
            switch(opcion){
                case 1:
                    Integer valor;
                    do{
                        System.out.println("¿A que tipo de alojamiento desea Ingresar?");
                        System.out.println("1-Cabaña");
                        System.out.println("2-Hotel");
                        System.out.println("3-Carpa");
                        valor = Leer.datoInt();
                    }while (valor<1 || valor>3);
                    turismo.opcion1(valor);
                    break;
                case 2:
                    System.out.println("Los Alojamientos almacenados son los siguientes:");
                    turismo.mostrarAlojamientos();
                    break;
                case 3:
                    String cliente;
                    do{
                        System.out.println("Ingrese nombre del cliente a quien quiere buscar: ");
                        cliente = Leer.dato();
                    } while (cliente.substring(0, 1).matches("[a-z]") == false);
                    turismo.buscarCliente(cliente);
                    break;
                case 4:
                    String cliente2;
                    do{
                        System.out.println("Ingrese el nombre del cliente del cual quiere calcular el adicional: ");
                        cliente2 = Leer.dato();
                    } while (cliente2.substring(0, 1).matches("[a-z]") == false);
                    turismo.calcularTotalAdicional(cliente2);
                    break;
                case 5:
                    String cliente3;
                    do{
                        System.out.println("Ingrese el nombre del cliente del cual quiere calcular el posible descuento");
                        cliente3 = Leer.dato();
                    }while (cliente3.substring(0, 1).matches("[a-z]") == false);
                    turismo.bonoDescuento(cliente3);
                    break;
                case 6:
                    Integer Valor4;
                   do {
                       System.out.println("¿De que tipo de alojamiento quiere saber la cantidad? ");
                       System.out.println("1-Cabaña");
                       System.out.println("2-Hotel");
                       System.out.println("3-Carpa");
                       Valor4 = Leer.datoInt();
                   }while (Valor4<1 || Valor4>3);
                    turismo.buscarAlojamientoEspecifico(Valor4);
                    break;
                case 7:
                    String cliente5;
                    do{
                        System.out.println("Ingrese el nombre del cliente del cual desea saber el total a cancelar: ");
                        cliente5 = Leer.dato();
                    }while (cliente5.substring(0, 1).matches("[a-z]") == false);
                    turismo.calcularTOTAL(cliente5);
                    break;
                case 8:
                    String cliente6;
                    do{
                        System.out.println("Ingrese el nombre del cliente para saber si se le aplica un incremento al valor base");
                        cliente6 = Leer.dato();
                    }while (cliente6.substring(0, 1).matches("[a-z]") == false);
                    turismo.aumentoValorBase(cliente6);
                    break;
                case 9:
                    System.out.println("Vuelva pronto! :)");
                    System.exit(0);
            }

        }while(opcion !=9); //repetir


    }


    }
