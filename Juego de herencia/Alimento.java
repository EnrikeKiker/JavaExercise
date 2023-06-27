public class Alimento{
	private String nombre;
	private int cantidadDeCalorias;
	private String comoLuce;
	private String sabor;
	private String aroma;

	public Alimento(){
		this("",0,"","","");
	}

	public Alimento(String nombre){
		this(nombre, 0, "", "", "");
	}

	public Alimento(String nombre, int cantidadDeCalorias, String comoLuce, String sabor, String aroma){
		this.nombre = nombre;
		this.cantidadDeCalorias = cantidadDeCalorias;
		this.comoLuce = comoLuce;
		this.sabor = sabor;
		this.aroma = aroma;
	}

	public void descripcionDeAlimento(){
		System.out.println(nombre+" tiene un total de "+cantidadDeCalorias+" Kcals"+
							"\n parece "+comoLuce+
							"\n con aroma a "+aroma+
							"\n con sabor "+sabor+"\n");
	}

	public void setNombre(String nombre){
		this.nombre = nombre;
	}

	public void setCantidadDeCalorias(int cantidadDeCalorias){
		this.cantidadDeCalorias = cantidadDeCalorias;
	}

	public void setComoLuce(String comoLuce){
		this.comoLuce = comoLuce;
	}

	public void setSabor(String sabor){
		this.sabor = sabor;
	}

	public void setAroma(String aroma){
		this.aroma = aroma;
	}

	public String getNombre(){
		return nombre;
	}

	public int getCantidadDeCalorias(){
		return cantidadDeCalorias;
	}

	public String getComoLuce(){
		return comoLuce;
	}

	public String getSabor(){
		return sabor;
	}

	public String getAroma(){
		return aroma;
	}
}