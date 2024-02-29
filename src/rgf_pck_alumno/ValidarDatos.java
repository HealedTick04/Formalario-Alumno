/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rgf_pck_alumno;

/**
 *
 * @author dary_
 */
public class ValidarDatos {
     public static boolean validarNumControl(int numControl) {
        return String.valueOf(numControl).length() == 8;
    }

    public static boolean validarNombreApellido(String texto) {
        return texto.matches("[a-zA-ZñÑáéíóúÁÉÍÓÚ\\s]+");
    }
}
