package pokemongamegogo;
import java.util.*;
import java.io.*;

class CommandParser{
	private PokemonFarm pokemonFarm;
	private Scanner commandScanner;
	private boolean isRunning;

	public CommandParser(PokemonFarm pokemonFarm){
		this.pokemonFarm = pokemonFarm;
		commandScanner = new Scanner(System.in);
		isRunning = false;
	}

	public void run(){
		isRunning = true;
		String command;

		System.out.println("Hello Pokemon Game");
		while(isRunning){
			System.out.print("\nWhat do you want? Type: ");
			command = commandScanner.next();
			// System.out.println("You type \'"+command+"\'");
			if(command.equals("quit")){
				isRunning = false;
				System.out.println("Good bye, See you next time.");
			}
			else if(command.equals("add"))
				this.addPokemon();
			else if(command.equals("list"))
				this.listPokemons();
			else if(command.equals("feed"))
				this.feedPokemons();
                        else if(command.equals("walk"))
				this.walkPokemons();
                        else if(command.equals("delete"))
				this.deletePokemons();
		}

	}

	private void addPokemon(){
		commandScanner.nextLine();
		// input name weight length
                System.out.print("Type of pokemon: ");
                String pokemonType = commandScanner.nextLine();
                System.out.print("Name of pokemon: ");
                String name = commandScanner.nextLine();
                System.out.print("Weight of Pokemon: ");
                float weight = commandScanner.nextFloat();
                System.out.print("Steplength of Pokemon: ");
		float stepLength = commandScanner.nextFloat();
		if(pokemonType.equals("Eevee")){
			Eevee eevee = new Eevee(name, weight, stepLength, pokemonType);
			pokemonFarm.addPokemon(eevee);
		}
                else if(pokemonType.equals("Bulbasaur")){
			Bulbasaur bulbasaur = new Bulbasaur(name, weight, stepLength, pokemonType);
			pokemonFarm.addPokemon(bulbasaur);
		}
                else if(pokemonType.equals("Charmander")){
			Charmander charmander = new Charmander(name, weight, stepLength, pokemonType);
			pokemonFarm.addPokemon(charmander);
		}
                commandScanner.nextLine();
	}

	private void listPokemons(){
		System.out.println("==========================================");
		System.out.println("Pokemon List");
		System.out.println("==========================================");
		this.pokemonFarm.list();
		System.out.println("==========================================");
	}

	private void feedPokemons(){
		System.out.print("Which pokemon do you want to feed? ");
		String name = this.commandScanner.next();
		if(name.equals("all")){
			this.pokemonFarm.feed("all");
		}
                else{
                    this.pokemonFarm.feed(name);
                }
	}
        
        private void walkPokemons(){
		System.out.print("Which pokemon do you want to walk? ");
		String name = this.commandScanner.next();
		if(name.equals("all")){
			this.pokemonFarm.walk("all");
		}
                else{
                    this.pokemonFarm.walk(name);
                }
	}
        
        private void deletePokemons(){
		System.out.print("Which pokemon do you want to delete? ");
		String name = this.commandScanner.next();
		if(name.equals("all")){
			this.pokemonFarm.delete("all");
		}
                else{
                    this.pokemonFarm.delete(name);
                }
	}
        
        
        

}

