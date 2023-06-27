public class Pastel extends Postre{
	
	private String relleno;
	private String betun;

	public Pastel(String nombre, int cantidadDeCalorias, String comoLuce, String sabor, String aroma, String tipoDeCoccion,
				String textura, float temperatura, String baseDeSabor, String relleno, String betun){
		super(nombre, cantidadDeCalorias, comoLuce, sabor, aroma, tipoDeCoccion, textura, temperatura, baseDeSabor);
		this.relleno = relleno;
		this.betun = betun;
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
							"\n el relleno es "+relleno+
							"\n la cubierta de betun es "+betun+"\n");
	}

	public void setRelleno(String relleno){
		this.relleno = relleno;
	}

	public void setBetun(String betun){
		this.betun = betun;
	}

	public String getRelleno(){
		return relleno;
	}

	public String getBetun(){
		return betun;
	}

}