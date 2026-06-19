/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package seleccion;
import jugador.Jugador;
import entrenador.Entrenador;

/**
 *
 * @author josed
 */
public class Seleccion {
   private String nombre;
    private Grupos grupo; 
    private Entrenador entrenador; 
    private Jugador jugadores[] =new Jugador[23];

    public Grupos getGrupo() {
        return grupo;
    }

    public Entrenador getEntrenador() {
        return entrenador;
    }

    public Jugador[] getJugadores() {
        return jugadores;
    }

    public void setEntrenador(Entrenador entrenador) {
        this.entrenador = entrenador;
    }

    public Seleccion(String nombre, Grupos grupo, Entrenador entrenador, Jugador[] jugadores) {
        this.nombre = nombre;
        this.grupo = grupo;
        this.entrenador = entrenador;
        this.jugadores = jugadores;
    }
   @Override
    public String toString() {
        return "Selección: " + nombre + " | Grupo: " + grupo + " | Entrenador: " + 
               (entrenador != null ? entrenador.getNombre() : "Sin entrenador");
    }}
        
      
    
