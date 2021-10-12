package com.ceep.dominio;

public class Orden {
    private final int idOrden;
    Producto productos[];
    private static int contadorOrdenes;
    private static int contadorProductos;
    private static final int MAX_PRODUCTOS = 10;
    
    public Orden(){
        Orden.contadorProductos = 0;
        productos = new Producto[Orden.MAX_PRODUCTOS];
        this.idOrden = ++Orden.contadorOrdenes;
    }
    
    public void agregarProducto(Producto producto){
        if (Orden.contadorProductos < Orden.MAX_PRODUCTOS){
            productos[Orden.contadorProductos++] = producto;
        } else {
            System.out.println("Has alcanzado el máximo de productos por orden de " +
                    + Orden.MAX_PRODUCTOS);
        }
    }
    
    public double calcularTotal(){
        var res = 0.0;
        for (int i = 0; i < Orden.contadorProductos; i++) {
            res += productos[i].getPrecio();
        }
        return res;
    }
    
    public void mostrarOrden(){
        System.out.println("Id de Orden: " + this.idOrden);
        for (int i = 0; i < Orden.contadorProductos; i++) {
            System.out.println("Nombre producto[" + i + "] -> " 
                    + productos[i].getNombre());
            System.out.println("Precio producto[" + i + "] -> " 
                    + productos[i].getPrecio());            
        }
        System.out.println("Total: " + this.calcularTotal());
    }
}
