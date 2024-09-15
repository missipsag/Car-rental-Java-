package EXO1;

public class TestVehicule {

	public static void main(String[] args) {

		Vehicule[] vehicules = new Vehicule[4];
        vehicules[0] = new Voiture("Renault", "Clio", 5000, 150);
        vehicules[1] = new Camion("Iveco", "Stralis", 10000, 2500);
        vehicules[2] = new Voiture("Peugeot", "208", 5000, 90);
        vehicules[3] = new Camion("Man", "TGX", 10000, 1800);
		
		
		for(int i=0; i<4;i++)
		{
			System.out.println(vehicules[i]);
		}

		
		System.out.println(vehicules[0].comparer(vehicules[1]));
		System.out.println("   ");
		System.out.println(vehicules[1].comparer(vehicules[2]));

		
		
		
		
	}

}
