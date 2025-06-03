package U1;

import java.util.Scanner;

public class Test {
    public static void main(String[] args){
    
    Persona persona = new Persona();
    Persona persona2 = new Persona();
    Estudiante estudiante = new Estudiante();
    Estudiante estudiante1 = new Estudiante();
    Estudiante estudiante2 = new Estudiante();
    Scanner teclado = new Scanner(System.in);
    String valor;
    /*persona.nombre="Gerald";
    persona.nombre="Juan";*/
    System.out.println("Dame el nombre = ");
    valor=teclado.nextLine();
    persona.setNombre(valor);
    System.out.println("Nombre de persona= "+persona.getNombre());
    
        System.out.println("Dame el nombre = ");
        valor=teclado.nextLine();
        persona2.setNombre(valor);
        System.out.println("Nombre de persona 2= "+persona2.getNombre());
        
        //estudinate
        estudiante.setNombre("Pablo");
        estudiante.setApellido("Morales");
        System.out.println("Dame la matricula = ");
        valor = teclado.nextLine();
        estudiante.Matricular(valor);
        System.out.println("Alumno "+ estudiante.getNombre() + "\n");
        
        estudiante1.setNombre("pollis");
        estudiante1.setApellido("cruz");
        System.out.println("Dame la matricula = ");
        valor = teclado.nextLine();
        estudiante1.Matricular(valor);
        System.out.println("Alumno "+ estudiante1.getNombre() + "\n");
        
        estudiante2.setNombre("uriel");
        estudiante2.setApellido("abizaid");
        System.out.println("Dame la matricula = ");
        valor = teclado.nextLine();
        estudiante2.Matricular(valor);
        System.out.println("Alumno "+ estudiante2.getNombre() + "\n");
    
    }
}
