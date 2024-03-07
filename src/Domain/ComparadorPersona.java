/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Domain;

import Domain.Persona;
import java.util.Comparator;

/**
 *
 * @author Manuel Trejos
 */
public class ComparadorPersona implements Comparator<Persona>{

    /**
     *
     * @param p1
     * @param p2
     * @return
     */
    @Override
    public int compare(Persona p1, Persona p2) {
        
        int resultado = p1.getNombre().compareTo(p2.getNombre());
        
        if (resultado > 0) {
            return resultado;
        } 
        else if (resultado < 0) {
            return resultado;
        }
        else{
            return resultado;
        }

    } //compare

} //class
