package Clases;

public class ClientesC {

    private int idCliente;
    private String nombre;
    private String apellidopc;
    private String apellidomc;
    private String rfc;
    private String telefono;
    private String email;

    public ClientesC(int idCliente, String nombre, String apellidopc, String apellidomc, String rfc, String telefono, String email) {
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.apellidopc = apellidopc;
        this.apellidomc = apellidomc;
        this.rfc = rfc;
        this.telefono = telefono;
        this.email = email;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public String getNombrec() {
        return nombre;
    }

    public void setNombrec(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidopc() {
        return apellidopc;
    }

    public void setApellidopc(String apellidopc) {
        this.apellidopc = apellidopc;
    }

    public String getApellidomc() {
        return apellidomc;
    }

    public void setApellidomc(String apellidomc) {
        this.apellidomc = apellidomc;
    }

    public String getRFC() {
        return rfc;
    }

    public void setRFC(String rfc) {
        this.rfc = rfc;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return this.nombre + " " + this.apellidopc + " " + this.apellidomc + " " + String.valueOf(this.idCliente);
    }
}
