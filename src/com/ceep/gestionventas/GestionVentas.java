package com.ceep.gestionventas;

import com.ceep.dominio.*;

public class GestionVentas {

    public static void main(String[] args) {

        Producto prod1 = new Producto("Peras", 5.4);
        Producto prod2 = new Producto("Manzanas", 6.4);
        Producto prod3 = new Producto("Platanos", 7);
        Orden pedido1 = new Orden();
        pedido1.agregarProducto(prod1);
        pedido1.agregarProducto(prod2);
        pedido1.agregarProducto(prod3);
        pedido1.mostrarOrden();
        Orden pedido2 = new Orden();
        pedido2.agregarProducto(prod1);
        pedido2.agregarProducto(prod2);
        pedido2.mostrarOrden();
    }

}
