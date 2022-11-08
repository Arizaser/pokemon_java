/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.curso.pokemon;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author marizase
 */
public class Juego {
    protected Entrenador entrenador;
    public Random r = new Random();
    public Scanner sc = new Scanner(System.in);

    public Juego() {
    }

    public Pokemon appearWildPokemon() {
        Pokemon wildPokemon = DB.wildPokemons.get((int)(Math.random() * DB.wildPokemons.size()));
        System.out.println("¡Ha apareceido un " + wildPokemon.getName() + " salvaje! Debilítalo para poder capturarlo.");
        return wildPokemon;
    }

    public Entrenador getEntrenador() {
        return entrenador;
    }
}
