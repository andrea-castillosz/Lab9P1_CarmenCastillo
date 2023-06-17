/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab9p1_carmencastillo;

import java.util.Random;
import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author casti
 */
public class Lab9P1_CarmenCastillo {

    static Scanner leer = new Scanner(System.in, "ISO-8859-1");
    static Scanner leerent = new Scanner(System.in);
    static Random rand = new Random();
    static Libros libro = new Libros();
    static ArrayList<Libros> libros = new ArrayList<>();

    //Libros.get(i).get
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        boolean seguirmenu = true;
        while (seguirmenu) {
            System.out.println(" ");
            System.out.println("Menu");
            System.out.println("1. Libros y más Libros REMASTERED.");
            System.out.println("2. Salir.");
            System.out.print("Ingrese una opcion: ");
            int opcion = leerent.nextInt();

            switch (opcion) {
                case 1:
                    int contador = 0;
                    boolean seguir = true;
                    while (seguir) {
                        System.out.println("");
                        System.out.println("--SubMenu--");
                        System.out.println("1. Agregar Libro.");
                        System.out.println("2. Listar libros.");
                        System.out.println("3. Modificar librero.");
                        System.out.println("4. Eliminar libro.");
                        System.out.println("5. Buscar libro por titulo.");
                        System.out.println("6. Buscar libros según autor.");
                        System.out.println("7. Búsqueda con filtro de genero.");
                        System.out.println("Advertencia: Primero cree su libro.");
                        System.out.println("8. Salir.");
                        System.out.print("Ingrese una opcion: ");
                        int opcionsub = leerent.nextInt();
                        System.out.println("");

                        switch (opcionsub) {
                            case 1:
                                System.out.println("");
                                System.out.println("Opción ingresada: 1");
                                System.out.println("Ha elegido la opción para agregar un libro, por favor aporte la información solicitada");
                                
                                agregarLibro(libros);

                                //Imprimir(libros);
                                contador++;
                                break;

                            case 2:
                                if (contador == 0) {
                                    System.out.println("Primero cree su libro.");
                                } else {
                                    System.out.println("");
                                    System.out.println("Opción ingresada: 2");
                                    System.out.println("Libros Disponibles:");
                                    
                                    Imprimir(libros);

                                }

                                break;

                            case 3:
                                if (contador == 0) {
                                    System.out.println("Primero cree su libro.");
                                } else {
                                    System.out.println("");
                                    System.out.println("Opción ingresada: 3");
                                    System.out.print("Ingrese el numero de libro que desea modificar: ");
                                    int mod = leerent.nextInt();
                                    
                                    modificarLibro(mod, libros);

                                }
                                break;

                            case 4:
                                if (contador == 0) {
                                    System.out.println("Primero cree su libro.");
                                } else {
                                    System.out.println("");
                                    System.out.println("Opción ingresada: 4");
                                    System.out.print("Ingrese el numero de libro que desea eliminar: ");
                                    int mod = leerent.nextInt();
                                    
                                    eliminarLibro(mod, libros);
                                }

                                break;

                            case 5:
                                if (contador == 0) {
                                    System.out.println("Primero cree su libro.");
                                } else {
                                    System.out.println("");
                                    System.out.println("Opción ingresada: 5");
                                    System.out.print("Ingrese el titulo a buscar: ");
                                    String titu = leer.nextLine();
                                    
                                    buscarTitulo(libros, titu);
                                    
                                    
                                }

                                break;

                            case 6:
                                if (contador == 0) {
                                    System.out.println("Primero cree su libro.");
                                } else {
                                    System.out.println("");
                                    System.out.println("Opción ingresada: 6");
                                    System.out.print("Ingrese el/la autor(a) a buscar: ");
                                    String aut = leer.nextLine();
                                    
                                    buscarAutor(libros,aut);
                                    
                                }

                                break;

                            case 7:
                                if (contador == 0) {
                                    System.out.println("Primero cree su libro.");
                                } else {
                                    System.out.println("");
                                    System.out.println("Opción ingresada: 7");
                                    System.out.print("Ingrese el género a buscar: ");
                                    String gen = leer.nextLine();
                                    
                                    filtroGen(libros, gen);
                                    
                                    
                                }

                                break;

                            default:
                                seguir = false;

                        }

                    }

                    break;

                default:
                    seguirmenu = false;

            }

        }

    }

    public static ArrayList<Libros> agregarLibro(ArrayList<Libros> libro) {
        Libros libros = new Libros();

        System.out.print("Titulo: ");
        libros.setTitulo(leer.nextLine());
        System.out.print("Autor: ");
        libros.setAutor(leer.nextLine());
        System.out.print("Genero: ");
        libros.setGenero(leer.nextLine());
        System.out.print("Edad Minima: ");
        libros.setEdad(leerent.nextInt());

        /*while (libros.getEdad() < 0) {
            System.out.print("Edad invalida, re-ingrese: ");
            libros.setEdad(leer.nextInt());
        }*/
        libro.add(libros);
        System.out.println("Libro agregado exitosamente!");
        System.out.println("");

        return libro;

    }

    public static void Imprimir(ArrayList<Libros> libro) {
        for (int i = 0; i < libro.size(); i++) {
            System.out.println("");
            System.out.println("Libro " + (i + 1));
            System.out.println("Titulo: " + libro.get(i).getTitulo());
            System.out.println("Autor: " + libro.get(i).getAutor());
            System.out.println("Genero: " + libro.get(i).getGenero());
            System.out.println("Edad Minima: " + libro.get(i).getEdad());
            System.out.println("");

        }
        //System.out.println("");

    }

    public static void modificarLibro(int input, ArrayList<Libros> lib) {
        ArrayList<Libros> libros = lib;
        int cont = 0;
        //boolean encontrado = false;

        for (int i = 0; i < libros.size(); i++) {
            if (input == i+1) {
                System.out.println("Se ha encontrado el libro.");
                System.out.println("Ingrese los siguientes datos a modificar: ");
                System.out.print("Titulo: ");
                libros.get(i).setTitulo(leer.nextLine());
                System.out.print("Autor: ");
                libros.get(i).setAutor(leer.nextLine());
                System.out.print("Genero: ");
                libros.get(i).setGenero(leer.nextLine());
                System.out.print("Edad Minima: ");
                libros.get(i).setEdad(leerent.nextInt());

                System.out.println("Se ha modificado su libro exitosamente.");
                cont++;

            }
            //System.out.println("No se encontró su libro a modificar.");
        }

        if (cont == 0) {
            System.out.println("No se encontró su libro a modificar.");
        }
    }

    public static void eliminarLibro(int input, ArrayList<Libros> lib) {
        ArrayList<Libros> libros = lib;
        int cont = 0;
        //boolean encontrado = false;
        for (int i = 0; i < libros.size(); i++) {
            if (input == i+1) {
                System.out.println("Se ha encontrado el libro.");
                libros.remove(i);
                System.out.println("Se ha eliminado su libro exitosamente.");
                cont++;
            }
            //System.out.println("No se encontró su libro a modificar.");
        }
        
        if (cont == 0) {
            System.out.println("No se encontró su libro a eliminar.");
        }
    }
    
    public static void buscarTitulo(ArrayList<Libros> lib, String titulo){
        ArrayList<Libros> libros = lib;
        int cont = 0;
        //boolean encontrado = false;
        System.out.println("Libros con el titulo " + titulo + ": ");
        System.out.println("");
        for (int i = 0; i < libros.size(); i++) {
            if (titulo.equalsIgnoreCase(libros.get(i).getTitulo())) {
                System.out.println("Libro " + (i+1));
                System.out.println(libros.get(i).toString().trim());
                System.out.println("");
                cont++;
            }
        }
        
        if (cont == 0) {
            System.out.println("No se encontró ningún libro.");
        }
        
    }
    
    public static void buscarAutor(ArrayList<Libros> lib, String autor){
        ArrayList<Libros> libros = lib;
        int cont = 0;
        //boolean encontrado = false;
        System.out.println("Libros con el/la autor(a) " + autor + ": ");
        System.out.println("");
        for (int i = 0; i < libros.size(); i++) {
            if (autor.equalsIgnoreCase(libros.get(i).getAutor())) {
                System.out.println("Libro " + (i+1));
                System.out.println(libros.get(i).toString().trim());
                System.out.println("");
                cont++;
            }
        }
        
        if (cont == 0) {
            System.out.println("No se encontró ningún libro.");
        }
        
    }
    
    public static void filtroGen(ArrayList<Libros> lib, String genero){
        ArrayList<Libros> libros = lib;
        int cont = 0;
        //boolean encontrado = false;
        System.out.println("Libros con genero de " + genero + ": ");
        System.out.println("");
        for (int i = 0; i < libros.size(); i++) {
            if (genero.equalsIgnoreCase(libros.get(i).getGenero())) {
                System.out.println("Libro " + (i+1));
                System.out.println(libros.get(i).toString().trim());
                System.out.println("");
                cont++;
            }
        }
        
        if (cont == 0) {
            System.out.println("No se encontró ningún libro.");
        }
        
    }
    
    //me duele la nariz y la garganta dios santo
    
    
    
}
