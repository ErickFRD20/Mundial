/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package partido;
import arbitro.Arbitro;
/**
 *
 * @author Student
 */
public class ListaArbitros {
    private Arbitro[] arbitros;
    private int cantidad;
    
    public ListaArbitros(){
        arbitros = new Arbitro[20];
        cantidad = 0;
    }
    public void agregarArbitro(Arbitro arbitro){
        if (cantidad < arbitros.length){
            arbitros[cantidad] = arbitro;
            cantidad++;
        }
    }
    public void eliminarArbitro(String nombre){
        for (int i=0;i<cantidad;i++){
            if (arbitros[i].getNombre().equalsIgnoreCase(nombre)){
                for(int j=i;j<cantidad-1;j++){
                    arbitros[j] = arbitros[j+1];
                }
                arbitros[cantidad-1]=null;
                cantidad--;
                break;
            }   
        }
    }
    public Arbitro buscarArbitro(String nombre){
        for (int i =0;i<cantidad;i++){
            if (arbitros[i].getNombre().equalsIgnoreCase(nombre)){
                return arbitros[i];
            }
        }
        return null;
    }
    public int contarArbitros(){
        return cantidad;
    }
    public void verificarArbitro(String nombre){
        Arbitro arbitro = buscarArbitro(nombre);
        if(arbitro!=null){
            System.out.print("El arbitro si esta registrado.");
        }else {
            System.out.print("El arbitro no esta registrado.");
        }
    }
}
