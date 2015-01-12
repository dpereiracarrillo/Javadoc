package boletin15;

public class Masajista extends Seleccion {

    private String titulacion;
    private int añosExp;

    public Masajista() {
        super();
    }

    public Masajista(String titulacion, int añosExp, String n, String a, int id, int e) {
        super(n, a, id, e);
        this.titulacion = titulacion;
        this.añosExp = añosExp;
    }
    /**
     * Descripción devuelve un dato
     * @return titulacion
     */
    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public int getAñosExp() {
        return añosExp;
    }

    public void setAñosExp(int añosExp) {
        this.añosExp = añosExp;
    }

    @Override
    public void viajar() {
        System.out.println("viaxan os xogadores");
    }

    @Override
    public String toString() {
        return super.toString() + "Masajista{" + "titulacion=" + titulacion + ", a\u00f1osExp=" + añosExp + '}';
    }

}
