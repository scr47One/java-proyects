package ListaC_DL;

public class NodoD {

    private NodoD sig = null;
    private NodoD ant = null;
    private NodoD arr = null;
    private NodoD abj = null;
    private Object obj;
    private String s;

    public NodoD(Object obj, String s)
    {
        this.obj = obj;
        this.s=s;
    }

    /**
     * @return the sig
     */
    public NodoD getSig()
    {
        return sig;
    }

    /**
     * @param sig the sig to set
     */
    public void setSig(NodoD sig)
    {
        this.sig = sig;
    }

    /**
     * @return the ant
     */
    public NodoD getAnt()
    {
        return ant;
    }

    /**
     * @param ant the ant to set
     */
    public void setAnt(NodoD ant)
    {
        this.ant = ant;
    }

    /**
     * @return the abj
     */
    public NodoD getAbj()
    {
        return abj;
    }

    /**
     * @param abj the abj to set
     */
    public void setAbj(NodoD abj)
    {
        this.abj = abj;
    }

    /**
     * @return the obj
     */
    public Object getObj()
    {
        return obj;
    }

    /**
     * @param obj the obj to set
     */
    public void setObj(Object obj)
    {
        this.obj = obj;
    }

    /**
     * @return the s
     */
    public String getS()
    {
        return s;
    }

    /**
     * @param s the s to set
     */
    public void setS(String s)
    {
        this.s = s;
    }

    /**
     * @return the arr
     */
    public NodoD getArr() {
        return arr;
    }

    /**
     * @param arr the arr to set
     */
    public void setArr(NodoD arr) {
        this.arr = arr;
    }
    
    
}
