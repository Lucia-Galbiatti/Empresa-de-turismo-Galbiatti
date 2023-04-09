package Modelo;

public class  Hospedaje extends MediodeAlojamiento{
    private boolean esfumador;
    private Integer capacidad;

    // valorACancelar: devolverá el valor a cancelar, el cual al subtotal se le debe descontar el bono y sumar el adicional, donde corresponda.

    public boolean isEsfumador() {
        return esfumador;
    }

    public void setEsfumador(boolean esfumador) {
        this.esfumador = esfumador;
    }

    public Integer getCapacidad() {
        return capacidad;
    }

    public void setCapacidad(Integer capacidad) {
        this.capacidad = capacidad;
    }
}
