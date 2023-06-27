public class Taco extends Comida{
	
	private String tipoDeTortilla;
	private boolean conVerdura;
	private boolean conSalsa;

	public Taco(String nombre, int cantidadDeCalorias, String comoLuce, String sabor, String aroma, String tipoDeProteina,
				String tipoDeTortilla, boolean conVerdura, boolean conSalsa){
		super(nombre, cantidadDeCalorias, comoLuce, sabor, aroma, tipoDeProteina);
		this.tipoDeTortilla = tipoDeTortilla;
		this.conVerdura = conVerdura;
		this.conSalsa = conSalsa;
	}

	public void descripcionDeAlimento(){
		System.out.println(getNombre()+" tiene un total de "+getCantidadDeCalorias()+" Kcals"+
							"\n parece "+getComoLuce()+
							"\n con aroma a "+getAroma()+
							"\n con sabor "+getSabor()+
							"\n la proteina es "+getTipoDeProteina()+
							"\n sobre un base de tortilla de "+tipoDeTortilla);
		prepararTaco();
		System.out.print("\n");
	}

	public void setTipoDeTortilla(String tipoDeTortilla){
		this.tipoDeTortilla = tipoDeTortilla;
	}

	public void setConVerdura(boolean conVerdura){
		this.conVerdura = conVerdura;
	}

	public void setConSalsa(boolean conSalsa){
		this.conSalsa = conSalsa;
	}

	public String getTipoDeTortilla(){
		return tipoDeTortilla;
	}

	public boolean getConVerdura(){
		return conVerdura;
	}

	public boolean getConSalsa(){
		return conSalsa;
	}

	private void prepararTaco(){
		if(conVerdura){
			System.out.print(" con cebolla y cilantro");
			if(conSalsa){
				System.out.println("\n también con salsa");
			}
			else{
				System.out.print("");
			}
		}
		else{
			System.out.print("");
		}
	}
}