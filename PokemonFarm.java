package pokemongamegogo;
import java.util.*;

public class PokemonFarm {
	private ArrayList<Pokemon> pokemons;
        private Scanner commandScanner;
	public PokemonFarm(){
		pokemons = new ArrayList<Pokemon>();
	}

	public void addPokemon(Pokemon pokemon){
		pokemons.add(pokemon);
	}

	public void list(){
		for(Pokemon pokemon: pokemons){
			pokemon.print();
		}
	}

	public void feed(String pokemonName){
		if(pokemonName.equals("all")){
			for(Pokemon pokemon: pokemons){
				pokemon.eat();
			}
		}
                for(Pokemon pokemon: pokemons){
                    if(pokemonName.equals(pokemon.getName())){
                        pokemon.eat();
                    }
                }
	}
        
        public void walk(String pokemonName){
		if(pokemonName.equals("all")){
			for(Pokemon pokemon: pokemons){
				pokemon.walk();
			}
		}
                for(Pokemon pokemon: pokemons){
                    if(pokemonName.equals(pokemon.getName())){
                        pokemon.walk();
                    }
                }
	}
        
        public void delete(String pokemonName){
                int i=0;
                for(Pokemon pokemon: pokemons){
                    if(pokemonName.equals(pokemon.getName())){
                        pokemons.remove(i);
                    }
                    i++;
                }
        }
        
        public void evolution(String pokemonName){
            //String typePokemon[] = {"Eevee","Bulbasaur","Charmander"};
                for(Pokemon pokemon: pokemons){
                    if(pokemonName.equals(pokemon.getName())){
                        if(pokemon.getClass().equals("Charmander"))
                        {
                            pokemon.evolution("Charmander");
                        }
                        else if(pokemon.getClass().equals("Eevee")){
                            pokemon.evolution("Eevee");
                        }
                        else if(pokemon.getClass().equals("Bulbasaur")){
                            pokemon.evolution("Bulbasaur");
                        }
                    }
                }
        }
        
        
}
