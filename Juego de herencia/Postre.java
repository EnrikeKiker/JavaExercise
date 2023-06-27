public class Postre extends Alimento{
	
	private String tipoDeCoccion;
	private String textura;
	private float temperatura;
	private String baseDeSabor;
	private String propiedadDeTemperatura;

	public Postre(String nombre, int cantidadDeCalorias, String comoLuce, String sabor, String aroma, String tipoDeCoccion,
				String textura, float temperatura, String baseDeSabor){
		super(nombre, cantidadDeCalorias, comoLuce, sabor, aroma);
		this.tipoDeCoccion = tipoDeCoccion;
		this.textura = textura;
		this.temperatura = temperatura;
		this.baseDeSabor = baseDeSabor;
	}

	public void descripcionDeAlimento(){
		System.out.println(getNombre()+" tiene un total de "+getCantidadDeCalorias()+" Kcals"+
							"\n parece "+getComoLuce()+
							"\n con aroma a "+getAroma()+
							"\n con sabor "+getSabor());
		frioOCaliente();
		System.out.println(" forma de cocción es "+tipoDeCoccion+
							"\n es "+textura+
							"\n con una temperatura de "+temperatura+"°C es "+propiedadDeTemperatura+
							"\n la base del sabor es "+baseDeSabor+"\n");
	}

	public void frioOCaliente(){
		if(temperatura <= 10){
			propiedadDeTemperatura = "frío";
		}
		else if(temperatura >= 28){
			propiedadDeTemperatura = "caliente";
		}
		else{
			propiedadDeTemperatura = "tibio";
		}
	}

	public void setTipoDeCoccion(String tipoDeCoccion){
		this.tipoDeCoccion = tipoDeCoccion;
	}

	public void setTextura(String textura){
		this.textura = textura;
	}

	public void setTemperatura(float temperatura){
		this.temperatura = temperatura;
	}

	public void setBaseDeSabor(String baseDeSabor){
		this.baseDeSabor = baseDeSabor;
	}

	public void setPropiedadDeTemperatura(String propiedadDeTemperatura){
		this.propiedadDeTemperatura = propiedadDeTemperatura;
	}

	public String getTipoDeCoccion(){
		return tipoDeCoccion;
	}

	public String getTextura(){
		return textura;
	}

	public float getTemperatura(){
		return temperatura;
	}

	public String getBaseDeSabor(){
		return baseDeSabor;
	}

	public String getPropiedadDeTemperatura(){
		return propiedadDeTemperatura;
	}

}