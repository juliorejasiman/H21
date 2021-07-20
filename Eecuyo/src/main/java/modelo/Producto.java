package modelo;

public class Producto {
    
    
    private Integer CODPIZ;
    private String NOMPIZ;
    private String TIPPIZ;
    private Integer PREPPIZ;
    private Integer STOPIZ; 
    
    public Producto( Integer codpiz, String nompiz, String tippiz, Integer preppiz 
      ,Integer stopiz) {
         this.CODPIZ = codpiz;
        this.NOMPIZ = nompiz;
        this.TIPPIZ = tippiz;
        this.PREPPIZ = preppiz;
        this.STOPIZ = stopiz;
        
        
    }

    public Producto() {
    }
   

    public Integer getCODPIZ() {
        return CODPIZ;
    }

    public void setCODPIZ(Integer CODPIZ) {
        this.CODPIZ = CODPIZ;
    }

    public String getNOMPIZ() {
        return NOMPIZ;
    }

    public void setNOMPIZ(String NOMPIZ) {
        this.NOMPIZ = NOMPIZ;
    }

    public String getTIPPIZ() {
        return TIPPIZ;
    }

    public void setTIPPIZ(String TIPPIZ) {
        this.TIPPIZ = TIPPIZ;
    }

    public Integer getPREPPIZ() {
        return PREPPIZ;
    }

    public void setPREPPIZ(Integer PREPPIZ) {
        this.PREPPIZ = PREPPIZ;
    }

    public Integer getSTOPIZ() {
        return STOPIZ;
    }

    public void setSTOPIZ(Integer STOPIZ) {
        this.STOPIZ = STOPIZ;
    }
    
 //@Override
  //  public String toString() {
    //    return "Producto{" + "cod=" + cod + ", nom=" + nom + ", precio=" + precio + ", codprov=" + codprov + ", gtin=" + gtin + ", stock=" + stock + ", dattec=" + dattec + ", estado=" + estado + ", codsubfam=" + codsubfam + '}';
   //  } 

    public void getCODPIZ(int aInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
