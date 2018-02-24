/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pokemongamegogo;
import java.util.*;
import java.io.*;
import java.util.Random;

/**
 *
 * @author PAWITRA
 */
public class BagPokemon {
    private ArrayList<Pokemon> pokemonBags;
    public BagPokemon(){
		pokemonBags = new ArrayList<Pokemon>();
	}
    public void addToBag(Pokemon pokemons) {
        pokemonBags.add(pokemons);
    }
}
