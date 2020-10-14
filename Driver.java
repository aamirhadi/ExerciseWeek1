public class Driver {

	public static void main(String [] arg) {
		//Fish actually is a data type
		//Fish nemo; == int x;
		//nemo adalah object, Fish adalah kelas
		fish nemo = new fish();  
		nemo.Swim();
		// nemo.color = "red"; 
		nemo.SetColor("red");  
		nemo.Swim();

		//nemo.Eat();

		Shark fiery = new Shark();
		fiery.Eat();
		fiery.Swim();
		fiery.SetSharpTeeth(130);
		fiery.Eat();






		// fish dory = new fish();
		// dory.Swim();
		// // dory.color = "yellow";
		// dory.SetColor("yellow");  
		// dory.Swim();

		// Aquirium fancyAquirium = new Aquirium();
		// fancyAquirium.fillFish();

	}
}