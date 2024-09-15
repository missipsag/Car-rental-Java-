package EXO1;

public class Camion extends Vehicule{
 
	private int poids;
	final int LIMITE_KG=2000;
	final int TARIF_SUP=100;


	public int getPoids() {
		return poids;
	}
	public Camion() {
		super();
		this.poids=0;
		
	}
	public Camion(String marque, String modele, int tarifBase, int poids) {
		super(marque, modele, tarifBase);
		this.poids=poids;
		
	}
	
	@Override 
	public int getTarifLocation()
	{
		if( this.poids<=this.LIMITE_KG)
			return super.getTarifBase();
		else 
			return super.getTarifBase()+(this.poids-this.LIMITE_KG)*this.TARIF_SUP;
		
	}
	
	

	@Override
	public String toString()
	{
		return super.toString()+" kg portés = "+this.poids+" tarif de location = "+this.getTarifLocation();
	}
	
	
	
	public void setPoids(int poids) {
		this.poids = poids;
	}
	
	
	
	
	
}
