public class Natural extends Bebida{
	private boolean esMineral;

	public Natural(String nombre, int cantidadDeCalorias, int cantidadDeContenido, float temperatura, String color, 
				String sabor, String aroma, String recipiente, boolean esMineral){
		super(nombre, cantidadDeCalorias, cantidadDeContenido, temperatura, color, sabor, aroma, recipiente);
		this.esMineral = esMineral;
	}

	public void descripcionDeBebida(){
		frioOCaliente();
		System.out.println(getNombre()+" tiene un total de "+getCantidadDeCalorias()+" Kcals"+
							"\n contiene "+getCantidadDeContenido()+"ml"+
							"\n con temperatura de "+getTemperatura()+"°C por lo que es una bebida "+getPropiedadDeTemperatura()+
							"\n con un color "+getColor()+
							"\n con aroma a "+getAroma()+
							"\n con sabor "+getSabor()+
							"\n en un recipiente de "+getRecipiente());
		agregarMineral();
	}

	public void agregarMineral(){
		if(esMineral){
			System.out.println(" con agua mineral, carbonatada");
		}
		else{
			System.out.println(" con agua natural");
		}
	}

	public void setEsMineral(boolean esMineral){
		this.esMineral = esMineral;
	}

	public boolean getEsMineral(){
		return esMineral;
	}

}