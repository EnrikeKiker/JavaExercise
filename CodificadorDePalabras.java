import java.util.Scanner;

public class CodificadorDePalabras{
	static int totalDeCaracteres=5 ;
	
	public static void main(String[] args){
		Scanner datoUsuario = new Scanner(System.in);
		Scanner datoOpcion = new Scanner(System.in);
		int opcion=0;
		char[] palabra = new char [totalDeCaracteres] ;
        
        System.out.println("------------CODIFICADOR DE PALABRAS-----------");
        System.out.println("**Ingrese 5 caracteres.**");
		for(int i=0 ; i < totalDeCaracteres ; i++){
			System.out.print("Ingresa el caracter "+(i+1)+":");
			palabra[i] = datoUsuario.next().charAt(0);
			}
		System.out.println("-----------------------");
		System.out.print("Tu palabra es: ");
		for(int i=0 ; i < totalDeCaracteres ; i++){
			System.out.print(palabra[i]) ;
		}
		System.out.println();
		System.out.println("-----------------------");
		
        do{
        	System.out.println("**Ingrese el número de la opción que desee.**");
        	System.out.println("1.- Convertir a mayúsculas");
        	System.out.println("2.- Convertir a minúsculas");
        	System.out.println("3.- Convertir a símbolos especiales");
        	System.out.println("-1 .- Salir");
        	System.out.print("Opción: ");
        	opcion = datoOpcion.nextInt();
        	if(opcion == 1){
        		System.out.println("-----------------------");
        		convertirAMayusculas(palabra);
        		System.out.println("-----------------------");
        	}
        	else if(opcion == 2){
        		System.out.println("-----------------------");
        		convertirAMinusculas(palabra);
        		System.out.println("-----------------------");
        	}
        	else if(opcion == 3){
        		System.out.println("-----------------------");
        		convertirAOtrosSimbolos(palabra);
        		System.out.println("-----------------------");
        	}
        	else if(opcion > 3 || opcion < 1){ 
        		System.out.println("-----------------------");
        		System.out.println("Error: Ingrese alguna opción disponible");
        		System.out.println("-----------------------");
        	}
        }while(opcion != -1);
	}
	
	public static void convertirAMayusculas(char palabra[]){

		for (int i=0 ; i < totalDeCaracteres ; i ++){
            if (palabra[i] >= 'a' && palabra[i] <= 'z'){
                palabra[i] = (char) ('A' + (palabra[i] - 'a'));
            }
		}
        for (int i=0 ; i < totalDeCaracteres ; i++){
            System.out.print(palabra[i]);
		}
        System.out.println();
	}
	
	public static void convertirAMinusculas(char palabra[]){
	
		for (int i=0 ; i < totalDeCaracteres ; i ++){
            if (palabra[i] >= 'A' && palabra[i] <= 'Z'){
                palabra[i] = (char) ('a' + (palabra[i] - 'A'));
            }
		}
        for (int i=0 ; i < totalDeCaracteres ; i++){
            System.out.print(palabra[i]);
		}
        System.out.println();
	}
	
	public static void convertirAOtrosSimbolos(char palabra[]){
		
		for(int i=0 ; i < totalDeCaracteres ; i++){
			if(palabra[i] == 'A'){
				palabra[i] = (char) 52;
			}
			else if(palabra[i] == 'B'){
				palabra[i] = (char) 56;
			}
			else if(palabra[i] == 'E'){
				palabra[i] = '3';
			}
			else if(palabra[i] == 'I'){
				palabra[i] = '1';
			}
			else if(palabra[i] == 'O'){
				palabra[i] = '0';
			}
			else if(palabra[i] == 'a'){
				palabra[i] = '@';
			}
			else if(palabra[i] == 'c'){
				palabra[i] = '<';
			}
			else if(palabra[i] == 'E'){
				palabra[i] = '3';
			}
			else if(palabra[i] == 'l'){
				palabra[i] = (char) 217;
			}
			else if(palabra[i] == 'n'){
				palabra[i] = (char) 164;
			}
			else if(palabra[i] == 'R'){
				palabra[i] = (char) 169;
			}
			else if(palabra[i] == 'P'){
				palabra[i] = (char) 244;
			}
			else if(palabra[i] == 'S'){
				palabra[i] = '5';
			}
			else if(palabra[i] == 'u'){
				palabra[i] = (char) 230;
			}
			else if(palabra[i] == 'k'){
				palabra[i] = (char) 204;
			}
		}
		for (int i=0 ; i < totalDeCaracteres ; i++){
            System.out.print(palabra[i]);
		}
        System.out.println();
	}
}