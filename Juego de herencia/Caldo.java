public class Caldo extends Comida{
	
	private String[] verduras = {"papa","zanahoria","calabaza","chayote","elote"};
	private String colorDeCaldo;
	private boolean conVerduras;
	private int caloriasExtra;

	public Caldo(String nombre, int cantidadDeCalorias, String comoLuce, String sabor, String aroma, String tipoDeProteina,
				String colorDeCaldo, boolean conVerduras){
		super(nombre, cantidadDeCalorias, comoLuce, sabor, aroma, tipoDeProteina);
		this.colorDeCaldo = colorDeCaldo;
		this.conVerduras = conVerduras;
	}

	public void descripcionDeAlimento(){
		prepararConVerduras();
		System.out.println(getNombre()+" tiene un total de "+getCantidadDeCalorias()+" Kcals"+
							"\n parece "+getComoLuce()+
							"\n con aroma a "+getAroma()+
							"\n con sabor "+getSabor()+
							"\n la proteina es "+getTipoDeProteina()+
							"\n el color del caldo es "+colorDeCaldo);
		System.out.println(" Se come caliente");
		mostrarVerduras();
		System.out.println("\n");
	}

	public void setColorDeCaldo(String colorDeCaldo){
		this.colorDeCaldo = colorDeCaldo;
	}

	public String getColorDeCaldo(){
		return colorDeCaldo;
	}

	public boolean getConVerduras(){
		return conVerduras;
	}

	private void prepararConVerduras(){
		if(conVerduras){
			setCantidadDeCalorias(getCantidadDeCalorias()+60);
		}
	}

	private void mostrarVerduras(){
		if(conVerduras){
			System.out.print(" Contiene las verduras:");
				for(int i=0 ; i < verduras.length ; i++){
					System.out.print(" "+verduras[i]);
				}
		}
		else{
			System.out.print(" No contiene verduras");
		}
	}
}