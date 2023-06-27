public class Comida extends Alimento{
	
	private String tipoDeProteina;

	public Comida(String nombre, int cantidadDeCalorias, String comoLuce, String sabor, String aroma, String tipoDeProteina){
		super(nombre, cantidadDeCalorias, comoLuce, sabor, aroma);
		this.tipoDeProteina = tipoDeProteina;
	}

	public void descripcionDeAlimento(){
		System.out.println(getNombre()+" tiene un total de "+getCantidadDeCalorias()+" Kcals"+
							"\n parece "+getComoLuce()+
							"\n con aroma a "+getAroma()+
							"\n con sabor "+getSabor()+
							"\n la base proteica es "+tipoDeProteina+"\n");
	}

	public void setTipoDeProteina(String tipoDeProteina){
		this.tipoDeProteina = tipoDeProteina;
	}

	public String getTipoDeProteina(){
		return tipoDeProteina;
	}
}