import java.util.Scanner;

public class ArticulosDeElectronica {

	public static void main (String[] args) {
		int opcion = 0;
		Scanner entradaOpcion = new Scanner(System.in);

		System.out.println();
		System.out.println("---------------MENU DE CATALOGOS---------------");
		do{
			System.out.println();
			System.out.println("1. Catálogo de Computadoras");
			System.out.println("2. Catálogo de Celulares");
			System.out.println("3. Catálogo de Bocinas");
			System.out.println("0. Salir");
			System.out.print("Escribe el número de tu opción:  ");
			opcion = entradaOpcion.nextInt();
			if(opcion == 1){
				catalogoComputadoras();
			}
			else if(opcion == 2){
				catalogoCelulares();
			}
			else if(opcion == 3){
				catalogoBocinas();
			}
			else if (opcion < 0 || opcion > 3){
				System.out.println("La opción ingresada no existe");
			}
		}while(opcion != 0);
	}

	public static void catalogoComputadoras(){
		int opcion = 0;
		Scanner entradaOpcion = new Scanner(System.in);

		do{
			System.out.println();
			System.out.println("******Catalogo de Computadoras******");
			System.out.println("1. "+Computadora.ESCRITORIO_HP.getMarca());
			System.out.println("2. "+Computadora.NOTEBOOK_DELL.getMarca());
			System.out.println("3. "+Computadora.NOTEBOOK_APPLE.getMarca());
			System.out.println("4. "+Computadora.TABLET_SAMSUNG.getMarca());
			System.out.println("5. "+Computadora.SERVIDOR_IBM.getMarca());
			System.out.println("6. "+Computadora.MINI_PC_INTEL.getMarca());
			System.out.println("7. "+Computadora.ALL_IN_ONE_LENOVO.getMarca());
			System.out.println("0. Volver a los Catalogos");
			System.out.println();
			System.out.print("Escribe el número del articulo para ver especificaciones: ");
			opcion = entradaOpcion.nextInt();
			switch(opcion){
				case 1: 
					System.out.println();
					System.out.println("----------------------------------------------------");
					System.out.println("| COMPUTADORA DE ESCRITORIO "+Computadora.ESCRITORIO_HP.getMarca()+" |");
					System.out.println("----------------------------------------------------");
					System.out.println("| Procesador: "+Computadora.ESCRITORIO_HP.getProcesador()+" |");
					System.out.println("----------------------------------------------------");
					System.out.println("| Memoria RAM: "+Computadora.ESCRITORIO_HP.getMemoriaRAM()+" |");
					System.out.println("----------------------------------------------------");
					System.out.println("| Memoria ROM: "+Computadora.ESCRITORIO_HP.getAlmacenamiento()+" |");
					System.out.println("----------------------------------------------------");
					System.out.println("| Sistema Operativo: "+Computadora.ESCRITORIO_HP.getSistemaOperativo()+" |");
					System.out.println("----------------------------------------------------");
					System.out.println("| Tamaño de pantalla: "+Computadora.ESCRITORIO_HP.getTamanioPantalla()+"\" |");
					System.out.println("----------------------------------------------------");
					System.out.println("| Periféricos por defecto: "+Computadora.ESCRITORIO_HP.getPerifericos()+" |");
					System.out.println("----------------------------------------------------");
					System.out.println();
					break;
				case 2: 
					System.out.println();
					System.out.println("----------------------------------------------------");
					System.out.println("| COMPUTADORA NOTEBOOK "+Computadora.NOTEBOOK_DELL.getMarca()+" |");
					System.out.println("----------------------------------------------------");
					System.out.println("| Procesador: "+Computadora.NOTEBOOK_DELL.getProcesador()+" |");
					System.out.println("----------------------------------------------------");
					System.out.println("| Memoria RAM:  "+Computadora.NOTEBOOK_DELL.getMemoriaRAM()+" |");
					System.out.println("----------------------------------------------------");
					System.out.println("| Memoria ROM: "+Computadora.NOTEBOOK_DELL.getAlmacenamiento()+" |");
					System.out.println("----------------------------------------------------");
					System.out.println("| Sistema Operativo: "+Computadora.NOTEBOOK_DELL.getSistemaOperativo()+" |");
					System.out.println("----------------------------------------------------");
					System.out.println("| Tamaño de pantalla "+Computadora.NOTEBOOK_DELL.getTamanioPantalla()+"\" |");
					System.out.println("----------------------------------------------------");
					System.out.println("| Periféricos por defecto: "+Computadora.NOTEBOOK_DELL.getPerifericos()+" |");
					System.out.println("----------------------------------------------------");
					System.out.println();
					break;
				case 3: 
					System.out.println();
					System.out.println("----------------------------------------------------");
					System.out.println("| COMPUTADORA NOTEBOOK "+Computadora.NOTEBOOK_APPLE.getMarca()+" |");
					System.out.println("----------------------------------------------------");
					System.out.println("| Procesador: "+Computadora.NOTEBOOK_APPLE.getProcesador()+" |");
					System.out.println("----------------------------------------------------");
					System.out.println("| Memoria RAM:  "+Computadora.NOTEBOOK_APPLE.getMemoriaRAM()+" |");
					System.out.println("----------------------------------------------------");
					System.out.println("| Memoria ROM: "+Computadora.NOTEBOOK_APPLE.getAlmacenamiento()+" |");
					System.out.println("----------------------------------------------------");
					System.out.println("| Sistema Operativo: "+Computadora.NOTEBOOK_APPLE.getSistemaOperativo()+" |");
					System.out.println("----------------------------------------------------");
					System.out.println("| Tamaño de pantalla "+Computadora.NOTEBOOK_APPLE.getTamanioPantalla()+"\" |");
					System.out.println("----------------------------------------------------");
					System.out.println("| Periféricos por defecto: "+Computadora.NOTEBOOK_APPLE.getPerifericos()+" |");
					System.out.println("----------------------------------------------------");
					System.out.println();
					break;
				case 4: 
					System.out.println();
					System.out.println("----------------------------------------------------");
					System.out.println("| COMPUTADORA TABLET "+Computadora.TABLET_SAMSUNG.getMarca()+" |");
					System.out.println("----------------------------------------------------");
					System.out.println("| Procesador: "+Computadora.TABLET_SAMSUNG.getProcesador()+" |");
					System.out.println("----------------------------------------------------");
					System.out.println("| Memoria RAM:  "+Computadora.TABLET_SAMSUNG.getMemoriaRAM()+" |");
					System.out.println("----------------------------------------------------");
					System.out.println("| Memoria ROM: "+Computadora.TABLET_SAMSUNG.getAlmacenamiento()+" |");
					System.out.println("----------------------------------------------------");
					System.out.println("| Sistema Operativo: "+Computadora.TABLET_SAMSUNG.getSistemaOperativo()+" |");
					System.out.println("----------------------------------------------------");
					System.out.println("| Tamaño de pantalla "+Computadora.TABLET_SAMSUNG.getTamanioPantalla()+"\" |");
					System.out.println("----------------------------------------------------");
					System.out.println("| Periféricos por defecto: "+Computadora.TABLET_SAMSUNG.getPerifericos()+" |");
					System.out.println("----------------------------------------------------");
					System.out.println();
					break;
				case 5: 
					System.out.println();
					System.out.println("----------------------------------------------------");
					System.out.println("| COMPUTADORA SERVIDOR "+Computadora.SERVIDOR_IBM.getMarca()+" |");
					System.out.println("----------------------------------------------------");
					System.out.println("| Procesador: "+Computadora.SERVIDOR_IBM.getProcesador()+" |");
					System.out.println("----------------------------------------------------");
					System.out.println("| Memoria RAM:  "+Computadora.SERVIDOR_IBM.getMemoriaRAM()+" |");
					System.out.println("----------------------------------------------------");
					System.out.println("| Memoria ROM: "+Computadora.SERVIDOR_IBM.getAlmacenamiento()+" |");
					System.out.println("----------------------------------------------------");
					System.out.println("| Sistema Operativo: "+Computadora.SERVIDOR_IBM.getSistemaOperativo()+" |");
					System.out.println("----------------------------------------------------");
					System.out.println("| Tamaño de pantalla "+Computadora.SERVIDOR_IBM.getTamanioPantalla()+"\" |");
					System.out.println("----------------------------------------------------");
					System.out.println("| Periféricos por defecto: "+Computadora.SERVIDOR_IBM.getPerifericos()+" |");
					System.out.println("----------------------------------------------------");
					System.out.println();
					break;
				case 6: 
					System.out.println();
					System.out.println("----------------------------------------------------");
					System.out.println("| COMPUTADORA MINI_PC "+Computadora.MINI_PC_INTEL.getMarca()+" |");
					System.out.println("----------------------------------------------------");
					System.out.println("| Procesador: "+Computadora.MINI_PC_INTEL.getProcesador()+" |");
					System.out.println("----------------------------------------------------");
					System.out.println("| Memoria RAM:  "+Computadora.MINI_PC_INTEL.getMemoriaRAM()+" |");
					System.out.println("----------------------------------------------------");
					System.out.println("| Memoria ROM: "+Computadora.MINI_PC_INTEL.getAlmacenamiento()+" |");
					System.out.println("----------------------------------------------------");
					System.out.println("| Sistema Operativo: "+Computadora.MINI_PC_INTEL.getSistemaOperativo()+" |");
					System.out.println("----------------------------------------------------");
					System.out.println("| Tamaño de pantalla "+Computadora.MINI_PC_INTEL.getTamanioPantalla()+"\" |");
					System.out.println("----------------------------------------------------");
					System.out.println("| Periféricos por defecto: "+Computadora.MINI_PC_INTEL.getPerifericos()+" |");
					System.out.println("----------------------------------------------------");
					System.out.println();
					break;
				case 7: 
					System.out.println();
					System.out.println("----------------------------------------------------");
					System.out.println("| COMPUTADORA ALL_IN_ONE "+Computadora.ALL_IN_ONE_LENOVO.getMarca()+" |");
					System.out.println("----------------------------------------------------");
					System.out.println("| Procesador: "+Computadora.ALL_IN_ONE_LENOVO.getProcesador()+" |");
					System.out.println("----------------------------------------------------");
					System.out.println("| Memoria RAM:  "+Computadora.ALL_IN_ONE_LENOVO.getMemoriaRAM()+" |");
					System.out.println("----------------------------------------------------");
					System.out.println("| Memoria ROM: "+Computadora.ALL_IN_ONE_LENOVO.getAlmacenamiento()+" |");
					System.out.println("----------------------------------------------------");
					System.out.println("| Sistema Operativo: "+Computadora.ALL_IN_ONE_LENOVO.getSistemaOperativo()+" |");
					System.out.println("----------------------------------------------------");
					System.out.println("| Tamaño de pantalla "+Computadora.ALL_IN_ONE_LENOVO.getTamanioPantalla()+"\" |");
					System.out.println("----------------------------------------------------");
					System.out.println("| Periféricos por defecto: "+Computadora.ALL_IN_ONE_LENOVO.getPerifericos()+" |");
					System.out.println("----------------------------------------------------");
					System.out.println();
					break;
				default: System.out.println("--No selecciono un articulo disponible");
			}
		}while(opcion != 0);
		
	}

	public static void catalogoCelulares(){
		int opcion = 0;
		Scanner entradaOpcion = new Scanner(System.in);

		do{
			System.out.println();
			System.out.println("******Catalogo de Celulares******");
			System.out.println("1. "+Celular.IPHONE.getMarca());
			System.out.println("2. "+Celular.SAMSUNG.getMarca());
			System.out.println("3. "+Celular.XIAOMI.getMarca());
			System.out.println("4. "+Celular.HUAWEI.getMarca());
			System.out.println("5. "+Celular.MOTOROLA.getMarca());
			System.out.println("6. "+Celular.GOOGLE.getMarca());
			System.out.println("0. Volver a los Catalogos");
			System.out.println();
			System.out.print("Escribe el número del articulo para ver especificaciones: ");
			opcion = entradaOpcion.nextInt();
			switch(opcion){
				case 1: 
					System.out.println();
					System.out.println("----------------------------------------------------");
					System.out.println("| CELULAR "+Celular.IPHONE.getMarca()+" |");
					System.out.println("----------------------------------------------------");
					System.out.println("| Modelo: "+Celular.IPHONE.getModelo()+" |");
					System.out.println("----------------------------------------------------");
					System.out.println("| Sistema Operativo: "+Celular.IPHONE.getSistemaOperativo()+" |");
					System.out.println("----------------------------------------------------");
					System.out.println("| Almacenamiento: "+Celular.IPHONE.getAlmacenamiento()+" |");
					System.out.println("----------------------------------------------------");
					System.out.println("| Bateria: "+Celular.IPHONE.getBateria()+"mAh |");
					System.out.println("----------------------------------------------------");
					System.out.println("| Cámaras: "+Celular.IPHONE.getCamara()+" |");
					System.out.println("----------------------------------------------------");
					System.out.println("| Precio Regular: $"+Celular.IPHONE.getPrecio()+" MXN |");
					System.out.println("----------------------------------------------------");
					System.out.println();
					break;
				case 2: 
					System.out.println();
					System.out.println("----------------------------------------------------");
					System.out.println("| Celular "+Celular.SAMSUNG.getMarca()+" |");
					System.out.println("----------------------------------------------------");
					System.out.println("| Modelo: "+Celular.SAMSUNG.getModelo()+" |");
					System.out.println("----------------------------------------------------");
					System.out.println("| Sistema Operativo: "+Celular.SAMSUNG.getSistemaOperativo()+" |");
					System.out.println("----------------------------------------------------");
					System.out.println("| Almacenamiento: "+Celular.SAMSUNG.getAlmacenamiento()+" |");
					System.out.println("----------------------------------------------------");
					System.out.println("| Bateria: "+Celular.SAMSUNG.getBateria()+"mAh |");
					System.out.println("----------------------------------------------------");
					System.out.println("| Cámaras: "+Celular.SAMSUNG.getCamara()+" |");
					System.out.println("----------------------------------------------------");
					System.out.println("| Precio Regular: $"+Celular.SAMSUNG.getPrecio()+" MXN |");
					System.out.println("----------------------------------------------------");
					System.out.println();
					break;
				case 3: 
					System.out.println();
					System.out.println("----------------------------------------------------");
					System.out.println("| Celular "+Celular.XIAOMI.getMarca()+" |");
					System.out.println("----------------------------------------------------");
					System.out.println("| Modelo: "+Celular.XIAOMI.getModelo()+" |");
					System.out.println("----------------------------------------------------");
					System.out.println("| Sistema Operativo: "+Celular.XIAOMI.getSistemaOperativo()+" |");
					System.out.println("----------------------------------------------------");
					System.out.println("| Almacenamiento: "+Celular.XIAOMI.getAlmacenamiento()+" |");
					System.out.println("----------------------------------------------------");
					System.out.println("| Bateria: "+Celular.XIAOMI.getBateria()+"mAh |");
					System.out.println("----------------------------------------------------");
					System.out.println("| Cámaras: "+Celular.XIAOMI.getCamara()+" |");
					System.out.println("----------------------------------------------------");
					System.out.println("| Precio Regular: $"+Celular.XIAOMI.getPrecio()+" MXN |");
					System.out.println("----------------------------------------------------");
					System.out.println();
					break;
				case 4: 
					System.out.println();
					System.out.println("----------------------------------------------------");
					System.out.println("| Celular "+Celular.HUAWEI.getMarca()+" |");
					System.out.println("----------------------------------------------------");
					System.out.println("| Modelo: "+Celular.HUAWEI.getModelo()+" |");
					System.out.println("----------------------------------------------------");
					System.out.println("| Sistema Operativo: "+Celular.HUAWEI.getSistemaOperativo()+" |");
					System.out.println("----------------------------------------------------");
					System.out.println("| Almacenamiento: "+Celular.HUAWEI.getAlmacenamiento()+" |");
					System.out.println("----------------------------------------------------");
					System.out.println("| Bateria: "+Celular.HUAWEI.getBateria()+"mAh |");
					System.out.println("----------------------------------------------------");
					System.out.println("| Cámaras: "+Celular.HUAWEI.getCamara()+" |");
					System.out.println("----------------------------------------------------");
					System.out.println("| Precio Regular: $"+Celular.HUAWEI.getPrecio()+" MXN |");
					System.out.println("----------------------------------------------------");
					System.out.println();
					break;
				case 5: 
					System.out.println();
					System.out.println("----------------------------------------------------");
					System.out.println("| Celular "+Celular.MOTOROLA.getMarca()+" |");
					System.out.println("----------------------------------------------------");
					System.out.println("| Modelo: "+Celular.MOTOROLA.getModelo()+" |");
					System.out.println("----------------------------------------------------");
					System.out.println("| Sistema Operativo: "+Celular.MOTOROLA.getSistemaOperativo()+" |");
					System.out.println("----------------------------------------------------");
					System.out.println("| Almacenamiento: "+Celular.MOTOROLA.getAlmacenamiento()+" |");
					System.out.println("----------------------------------------------------");
					System.out.println("| Bateria: "+Celular.MOTOROLA.getBateria()+"mAh |");
					System.out.println("----------------------------------------------------");
					System.out.println("| Cámaras: "+Celular.MOTOROLA.getCamara()+" |");
					System.out.println("----------------------------------------------------");
					System.out.println("| Precio Regular: $"+Celular.MOTOROLA.getPrecio()+" MXN |");
					System.out.println("----------------------------------------------------");
					System.out.println();
					break;
				case 6: 
					System.out.println();
					System.out.println("----------------------------------------------------");
					System.out.println("| Celular "+Celular.GOOGLE.getMarca()+" |");
					System.out.println("----------------------------------------------------");
					System.out.println("| Modelo: "+Celular.GOOGLE.getModelo()+" |");
					System.out.println("----------------------------------------------------");
					System.out.println("| Sistema Operativo: "+Celular.GOOGLE.getSistemaOperativo()+" |");
					System.out.println("----------------------------------------------------");
					System.out.println("| Almacenamiento: "+Celular.GOOGLE.getAlmacenamiento()+" |");
					System.out.println("----------------------------------------------------");
					System.out.println("| Bateria: "+Celular.GOOGLE.getBateria()+"mAh |");
					System.out.println("----------------------------------------------------");
					System.out.println("| Cámaras: "+Celular.GOOGLE.getCamara()+" |");
					System.out.println("----------------------------------------------------");
					System.out.println("| Precio Regular: $"+Celular.GOOGLE.getPrecio()+" MXN |");
					System.out.println("----------------------------------------------------");
					System.out.println();
					break;
				default: System.out.println("--No selecciono un articulo disponible");
			}
		}while(opcion != 0);
	}

	public static void catalogoBocinas(){
		int opcion = 0;
		Scanner entradaOpcion = new Scanner(System.in);

		do{
			System.out.println();
			System.out.println("******Catalogo de Bocinas******");
			System.out.println("1. "+Bocina.BOSE.getMarca());
			System.out.println("2. "+Bocina.JBL.getMarca());
			System.out.println("3. "+Bocina.SONY.getMarca());
			System.out.println("4. "+Bocina.HARMAN_KARDON.getMarca());
			System.out.println("5. "+Bocina.EDIFIER.getMarca());
			System.out.println("6. "+Bocina.LOGITECH.getMarca());
			System.out.println("0. Volver a los Catalogos");
			System.out.println();
			System.out.print("Escribe el número del articulo para ver especificaciones: ");
			opcion = entradaOpcion.nextInt();
			switch(opcion){
				case 1: 
					System.out.println();
					System.out.println("----------------------------------------------------");
					System.out.println("| Bocina "+Bocina.BOSE.getMarca()+" |");
					System.out.println("----------------------------------------------------");
					System.out.println("| Modelo: "+Bocina.BOSE.getModelo()+" |");
					System.out.println("----------------------------------------------------");
					System.out.println("| Tipo: "+Bocina.BOSE.getTipo()+" |");
					System.out.println("----------------------------------------------------");
					System.out.println("| Potencia: "+Bocina.BOSE.getPotencia()+"W |");
					System.out.println("----------------------------------------------------");
					System.out.println("| Precio Regular: $"+Bocina.BOSE.getPrecio()+" MXN |");
					System.out.println("----------------------------------------------------");
					System.out.println();
					break;
				case 2: 
					System.out.println();
					System.out.println("----------------------------------------------------");
					System.out.println("| Bocina "+Bocina.JBL.getMarca()+" |");
					System.out.println("----------------------------------------------------");
					System.out.println("| Modelo: "+Bocina.JBL.getModelo()+" |");
					System.out.println("----------------------------------------------------");
					System.out.println("| Tipo: "+Bocina.JBL.getTipo()+" |");
					System.out.println("----------------------------------------------------");
					System.out.println("| Potencia: "+Bocina.JBL.getPotencia()+"W |");
					System.out.println("----------------------------------------------------");
					System.out.println("| Precio Regular: $"+Bocina.JBL.getPrecio()+" MXN |");
					System.out.println("----------------------------------------------------");
					System.out.println();
					break;
				case 3: 
					System.out.println();
					System.out.println("----------------------------------------------------");
					System.out.println("| Bocina "+Bocina.SONY.getMarca()+" |");
					System.out.println("----------------------------------------------------");
					System.out.println("| Modelo: "+Bocina.SONY.getModelo()+" |");
					System.out.println("----------------------------------------------------");
					System.out.println("| Tipo: "+Bocina.SONY.getTipo()+" |");
					System.out.println("----------------------------------------------------");
					System.out.println("| Potencia: "+Bocina.SONY.getPotencia()+"W |");
					System.out.println("----------------------------------------------------");
					System.out.println("| Precio Regular: $"+Bocina.SONY.getPrecio()+" MXN |");
					System.out.println("----------------------------------------------------");
					System.out.println();
					break;
				case 4: 
					System.out.println();
					System.out.println("----------------------------------------------------");
					System.out.println("| Bocina "+Bocina.HARMAN_KARDON.getMarca()+" |");
					System.out.println("----------------------------------------------------");
					System.out.println("| Modelo: "+Bocina.HARMAN_KARDON.getModelo()+" |");
					System.out.println("----------------------------------------------------");
					System.out.println("| Tipo: "+Bocina.HARMAN_KARDON.getTipo()+" |");
					System.out.println("----------------------------------------------------");
					System.out.println("| Potencia: "+Bocina.HARMAN_KARDON.getPotencia()+"W |");
					System.out.println("----------------------------------------------------");
					System.out.println("| Precio Regular: $"+Bocina.HARMAN_KARDON.getPrecio()+" MXN |");
					System.out.println("----------------------------------------------------");
					System.out.println();
					break;
				case 5: 
					System.out.println();
					System.out.println("----------------------------------------------------");
					System.out.println("| Bocina "+Bocina.EDIFIER.getMarca()+" |");
					System.out.println("----------------------------------------------------");
					System.out.println("| Modelo: "+Bocina.EDIFIER.getModelo()+" |");
					System.out.println("----------------------------------------------------");
					System.out.println("| Tipo: "+Bocina.EDIFIER.getTipo()+" |");
					System.out.println("----------------------------------------------------");
					System.out.println("| Potencia: "+Bocina.EDIFIER.getPotencia()+"W |");
					System.out.println("----------------------------------------------------");
					System.out.println("| Precio Regular: $"+Bocina.EDIFIER.getPrecio()+" MXN |");
					System.out.println("----------------------------------------------------");
					System.out.println();
					break;
				case 6: 
					System.out.println();
					System.out.println("----------------------------------------------------");
					System.out.println("| Bocina "+Bocina.LOGITECH.getMarca()+" |");
					System.out.println("----------------------------------------------------");
					System.out.println("| Modelo: "+Bocina.LOGITECH.getModelo()+" |");
					System.out.println("----------------------------------------------------");
					System.out.println("| Tipo: "+Bocina.LOGITECH.getTipo()+" |");
					System.out.println("----------------------------------------------------");
					System.out.println("| Potencia: "+Bocina.LOGITECH.getPotencia()+"W |");
					System.out.println("----------------------------------------------------");
					System.out.println("| Precio Regular: $"+Bocina.LOGITECH.getPrecio()+" MXN |");
					System.out.println("----------------------------------------------------");
					System.out.println();
					break;
				default: System.out.println("--No selecciono un articulo disponible");
			}
		}while(opcion != 0);
	}
}