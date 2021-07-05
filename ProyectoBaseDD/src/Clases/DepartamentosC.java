
package Clases;

public class DepartamentosC {
    private int idDepartamento;
    private String nombredep;
    private int pasillo;
    private int rack;
    
    public DepartamentosC(int idDepartamento, String nombredep, int pasillo, int rack) {
        this.idDepartamento = idDepartamento;
        this.nombredep = nombredep;
        this.pasillo = pasillo;
        this.rack = rack;
    }
    
    public int getIdDepartamento() {
        return idDepartamento;
    }

    public void setIdDepartamento(int idDepartamento) {
        this.idDepartamento = idDepartamento;
    }
    
    public String getNombreDep() {
        return nombredep;
    }

    public void setNombreDep(String nombredep) {
        this.nombredep = nombredep;
    }
    
    public int getPasillo() {
        return pasillo;
    }

    public void setPasillo(int pasillo) {
        this.pasillo = pasillo;
    }
    
    public int getRack() {
        return rack;
    }

    public void setRack(int rack) {
        this.rack = rack;
    }
    
    public String toString(){
        return this.nombredep + " " + String.valueOf(this.idDepartamento);
    }
}
