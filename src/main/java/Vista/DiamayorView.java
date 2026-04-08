/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

/**
 *
 * @author RYZEN
 */
import java.util.ArrayList;

public class DiamayorView {

    public void mostrarMenu() {
        System.out.println("\n==== MENÚ DIMAYOR ====");
        System.out.println("1. Tabla de posiciones");
        System.out.println("2. Mayor puntaje");
        System.out.println("3. Buscar equipo");
        System.out.println("4. Equipos líderes");
        System.out.println("0. Salir");
        System.out.print("Opción: ");
    }

    public void mostrarLista(ArrayList<Equipo> equipos) {
        System.out.println("\n--- Tabla de Posiciones ---");
        for (Equipo e : equipos) System.out.println(e.mostrarInfo());
    }

    public void mostrarEquipo(Equipo e) {
        if (e != null) System.out.println("\n" + e.mostrarInfo());
        else System.out.println("Equipo no encontrado.");
    }

    public void mostrarLideres(ArrayList<Equipo> lideres, int pts) {
        System.out.println("\n--- Líderes con " + pts + " pts (" + lideres.size() + " equipos) ---");
        for (Equipo e : lideres) System.out.println(e.mostrarInfo());
    }

    public void mostrarPuntaje(int pts) {
        System.out.println("\nMayor puntaje: " + pts + " puntos");
    }
}
