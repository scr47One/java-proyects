package Clases;

import java.sql.Date;

public class EntregasC {

    private int idProducto;
    private int idProveedor;
    private int cantidad;
    private Date fecha;

    public EntregasC(int idProducto, int idProveedor, int cantidad, Date fecha) {
        this.idProducto = idProducto;
        this.idProveedor = idProveedor;
        this.cantidad = cantidad;
        this.fecha = fecha;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    @Override
    public String toString(){
        return String.valueOf(this.idProducto);
    }
}
