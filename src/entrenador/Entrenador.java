/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entrenador;

import java.time.LocalDate;
import persona.Persona;

/**
 *
 * @author mr117
 */
public class Entrenador extends Persona {
    protected int añosExperiencia;

    public Entrenador(int añosDeExperiencia, String nombre, String nacionalidad, LocalDate fechaNacimiento) {
        super(nombre, nacionalidad, fechaNacimiento);
        this.añosExperiencia = añosDeExperiencia;
    }

    public int getAñosDeExperiencia() {
        return añosExperiencia;
    }

    public void setAñosExperiencia(int añosExperiencia) {
        this.añosExperiencia = añosExperiencia;
    }
    @Override
public String toString() {
    return "Nombre: " + nombre +
           "\nNacionalidad: " + nacionalidad +
           "\nFecha de nacimiento: " + fechaNacimiento +
           "\nEdad: " + getEdad() +
           "\nAños de experiencia: " + añosExperiencia;
}
}
