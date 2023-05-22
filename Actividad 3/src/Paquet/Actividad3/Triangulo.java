package Paquet.Actividad3;

public class Triangulo {
    
    int a,b,c;
    double A,B,C;
    String Tipo;
    
    public void Clasificar (){
        
        if (a == b && b == c) {
            System.out.println("El triangulo es Equilatero");
            Tipo = "Equilatero";
            
        } else if ((a == b && c != a) || (b == c && c != a) || (a == c && b != a)){
            System.out.println("El triangulo es Isosceles");
            Tipo = "Isosceles";
            
        } else if (a != b && a != c && b != c){
            System.out.println("Es triangulo es Escaleno");
            Tipo = "Escaleno";
            
        }
    }
    
    public void Angulos (){
        
        double AR, BR, CR, Argumento;
        
        double a1 = (double)a;
        double b1 = (double)b;
        double c1 = (double)c;
        
        switch (Tipo){
            
            case "Equilatero":
                
                AR = Math.PI/3.0;
                BR = Math.PI/3.0;
                CR = Math.PI/3.0;
                break;
                
            default:
                
                Argumento = (b1 * b1 + c1 * c1 - a1 * a1)/(2*b1*c1);
                AR = Math.acos(Argumento);
                
                Argumento = (a1 * a1 + c1 * c1 - b1 * b1)/(2*a1*c1);
                BR = Math.acos(Argumento);
                
                Argumento = (a1 * a1 + b1 * b1 - c1 * c1)/(2*a1*b1);
                CR = Math.acos(Argumento);
                break;
                
        }
        
        A = Math.toDegrees(AR);
        B = Math.toDegrees(BR);
        C = Math.toDegrees(CR);
        
    }
}
