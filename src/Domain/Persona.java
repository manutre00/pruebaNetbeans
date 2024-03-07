/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Domain;

/**
 *
 * @author Manuel Trejos
 */
public class Persona {
    
    private String nombre;
    private String ID; 
    private String FechaInicioLab;

    public Persona(String nombre, String ID, String FechaInicioLab) {
        this.nombre = nombre;
        this.ID = ID;
        this.FechaInicioLab = FechaInicioLab;
    } //constructor

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getFechaInicioLab() {
        return FechaInicioLab;
    }

    public void setFechaInicioLab(String FechaInicioLab) {
        this.FechaInicioLab = FechaInicioLab;
    }
    
} //class
