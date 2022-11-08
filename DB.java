/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.curso.pokemon;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author marizase
 */
public class DB {

    static ArrayList<Pokemon> wildPokemons = new ArrayList<Pokemon>() {
        {
            add(new Pokemon(1, "Bulbasaur", "plant"));
            add(new Pokemon(2, "Ivysaur", "plant"));
            add(new Pokemon(3, "Venusaur", "plant"));
            add(new Pokemon(4, "Charmander", "fire"));
            add(new Pokemon(5, "Charmeleon", "fire"));
            add(new Pokemon(6, "Charizard", "fire"));
            add(new Pokemon(7, "Squirtle", "water"));
            add(new Pokemon(8, "Wartortle", "water"));
            add(new Pokemon(9, "Blastoise", "water"));
            add(new Pokemon(10, "Caterpie", "bicho"));
            add(new Pokemon(11, "Metapod", "bicho"));
            add(new Pokemon(12, "Butterfree", "bicho"));
            add(new Pokemon(13, "Weedle", "bicho"));
            add(new Pokemon(14, "Kakuna", "bicho"));
            add(new Pokemon(15, "Beedrill", "bicho"));
            add(new Pokemon(16, "Pidgey", "volador"));
            add(new Pokemon(17, "Pidgeotto", "volador"));
            add(new Pokemon(18, "Pidgeot", "volador"));
            add(new Pokemon(19, "Rattata", "siniestro"));
            add(new Pokemon(20, "Raticate", "siniestro"));
            add(new Pokemon(21, "Spearow", "volador"));
            add(new Pokemon(22, "Fearow", "volador"));
            add(new Pokemon(23, "Ekans", "siniestro"));
            add(new Pokemon(24, "Arbok", "siniestro"));
            add(new Pokemon(25, "Pikachu", "electrico"));
            add(new Pokemon(26, "Raichu", "fire"));
            add(new Pokemon(27, "Sandshrew", "fire"));
            add(new Pokemon(28, "Sandslash", "fire"));
            add(new Pokemon(29, "Nidoran♀", "fire"));
            add(new Pokemon(30, "Nidorina", "fire"));
            add(new Pokemon(31, "Nidoqueen", "fire"));
            add(new Pokemon(32, "Nidoran♂", "fire"));
            add(new Pokemon(33, "Nidorino", "fire"));
            add(new Pokemon(34, "Nidoking", "fire"));
            add(new Pokemon(35, "Clefairy", "fire"));
            add(new Pokemon(36, "Clefable", "fire"));
            add(new Pokemon(37, "Vulpix", "fire"));
            add(new Pokemon(38, "Ninetales", "fire"));
            add(new Pokemon(39, "Jigglypuff", "fire"));
            add(new Pokemon(40, "Wigglytuff", "fire"));
            add(new Pokemon(41, "Zubat", "fire"));
            add(new Pokemon(42, "Golbat", "fire"));
            add(new Pokemon(43, "Oddish", "fire"));
            add(new Pokemon(44, "Gloom", "fire"));
            add(new Pokemon(45, "Vileplume", "fire"));
            add(new Pokemon(46, "Paras", "fire"));
            add(new Pokemon(47, "Parasect", "fire"));
            add(new Pokemon(48, "Venonat", "fire"));
            add(new Pokemon(49, "Venomoth", "fire"));
            add(new Pokemon(50, "Diglett", "fire"));
            add(new Pokemon(51, "Dugtrio", "fire"));
            add(new Pokemon(52, "Meowth", "fire"));
            add(new Pokemon(53, "Persian", "fire"));
            add(new Pokemon(54, "Psyduck", "fire"));
            add(new Pokemon(55, "Golduck", "fire"));
            add(new Pokemon(56, "Mankey", "fire"));
            add(new Pokemon(57, "Primeape", "fire"));
            add(new Pokemon(58, "Growlithe", "fire"));
            add(new Pokemon(59, "Arcanine", "fire"));
            add(new Pokemon(60, "Poliwag", "fire"));
            add(new Pokemon(61, "Poliwhirl", "fire"));
            add(new Pokemon(62, "Poliwrath", "fire"));
            add(new Pokemon(63, "Abra", "fire"));
            add(new Pokemon(64, "Kadabra", "fire"));
            add(new Pokemon(65, "Alakazam", "fire"));
            add(new Pokemon(66, "Machop", "fire"));
            add(new Pokemon(67, "Machoke", "fire"));
            add(new Pokemon(68, "Machamp", "fire"));
            add(new Pokemon(69, "Bellsprout", "fire"));
            add(new Pokemon(70, "Weepinbell", "fire"));
            add(new Pokemon(71, "Victreebel", "fire"));
            add(new Pokemon(72, "Tentacool", "fire"));
            add(new Pokemon(73, "Tentacruel", "fire"));
            add(new Pokemon(74, "Geodude", "fire"));
            add(new Pokemon(75, "Graveler", "fire"));
            add(new Pokemon(76, "Golem", "fire"));
            add(new Pokemon(77, "Ponyta", "fire"));
            add(new Pokemon(78, "Rapidash", "fire"));
            add(new Pokemon(79, "Slowpoke", "fire"));
            add(new Pokemon(80, "Slowbro", "fire"));
            add(new Pokemon(81, "Magnemite", "fire"));
            add(new Pokemon(82, "Magneton", "fire"));
            add(new Pokemon(83, "Farfetch’d", "fire"));
            add(new Pokemon(84, "Doduo", "fire"));
            add(new Pokemon(85, "Dodrio", "fire"));
            add(new Pokemon(86, "Seel", "fire"));
            add(new Pokemon(87, "Dewgong", "fire"));
            add(new Pokemon(88, "Grimer", "fire"));
            add(new Pokemon(89, "Muk", "fire"));
            add(new Pokemon(90, "Shellder", "fire"));
            add(new Pokemon(91, "Cloyster", "fire"));
            add(new Pokemon(92, "Gastly", "fire"));
            add(new Pokemon(93, "Haunter", "fire"));
            add(new Pokemon(94, "Gengar", "fire"));
            add(new Pokemon(95, "Onix", "fire"));
            add(new Pokemon(96, "Drowzee", "fire"));
            add(new Pokemon(97, "Hypno", "fire"));
            add(new Pokemon(98, "Krabby", "fire"));
            add(new Pokemon(99, "Kingler", "fire"));
            add(new Pokemon(100, "Voltorb", "fire"));
            add(new Pokemon(101, "Electrode", "fire"));
            add(new Pokemon(102, "Exeggcute", "fire"));
            add(new Pokemon(103, "Exeggutor", "fire"));
            add(new Pokemon(104, "Cubone", "fire"));
            add(new Pokemon(105, "Marowak", "fire"));
            add(new Pokemon(106, "Hitmonlee", "fire"));
            add(new Pokemon(107, "Hitmonchan", "fire"));
            add(new Pokemon(108, "Lickitung", "fire"));
            add(new Pokemon(109, "Koffing", "fire"));
            add(new Pokemon(110, "Weezing", "fire"));
            add(new Pokemon(111, "Rhyhorn", "fire"));
            add(new Pokemon(112, "Rhydon", "fire"));
            add(new Pokemon(113, "Chansey", "fire"));
            add(new Pokemon(114, "Tangela", "fire"));
            add(new Pokemon(115, "Kangaskhan", "fire"));
            add(new Pokemon(116, "Horsea", "fire"));
            add(new Pokemon(117, "Seadra", "fire"));
            add(new Pokemon(118, "Goldeen", "fire"));
            add(new Pokemon(119, "Seaking", "fire"));
            add(new Pokemon(120, "Staryu", "fire"));
            add(new Pokemon(121, "Starmie", "fire"));
            add(new Pokemon(122, "Mr. Mime", "fire"));
            add(new Pokemon(123, "Scyther", "fire"));
            add(new Pokemon(124, "Jynx", "fire"));
            add(new Pokemon(125, "Electabuzz", "fire"));
            add(new Pokemon(126, "Magmar", "fire"));
            add(new Pokemon(127, "Pinsir", "fire"));
            add(new Pokemon(128, "Tauros", "fire"));
            add(new Pokemon(129, "Magikarp", "fire"));
            add(new Pokemon(130, "Gyarados", "fire"));
            add(new Pokemon(131, "Lapras", "fire"));
            add(new Pokemon(132, "Ditto", "fire"));
        }
    };

    static ArrayList<Pokemon> starters = new ArrayList<>() {
        {
            add(new Pokemon(1, "Bulbasaur", "plant"));
            add(new Pokemon(4, "Charmander", "fire"));
            add(new Pokemon(7, "Squirtle", "water"));
            add(new Pokemon(25, "Pikachu", "electrico"));
        }
    };

    public static HashMap<Integer, Pokemon> evolutions = new HashMap<>() {
        {
            put(1, new Pokemon(DB.wildPokemons.get(1)));
            put(2, new Pokemon(DB.wildPokemons.get(2)));
            put(4, new Pokemon(DB.wildPokemons.get(4)));
            put(5, new Pokemon(DB.wildPokemons.get(5)));
            put(7, new Pokemon(DB.wildPokemons.get(7)));
            put(8, new Pokemon(DB.wildPokemons.get(8)));
            put(25, new Pokemon(DB.wildPokemons.get(25)));
        }
    };

    public DB() {
    }

}
