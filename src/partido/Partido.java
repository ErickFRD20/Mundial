/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package partido;
import java.time.LocalDate;
import seleccion.Seleccion;
import arbitro.Arbitro;
import java.time.LocalTime;

/**
 *
 * @author Student
 */
public class Partido {
    private Seleccion seleccionLocal;
    private Seleccion seleccionVisitante;
    private String estadio;
    private LocalDate fecha;
    private LocalTime hora;
    private Arbitro arbitro;
    private String resultado;
    
    public Partido(){}
    public Partido(Seleccion seleccionLocal, Seleccion seleccionVisitante,String estadio,LocalDate fecha, LocalTime hora, Arbitro arbitro, String resultado){
        this.seleccionLocal = seleccionLocal;
        this.seleccionVisitante = seleccionVisitante;
        this.estadio = estadio;
        this.fecha = fecha;
        this.hora = hora;
        this.arbitro = arbitro;
        this.resultado = resultado;
    }
    public Seleccion getSeleccionLocal() {

        return seleccionLocal;

    }

    public void setSeleccionLocal(Seleccion seleccionLocal) {

        this.seleccionLocal = seleccionLocal;

    }

    public Seleccion getSeleccionVisitante() {

        return seleccionVisitante;

    }

    public void setSeleccionVisitante(Seleccion seleccionVisitante) {

        this.seleccionVisitante = seleccionVisitante;

    }

    public String getEstadio() {

        return estadio;

    }

    public void setEstadio(String estadio) {

        this.estadio = estadio;

    }

    public LocalDate getFecha() {

        return fecha;

    }

    public void setFecha(LocalDate fecha) {

        this.fecha = fecha;

    }

    public LocalTime getHora() {

        return hora;

    }

    public void setHora(LocalTime hora) {

        this.hora = hora;

    }

    public Arbitro getArbitro() {

        return arbitro;

    }

    public void setArbitro(Arbitro arbitro) {

        this.arbitro = arbitro;

    }

    public String getResultado() {

        return resultado;

    }

    public void setResultado(String resultado) {

        this.resultado = resultado;
    }
       @Override
    public String toString() {
        return "Partido{" +
                "seleccionLocal=" + seleccionLocal +
                "seleccionVisitante=" + seleccionVisitante +
                "estadio='" + estadio + '\'' +
                "fecha=" + fecha +
                "hora=" + hora +
                "arbitro=" + arbitro +
                "resultado='" + resultado + '\'' +
                '}';
    }
    
}
