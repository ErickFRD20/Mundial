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
    String Grupo;
    if (grupo != null) {
    Grupo = grupo.getDescripcion();
    } else {Grupo = "Sin grupo";}
    
 String Entrenador;
    if (entrenador != null) {Entrenador = entrenador.getNombre();
    } else {Entrenador = "Sin entrenador";
    }
    return "Selección:"+nombre+"Grupo: "+Grupo+"Entrenador:"+Entrenador;
    
}
public void agregarJugador(Jugador jugador) {
        for (int i = 0; i < jugadores.length; i++) {
            if (jugadores[i] == null) {
                jugadores[i] = jugador;
                System.out.println("se agrego un jugador : " + jugador.getNombre());
                return;}
        }
    System.out.println("no hay campo en la seleccion");
    }
    
    public void agregarJugadores(Jugador[] jugadores) {
        for(int i = 0; i < jugadores.length; i++) { 
            if (jugadores[i] != null) { agregarJugador(jugadores[i]);
            }}}
    
   public void eliminarJugador(String nombre) {
        for (int i = 0; i < jugadores.length; i++) {
        if (jugadores[i] != null && jugadores[i].getNombre().equals(nombre)) {
        jugadores[i] = null;
        System.out.println("jugador borrado:"+ nombre);
        return;}}
        System.out.println("No se encontró el jugador: " + nombre);
    }
  
    public Jugador BuscarPorNombre(String nombre) {
        for (int i = 0; i < jugadores.length; i++) {
         if (jugadores[i] != null && jugadores[i].getNombre().compareTo(nombre) == 0) {
         return jugadores[i];
         }}
        return null;
    }
    
    public Jugador buscarPorNumero(int numero) {
        for (int i = 0; i < jugadores.length; i++) {
           if (jugadores[i] != null && jugadores[i].getNumero() == numero) {
          return jugadores[i];
      }}
        return null;
    }
    public int contarJugadores() {
        int contador = 0;
        for (int i = 0; i < jugadores.length; i++) {
        if (jugadores[i] != null) {  
        contador = contador + 1;
     }}
        return contador;
    }
    public void existeNumeroJugador(int numero) {
        Jugador encontrado=buscarPorNumero(numero);
         if (encontrado != null) {
      System.out.println("existe la camiseta" + numero + ":"+encontrado.getNombre());
        } else {
            System.out.println("no existe la camiseta"+numero);
        }
    }
}

        
      
    
