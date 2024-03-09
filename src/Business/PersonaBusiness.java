/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business;

import Data.PersonaData;
import Domain.Persona;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;

/**
 *
 * @author Manuel Trejos
 */
public class PersonaBusiness {

    private PersonaData pd;

    public PersonaBusiness() {
        this.pd = new PersonaData();
    } //constructor

    public boolean registrarPersona(Persona persona) throws IOException {
        boolean com = comprobarCaracteres(persona);
        if (com) {
                return false;
        } else {
             return this.pd.registrarPersona(persona);
        }
    }//registrarPersona

    public ArrayList<Persona> devolverPersonas() throws FileNotFoundException, IOException {
        return this.pd.readPersonas();
    }//devolverPersonas

    public boolean comprobarCaracteres(Persona persona) {
        boolean res = false;
        String[] caracteres = {"!", "\"\"", "#", "$", "%", "&"};
        for (int i = 0; i < caracteres.length; i++) {
            res = persona.getNombre().contains(caracteres[i]);
            if (res == true){
                break;
            }
        } //for
        return res;
    }//comprobarCaracteres
    
     public Persona buscarPersona(String ID) throws IOException{
         return this.pd.buscarPersona(ID);
     }//buscarPersona

} //class
