/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package batallaheroes;

/**
 *
 * @author tomas
 */
public class Armas {
    public static Arma Piedra = new Arma("Piedra ancestral", 10.0, "roca", "Una antigua piedra forjada por los Dioses");
    public static Arma EspadaFuego = new Arma("Espada de fuego", 15.0, "fuego", "Una espada forjada en fuego");
    public static Arma HachaOxidada = new Arma("Hacha oxidada", 20.0, "metal", "Una antigua hacha oxidada, muy filosa");
    public static Arma Varita = new Arma("Varita mágica", 23.0, "magia", "Una varita mágica, perteneció a un gran mago");
    public static Arma Lanza = new Arma("Lanza oriental", 20.0, "fuego", "Una lanza creada con cenizas y llamas");
    public static Arma TiraTodo = new Arma("Tira-todo", 18.0, "roca", "Un artilujio creado para lanzar todo lo que encuentres");
    public static Arma Tridente = new Arma("Tridente del infierno", 25.0, "fuego", "Un tridente creado por Satanas");
    public static Arma Escoba = new Arma("Escoba", 17.0, "magia", "Una escoba creada en un puebli mágico");
    
    static Arma[] armas = {Armas.Piedra, Armas.EspadaFuego, Armas.HachaOxidada, Armas.Varita, Armas.Lanza, Armas.TiraTodo, Armas.Tridente, Armas.Escoba};
}
