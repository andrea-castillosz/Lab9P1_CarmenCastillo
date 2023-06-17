/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab9p1_carmencastillo;

import java.util.Random;
import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author casti
 */
public class Libros {

    private String titulo;
    private String autor;
    private String genero;
    private int edad;

    public Libros() {

        
        
        
    }
    
    public Libros (String tituloN, String autorN, String generoN, int edadN){
        
        this.titulo = tituloN;
        this.autor = autorN;
        this.genero = generoN;
        this.edad = edadN;
        
    }
    
    @Override
    public String toString(){
        
        return "Título: " + titulo + "\n Autor: " + autor + "\n Género: " + genero + "\n Edad Minima: " + edad;
        
    }
    
    public void setTitulo(String titulo) {

        this.titulo = titulo;

    }
    
    public void setAutor(String autor) {

        this.autor = autor;

    }
    
    public void setGenero(String gen) {

        this.genero = gen;

    }
    
    public void setEdad(int edad) {
        
        this.edad = edad;
        
    }
    
    public String getTitulo(){
        
        return this.titulo;
        
    }
    public String getAutor() {

        return this.autor;

    }
    
    public String getGenero() {

        return this.genero;

    }
    
    public int getEdad() {
        
        return this.edad;
        
    }

}
