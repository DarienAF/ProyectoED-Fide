package Procesos;


import java.io.BufferedWriter;
import java.io.FileWriter;

import java.io.BufferedReader;
import java.io.FileReader;

import java.io.IOException;

public class DatosManager {
   public void guardarDatos(String nombre, int puntos) {
        String datos = "Jugador: " + nombre + ", " + "Puntos: " + puntos + "\n";
        try (BufferedWriter writer = new BufferedWriter(new FileWriter
        ("Resultados.txt", true))) {

            writer.write(datos); 
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public String leerDatos() {
        StringBuilder sb = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader
        ("Resultados.txt"))) {
            
            String line;
            while ((line = reader.readLine()) != null) {
                sb.append(line).append("\n"); 
            }
            
        } catch (IOException e) {
            e.printStackTrace();
        }
        return sb.toString(); 
    }
}
