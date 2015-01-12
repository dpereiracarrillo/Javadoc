package boletin15;

public class Seleccion {

    private String nombre;
    private String apellidos;
    private int id;
    private int edad;

    public Seleccion() {

    }

    public Seleccion(String n, String a, int id, int e) {

        nombre = n;
        apellidos = a;
        this.id = id;
        edad = e;
    }
    /**
     * Descripción devuelve un dato
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Descripción coge un dato
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Descripción devuelve un dato
     * @return apellidos
     */
    public String getApellidos() {
        return apellidos;
    }
/**
 * Descripción coge un dato
 * @param apellidos 
 */
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
/**
 * Descripción devuelve un dato
 * @return id
 */
    public int getId() {
        return id;
    }
/**
 * Descripcion coge un dato
 * @param id 
 */
    public void setId(int id) {
        this.id = id;
    }
/**
 * Descricpion devuelve un dato
 * @return edad
 */
    public int getEdad() {
        return edad;
    }
/**
 * Descripcion coge un dato
 * @param edad 
 */
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void concentrarse() {
        System.out.println("concentrase a seleccion");
    }

    public void viajar() {
        System.out.println("viaxa a seleccion");
    }

    @Override
    public String toString() {
        return super.toString() + "Seleccion{" + "nombre=" + nombre + ", apellidos=" + apellidos + ", id=" + id + ", edad=" + edad + '}';

    }

}
