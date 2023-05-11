/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package batallaheroes;

/**
 *
 * @author tomas
 */
public class Arma {
    private String nombre;
    private double danioBase;
    private String material; 
    private String descripcion;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getDanioBase() {
        return danioBase;
    }

    public void setDanioBase(double danioBase) {
        this.danioBase = danioBase;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Arma(String nombre, double danioBase, String material, String descripcion) {
        this.nombre = nombre;
        this.danioBase = danioBase;
        this.material = material;
        this.descripcion = descripcion;
    }
    
    
}
