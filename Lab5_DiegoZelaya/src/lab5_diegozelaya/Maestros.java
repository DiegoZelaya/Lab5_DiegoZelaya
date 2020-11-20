
package lab5_diegozelaya;

import java.util.ArrayList;

public class Maestros {
    private String nombre;
    private String apellido;
    private String salario;
    private int edad;
    private String clase1;
    private String clase2;
    private String clase3;

    public Maestros() {
    }

    public Maestros(String nombre, String apellido, String salario, int edad, String clase1, String clase2, String clase3) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.salario = salario;
        this.edad = edad;
        this.clase1 = clase1;
        this.clase2 = clase2;
        this.clase3 = clase3;
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

    public String getSalario() {
        return salario;
    }

    public void setSalario(String salario) {
        this.salario = salario;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getClase1() {
        return clase1;
    }

    public void setClase1(String clase1) {
        this.clase1 = clase1;
    }

    public String getClase2() {
        return clase2;
    }

    public void setClase2(String clase2) {
        this.clase2 = clase2;
    }

    public String getClase3() {
        return clase3;
    }

    public void setClase3(String clase3) {
        this.clase3 = clase3;
    }

    @Override
    public String toString() {
        return apellido;
    }
    
}
