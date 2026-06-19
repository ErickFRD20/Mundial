/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arbitro;
import java.time.LocalDate;
import persona.Persona;
/**
 *
 * @author Student
 */
public class Arbitro extends Persona {
    private String categoria;

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public Arbitro(String categoria, String nombre, String nacionalidad, LocalDate fechaNacimiento) {
        super(nombre, nacionalidad, fechaNacimiento);
        this.categoria = categoria;
    }
    
    @Override
    public String toString(){
        return "Arbitro: " + super.toString() + ", Categoria:" + categoria;
    }
}
