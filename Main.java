/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.curso.pokemon;

import java.util.Scanner;

/**
 *
 * @author marizase
 */
public class Main {

    public static void showMenu() {
        System.out.println("---------------------------");
        System.out.println("""
                           SELECCIONA LA ACCIÓN QUE QUIERES REALIZAR EN PUEBLO PALETA
                           | 1. Capturar un pokemon
                           | 2. Entrenar tu pokemon
                           | 3. Ver mi equipo pokemon
                           | 0. TERMINAR PARTIDA """);
        System.out.println("---------------------------");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Juego game = new Juego();
        System.out.println("BIENVENIDO A LA AVENTURA POKEMON. ESCRIBE TU NOMBRE DE ENTRENADOR POKEMON: ");
        game.entrenador = new Entrenador(sc.nextLine());
        System.out.println("¿QUÉ POKEMON QUIERES PARA EMPEZAR LA AVENTURA?");
        for (int i = 0; i < DB.starters.size(); i++) {
            System.out.println(i + ". " + DB.starters.get(i));
        }
        game.getEntrenador().pickPokemon(DB.starters.get(Integer.parseInt(sc.nextLine())));
        game.getEntrenador().pokedex.add(game.getEntrenador().pickedPokemon);
        System.out.println("\nYA ESTÁS PREPARADO PARA LA AVENTURA POKEMON. \nA CAPTURARLOS A TODOS!!");
        
        int selectOption;
        do {
            showMenu();
            selectOption = Integer.parseInt(sc.nextLine());
            switch (selectOption) {
                case 1 -> {
                    Pokemon newWildPokemon = game.appearWildPokemon();
                    System.out.println("¿Quieres luchar contra este pokemon para capturarlo?\n1. Luchar\n2. Huir");
                    if (Integer.parseInt(sc.nextLine()) == 1) {
                        if (game.entrenador.pickedPokemon.fight(newWildPokemon)) {
                            System.out.println("¿Quieres capturar a este " + newWildPokemon.getName() + " salvaje?\n1. Capturar\n2. Huir" );
                            if (Integer.parseInt(sc.nextLine()) == 1)  {
                                game.entrenador.capturePokemon(newWildPokemon);
                            } else {
                                System.out.println("Has decidido no capturar.");
                            }
                        }
                    } else {
                        System.out.println("Has decidido no pelear.");
                    }
                    break;
                }
                case 2 -> {
                    game.entrenador.pickedPokemon.train();
                    break;
                }
                case 3 -> {
                    System.out.println("EQUIPO POKEMON DEL ENTRENADOR " + game.entrenador.getNombre());
                    System.out.println("¿A qué pokemon quieres seleccionar?");
                    for (int i = 0; i < game.entrenador.pokedex.size(); i++) {
                        System.out.println(i + ". " + game.entrenador.pokedex.get(i));
                    }
                    game.entrenador.pickPokemon(game.entrenador.pokedex.get(Integer.parseInt(sc.nextLine())));
                    break;
                }
                case 0 -> {
                    System.out.println("Has terminado tu partida");
                }
                default -> System.out.println("Has introducido un caracter dato inválido.");
            }
        } while (selectOption != 0);
    }
}
