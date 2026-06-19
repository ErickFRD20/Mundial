/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package seleccion;

/**
 *
 * @author josed
 */
public enum Grupos {
   A("Grupo A"), B("Grupo B"), C("Grupo C"), D("Grupo D"), 
   E("Grupo E"), F("Grupo F"), G("Grupo G"), H("Grupo H"), 
   I("Grupo I"), J("Grupo J"),  K("Grupo K"),  L("Grupo L");
    private final String descripcion;

    public String getDescripcion() {
        return descripcion;
    }
      private Grupos(String descripcion) {
        this.descripcion = descripcion;
    }
} 

