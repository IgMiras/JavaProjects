/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package banco;

/**
 *
 * @author IgMiras
 */
public class PrimeiraMaiuscula {
    public static String primeiraMaiuscula(String s) {
    if (s == null || s.isEmpty()) {
        return s;
    }
    return s.substring(0, 1).toUpperCase() + s.substring(1).toLowerCase();
}

}
