/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.area.sueldo;

/**
 *
 * @author ramon.simona
 */
public class Principal {

    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("Ramon", "Perez", 1000f);
        Empleado empleado2 = new Empleado("Maria", "Closa", 1100f);
        Empleado empleado3 = new Empleado("Pere", "Martinez", 900f);
        Empleado empleado4 = new Empleado("Joan", "Farre", 1200f);
        Empleado empleado5 = new Empleado("Marta", "Pedros", 1500f);

        Empleado[] empleados = {empleado1, empleado2, empleado3, empleado4, empleado5};

        float sueldoTodos = 0;
        for (Empleado empleado : empleados) {
            sueldoTodos += empleado.sueldo;
        }

        System.out.println("El sueldo total de los empleados es: " + sueldoTodos);

    }
}
