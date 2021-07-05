
package Clases;

import java.sql.Date;

public class VentasC {
    
    private int idVenta;
    private int idCliente;
    private int idEmpleado;
    private double subtotal;
//    static final private double iva = 0.16;
    private String fecha;

    public VentasC(int idVenta, int idCliente, int idEmpleado, double subtotal, String fecha) {
        this.idVenta = idVenta;
        this.idCliente = idCliente;
        this.idEmpleado = idEmpleado;
        this.subtotal = subtotal;
        this.fecha = fecha;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }
    
    public String toString(){
        return String.valueOf(this.idVenta);
    }
  
}
