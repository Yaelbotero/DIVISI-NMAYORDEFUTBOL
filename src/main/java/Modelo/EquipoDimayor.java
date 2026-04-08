/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author RYZEN
 */
public class EquipoDimayor extends Equipo {
    private String ciudad;

    public EquipoDimayor(String nombre, String ciudad, int pg, int pe, int pp) {
        super(nombre, pg, pe, pp);
        this.ciudad = ciudad;
    }
    public EquipoDimayor(String nombre, String ciudad) { // Sobrecarga
        super(nombre); this.ciudad = ciudad;
    }

    @Override
    public String mostrarInfo() { // Polimorfismo
        return super.mostrarInfo() + " | " + ciudad;
    }
}
