public class Gelatina extends Postre{
	
	private String tipoDeGel;

	public Gelatina(String nombre, int cantidadDeCalorias, String comoLuce, String sabor, String aroma, String tipoDeCoccion,
				String textura, float temperatura, String baseDeSabor, String tipoDeGel){
		super(nombre, cantidadDeCalorias, comoLuce, sabor, aroma, tipoDeCoccion, textura, temperatura, baseDeSabor);
		this.tipoDeGel = tipoDeGel;
	}

	public void descripcionDeAlimento(){
		System.out.println(getNombre()+" tiene un total de "+getCantidadDeCalorias()+" Kcals"+
							"\n parece "+getComoLuce()+
							"\n con aroma a "+getAroma()+
							"\n con sabor "+getSabor());
		frioOCaliente();
		System.out.println(" forma de cocción es "+getTipoDeCoccion()+
							"\n es "+getTextura()+
							"\n con una temperatura de "+getTemperatura()+"°C es "+getPropiedadDeTemperatura()+
							"\n la base del sabor es "+getBaseDeSabor()+
							"\n es a base de "+tipoDeGel+"\n");
	}

	public void setTipoDeGel(String tipoDeGel){
		this.tipoDeGel = tipoDeGel;
	}

	public String getTipoDeGel(){
		return tipoDeGel;
	}

}