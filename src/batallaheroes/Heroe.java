/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package batallaheroes;
import java.util.*;

/**
 *
 * @author tomas
 */
public class Heroe {
    private String nombre;
    private double salud;
    private double fuerza;
    private double defensa; // nivel 1: 0.3 - nivel 2: 0.6 - nivel 3: 0.9
    private Arma arma;
    private String debilidad;
    private int nivel;
    private boolean protejer;
    private int victorias;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalud() {
        return salud;
    }

    public void setSalud(double salud) {
        this.salud = salud;
    }

    public double getFuerza() {
        return fuerza;
    }

    public void setFuerza(double fuerza) {
        this.fuerza = fuerza;
    }

    public double getDefensa() {
        return defensa;
    }

    public void setDefensa(double defensa) {
        this.defensa = defensa;
    }

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }

    public String getDebilidad() {
        return debilidad;
    }

    public void setDebilidad(String debilidad) {
        this.debilidad = debilidad;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public boolean isProtejer() {
        return protejer;
    }

    public void setProtejer(boolean protejer) {
        this.protejer = protejer;
    }

    public int getVictorias() {
        return victorias;
    }

    public void setVictorias(int victorias) {
        this.victorias = victorias;
    }
    
    
    
    // Constructor semi-automático
    public Heroe(String nombre, double salud, double fuerza, double defensa, Arma arma, String debilidad, int nivel) {
        this.nombre = nombre;
        this.salud = salud;
        this.fuerza = fuerza;
        this.defensa = defensa;
        this.arma = arma;
        this.debilidad = debilidad;
        this.nivel = nivel;
        this.protejer = false;
        this.victorias = 0;
    }
    
    // Métodos
    public List<String> atacar(Heroe rival) {
        Arma armaRival = rival.getArma();
        Arma arma = this.getArma();
        // Lista de outputs, usando java.util para añadirlos dinámicamente
        List<String> outputs = new ArrayList<String>();
        // Estableciendo el daño causado base según el daño base del arma
        double danioCausado = arma.getDanioBase();
        // Comprobar si el material del arma es igual a la debilidad del rival
        if((arma.getMaterial()).equals(rival.getDebilidad())) {
            danioCausado = danioCausado * 1.3;
            outputs.add("INFO: El daño efectuado a " + rival.getNombre() + " fue potenciado por su debilidad!");
        }
        // Si tiene más fuerza que el rival, entonces hará 1.2 más daño
        if (this.getFuerza() > rival.getFuerza()) {
            danioCausado = danioCausado * 1.2;
            outputs.add("INFO: " + this.getNombre() + " es más fuerte que " + rival.getNombre() + "!");
        }
        
        if (rival.isProtejer()) {
            // Manejando la defensa potenciada
            danioCausado = danioCausado - ((danioCausado - danioCausado/2) + rival.getDefensa());
            outputs.add("INFO: " + rival.getNombre() + " se defendió del ataque!");
            // Estableciendo la defensa en falso
            rival.setProtejer(false);
        } else {
            // Manejando la defensa base
            danioCausado = danioCausado / rival.getDefensa();
            System.out.println(danioCausado);
            
        }
        
        
        outputs.add("DAÑO: " + rival.getNombre() + " recibió " + danioCausado + " puntos de daño!");
        
        // Revisando la vida
        if (danioCausado >= rival.getSalud()) {
            outputs.add("INFO: " + this.getNombre() + " ganó el combate!");
            this.setVictorias(this.getVictorias() + 1); // Añade 1 a las victorias
            rival.setSalud(0);
            return outputs;
        }
        rival.setSalud((rival.getSalud()) - danioCausado);
        return outputs;
    }
    
    public String defender() {
        this.setProtejer(true);
        return "INFO: " + this.getNombre() + " decidió defenderse!";
    }
    
    
}
