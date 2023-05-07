/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package doceseptiembre;

/**
 *
 * @author suare
 */
public class Estudiante {
    private int codigo;
    private int numerodematerias;
    private String nombre;
    private String apellido;
    private Asignatura Materia[]=new Asignatura[4];

                
    public Estudiante(int codigo, String nombre, String apellido) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.apellido = apellido;
        Materia[0]=new Asignatura(0, " ", 0);
        Materia[1]=new Asignatura(0, " ", 0);
        Materia[2]=new Asignatura(0, " ", 0);
        Materia[3]=new Asignatura(0, " ", 0);        
    }

    public int getCodigo() {
        return codigo;
    }

    public int getNumerodematerias() {
        return numerodematerias;
    }    
    
    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Asignatura[] getMateria() {
        return Materia;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNumerodematerias(int numerodematerias) {
        this.numerodematerias = numerodematerias;
    }   

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    public void registrar(int num, Asignatura Mat)
    {
        Materia[num]=Mat;     
    }
    
    public int comprobar(int mat, Asignatura materias[])
    {
        int ciclo=0;
        for(int i=0;i<4;i++)
        {
            if(mat==0)
            {
                ciclo=0;
                break;
            }
            if(Materia[i]==materias[mat-1])
            {
                ciclo=1;
                break;            
            }  
            else
            {
                ciclo=2;
            }
        }
        return ciclo;
    }
           
    public float calcularpromedio()
    {
        return (((Materia[0].getNota())*(Materia[0].getNumerocreditos()))+((Materia[1].getNota())*(Materia[1].getNumerocreditos()))+((Materia[2].getNota())*(Materia[2].getNumerocreditos()))+((Materia[3].getNota())*(Materia[3].getNumerocreditos())))/((Materia[0].getNumerocreditos())+(Materia[1].getNumerocreditos())+(Materia[2].getNumerocreditos())+(Materia[3].getNumerocreditos()));
    }
    
    public boolean verificar (float promedio)
    {
        return promedio<3.3;
    }
    
}
