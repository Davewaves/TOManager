/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.crear;

import java.util.ArrayList;

/**
 *
 * @author Davewaves
 */
public class DatosCompartidos {
    
    private static final ArrayList<Registro> registros = new ArrayList<>();

    public static void agregarRegistro(Registro registro) {
        registros.add(registro);
    }

    public static ArrayList<Registro> getRegistros() {
        return new ArrayList<>(registros); // Devuelve una copia para evitar modificaciones directas
    }
    
}
