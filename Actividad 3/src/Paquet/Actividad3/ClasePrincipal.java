package Paquet.Actividad3;

import java.util.Scanner;

public class ClasePrincipal {
    public static void main(String[] args) {
        
        Triangulo t = new Triangulo();
        
        Scanner L = new Scanner(System.in);
        
        System.out.println("Ingrese la medida del lado a: ");
        t.a = L.nextInt();
        
        System.out.println("Ingrese la medida del lado b: ");
        t.b = L.nextInt();
        
        System.out.println("Ingrese la medida del lado c: ");
        t.c = L.nextInt();
        
        t.Clasificar();
        
        System.out.println("Tipo de Triangulo: "+ t.Tipo);
        
        t.Angulos();
        
        System.out.println("Angulos = ");
        System.out.println("A = " + t.A);
        System.out.println("B = " + t.B);
        System.out.println("C = " + t.C);
        
        System.out.println("Programado por: Juan Felipe Fernandez Gomez");
        
    }
}
