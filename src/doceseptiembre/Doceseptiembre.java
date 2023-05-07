/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doceseptiembre;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author suare
 */
public class Doceseptiembre {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int ciclo=0;
        
        Asignatura materias[]=new Asignatura[7];
        materias[0]=new Asignatura(001, "Matematicas", 4);
        materias[1]=new Asignatura(010, "Fisica", 4);
        materias[2]=new Asignatura(011,"Ingles", 1);
        materias[3]=new Asignatura(100, "Sexologia", 10);
        materias[4]=new Asignatura(101, "Deportes", 0);
        materias[5]=new Asignatura(110, "Filosofia de cereales cuanticos para gorilas", 4);
        materias[6]=new Asignatura(111,"Como cocinar agua", 1);
        
        
        System.out.println("Ingrese el codigo, el nombre y el apellido del estudiante: ");
        Estudiante E1=new Estudiante(Integer.parseInt(br.readLine()),br.readLine(),br.readLine());
        System.out.println("Las materias disponibles son: ");
        for(int i=1;i<=7;i++)
        {
            System.out.println(i+") "+materias[i-1].getNombre());
            System.out.println("Codigo: "+materias[i-1].getCodigo());            
            System.out.println("Creditos: "+materias[i-1].getNumerocreditos());
        }
        System.out.println("Ingrese el numero de materias que va a ver el estudiante (maximo 4 independiente de los creditos): ");
        E1.setNumerodematerias(Integer.parseInt(br.readLine()));
        System.out.println("Ingrese el numero de la(s) materia(s): ");
        
        for(int i=0;i<E1.getNumerodematerias();i++)
        {
            E1.registrar(i,materias[Integer.parseInt(br.readLine())-1]);                   
        }
        
        do
        {
        System.out.println(" ");   
        System.out.println("Si quiere comprobar alguna ingrese el numero, de lo contrario ingrese '0': ");
        ciclo=E1.comprobar(Integer.parseInt(br.readLine()),materias);
        if (ciclo==1)
        {
            System.out.println("La materia esta matriculada");
        }
        if(ciclo==2)
        {
            System.out.println("No esta matriculada");   
        }       
        }
        while(ciclo!=0);
        
        for(int i=1;i<=E1.getNumerodematerias();i++)
        {
            System.out.println(i+") Ingresar la nota de "+E1.getMateria()[i-1].getNombre()+": ");
            E1.getMateria()[i-1].setNota(Integer.parseInt(br.readLine()));         
        }
        System.out.println("El promedio ponderado del estudiante "+E1.getNombre()+" "+E1.getApellido()+" es: "+E1.calcularpromedio());
        System.out.println("El estudiante "+E1.getNombre()+" "+E1.getApellido()+" se encuentra 'Condicionado': "+E1.verificar(E1.calcularpromedio()));
        // TODO code application logic here
    }
    
}
