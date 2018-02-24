package pokemongamegogo;
class Bulbasaur extends Pokemon {
        private float damageBulbasaur;
	public Bulbasaur(String name, float weight, float stepLength){
		super(name, weight, stepLength, 1f, new String[] {"normal"});
                damageBulbasaur = 4.6f;
	}
        public void seedbomb(){
                damageBulbasaur = 10.2f;
        }
        public void powerwhip (){
                damageBulbasaur = 25.5f;
        }
        

	// skill
}
