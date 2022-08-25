package com.ktxdev.proyectoseis.control;


import com.ktxdev.proyectoseis.modelo.Cliente;
import com.ktxdev.proyectoseis.vista.VistaCliente;

public class ControlCliente {

    private String nombre;
    private String apellido;

    private Cliente modelo;
    private VistaCliente vista;

    //constructor para inicializar el modelo y la vista
    public ControlCliente(Cliente modelo, VistaCliente vista)
    {
        this.modelo = modelo;
        this.vista = vista;
    }

    //getter y setter
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    public VistaCliente getVista()
    {
        return vista;
    }
    public void setVista(VistaCliente vista)
    {
        this.vista = vista;
    }
    public Cliente getModelo()
    {
        return modelo;
    }
    public void setModelo(Cliente modelo)
    {
        this.modelo = modelo;
    }

    //pasa el modelo a la vista para presentar los datos
    public void actualizarVista()
    {
        vista.MostrarDatosCliente(modelo.getId(),modelo.getNombre(), modelo.getApellido());
    }
}
