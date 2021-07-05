
package Clases;

public class ApartadosC {
    
    private int idApartado;
    private int idCliente;
    private int idProducto;
    private String descripcion;
    private int cantidad;
    private int adelanto;
    private String vencimientoPago;

    public ApartadosC(int idApartado, int idCliente, int idProducto, String descripcion, int cantidad, int adelanto, String vencimientoPago) {
        this.idApartado = idApartado;
        this.idCliente = idCliente;
        this.idProducto = idProducto;
        this.descripcion = descripcion;
        this.cantidad = cantidad;
        this.adelanto = adelanto;
        this.vencimientoPago = vencimientoPago;
    }

    public int getIdApartado() {
        return idApartado;
    }

    public void setIdApartado(int idApartado) {
        this.idApartado = idApartado;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public int getIdProducto() {
        return idProducto;
    }

    public void setIdProducto(int idProducto) {
        this.idProducto = idProducto;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getAdelanto() {
        return adelanto;
    }

    public void setAdelanto(int adelanto) {
        this.adelanto = adelanto;
    }

    public String getVencimientoPago() {
        return vencimientoPago;
    }

    public void setVencimientoPago(String vencimientoPago) {
        this.vencimientoPago = vencimientoPago;
    }
    
    public String toString(){
        return String.valueOf(this.idApartado);
    }
 
}
