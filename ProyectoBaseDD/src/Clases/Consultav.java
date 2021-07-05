/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author scr47
 */
public class Consultav
{
    private String numerocon;
    private String info;

    public Consultav(String numerocon, String info)
    {
        this.numerocon = numerocon;
        this.info = info;
    }
    
    /**
     * @return the numerocon
     */
    public String getNumerocon()
    {
        return numerocon;
    }

    /**
     * @param numerocon the numerocon to set
     */
    public void setNumerocon(String numerocon)
    {
        this.numerocon = numerocon;
    }

    /**
     * @return the info
     */
    public String getInfo()
    {
        return info;
    }

    /**
     * @param info the info to set
     */
    public void setInfo(String info)
    {
        this.info = info;
    }
    
    
}
