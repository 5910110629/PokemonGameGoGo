package pokemongamegogo;
import java.util.*;

class PokemonFarm {
	private ArrayList<Pokemon> pokemons;
        private ArrayList<Eevee> eevees;
        private ArrayList<Bulbasaur> bulbasaurs;
        private ArrayList<Charmander> charmanders;
	public PokemonFarm(){
		pokemons = new ArrayList<Pokemon>();
                eevees = new ArrayList<Eevee>();
                bulbasaurs = new ArrayList<Bulbasaur>();
                charmanders = new ArrayList<Charmander>();
	}

	public void addPokemon(Pokemon pokemon){
		pokemons.add(pokemon);
	}
        
        /*public void evoPokemon(String pokemonName, String pokemonType){
                for(Pokemon pokemon: pokemons){
                    if(pokemonName.equals(pokemon.getName()) && pokemonType.equals(pokemon.getType())){
                        pokemon.eat();
                    }
                }
	}*/

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
        
        
}
