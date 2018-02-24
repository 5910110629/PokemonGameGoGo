package pokemongamegogo;
import java.util.*;
import java.io.*;
import java.util.Random;

public class CommandParser{
	private PokemonFarm pokemonFarm;
	private Scanner commandScanner;
	private boolean isRunning;
        private boolean isRunningWild;
        private BagPokemon bagPokemon;

	public CommandParser(PokemonFarm pokemonFarm){
		this.pokemonFarm = pokemonFarm;
		commandScanner = new Scanner(System.in);
		isRunning = false;
                isRunningWild = false;
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
                        else if(command.equals("wild"))
				this.wildPokemons();
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
			Eevee eevee = new Eevee(name, weight, stepLength);
			pokemonFarm.addPokemon(eevee);
		}
                else if(pokemonType.equals("Bulbasaur")){
			Bulbasaur bulbasaur = new Bulbasaur(name, weight, stepLength);
			pokemonFarm.addPokemon(bulbasaur);
		}
                else if(pokemonType.equals("Charmander")){
			Charmander charmander = new Charmander(name, weight, stepLength);
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
		System.out.print("Which pokemon do you want to feed? : ");
		String name = this.commandScanner.next();
		if(name.equals("all")){
			this.pokemonFarm.feed("all");
		}
                else{
                    this.pokemonFarm.feed(name);
                }
	}
        
        private void walkPokemons(){
		System.out.print("Which pokemon do you want to walk? : ");
		String name = this.commandScanner.next();
		if(name.equals("all")){
			this.pokemonFarm.walk("all");
		}
                else{
                    this.pokemonFarm.walk(name);
                }
	}
        
        private void deletePokemons(){
		System.out.print("Which pokemon do you want to delete? : ");
		String name = this.commandScanner.next();
		if(name.equals("all")){
			this.pokemonFarm.delete("all");
		}
                else{
                    this.pokemonFarm.delete(name);
                }
	}
        
        private void wildPokemons(){
            float mood = 0.0f;
            float opportunity = 0.0f;
            float minMood = 0.0f;
            float maxMood = 1.0f;
            float minWeight = 5.2f;
            float maxWeight = 14.3f;
            float minStepLength = 3.5f;
            float maxStepLength = 12.7f;
            //String type[] = {"Eevee","Bulbasaur","Charmander"};
            String nameOfType[] = {"Eevee","Bulbasaur","Charmander"};
            float randomWeight = 0.0f;
            float randomStepLength = 0.0f;
            //int randomType = 0;
            Random random = new Random();
            String type = nameOfType[random.nextInt(3)];
            isRunningWild = true;
            
            while (isRunningWild == true){
                commandScanner.nextLine();
		System.out.print("\nWhich PokeBall you want to use? ");
                System.out.print("PokeBall/GreatBall/UltraBall :\n");
                System.out.print("---->  ");
		String pokeBall = this.commandScanner.next();
		if(pokeBall.equals("PokeBall")){
                    opportunity = 0.8f;
                }
                else if(pokeBall.equals("GreatBall")){
                    opportunity = 0.9f;
                }
                else if(pokeBall.equals("UltraBall")){
                    opportunity = 1.0f;
                }
                mood = random.nextFloat() * (maxMood - minMood) - minMood;
                if((opportunity * mood) > 0.5){
                    System.out.print("\nCongrat!!\n");
                    System.out.print("You can catch this Pokemon\n");
                    //commandScanner.nextLine();
                    //randomWeight = random.nextFloat() * (maxWeight - minWeight) - minWeight;
                    //randomStepLength = random.nextFloat() * (maxStepLength - minStepLength) - minStepLength;
                    //randomType = random.nextInt(3);
                    commandScanner.nextLine();
                    System.out.print("Insert name: ");
                    String name = commandScanner.nextLine();
                    System.out.print("Weight of Pokemon: ");
                    float weight = commandScanner.nextFloat();
                    System.out.print("Steplength of Pokemon: ");
                    float stepLength = commandScanner.nextFloat();
                    //commandScanner.nextLine();
                    if(type.equals("Eevee")){
                        Eevee eevee = new Eevee(name, weight, stepLength);
                        this.bagPokemon.addToBag(eevee);
                    }
                    else if(type.equals("Bulbasaur")){
                        Bulbasaur bulbasaur = new Bulbasaur(name, weight, stepLength);
                        this.bagPokemon.addToBag(bulbasaur);
                    }
                    else if(type.equals("Charmander")){
                        Charmander charmander = new Charmander(name, weight, stepLength);
                        this.bagPokemon.addToBag(charmander);
                    }
                    commandScanner.nextLine();
                }
                else{
                    System.out.println("\nSorry, You can't catch this Pokemon");
                    System.out.println("Try Again!!");
                }
                
                System.out.print("\nDo you want to leave the wild?(Yes or No): ");
                String leaveWild = commandScanner.nextLine();
                if(leaveWild.equals("Yes")){
                    isRunningWild = false;
                }
            }
                
	}
        

}

