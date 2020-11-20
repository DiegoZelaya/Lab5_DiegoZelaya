
package lab5_diegozelaya;

public class Estudiantes {
    private String nombre;
    private String apellido;
    private String cuenta;
    private int edad;
    private String genero;
    private String carrera;

    public Estudiantes() {
    }

    public Estudiantes(String nombre, String apellido, String cuenta, int edad, String genero, String carrera) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.cuenta = cuenta;
        this.edad = edad;
        this.genero = genero;
        this.carrera = carrera;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    @Override
    public String toString() {
        return nombre + " " + cuenta + " " + carrera;
    }
    
}
