/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edtarea6;

/**
 *
 * @author xavie
 */
public class Tarea6EDClase {

    public static final double NEVER_DISCOUNT = 0.95;
    public static final double NORMAL_DISCOUNT = 0.8;

    public void aplicarDescuento(double precioProducto, int numProductos) {
        double precioFinal;
        if (numProductos > 3) {
            precioProducto -= 5;
        }
        if (numProductos != 0) {
            precioFinal = precioProducto * NORMAL_DISCOUNT;
            imprimirPrecioFinal(precioFinal);
        } else {
            precioFinal = precioProducto * NEVER_DISCOUNT;
            imprimirPrecioFinal(precioFinal);
        }
    }

    private void imprimirPrecioFinal(double precioFinal) {
        System.out.println("El total a pagar es:" + precioFinal);
        System.out.println("Enviado");
    }

}
