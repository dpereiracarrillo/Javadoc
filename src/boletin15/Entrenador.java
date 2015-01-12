package boletin15;

public class Entrenador extends Seleccion {

    private String ideFederacion;

    public Entrenador() {

        super();
    }

    public Entrenador(String n, String a, int id, int e, String ideFederacion) {
        super(n, a, id, e);
        this.ideFederacion = ideFederacion;
    }
    /**
     * Descripción devuelve un dato
     * @return ideFederacion
     */
    public String getIdeFederacion() {
        return ideFederacion;
    }
/**
     * Descripción coge un dato
     */
    public void setIdeFederacion(String ideFederacion) {
        this.ideFederacion = ideFederacion;
    }

    public void dirigirPartido() {

    }

    public void dirigirEntrenamiento() {

    }

    @Override
    public void viajar() {
        System.out.println("viaxan os xogadores");
    }

    @Override
    public String toString() {
        return super.toString() + "Entrenador{" + "ideFederacion=" + ideFederacion + '}';
    }

}
