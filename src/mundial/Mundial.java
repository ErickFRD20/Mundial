package mundial;

import java.time.LocalDate;
import seleccion.Seleccion;
import seleccion.Grupos;
import partido.Partido;

public class Mundial {

    protected String Nombre;
    protected LocalDate año;
    protected String Pais;

    Seleccion[] selecciones = new Seleccion[50];
    int totalSelecciones = 0;

    Partido[] partidos = new Partido[200];
    int totalPartidos = 0;

    public String getNombre() {
        return Nombre;
    }

    public LocalDate getAño() {
        return año;
    }

    public String getPais() {
        return Pais;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public void setAño(LocalDate año) {
        this.año = año;
    }

    public void setPais(String Pais) {
        this.Pais = Pais;
    }

    public Mundial(String Nombre, LocalDate año, String Pais) {
        this.Nombre = Nombre;
        this.año = año;
        this.Pais = Pais;
    }

    // ---------------- SELECCIONES ----------------

    public void agregarSeleccion(Seleccion seleccion) {
        selecciones[totalSelecciones++] = seleccion;
    }

    public void eliminarSeleccion(Seleccion seleccion) {
        for (int i = 0; i < totalSelecciones; i++) {
            if (selecciones[i] != null && selecciones[i] == seleccion) {
                for (int j = i; j < totalSelecciones - 1; j++) {
                    selecciones[j] = selecciones[j + 1];
                }
                selecciones[--totalSelecciones] = null;
                break;
            }
        }
    }

    public Seleccion buscarSeleccion(String nombre) {
        for (int i = 0; i < totalSelecciones; i++) {
            if (selecciones[i] != null &&
                selecciones[i].getNombre() != null &&
                selecciones[i].getNombre().equals(nombre)) {
                return selecciones[i];
            }
        }
        return null;
    }

    public int contarSelecciones() {
        return totalSelecciones;
    }

    public Seleccion estaInscrita(String nombre) {
        return buscarSeleccion(nombre);
    }

    public Seleccion[] seleccionesPorGrupo(Grupos grupo) {
        Seleccion[] aux = new Seleccion[50];
        int total = 0;

        for (int i = 0; i < totalSelecciones; i++) {
            if (selecciones[i] != null && selecciones[i].getGrupo() == grupo) {
                aux[total++] = selecciones[i];
            }
        }
        return aux;
    }

    // ---------------- PARTIDOS ----------------

    public void agregarPartido(Partido partido) {
        partidos[totalPartidos++] = partido;
    }

    public void eliminarPartido(Partido partido) {
        for (int i = 0; i < totalPartidos; i++) {
            if (partidos[i] == partido) {
                for (int j = i; j < totalPartidos - 1; j++) {
                    partidos[j] = partidos[j + 1];
                }
                partidos[--totalPartidos] = null;
                break;
            }
        }
    }

    public int contarPartidos() {
        return totalPartidos;
    }

    public Partido[] partidosPorSeleccion(String nombreSeleccion) {
        Partido[] aux = new Partido[200];
        int total = 0;

        for (int i = 0; i < totalPartidos; i++) {
            if (partidos[i] != null) {

                if (partidos[i].getSeleccionLocal() != null &&
                    partidos[i].getSeleccionLocal().getNombre() != null &&
                    partidos[i].getSeleccionLocal().getNombre().equals(nombreSeleccion)) {

                    aux[total++] = partidos[i];
                }

                else if (partidos[i].getSeleccionVisitante() != null &&
                         partidos[i].getSeleccionVisitante().getNombre() != null &&
                         partidos[i].getSeleccionVisitante().getNombre().equals(nombreSeleccion)) {

                    aux[total++] = partidos[i];
                }
            }
        }
        return aux;
    }

    public Partido[] partidosPorFecha(LocalDate fechaBuscada) {
        Partido[] aux = new Partido[200];
        int total = 0;

        for (int i = 0; i < totalPartidos; i++) {
            if (partidos[i] != null &&
                partidos[i].getFecha() != null &&
                partidos[i].getFecha().equals(fechaBuscada)) {

                aux[total++] = partidos[i];
            }
        }
        return aux;
    }

    @Override
    public String toString() {
        return "Mundial{" +
                "nombre=" + Nombre +
                ", año=" + año +
                ", pais=" + Pais +
                '}';
    }
}