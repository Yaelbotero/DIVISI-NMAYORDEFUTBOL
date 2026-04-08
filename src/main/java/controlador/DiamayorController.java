/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

/**
 *
 * @author RYZEN
 */
import java.util.ArrayList;
import Modelo.Equipo;

public class DiamayorController {
    private ArrayList<Equipo> equipos = new ArrayList<>();

    public void agregar(Equipo e)          { equipos.add(e); }
    public ArrayList<Equipo> getEquipos()  { return equipos; }

    public Equipo buscar(String nombre) {
        for (Equipo e : equipos)
            if (e.getNombre().equalsIgnoreCase(nombre)) return e;
        return null;
    }

    public int getMayorPuntaje() {
        int mayor = 0;
        for (Equipo e : equipos) if (e.getPuntos() > mayor) mayor = e.getPuntos();
        return mayor;
    }

    public ArrayList<Equipo> getLideres() {
        int mayor = getMayorPuntaje();
        ArrayList<Equipo> lideres = new ArrayList<>();
        for (Equipo e : equipos) if (e.getPuntos() == mayor) lideres.add(e);
        return lideres;
    }
}
