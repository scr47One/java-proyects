
package Clases;

import java.sql.Date;

public class TarjetaPuntosC {
    
    private int idTarjeta;
    private int idCliente;
    private int idVenta;
    private String numeroTarjeta;
    private Date vencimientoPuntos;
    private int totalPuntos;

    public TarjetaPuntosC(int idTarjeta, int idCliente, int idVenta, String numeroTarjeta, Date vencimientoPuntos, int totalPuntos) {
        this.idTarjeta = idTarjeta;
        this.idCliente = idCliente;
        this.idVenta = idVenta;
        this.numeroTarjeta = numeroTarjeta;
        this.vencimientoPuntos = vencimientoPuntos;
        this.totalPuntos = totalPuntos;
    }
    public TarjetaPuntosC(int idTarjeta, int idCliente, int idVenta) {
         this.idTarjeta = idTarjeta;
        this.idCliente = idCliente;
        this.idVenta = idVenta;
       
    }

    public int getIdTarjeta() {
        return idTarjeta;
    }

    public void setIdTarjeta(int idTarjeta) {
        this.idTarjeta = idTarjeta;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdVenta() {
        return idVenta;
    }

    public void setIdVenta(int idVenta) {
        this.idVenta = idVenta;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public Date getVencimientoPuntos() {
        return vencimientoPuntos;
    }

    public void setVencimientoPuntos(Date vencimientoPuntos) {
        this.vencimientoPuntos = vencimientoPuntos;
    }

    public int getTotalPuntos() {
        return totalPuntos;
    }

    public void setTotalPuntos(int totalPuntos) {
        this.totalPuntos = totalPuntos;
    }
    
    public String toString(){
        return String.valueOf(this.idTarjeta);
    }
    
}
