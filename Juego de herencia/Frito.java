public class Frito extends Postre{
	
	private String forma;
	private String cubierta;

	public Frito(String nombre, int cantidadDeCalorias, String comoLuce, String sabor, String aroma, String tipoDeCoccion,
				String textura, float temperatura, String baseDeSabor, String forma, String cubierta){
		super(nombre, cantidadDeCalorias, comoLuce, sabor, aroma, tipoDeCoccion, textura, temperatura, baseDeSabor);
		this.forma = forma;
		this.cubierta = cubierta;
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
							"\n tiene una forma de "+forma+
							"\n la cubierta "+cubierta+"\n");
	}

	public void setForma(String forma){
		this.forma = forma;
	}

	public void setCubierta(String cubierta){
		this.cubierta = cubierta;
	}

	public String getforma(){
		return forma;
	}

	public String getCubierta(){
		return cubierta;
	}

}