/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.curso.pokemon;

import java.util.ArrayList;

/**
 *
 * @author marizase
 */
public class Entrenador {
    protected ArrayList <Pokemon> pokedex;
    private String nombre;
    protected Pokemon pickedPokemon;

    public Entrenador(String nombre) {
        this.nombre = nombre;
        this.pokedex = new ArrayList();
    }
    
    public void capturePokemon(Pokemon pokemon) {
        System.out.println("Has capturado a este " + pokemon.getName());
        this.pokedex.add(pokemon);
        this.pickPokemon(pokemon);
    }
    
    public void pickPokemon(Pokemon pokemon) {
        System.out.println("Tu pokemon seleccionado es ahora " + pokemon.getName());
        this.pickedPokemon = pokemon;
    }

    public String getNombre() {
        return nombre;
    }
    
}
