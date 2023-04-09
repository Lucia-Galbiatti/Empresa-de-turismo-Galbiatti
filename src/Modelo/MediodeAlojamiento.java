package Modelo;

public class MediodeAlojamiento {

   //Se añaden dos atributos nombre y tipo de alojamiento para poder identificar el objeto almacenado.

    private String nombre;

    private String tipoAlojamiento;

    private Integer valorbasenoche;
    private Integer cantidaddenoches;
    private DatosCliente datosdelcliente;
    private String temporada;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipoAlojamiento() {
        return tipoAlojamiento;
    }

    public void setTipoAlojamiento(String tipoAlojamiento) {
        this.tipoAlojamiento = tipoAlojamiento;
    }
    public Integer getValorbasenoche() {
        return valorbasenoche;
    }

    public void setValorbasenoche(Integer valorbasenoche) {
        this.valorbasenoche = valorbasenoche;
    }

    public Integer getCantidaddenoches() {
        return cantidaddenoches;
    }

    public void setCantidaddenoches(Integer cantidaddenoches) {
        this.cantidaddenoches = cantidaddenoches;
    }

    public DatosCliente getDatosdelcliente() {
        return datosdelcliente;
    }

    public void setDatosdelcliente(DatosCliente datosdelcliente) {
        this.datosdelcliente = datosdelcliente;
    }

    public String getTemporada() {
        return temporada;
    }

    public void setTemporada(String temporada) {
        this.temporada = temporada;
    }

    /*    •	subtotal: devolverá el subtotal a cancelar el cual será cantidad de noches por el valorBaseNoche
    •	adicional: devolverá el valor adicional, que corresponde al 30% del subtotal si es Fumador y con desayuno.*/
public Integer Subtotal (Integer cantidaddenoches, Integer valorbasenoche){
    Integer subtotal= (cantidaddenoches*valorbasenoche);
    return subtotal;
}
public Double Adicional (Integer subtotal, boolean fumador, boolean desayuno) {
    Double adicional = null;
    if (fumador == true ||desayuno == true ) {
            adicional = (subtotal * 0.3);
    }
    return adicional;
}
//	bonoDescuento: devolverá el valor a descontar sabiendo que es un 25% del subTotal si el tipo de temporada es baja o es de un 12.5% si el tipo Temporada es media.
public Integer bonodescuento (Integer subtotal, String temporada){
    Integer bonodescuento =0;
    if(temporada.equalsIgnoreCase("baja")){
        bonodescuento= (int) (subtotal - Math.round(subtotal*0.25));
    }
    else if(temporada.equalsIgnoreCase("media")){
        bonodescuento= (int) (subtotal - Math.round(subtotal*0.125));
    }
    return bonodescuento;
}
    public Double valoracancelar (Integer subtotal, Integer bonodescuento, Double adicional ){
        Double valoracancelar = (subtotal-bonodescuento+adicional);
        return valoracancelar;

    }
    //incrementaValorBase: aumenta el valor base en un 18% si la capacidad de la cabaña es superior a 5.
public  Integer incrementavalorbase (Integer valorbasenoche, Integer capacidad){
   Integer incrementavalorbase=valorbasenoche;
    if(capacidad>5){
        incrementavalorbase= (int) (valorbasenoche + Math.round(valorbasenoche * 0.18));

    }
    return  incrementavalorbase;
}
}