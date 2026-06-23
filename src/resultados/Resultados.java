/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package resultados;

/**
 *
 * @author Student
 */
public class Resultados {
private String equipo1;
private String equipo2;
private int golesEquipo1;
private int golesEquipo2;

    public void setEquipo1(String equipo1) {
        this.equipo1 = equipo1;
    }

    public void setEquipo2(String equipo2) {
        this.equipo2 = equipo2;
    }

    public void setGolesEquipo1(int golesEquipo1) {
        this.golesEquipo1 = golesEquipo1;
    }

    public void setGolesEquipo2(int golesEquipo2) {
        this.golesEquipo2 = golesEquipo2;
    }

    public String getEquipo1() {
        return equipo1;
    }

    public String getEquipo2() {
        return equipo2;
    }

    public int getGolesEquipo1() {
        return golesEquipo1;
    }

    public int getGolesEquipo2() {
        return golesEquipo2;
    }

    public Resultados(String equipo1, String equipo2, int golesEquipo1, int golesEquipo2) {
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
        this.golesEquipo1 = golesEquipo1;
        this.golesEquipo2 = golesEquipo2;
    }

public String empate(){
    if (golesEquipo1 == golesEquipo2){
        return "Si";
    }
    return "No";
}

public int diferenciaGoles(){
    return Math.abs(golesEquipo1 - golesEquipo2);
}

public int totalGoles(){
    return golesEquipo1 + golesEquipo2;
}

public String ambosAnotaron(){
    if (golesEquipo1 > 0 && golesEquipo2 > 0){
        return "Si";
    }
    return "No";
}

public String equipoGanador(){
    if (golesEquipo1 > golesEquipo2){
        return equipo1;
    } else if (golesEquipo2 > golesEquipo1){
        return equipo2;
    }
    return "Empate";
}
}

