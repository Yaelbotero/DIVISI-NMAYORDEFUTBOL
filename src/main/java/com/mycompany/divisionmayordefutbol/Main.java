/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.divisionmayordefutbol;

/**
 *
 * @author RYZEN
 */
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        DiamayorController ctrl = new DiamayorController();
        DiamayorView view = new DiamayorView();
        Scanner sc = new Scanner(System.in);

        ctrl.agregar(new EquipoDimayor("América de Cali",       "Cali",         10, 3, 2));
        ctrl.agregar(new EquipoDimayor("Atlético Nacional",     "Medellín",     10, 3, 2));
        ctrl.agregar(new EquipoDimayor("Millonarios FC",        "Bogotá",        9, 2, 4));
        ctrl.agregar(new EquipoDimayor("Junior FC",             "Barranquilla",  7, 5, 3));
        ctrl.agregar(new EquipoDimayor("Deportivo Cali",        "Cali",          8, 4, 3));

        int op;
        do {
            view.mostrarMenu();
            op = sc.nextInt(); sc.nextLine();
            switch (op) {
                case 1: view.mostrarLista(ctrl.getEquipos()); break;
                case 2: view.mostrarPuntaje(ctrl.getMayorPuntaje()); break;
                case 3:
                    System.out.print("Nombre: ");
                    view.mostrarEquipo(ctrl.buscar(sc.nextLine())); break;
                case 4: view.mostrarLideres(ctrl.getLideres(), ctrl.getMayorPuntaje()); break;
                case 0: System.out.println("¡Hasta luego!"); break;
            }
        } while (op != 0);
    }
}
