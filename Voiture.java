package EXO1;

public class Voiture extends Vehicule {

	int kmParcouru;
	final int LIMITE_KM=100;
	final int TARIF_SUP=200;
		
	
	Voiture()
	{
		super();
		this.kmParcouru=0;
		
	}
	
	Voiture(String marque, String modele, int tarifBase, int kmParcouru)
	{
		super(marque, modele, tarifBase);
		this.kmParcouru=kmParcouru;
	}

	
	@Override
	
	public int getTarifLocation()
	{
		
		if(this.kmParcouru<=this.LIMITE_KM)
			return super.getTarifBase();
		else 
			return super.getTarifBase()+(this.kmParcouru-this.LIMITE_KM)*this.TARIF_SUP;
		
	}
	
	@Override
	public String toString()
	{
		return super.toString()+" km parcouru = "+this.kmParcouru+" tarif de location = "+this.getTarifLocation();
	}
	
	
	

	
	
	
	public int getKmParcouru() {
		return kmParcouru;
	}

	public void setKmParcouru(int kmParcouru) {
		this.kmParcouru = kmParcouru;
	}

	
	
}
