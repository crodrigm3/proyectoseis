package com.ktxdev.proyectoseis;

import com.ktxdev.proyectoseis.control.ControlCliente;
import com.ktxdev.proyectoseis.modelo.Cliente;
import com.ktxdev.proyectoseis.vista.VistaCliente;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ProyectoseisApplication {

    public static void main(String[] args) {

        SpringApplication.run(ProyectoseisApplication.class, args);

        System.out.println("Proyecto M V C");
        Cliente modelo;
        modelo = llenarDatosCliente();
        VistaCliente vista = new VistaCliente();

        ControlCliente control = new ControlCliente(modelo, vista);
        control.actualizarVista();

    }
    //metodo
    private static Cliente llenarDatosCliente(){
        Cliente cliente = new Cliente();
        cliente.setId(1234);
        cliente.setNombre("Gloria");
        cliente.setApellido("Martinez");
        return cliente;
    }
}
