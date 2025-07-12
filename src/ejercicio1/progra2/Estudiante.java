/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejercicio1.progra2;

/**
 *
 * @author BICHO
 */
public class Estudiante extends Persona {

    public Estudiante(String nombre, int edad) {
        super(nombre, edad);
    }
    @Override
    public void saludar(){
        System.out.println("Mi nombre es: " + nombre);
    }
}
