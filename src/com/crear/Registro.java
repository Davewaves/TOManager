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
public class Registro {
    
    private String titulo;
    private Date fechaSeleccionada;
    private LocalTime horaSeleccionada;
    private String prioridad;
    private String estado;
    private String descripcion;
    
    //Metodo constructor que asigna los valores.
    public Registro(String titulo, Date fechaSeleccionada, LocalTime horaSeleccionada, String prioridad, String estado, String descripcion) {
        this.titulo = titulo;
        this.fechaSeleccionada = fechaSeleccionada;
        this.horaSeleccionada = horaSeleccionada;
        this.prioridad = prioridad;
        this.estado = estado;
        this.descripcion = descripcion;
    }
    
    public String getTitulo() {
        return titulo;
    }
        public String getEstado() {
        return estado;
    }

    public String getPrioridad() {
        return prioridad;
    }

    public String getDescripcion() {
        return descripcion;
    }
    
    public Date getFechaSeleccionada() {
        return fechaSeleccionada;
    }
    
    public LocalTime getHoraSeleccionada() {
        return horaSeleccionada;
    }
    
    
    //metodos set
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
        public void setEstado(String estado) {
        this.estado = estado;
    }

    public void setPrioridad(String prioridad) {
        this.prioridad = prioridad;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    public void setFechaSeleccionada(Date fechaSeleccionada) {
        this.fechaSeleccionada = fechaSeleccionada;
    }
    
    public void setHoraSeleccionada(LocalTime horaSeleccionada) {
        this.horaSeleccionada = horaSeleccionada;
    }
    
}
