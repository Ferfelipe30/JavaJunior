package PaqueteActividad2;

import java.util.Scanner;

public class ClasePrincipal {
    
    public static void main(String[] args) {
        
        Scanner Escribir = new Scanner(System.in);
        
        // Cliente 1
        
        System.out.println("Digite el Nombre del cliente: ");
        String NombreDelCliente1 = Escribir.nextLine();
        
        // Producto 1
        
        System.out.println("Digita Nombre del producto 1: ");
        String NombreDelProducto1 = Escribir.nextLine();
        System.out.println("Digita el Precio unitario del producto 1: ");
        int Precio1 = Escribir.nextInt();
        System.out.println("Digita la Cantidad de productos 1: ");
        int Cantidad1 = Escribir.nextInt();
        
        // Producto 2
        
        Escribir.nextLine();
        
        System.out.println("Digita Nombre del Producto 2: ");
        String NombreDelProducto2 = Escribir.nextLine();
        System.out.println("Digita el Precio unitario del producto 2: ");
        int Precio2 = Escribir.nextInt();
        System.out.println("Digita la Cantidad de productos 2: ");
        int Cantidad2 = Escribir.nextInt();
        
        // Producto 3
        
        Escribir.nextLine();
        
        System.out.println("Digita Nombre del Producto 3: ");
        String NombreDelProducto3 = Escribir.nextLine();
        System.out.println("Digita el Precio unitario del Producto 3: ");
        int Precio3 = Escribir.nextInt();
        System.out.println("Digita la Cantidad de Productos 3: ");
        int Cantidad3 = Escribir.nextInt();
        
        // Valor Total
        
        int VT1 = Precio1 * Cantidad1;
        int VT2 = Precio2 * Cantidad2;
        int VT3 = Precio3 * Cantidad3;
        
        int VT = VT1 + VT2 + VT3;
        
        System.out.println("El valor total de la factura es: " + VT);
        
        // Factura
        
        System.out.println("");
        System.out.println("Nombre del Cliente: " +NombreDelCliente1);
        System.out.println("Producto            Valor Unitario       Cantidad        Valor Total");
        System.out.println(NombreDelProducto1 + "         " + Precio1 + "                 " + Cantidad1 + "               " + VT1);
        System.out.println(NombreDelProducto2 + "               " + Precio2 + "                 " + Cantidad2 + "               " + VT2);
        System.out.println(NombreDelProducto3 + "         " + Precio3 + "                 " + Cantidad3 + "               " + VT3);
        System.out.println("Total a pagar:                                           "+VT);
        
    }
}
