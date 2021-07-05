
package Clases;

public class ProveedoresC {
    private int idProveedor;
    private String telefono;
    private String direccion;
    private String nombrepro;
    
    public ProveedoresC(int idProveedor, String telefono, String direccion, String nombrepro) {
        this.idProveedor = idProveedor;
        this.telefono = telefono;
        this.direccion = direccion;
        this.nombrepro = nombrepro;
    }
    
    public int getIdProveedor() {
        return idProveedor;
    }

    public void setIdProveedor(int idProveedor) {
        this.idProveedor = idProveedor;
    }
    
    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }
    
    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    public String getNombreProv() {
        return nombrepro;
    }

    public void setNombreProv(String nombrepro) {
        this.nombrepro = nombrepro;
    }
    
    public String toString(){
        return this.nombrepro + " " +String.valueOf(this.idProveedor);
    }
}
