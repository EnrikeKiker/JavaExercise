import java.util.Scanner;

public class HerenciaDeAlimentos {
    private static Alimento tacoDeTripa;
    private static Comida tacoAlPastor;
    private static Taco tacoDeSuadero;
    private static Caldo caldoDePollo;
    private static Postre pastelDeZanahoria;
    private static Pastel pastelRedVelvet;
    private static Gelatina gelatinaVainilla;
    private static Frito churrosDeCanela;
    private static Bebida refrescoDeSangria;
    private static Alcoholica cerveza;
    private static Natural cafe;

    public static void main(String[] args) {
        inicializarObjetos();
        iniciarJuego();
    }

    public static void inicializarObjetos() {
        tacoDeTripa = new Alimento("Taco de Tripa", 350, "Delicioso", "Salado", "Caldo de res");
        tacoAlPastor = new Comida("Taco al Pastor", 200, "Delicioso", "Salado", "Adobo", "Cerdo");
        tacoDeSuadero = new Taco("Taco de suadero", 250, "Muy rico", "Salado", "Carne asada", "Res", "Maíz", true, true);
        caldoDePollo = new Caldo("Caldo de pollo", 130, "Nutritivo", "Umami", "Concentrado de pollo", "Pollo", "Blanco", true);
        pastelDeZanahoria = new Postre("Pastel de Zanahoría", 320, "Excepcional", "Dulce", "Dulce", "Horneado", "Esponjoso", 27, "Zanahoría");
        pastelRedVelvet = new Pastel("Pastel de RedVelvet", 370, "Delicioso", "Dulce", "Queso", "Horneado", "Esponjoso", 26, "Chocolate", "Queso crema", "Vainilla con queso");
        gelatinaVainilla = new Gelatina("Gelatina de Vainilla", 430, "Simple", "Dulce", "Vainilla", "Disolver", "Suave y Gomosa", 15, "Vainilla", "Leche");
        churrosDeCanela = new Frito("Churros con Canela", 330, "Antojable", "Dulce", "Canela", "Frito", "Firme y Crujiente", 40, "Vainilla y Canela", "Cilindrica", "Azucar con Canela");
        refrescoDeSangria = new Bebida("Refresco de Sangría", 170, 355, 8, "Rojo", "Vino Cítrico", "Vino", "Plástico");
        cerveza = new Alcoholica("Cerveza", 155, 350, 5, "Dorado", "Amargo", "Cebada", "Botella", "Etanol", 5, "Vidrio");
        cafe = new Natural("Cafe", 0, 220, 60, "Café oscuro", "Amargo", "Café", "Taza", false);
    }

    public static void iniciarJuego(){
        Scanner objetoDeJugador = new Scanner(System.in);

        Alimento[] alimentos = {
            tacoDeTripa,
            tacoAlPastor,
            tacoDeSuadero,
            caldoDePollo,
            pastelDeZanahoria,
            pastelRedVelvet,
            gelatinaVainilla,
            churrosDeCanela
        };

        Bebida[] bebidas = {
            refrescoDeSangria,
            cerveza,
            cafe
        };
        System.out.println("---------------------------------------------------------");
        System.out.println("¡Bienvenido a Scribblenauts - Alimentos y bebidas!");
        System.out.println("---------------------------------------------------------");

        while(true){
        	System.out.println("Recuerda que tienes que escribir en singular y puedes escribir \"salir\" para salir\n");
    		System.out.print("Ingresa el nombre del alimento o bebida para invocarlo: ");
    		String entrada = objetoDeJugador.nextLine().toLowerCase();
    		System.out.print("\n");

    		if(entrada.equals("salir")){
        		System.out.println("Gracias por jugar. ¡Hasta luego!");
        		break;
		    }

    		boolean alimentoEncontrado = false;
    		for(int i = 0; i < alimentos.length; i++) {
        		Alimento alimento = alimentos[i];
        		//if (alimento.getNombre().equalsIgnoreCase(entrada)) {
        		if(alimento.getNombre().toLowerCase().contains(entrada)){
            		alimentoEncontrado = true;
            		alimento.descripcionDeAlimento();
            		break;
        		}
    		}

    		if(!alimentoEncontrado) {
        		boolean bebidaEncontrada = false;
        		for (int i = 0; i < bebidas.length; i++) {
            		Bebida bebida = bebidas[i];
            		//if (bebida.getNombre().equalsIgnoreCase(entrada)) {
            		if(bebida.getNombre().toLowerCase().contains(entrada)){
                		bebidaEncontrada = true;
                		bebida.descripcionDeBebida();
                		break;
            		}
        		}

        		if(!bebidaEncontrada) {
            		System.out.println("Lo siento, no se encontró el alimento o bebida especificado.");
        		}
    		}
		}
        objetoDeJugador.close();
    }
}
