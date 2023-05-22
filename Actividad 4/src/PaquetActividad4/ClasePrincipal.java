package PaquetActividad4;

import java.util.Scanner;

public class ClasePrincipal {
    public static void main(String[] args) {
        
        Scanner A = new Scanner (System.in);
        
        int CantEstudiantes, a = 0;
        double Prom1, Prom2, Prom3, Acumulado, Nota;
        String Materia;
        
        System.out.println("Digita la cantidad de Estudiante: ");
        CantEstudiantes = A.nextInt();
        
        System.out.println("Dame la materia que deseas sacar el promedio: ");
        Materia = A.next();
        
        switch(Materia){
            case "Matematicas":
                
                //Matematicas
                
                System.out.println("Materia: Matematicas");
                Acumulado = 0.0;
                for(a = 1; a <= CantEstudiantes; a++){
                    System.out.println("Digita la nota del estudiante " + a + " : ");
                    Nota = A.nextDouble();
                    Acumulado = Acumulado + Nota;
                }
                Prom1 = Acumulado/CantEstudiantes;
                System.out.println("Promedio de Matematicas: " + Prom1);
            
                break;
                
            case "Español":
                
                //Español
                
                System.out.println("Materia: Español");
                a = 1;
                Acumulado = 0.0;
                while(a <= CantEstudiantes){
                    System.out.println("Digita la nota del estudiante " + a + " : ");
                    Nota = A.nextDouble();
                    Acumulado = Acumulado + Nota;
                    a++;
                }
                Prom2 = Acumulado/CantEstudiantes;
                System.out.println("Promedio de Español: " + Prom2);
                
                break;
                
            case "Ingles":
                
                //Ingles
                
                System.out.println("Materia: Español");
                a = 1;
                Acumulado = 0.0;
                do{
                    System.out.println("Digita la nota del estudiante " + a + " : ");
                    Nota = A.nextDouble();
                    Acumulado = Acumulado + Nota;
                    a++; 
                }while(a <= CantEstudiantes);
                Prom3 = Acumulado/CantEstudiantes;
                System.out.println("Promedio de Ingles: " + Prom3);
                
                break;
            
            default:
                System.out.println("No se ecuentra la materia digitada ");
                break;
        }
        System.out.println("Programado por: Juan Felipe Fernandez Gomez");
    }
}
