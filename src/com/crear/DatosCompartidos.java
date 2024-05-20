/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.crear;

import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Davewaves
 */
public class DatosCompartidos {
    
    private static final ArrayList<Registro> registros = new ArrayList<>();

    public static void agregarRegistro(Registro registro) {
        registros.add(registro);
    }
    
    //funcion para eliminar registro
    public static void eliminarRegistro(int e) {
        registros.remove(e);
    }
    
    /*actualizar registro
    public static void editarRegistro(String titulo, Date fechaSeleccionada, LocalTime horaSeleccionada, String prioridad, String estado, String descripcion, int e) {
        registros.set(e, titulo, fechaSeleccionada, horaSeleccionada, prioridad, estado, descripcion);
    }*/

    
    //actualizar registro
    public static void editarRegistro(Registro registro, int e) {
        registros.set(e, registro);
    }
    
    
    public static ArrayList<Registro> getRegistros() {
        return new ArrayList<>(registros); // Devuelve una copia para evitar modificaciones directas
    }
    
}
