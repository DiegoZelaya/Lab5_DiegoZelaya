
package lab5_diegozelaya;

public class Carrera {
    private String nombre;
    private String facultad;
    private int costo;
    private String jefe;
    private String tipo;

    public Carrera() {
    }

    public Carrera(String nombre, String facultad, int costo, String jefe, String tipo) {
        this.nombre = nombre;
        this.facultad = facultad;
        this.costo = costo;
        this.jefe = jefe;
        this.tipo = tipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFacultad() {
        return facultad;
    }

    public void setFacultad(String facultad) {
        this.facultad = facultad;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public String getJefe() {
        return jefe;
    }

    public void setJefe(String jefe) {
        this.jefe = jefe;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Carrera{" + "nombre=" + nombre + ", facultad=" + facultad + ", costo=" + costo + ", jefe=" + jefe + ", tipo=" + tipo + '}';
    }
    
}
