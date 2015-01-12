package boletin15;

public class Futbolista extends Seleccion {

    private int dorsal;
    private int demarcacion;

    public Futbolista() {
        super();
    }
    
    public Futbolista(String n, String a, int id, int e, int dor, int dem) {
        super(n, a, id, e);
        dorsal = dor;
        demarcacion = dem;
    }
/**
     * Descripción devuelve un dato
     * @return dorsal
     */
    public int getDorsal() {
        return dorsal;
    }
/**
     * Descripción coge un dato
     */
    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }
    /** 
     * Descripción devuelve un dato
     * @return demarcacion
     */
    public int getDemarcacion() {
        return demarcacion;
    }
    /**
     * Descripción coge un dato
     * @param demarcacion 
     */
    public void setDemarcacion(int demarcacion) {
        this.demarcacion = demarcacion;
    }

    @Override
    public void viajar() {
        System.out.println("viaxan os xogadores");
    }

    @Override
    public String toString() {
        return super.toString() + "Futbolista{" + "dorsal=" + dorsal + ", demarcacion=" + demarcacion + '}';
    }

}
