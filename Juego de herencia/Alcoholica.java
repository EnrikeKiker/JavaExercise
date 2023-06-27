public class Alcoholica extends Bebida{
	private String tipoDeAlcohol;
	private float gradosDeAlcohol;
	private String materialDeRecipiente;

	public Alcoholica(String nombre, int cantidadDeCalorias, int cantidadDeContenido, float temperatura, String color, 
				String sabor, String aroma, String recipiente, String tipoDeAlcohol, float gradosDeAlcohol, String materialDeRecipiente){
		super(nombre, cantidadDeCalorias, cantidadDeContenido, temperatura, color, sabor, aroma, recipiente);
		this.tipoDeAlcohol = tipoDeAlcohol;
		this.gradosDeAlcohol = gradosDeAlcohol;
		this.materialDeRecipiente = materialDeRecipiente;
	}

	public void descripcionDeBebida(){
		frioOCaliente();
		System.out.println(getNombre()+" tiene un total de "+getCantidadDeCalorias()+" Kcals"+
							"\n contiene "+getCantidadDeContenido()+"ml"+
							"\n con temperatura de "+getTemperatura()+"°C por lo que es una bebida "+getPropiedadDeTemperatura()+
							"\n con un color "+getColor()+
							"\n con aroma a "+getAroma()+
							"\n con sabor "+getSabor()+
							"\n en un recipiente de "+getRecipiente()+" de "+getMaterialDeRecipiente()+
							"\n contiene "+tipoDeAlcohol+" a "+gradosDeAlcohol+"% de alcohol \n");
	}

	public void setTipoDeAlcohol(String tipoDeAlcohol){
		this.tipoDeAlcohol = tipoDeAlcohol;
	}

	public void setGradosDeAlcohol(int gradosDeAlcohol){
		this.gradosDeAlcohol = gradosDeAlcohol;
	}

	public void setMaterialDeRecipiente(String materialDeRecipiente){
		this.materialDeRecipiente = materialDeRecipiente;
	}

	public String getTipoDeAlcohol(){
		return tipoDeAlcohol;
	}

	public float getGradosDeAlcohol(){
		return gradosDeAlcohol;
	}

	public String getMaterialDeRecipiente(){
		return materialDeRecipiente;
	}

}