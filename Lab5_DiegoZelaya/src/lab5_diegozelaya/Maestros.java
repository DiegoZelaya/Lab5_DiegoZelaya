
package lab5_diegozelaya;

import java.util.ArrayList;

public class Maestros {
    private String nombre;
    private String apellido;
    private int salario;
    private int edad;
    private ArrayList carreras;

    public Maestros() {
    }

    public Maestros(String nombre, String apellido, int salario, int edad, ArrayList carreras) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
        this.edad = edad;
        this.carreras = carreras;
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

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public ArrayList getCarreras() {
        return carreras;
    }

    public void setCarreras(ArrayList carreras) {
        this.carreras = carreras;
    }

    @Override
    public String toString() {
        return "Maestros{" + "nombre=" + nombre + ", apellido=" + apellido + ", salario=" + salario + ", edad=" + edad + ", carreras=" + carreras + '}';
    }
    
}
