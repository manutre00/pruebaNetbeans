/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Domain;

import Domain.ComparadorPersona;
import Domain.Persona;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Manuel Trejos
 */
public class ClaseInvocacion {

    private ArrayList<Persona> personas;

    private List<Persona> list;

    public ClaseInvocacion() {
        this.list = llenarPersonas();
        imprimirLista("desordenada");
        Collections.sort(this.list, new ComparadorPersona());
        imprimirLista("ordenada");
    } //constructor

    private ArrayList<Persona> llenarPersonas() {
        this.personas = new ArrayList<>();

        this.personas.add(new Persona("Manuel", "30527",
                "1 de Mayo"));
        this.personas.add(new Persona("Carlos", "65789",
                "4 de Abril"));
        this.personas.add(new Persona("Ian", "56549",
                "25 de Marzo"));
        this.personas.add(new Persona("Cecilio", "94572",
                "25 de Enero"));

        return this.personas;
        
        //automatizar esto para que se pide con GI
        
    } //llenarPersonas

    private void imprimirLista(String momento) {
        String cadena = "La lista " + momento + " es: " + "\n" + "[";
        for (int i = 0; i < list.size(); i++) {
            cadena += this.list.get(i).getNombre();
            if (i != this.list.size() - 1) {
                cadena += ", ";
            }//if
        }//for
        cadena += "]";
        JOptionPane.showMessageDialog(null, cadena);
    } //imprimirLista
    
} //class
