public class Bebida{
	private String nombre;
	private int cantidadDeCalorias;
	private int cantidadDeContenido;
	private float temperatura;
	private String color;
	private String sabor;
	private String aroma;
	private String recipiente;
	private String propiedadDeTemperatura;

	public Bebida(){
		this("",0,0,0,"","","","");
	}

	public Bebida(String nombre, int cantidadDeCalorias, int cantidadDeContenido, float temperatura, String color, 
				String sabor, String aroma, String recipiente){
		this.nombre = nombre;
		this.cantidadDeCalorias = cantidadDeCalorias;
		this.cantidadDeContenido = cantidadDeContenido;
		this.temperatura = temperatura;
		this.color = color;
		this.sabor = sabor;
		this.aroma = aroma;
		this.recipiente = recipiente;
	}

	public void descripcionDeBebida(){
		frioOCaliente();
		System.out.println(nombre+" tiene un total de "+cantidadDeCalorias+" Kcals"+
							"\n contiene "+cantidadDeContenido+"ml"+
							"\n con temperatura de "+temperatura+"°C por lo que es una bebida "+propiedadDeTemperatura+
							"\n con un color "+color+
							"\n con aroma a "+aroma+
							"\n con sabor "+sabor+
							"\n en un recipiente de "+recipiente+"\n");
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

	public void setNombre(String nombre){
		this.nombre = nombre;
	}

	public void setCantidadDeCalorias(int cantidadDeCalorias){
		this.cantidadDeCalorias = cantidadDeCalorias;
	}

	public void setCantidadDeContenido(int cantidadDeContenido){
		this.cantidadDeContenido = cantidadDeContenido;
	}

	public void setTemperatura(float temperatura){
		this.temperatura = temperatura;
	}

	public void setPropiedadDeTemperatura(String propiedadDeTemperatura){
		this.propiedadDeTemperatura = propiedadDeTemperatura;
	}

	public void setColor(String color){
		this.color = color;
	}

	public void setSabor(String sabor){
		this.sabor = sabor;
	}

	public void setAroma(String aroma){
		this.aroma = aroma;
	}

	public void setRecipiente(String recipiente){
		this.recipiente = recipiente;
	}

	public String getNombre(){
		return nombre;
	}

	public int getCantidadDeCalorias(){
		return cantidadDeCalorias;
	}

	public int getCantidadDeContenido(){
		return cantidadDeContenido;
	}

	public String getPropiedadDeTemperatura(){
		return propiedadDeTemperatura;
	}

	public float getTemperatura(){
		return temperatura;
	}

	public String getColor(){
		return color;
	}

	public String getSabor(){
		return sabor;
	}

	public String getAroma(){
		return aroma;
	}

	public String getRecipiente(){
		return recipiente;
	}
}