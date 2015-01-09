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

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public int getDemarcacion() {
        return demarcacion;
    }

    public void setDemarcacion(int demarcacion) {
        this.demarcacion = demarcacion;
    }

    @Override
    public void viajar() {
        System.out.println("viaxan os xogadores");
    }

    @Override
    public String toString() {
        return "Futbolista{" + "dorsal=" + dorsal + ", demarcacion=" + demarcacion + '}';
    }

}
