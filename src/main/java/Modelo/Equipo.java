/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author RYZEN
 */
public class Equipo {
    private String nombre;
    private int pg, pe, pp;

    public Equipo(String nombre, int pg, int pe, int pp) {
        this.nombre = nombre; this.pg = pg; this.pe = pe; this.pp = pp;
    }
    public Equipo(String nombre) { this(nombre, 0, 0, 0); } // Sobrecarga

    public int getPuntos() { return pg * 3 + pe; }
    public int getPj()     { return pg + pe + pp; }

    public String getNombre() { return nombre; }
    public int getPg() { return pg; }
    public int getPe() { return pe; }
    public int getPp() { return pp; }

    public String mostrarInfo() { // Polimorfismo
        return String.format("%-22s PJ:%-3d PG:%-3d PE:%-3d PP:%-3d Pts:%d",
                nombre, getPj(), pg, pe, pp, getPuntos());
    }
}
