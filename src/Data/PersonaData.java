/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Data;

import Domain.Persona;
import Utility.RutaTxT;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Manuel Trejos
 */
public class PersonaData {

    /**
     * Este método registra la persona en el sistema.
     *
     * @param persona La persona a registrar.
     * @return boolean true si se registra bien.
     * @throws IOException
     */
    public boolean registrarPersona(Persona persona) throws IOException {
        File f = new File(RutaTxT.RUTAPERSONAS);
        FileWriter fw = new FileWriter(f.getName(), true);
        if (f.length() > 0) {
            fw.write("\n");
        }
        fw.write(persona.getNombre() + ";");
        fw.write(persona.getID() + ";");
        fw.write(persona.getFechaInicioLab());
        fw.close();

        return true;
    }//registrarPersona 

    /**
     * Devuelve a las personas en el sistema.
     *
     * @return ArrayList con las personas.
     * @throws FileNotFoundException
     * @throws IOException
     */
    public ArrayList<Persona> readPersonas() throws FileNotFoundException, IOException {
        ArrayList<Persona> personas = new ArrayList<>();
        BufferedReader buffer = new BufferedReader(new FileReader(RutaTxT.RUTAPERSONAS));
        String linea;
        while ((linea = buffer.readLine()) != null) {
            String[] campos = linea.split(";");
            Persona persona = new Persona(campos[0], campos[1], campos[2]);
            personas.add(persona);
        }
        return personas;
    } //readPersonas

    /**
     * Elimina una persona del sistema utlilizando el nombre
     *
     * @param nombre Nombre de la persona a eliminar
     * @return boolean true éxito, false error al eliminar
     * @throws IOException
     */
    public boolean eliminarPersona(String nombre) throws IOException {
        List<Persona> personas = readPersonas();
        boolean resultado = personas.removeIf(persona -> persona.getNombre().equalsIgnoreCase(nombre));
        if (resultado) {
            try (FileWriter fw = new FileWriter(RutaTxT.RUTAPERSONAS)) {
                //MEGA IMPORTANTE: sobrescribe el archivo
                for (Persona persona : personas) {
                    fw.write(persona.getNombre() + ";");
                    fw.write(persona.getID() + ";");
                    fw.write(persona.getFechaInicioLab() + "\n");
                }
            }// try
        }//if 
        else {
            resultado = false;
        }
        return resultado;
    }//eliminarPersona 
   
    
    
    
} //class
