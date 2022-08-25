package com.ktxdev.proyectoseis.mvc;

import com.ktxdev.proyectoseis.control.ControlCliente;
import com.ktxdev.proyectoseis.modelo.Cliente;
import com.ktxdev.proyectoseis.vista.VistaCliente;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class mvc {

    public static void main(String[] args)
    {
        SpringApplication.run(mvc.class, args);
        System.out.println("Proyecto MVC");

        // objeto vista, y modelo creado con el método estático
        Cliente modelo;
        modelo = llenarDatosCliente();
        VistaCliente vista= new VistaCliente();

        //El objeto controlador hace de intermediario entre el modelo y la vista
        //El objeto controlador le pasa el modelo y la vista
        ControlCliente controlador= new ControlCliente(modelo, vista);

        // Se muestra los datos del cliente
        controlador.actualizarVista();

        // Se actualiza un cliente y se muestra de nuevo los datos
        controlador.setNombre("Luis");
        controlador.setApellido("Santamaria");
        controlador.actualizarVista();
    }

    //método estático que retorna el cliente con sus datos
    private static Cliente llenarDatosCliente() {
        Cliente cliente = new Cliente();
        cliente.setId(125);
        cliente.setNombre("Carlos");
        cliente.setApellido("Torres");
        return cliente;
    }
}
