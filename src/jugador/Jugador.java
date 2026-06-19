/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package jugador;
import java.time.LocalDate;
import persona.Persona;
        
/**
 *
 * @author Student
 */
public class Jugador extends Persona {
    protected int numero;
    protected String posicion;

    public int getNumero() {
        return numero;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public Jugador(int numero, String posicion, String nombre, String nacionalidad, LocalDate fechaNacimiento) {
        super(nombre, nacionalidad, fechaNacimiento);
        this.numero = numero;
        this.posicion = posicion;
    }
@Override
    public String toString() {
        return "Jugador: " + nombre + ", Nacionalidad: " + nacionalidad + ", Edad: " + getEdad() + " años" +", Número: " + numero + ", Posición: " + posicion;
  
    
}
}
