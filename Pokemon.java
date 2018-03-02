package pokemongamegogo;
import java.util.*;

public class Pokemon{
        private PokemonFarm pokemonFarm;
	private String name;
	private float weight;
	private float stepLength;
	private int step;
	private float gainingWeightStep;
        private float loseWeight;
	private String[] types;

	public Pokemon(String name,
		       float weight,
		       float stepLength,
		       float gainingWeightStep,
                       String[] types
		       ){
		this.name = name;
		this.weight = weight;
		this.stepLength = stepLength;
		this.gainingWeightStep = gainingWeightStep;
                loseWeight = 0.5f;
		step = 0;

		if(types == null)
			this.types = new String[] {"normal"};
		else
			this.types = types;
	}

	public void walk(){
		step += 1;
                weight -= loseWeight;
	}

	public void eat(){
		weight += gainingWeightStep;
	}

	public void print(){
		System.out.println("Pokemon name: " + name);
 		System.out.print("        Type: ");
		for(String type: types){
			System.out.print(type+",");
		}
		System.out.println();
		System.out.println("      Weight: " + weight);
		System.out.println(" Step length: " + stepLength);
		System.out.println("  Today Step: " + step);
		System.out.println("------------------------------------------");
	}
        
        public String getName(){
            return name;
	}
        
        public void evolution(String typePokemon){
            if(typePokemon.equals("Eevee")){
                Espeon espeon = new Espeon(name, weight, stepLength);
                Pokemon pokemon = espeon;
            }
            else if(typePokemon.equals("Charmander")){
                Charmeleon charmeleon = new Charmeleon(name, weight, stepLength);
                Pokemon pokemon = charmeleon;
            }
            else if(typePokemon.equals("Bulbasaur")){
                Ivysaur ivysaur = new Ivysaur(name, weight, stepLength);
                Pokemon pokemon = ivysaur;
            }
	}
        /*
        public String[] getType(){
            return types;
	}*/
        
}
