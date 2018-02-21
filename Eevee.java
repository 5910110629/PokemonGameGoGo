package pokemongamegogo;
class Eevee extends Pokemon {
        private float damageEevee;
	public Eevee(String name, float weight, float stepLength, String pokemonType){
		super(name, weight, stepLength, 1f, new String[] {"normal"});
                damageEevee = 5.6f;
	}
        public void swift(){
                damageEevee += 150.2f;
        }
        public void tackle(int step){
                step = step+20;
                damageEevee = 7.5f;
        }
	// skill
}
