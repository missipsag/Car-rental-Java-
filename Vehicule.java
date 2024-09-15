package EXO1;

public abstract class Vehicule implements Comparable{
	
	private String marque; 
	private String modele; 
	private int tarifBase; 
	static int nbrVehicules=0;
	
	Vehicule()
	{
		this.marque="";
		this.modele="";
		this.tarifBase=0;
		nbrVehicules++;
		
	}
	
	Vehicule(String marque, String modele, int tarifBase)
	{
		this.marque=marque;
		this.modele=modele;
		this.tarifBase=tarifBase;
		nbrVehicules++;
	}

	
	public abstract int getTarifLocation();
	
	@Override
	public String toString()
	{
		return " marque= "+this.marque+ "  modèle = "+this.modele+ " tarif de base = "+this.tarifBase;
	}
	
	@Override
	
	public int comparer(Comparable autre)
	{
	 
		Vehicule autreVehicule= (Vehicule)autre;
		
		if(this.getTarifLocation()<autreVehicule.getTarifLocation())
			return -1;
		else{
			if(this.getTarifLocation()>autreVehicule.getTarifLocation())
				return 1; 
			else return 0;
		}
		
		
	}
	
	
	public String getMarque() {
		return marque;
	}

	public void setMarque(String marque) {
		this.marque = marque;
	}

	public String getModele() {
		return modele;
	}

	public void setModele(String modele) {
		this.modele = modele;
	}

	public int getTarifBase() {
		return tarifBase;
	}

	public void setTarifBase(int tarifBase) {
		this.tarifBase = tarifBase;
	}
	
	public static int retournerNbrVehicules()
	{
		return nbrVehicules; 
	}

}
