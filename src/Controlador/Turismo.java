package Controlador;

import Modelo.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Turismo {
    private ArrayList<MediodeAlojamiento> alojamiento;

    public ArrayList<MediodeAlojamiento> getAlojamiento() {
        return alojamiento;
    }

    public void setAlojamiento(ArrayList<MediodeAlojamiento> alojamiento) {
        this.alojamiento = alojamiento;
    }

    public Turismo(ArrayList<MediodeAlojamiento> alojamiento) {
        this.alojamiento = alojamiento;
    }


    public Integer Menu() {
        Scanner sc = new Scanner(System.in);
        //Creamos el scanner para poder tomar los valores que me pasa el usuario
        System.out.println("Bienvenidos a Empresa Turismo! Elige a partir de las siguientes opciones: ");
        System.out.println("1.\tIngresar Medio de Alojamiento \n" +
                "2.\tMostrar medios de alojamiento\t\n" +
                "3.\tMostrar datos de un cliente\n" +
                "4.\tCalcular total adicional\n" +
                "5.\tCalcular total bono descuento\n" +
                "6.\tCantidad medios de alojamiento X\n" +
                "7.\tValor a cancelar por un cliente \n" +
                "8.\tAplicar incremento del valor base\t\t\t\t\n" +
                "9.\tSalir.");
        //creamos un int para guardar el valor enviado por el usuario, next int significa proximo int ingresado por teclado
        Integer valor = sc.nextInt();
        return valor;
    }

    public void opcion1(Integer opcion1) {

        if (opcion1 == 1) {
            Scanner sc = new Scanner(System.in);
            //creo un objeto tipo cabaña y relleno sus campos
            Cabaña cabaña = new Cabaña();
            cabaña.setTipoAlojamiento("cabaña");
            DatosCliente datosCliente = new DatosCliente();
            System.out.println("Ingrese el nombre de la persona: ");
            datosCliente.setNombre(sc.next());
            System.out.println("Ingrese RUT de la persona: ");
            datosCliente.setRut(sc.nextInt());
            cabaña.setDatosdelcliente(datosCliente);
            System.out.println("Ingrese el nombre de la cabaña");
            String nombreCabaña = sc.next();
            cabaña.setNombre(nombreCabaña);
            System.out.println("Ingrese la capacidad de la cabaña");
            Integer capacidad = sc.nextInt();
            cabaña.setCapacidad(capacidad);
            System.out.println("Ingrese Valor base de la noche");
            Integer valorBaseNoche = sc.nextInt();
            cabaña.setValorbasenoche(valorBaseNoche);
            //Consulto si la cabaña tiene chimenea o no
            System.out.println("Tiene chimenea? Si/No");
            boolean chimenea;
            if (sc.next().equalsIgnoreCase("Si")) {
                chimenea = true;
            } else {
                chimenea = false;
            }
            cabaña.setChimenea(chimenea);
            System.out.println("Ingrese cantidad de noches a quedarse: ");
            Integer cantidadNoches = sc.nextInt();
            cabaña.setCantidaddenoches(cantidadNoches);
            //Consulto al cliente si es fumador o no
            System.out.println("usted es fumador/a? Si/No");
            boolean fumador;
            if (sc.next().equalsIgnoreCase("Si")) {
                fumador = true;
            } else {
                fumador = false;
            }
            cabaña.setEsfumador(fumador);
            //consulto la temporada
            System.out.println("Ingrese temporada (alta/media/baja)");
            String temporada = sc.next();
            cabaña.setTemporada(temporada);
            //añado la cabaña al arraylist
            agregarCabaña(cabaña);

        } else if (opcion1 == 2) {
            Scanner sc = new Scanner(System.in);
            Hotel hotel = new Hotel();
            hotel.setTipoAlojamiento("hotel");
            DatosCliente datosCliente = new DatosCliente();
            System.out.println("Ingrese el nombre de la persona: ");
            datosCliente.setNombre(sc.next());
            System.out.println("Ingrese RUT de la persona: ");
            datosCliente.setRut(sc.nextInt());
            hotel.setDatosdelcliente(datosCliente);
            System.out.println("Ingrese el nombre del hotel");
            String nombreHotel = sc.next();
            hotel.setNombre(nombreHotel);
            System.out.println("Ingrese Valor base de la noche");
            Integer valorBaseNoche = sc.nextInt();
            hotel.setValorbasenoche(valorBaseNoche);
            System.out.println("Tiene desayuno? Si/No");
            boolean desayuno;
            if (sc.next().equalsIgnoreCase("Si")) {
                desayuno = true;
            } else {
                desayuno = false;
            }
            hotel.setCondesayuno(desayuno);
            //consulto cantidad de noches
            System.out.println("Ingrese cantidad de noches a quedarse: ");
            Integer cantidadNoches = sc.nextInt();
            hotel.setCantidaddenoches(cantidadNoches);
            //Consulto al cliente si es fumador o no
            System.out.println("usted es fumador/a? Si/No");
            boolean fumador;
            if (sc.next().equalsIgnoreCase("Si")) {
                fumador = true;
            } else {
                fumador = false;
            }
            hotel.setEsfumador(fumador);
            //consulto la temporada
            System.out.println("Ingrese temporada (alta/media/baja)");
            String temporada = sc.next();
            hotel.setTemporada(temporada);
            //añado el hotel al arraylist
            agregarHotel(hotel);
        } else if (opcion1 == 3) {
            Scanner sc = new Scanner(System.in);
            Carpa carpa = new Carpa();
            carpa.setTipoAlojamiento("carpa");
            DatosCliente datosCliente = new DatosCliente();
            System.out.println("Ingrese el nombre de la persona: ");
            datosCliente.setNombre(sc.next());
            System.out.println("Ingrese RUT de la persona: ");
            datosCliente.setRut(sc.nextInt());
            carpa.setDatosdelcliente(datosCliente);
            System.out.println("Ingrese el nombre de la carpa");
            String nombreCarpa = sc.next();
            carpa.setNombre(nombreCarpa);
            System.out.println("Ingrese Valor base de la noche");
            Integer valorBaseNoche = sc.nextInt();
            carpa.setValorbasenoche(valorBaseNoche);
            System.out.println("cantidad de personas? :");
            Integer capacidad = sc.nextInt();
            carpa.setCantidaddepersonas(capacidad);
            System.out.println("Ingrese cantidad de noches a quedarse: ");
            Integer cantidadNoches = sc.nextInt();
            carpa.setCantidaddenoches(cantidadNoches);
            //consulto la temporada
            System.out.println("Ingrese temporada (alta/media/baja)");
            String temporada = sc.next();
            carpa.setTemporada(temporada);
            //añado la carpa al arraylist
            agregarCarpa(carpa);
        }

    }

    public int buscarAlojamiento(String nombre) {
        for (int i = 0; i < alojamiento.size(); i++) {
            if (alojamiento.get(i).getNombre().compareToIgnoreCase(nombre) == 0) {
                return i;
            }
        }
        return -1;
    }

    public void agregarCarpa(Carpa carpa) {
        if (buscarAlojamiento(carpa.getNombre()) == -1) {
            alojamiento.add(carpa);
            System.out.println("El alojamiento se añadio con exito!");

        } else {
            System.out.println("El alojamiento que usted quiere ingresar ya existe!");
        }

    }

    public void agregarCabaña(Cabaña cabaña) {
        if (buscarAlojamiento(cabaña.getNombre()) == -1) {
            alojamiento.add(cabaña);
            System.out.println("El alojamiento se añadio con exito!");

        } else {
            System.out.println("El alojamiento que usted quiere ingresar ya existe!");
        }

    }

    public void agregarHotel(Hotel hotel) {
        if (buscarAlojamiento(hotel.getNombre()) == -1) {
            alojamiento.add(hotel);
            System.out.println("El alojamiento se añadio con exito!");

        } else {
            System.out.println("El alojamiento que usted quiere ingresar ya existe!");
        }

    }

    public void mostrarAlojamientos() {
        //la siguiente funcion solo imprime los alojamientos que se hayan ingresado por medio de la opcion 1


        //si hay 0 alojamientos, le digo que agregue
        if (alojamiento.size() == 0) {
            System.out.println("No hay alojamientos disponibles aun, Agregue uno en la opcion 1");
        }

        for (int i = 0; i < alojamiento.size(); i++) {
            MediodeAlojamiento mediodeAlojamiento = new MediodeAlojamiento();
            mediodeAlojamiento = alojamiento.get(i);
            System.out.println(i + ") Nombre: " + mediodeAlojamiento.getNombre());
            System.out.println("el valor base de la noche es: " + mediodeAlojamiento.getValorbasenoche());
        }

    }

    public void buscarCliente(String nombreCliente) {
        if (alojamiento.size() == 0) {
            System.out.println("No hay personas añadidas aun, Agregue a traves en la opcion 1");
        }

        for (int i = 0; i < alojamiento.size(); i++) {
            MediodeAlojamiento mediodeAlojamiento = new MediodeAlojamiento();
            mediodeAlojamiento = alojamiento.get(i);
            if (mediodeAlojamiento.getDatosdelcliente().getNombre().equalsIgnoreCase(nombreCliente)) {
                System.out.println("Se ha encontrado al cliente y contiene los siguientes datos: ");
                System.out.println("El cliente se llama: " + mediodeAlojamiento.getDatosdelcliente().getNombre());
                System.out.println("El RUT del cliente es: " + mediodeAlojamiento.getDatosdelcliente().getRut());
                System.out.println("El alojamiento en el cual se encuentra el cliente es: " + mediodeAlojamiento.getTipoAlojamiento());
                System.out.println("el Nombre del " + mediodeAlojamiento.getTipoAlojamiento() + " en el cual se queda es: " + mediodeAlojamiento.getNombre());
                System.out.println("el valor base de la noche es: " + mediodeAlojamiento.getValorbasenoche());
            } else{
                System.out.println("El cliente que usted ha ingresado no existe.");
            }

        }

    }

    public void calcularTotalAdicional(String nombreCliente) {
        if (alojamiento.size() == 0) {
            System.out.println("No hay personas añadidas aun para calcular el total adicional, Agregue a traves en la opcion 1");
        }
        //primero recorro el array y obtengo el alojamientoo
        for (int i = 0; i < alojamiento.size(); i++) {
            MediodeAlojamiento mediodeAlojamiento = new MediodeAlojamiento();
            mediodeAlojamiento = alojamiento.get(i);
            //verifico que el alojamiento corresponda al cliente especifico
            if (mediodeAlojamiento.getDatosdelcliente().getNombre().equalsIgnoreCase(nombreCliente)) {
                //verifico que el alojamiento sea de un tipo especifico (hotel, cabaña o carpa)
                if (mediodeAlojamiento instanceof Hotel) {
                    Hotel hotel = (Hotel) mediodeAlojamiento;
                    System.out.println("Se ha encontrado al cliente y adicional a pagar: ");
                    System.out.println("El cliente se llama: " + hotel.getDatosdelcliente().getNombre());
                    Integer subtotal = hotel.Subtotal(hotel.getCantidaddenoches(), hotel.getValorbasenoche());
                    Double adicional = hotel.Adicional(subtotal, hotel.isEsfumador(), hotel.isCondesayuno());
                    //verifico si el adicional se tiene que pagar o no.
                    if (adicional == null) {
                    } else {
                        System.out.println("El adicional a pagar es: " + adicional);

                    }

                }
                //verifico si el medio de alojamiento es una cabaña
                if (mediodeAlojamiento instanceof Cabaña) {
                    Cabaña cabaña = (Cabaña) mediodeAlojamiento;
                    System.out.println("Se ha encontrado al cliente y adicional a pagar: ");
                    System.out.println("El cliente se llama: " + cabaña.getDatosdelcliente().getNombre());
                    Integer subtotal = cabaña.Subtotal(cabaña.getCantidaddenoches(), cabaña.getValorbasenoche());
                    //desayuno false porque la cabaña no sirve desayuno
                    Double adicional = cabaña.Adicional(subtotal, cabaña.isEsfumador(), false);
                    //verifico si el adicional se tiene que pagar o no.
                    if (adicional == null) {
                    } else {
                        System.out.println("El adicional a pagar es: " + adicional);

                    }

                }

                //la carpa no tiene pago adicional
                if (mediodeAlojamiento instanceof Carpa) {
                    System.out.println("a Usted no le corresponde pagar adicional");
                }

            }
        }

        //fin del metodo
    }

    public void bonoDescuento(String nombreCliente) {
        if (alojamiento.size() == 0) {
            System.out.println("No hay personas añadidas aun para calcular el total adicional, Agregue a traves en la opcion 1");
        }
        //primero recorro el array y obtengo el alojamientoo
        for (int i = 0; i < alojamiento.size(); i++) {
            MediodeAlojamiento mediodeAlojamiento = new MediodeAlojamiento();
            mediodeAlojamiento = alojamiento.get(i);
            //verifico que el alojamiento corresponda al cliente especifico
            if (mediodeAlojamiento.getDatosdelcliente().getNombre().equalsIgnoreCase(nombreCliente)) {
                System.out.println("Se ha encontrado al cliente y el bono de descuento a descontar de su estadia: ");
                Integer subtotal = mediodeAlojamiento.Subtotal(mediodeAlojamiento.getCantidaddenoches(), mediodeAlojamiento.getValorbasenoche());
                Integer descuento = mediodeAlojamiento.bonodescuento(subtotal, mediodeAlojamiento.getTemporada());
                System.out.println("El descuento que le corresponde es de : " + descuento);

            }


        }
//fin de la funcion
    }

    public void buscarAlojamientoEspecifico(Integer num) {
        int contadorcabaña = 0;
        int contadorhotel = 0;
        int contadorcarpa = 0;
        //si hay 0 alojamientos, le digo que agregue
        if (alojamiento.size() == 0) {
            System.out.println("No hay alojamientos disponibles aun, Agregue uno en la opcion 1");
        }
        for (int i = 0; i < alojamiento.size(); i++) {
            MediodeAlojamiento mediodeAlojamiento = new MediodeAlojamiento();
            mediodeAlojamiento = alojamiento.get(i);
//contamos la cantidad dependiendo de que tipo de alojamiento sean

            switch (num) {
                case 1:
                    if (mediodeAlojamiento instanceof Cabaña) {
                        contadorcabaña = contadorcabaña + 1;
                    }
                    break;
                case 2:
                    if (mediodeAlojamiento instanceof Hotel) {
                        contadorhotel = contadorhotel + 1;
                        break;
                    }
                case 3:
                    if (mediodeAlojamiento instanceof Carpa) {
                        contadorcarpa = contadorcarpa + 1;
                        break;
                    }

            }
        }
        //otro switch para devolver el contador correcto
        switch (num) {
            case 1:
                System.out.println("la cantidad es de : " + contadorcabaña);

                break;
            case 2:
                System.out.println("la cantidad es de : " + contadorhotel);

                break;

            case 3:
                System.out.println("la cantidad es de : " + contadorcarpa);

                break;

        }
    }
    public void calcularTOTAL(String nombreCliente){
     if (alojamiento.size() == 0) {
        System.out.println("No hay personas añadidas aun para calcular el total a cancelar, Agregue a traves en la opcion 1");
    }
    //primero recorro el array y obtengo el alojamiento
        for (int i = 0; i < alojamiento.size(); i++) {
        MediodeAlojamiento mediodeAlojamiento = new MediodeAlojamiento();
        mediodeAlojamiento = alojamiento.get(i);
        //verifico que el alojamiento corresponda al cliente especifico
        if (mediodeAlojamiento.getDatosdelcliente().getNombre().equalsIgnoreCase(nombreCliente)) {
            //verifico que el alojamiento sea de un tipo especifico (hotel, cabaña o carpa)
            if (mediodeAlojamiento instanceof Hotel) {
                Hotel hotel = (Hotel) mediodeAlojamiento;
                System.out.println("Se ha encontrado al cliente y adicional a pagar: ");
                System.out.println("El cliente se llama: " + hotel.getDatosdelcliente().getNombre());
                Integer subtotal = hotel.Subtotal(hotel.getCantidaddenoches(), hotel.getValorbasenoche());
                Double adicional = hotel.Adicional(subtotal, hotel.isEsfumador(), hotel.isCondesayuno());
                Integer descuento = hotel.bonodescuento(subtotal, hotel.getTemporada());
                Double total=hotel.valoracancelar(subtotal,descuento,adicional);
               System.out.println("el total a pagar por el cliente: " +  total);
            }
            //verifico si el medio de alojamiento es una cabaña
            if (mediodeAlojamiento instanceof Cabaña) {
                Cabaña cabaña = (Cabaña) mediodeAlojamiento;
                System.out.println("Se ha encontrado al cliente y adicional a pagar: ");
                System.out.println("El cliente se llama: " + cabaña.getDatosdelcliente().getNombre());
                Integer baseNocheCabaña= cabaña.incrementavalorbase(cabaña.getValorbasenoche(), cabaña.getCapacidad());
                Integer subtotal = cabaña.Subtotal(cabaña.getCantidaddenoches(), baseNocheCabaña);
                Double adicional = cabaña.Adicional(subtotal, cabaña.isEsfumador(), false);
                Integer descuento = cabaña.bonodescuento(subtotal, cabaña.getTemporada());
                Double total=cabaña.valoracancelar(subtotal,descuento,adicional);
                System.out.println("el total a pagar por el cliente: " +  total);

            }

            //la carpa no tiene pago adicional
            if (mediodeAlojamiento instanceof Carpa) {
                Carpa carpa = (Carpa) mediodeAlojamiento;
                System.out.println("Se ha encontrado al cliente y adicional a pagar: ");
                System.out.println("El cliente se llama: " + carpa.getDatosdelcliente().getNombre());
                Integer subtotal = carpa.Subtotal(carpa.getCantidaddenoches(), carpa.getValorbasenoche());
                Integer descuento = carpa.bonodescuento(subtotal, carpa.getTemporada());
                Double total=carpa.valoracancelar(subtotal,descuento,0.0);
                System.out.println("el total a pagar por el cliente: " +  total);            }

        }
    }

    //fin del metodo
}
public void aumentoValorBase(String nombreCliente) {
    if (alojamiento.size() == 0) {
        System.out.println("No hay personas añadidas aun para calcular el total a cancelar, Agregue a traves en la opcion 1");
    }
    //primero recorro el array y obtengo el alojamiento
    for (int i = 0; i < alojamiento.size(); i++) {
        MediodeAlojamiento mediodeAlojamiento = new MediodeAlojamiento();
        mediodeAlojamiento = alojamiento.get(i);
        //verifico que el alojamiento corresponda al cliente especifico
        if (mediodeAlojamiento.getDatosdelcliente().getNombre().equalsIgnoreCase(nombreCliente)) {
            //verifico si el medio de alojamiento es una cabaña
            if (mediodeAlojamiento instanceof Cabaña) {
                Cabaña cabaña = (Cabaña) mediodeAlojamiento;
                System.out.println("Se ha encontrado al cliente y adicional a pagar: ");
                System.out.println("El cliente se llama: " + cabaña.getDatosdelcliente().getNombre());
                Integer valorBase=cabaña.incrementavalorbase(cabaña.getValorbasenoche(), cabaña.getCapacidad());
                if(valorBase>cabaña.getValorbasenoche()){
                    System.out.println("el valor base por noche  para el cliente: " + valorBase);

                } else{
                    System.out.println("No le corresponde pagar un monto mayor ya que no son mas de 5 personas");

                }
            } else{
                System.out.println("A su tipo de alojamiento no le corresponde un aumento del valor base, solo a cabañas");
            }
        } else {
            System.out.println("El cliente que usted ha ingresado, no existe!");
        }
    }
}
}
