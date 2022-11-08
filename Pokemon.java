/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.curso.pokemon;

import java.util.Random;

/**
 *
 * @author marizase
 */
public class Pokemon {

    private int id;
    private String name;
    private String type;
    private double fuerza;
    private double nivel;
    private int levelEvolve;
    public Random r = new Random();

    public Pokemon(int id, String name, String type) {
        this.id = id;
        this.name = name;
        this.type = type;
        this.fuerza = r.nextInt(9) + 1;
        this.levelEvolve = 10;
        this.nivel = 1;
    }
    
    //constructor para crear un nuevo pokemon evolucionado
    public Pokemon(Pokemon pokemon) {
        this.id = pokemon.id;
        this.name = pokemon.name;
        this.type = pokemon.type;
    }

    public void checkEvolve() {
        if (this.nivel >= levelEvolve && DB.evolutions.get(this.id) != null) {
            Pokemon evolution = DB.evolutions.get(this.id);
            System.out.println("¡OJO! TU " + this.name + " acaba de evolucionar a " + evolution.name);
            this.id = evolution.id;
            this.name = evolution.name;
            this.type = evolution.type;
            this.fuerza = this.fuerza*1.35;
            this.levelEvolve = this.levelEvolve + 10;
        }
    }

    public void train() {
        this.fuerza += 2;
        this.nivel += .5;
        System.out.println("Tu " + this.name + " ha ganado +2 de fuerza y +0.5 de nivel.");
        this.checkEvolve();
        System.out.println(this);
    }

    public boolean fight(Pokemon pokemon) {
        if (this.fuerza >= pokemon.getFuerza()) {
            this.fuerza += 3;
            this.nivel += 1;
            System.out.println("Ha ganado tu " + this.name + ". Subes 3 de fuerza y 1 nivel.");
            this.checkEvolve();
            System.out.println(this);
            return true;
        }
        System.out.println("Ha ganado " + pokemon.name + ". Tu pokemon ha sido debilitado. Enterna más a este pokemon o elige uno más fuerte");
        return false;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getFuerza() {
        return fuerza;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public double getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    @Override
    public String toString() {
        return "Pokemon{" + "id=" + id + ", name=" + name + ", type=" + type + ", fuerza=" + fuerza + ", nivel=" + nivel + '}';
    }

}
