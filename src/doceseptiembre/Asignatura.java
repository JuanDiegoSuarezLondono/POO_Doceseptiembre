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
public class Asignatura {
    private int codigo;
    private String nombre;
    private int numerocreditos;
    private int nota;

    public Asignatura(int codigo, String nombre, int numerocreditos) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.numerocreditos = numerocreditos;
        nota=0;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumerocreditos() {
        return numerocreditos;
    }

    public int getNota() {
        return nota;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNumerocreditos(int numerocreditos) {
        this.numerocreditos = numerocreditos;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }
    
        
  
    
}
