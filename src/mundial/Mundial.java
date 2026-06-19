/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mundial;
import java.time.LocalDate;

/**
 *
 * @author mr117
 */
public class Mundial {
    protected String Nombre;
    protected  LocalDate año;
    protected String Pais;

    public Mundial(String Nombre, LocalDate año, String Pais) {
        this.Nombre = Nombre;
        this.año = año;
        this.Pais = Pais;
    }

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
    @Override
    public String toString(){
        return "Mundial{" + 
                "Nombre" + Nombre + 
                "año=" año + "pais=" Pais + "/" + "/";
    } 
    
}