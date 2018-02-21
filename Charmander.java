package pokemongamegogo;
class Charmander extends Pokemon {
        private float damageCharmander;
	public Charmander(String name, float weight, float stepLength, String pokemonType){
		super(name, weight, stepLength, 1f, new String[] {"normal"});
                damageCharmander = 8.3f;
	}
        public void flamehrower(){
                damageCharmander = 16.4f;
        }
        public void flamecharge(){
                damageCharmander = 8.6f;
        }
	// skill
}
