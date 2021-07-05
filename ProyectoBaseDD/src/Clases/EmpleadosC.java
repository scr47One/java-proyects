package Clases;

public class EmpleadosC {

    private int idEmpleado;
    private String nombre;
    private String apellidope;
    private String apellidome;
    private String puesto;
    private String telefono;
    private String direcion;
    private int salario;

    public EmpleadosC(int idEmpleado, String nombre, String apellidope, String apellidome, String puesto, String telefono, String direccion, int salario) {
        this.idEmpleado = idEmpleado;
        this.nombre = nombre;
        this.apellidope = apellidope;
        this.apellidome = apellidome;
        this.puesto = puesto;
        this.telefono = telefono;
        this.direcion = direccion;
        this.salario = salario;
    }

    public int getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(int idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidope() {
        return apellidope;
    }

    public void setApellidope(String apellidope) {
        this.apellidope = apellidope;
    }

    public String getApellidome() {
        return apellidome;
    }

    public void setApellidome(String apellidome) {
        this.apellidome = apellidome;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direcion;
    }

    public void setDireccion(String direccion) {
        this.direcion = direccion;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }
    
    public String toString(){
        return this.nombre + " " + this.apellidope + " " + this.apellidome + " " + String.valueOf(this.idEmpleado);
    }
    
}
