package boletin15;
/**
 * Descripción Boletín 15
 * @author dpereiracarrillo
 * @version 1.0
 */

public class Boletin15 {

    public static void main(String[] args) {
        Seleccion selec = new Seleccion();
        Futbolista fut = new Futbolista();
        Entrenador ent = new Entrenador();
        Masajista mas = new Masajista();

        selec.concentrarse();
        fut.concentrarse();
        ent.concentrarse();
        mas.concentrarse();

        selec.viajar();
        fut.viajar();
        ent.viajar();
        mas.viajar();

    }

}
