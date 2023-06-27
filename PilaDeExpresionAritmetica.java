import java.util.Scanner;

public class PilaDeExpresionAritmetica {
	static int tamanioPila=20;
	static int indiceIzq=0;
	static int indiceDer=tamanioPila-1;
	static String[] pila = new String[tamanioPila];
	static int resultadoFinal = 0;

	public static void main(String[] args) {
		String[] expresionAritmetica;
		int tamanioExpresion = 0;
		Scanner datoDeEntradaExpresion = new Scanner(System.in);
		Scanner datoDeEntradaTamanio = new Scanner(System.in);

		System.out.println("----Resolución de expresión aritmérica----");
		System.out.println("Ingresa el tamaño de la expresión");
		tamanioExpresion = datoDeEntradaTamanio.nextInt();
		expresionAritmetica = new String[tamanioExpresion];
		System.out.println("Ingresa tu expresión a resolver caracter por caracter");
		for (int n=0; n < tamanioExpresion ; n++) {
			System.out.print("Caracter "+(n+1)+" : ");
			expresionAritmetica[n] = datoDeEntradaExpresion.nextLine();
		}
		System.out.print("Tu expresión aritmérica es:    ");
		for (int i=0 ; i < tamanioExpresion ; i++) {
			System.out.print(expresionAritmetica[i]);
		}
		//Inicializar pila con espacios
		for(int i=0; i < tamanioPila ; i++){
			pila[i] = " ";
		}
		System.out.println();
		mostrarPila();

		for (int i=0 ; i < tamanioExpresion ; i++) {
			if(esNumero(expresionAritmetica[i])){
				push(expresionAritmetica[i]);
				mostrarPila();
			}
			
			else if(esParentesisDeApertura(expresionAritmetica[i])){
				pushContrario(expresionAritmetica[i]);
				mostrarPila();
			}

			else if(esParentesisDeCierre(expresionAritmetica[i])){
				while(!esParentesisDeApertura(elementoEnPila()) && !pilaDerechaVacia()){
					String elementoRecuperado = popContrario();
					System.out.println("pop por parentesis: "+elementoRecuperado);
					push(elementoRecuperado);
				}
				popContrario();
				mostrarPila();
			}

			else if(esSigno(expresionAritmetica[i])){
				if(precedencia(expresionAritmetica[i]) <= precedencia(elementoEnPila())){
					while(!(pilaDerechaVacia()) && !esParentesisDeApertura(elementoEnPila())){
						String elementoRecuperado = popContrario();
						System.out.println("pop Signo: "+elementoRecuperado);
						push(elementoRecuperado);
					}
				pushContrario(expresionAritmetica[i]);
				}
				else{
					pushContrario(expresionAritmetica[i]);	
				}
				mostrarPila();
			}
		}

		while(!(pilaDerechaVacia())){
			String elementoRecuperado = popContrario();
			System.out.println("pop acabo la expresion: "+elementoRecuperado);
			push(elementoRecuperado);
		}
		mostrarPila();
		resultadoFinal = calcularResultadoDeExpresionPostfija();
		System.out.println();
		System.out.println("El resultado de la expresión es: "+ resultadoFinal);
	}

	public static int calcularResultadoDeExpresionPostfija(){
		int resultado = 0, numero1 = 0 , numero2 = 0 ;
		for(int i=0 ; pila[i] != " " ; i++){
			char operador = pila[i].charAt(0);
			if(esNumero(pila[i])){
				pushContrario(pila[i]);
			}
			else if(esSigno(pila[i])){
				numero2 = Integer.parseInt(popContrario());
				numero1 = Integer.parseInt(popContrario());
				switch(operador){
					case '+': 
						resultado = numero1 + numero2;
						break;
					case '-':
						resultado = numero1 - numero2;
						break;
					case '*':
						resultado = numero1 * numero2;
						break;
					case '/':
							if(numero2 != 0){
								resultado = numero1 / numero2;
							} 
							else{
								System.out.println("Error: División entre cero no existe");
							}
						break;
					default:
						System.out.println("Error de operador");
				}
				pushContrario(Integer.toString(resultado));
			}
		}
		return resultado;
	}

	public static boolean esParentesisDeApertura(String elemento){
		char caracter = elemento.charAt(0);
		if(caracter == '('){
			return true;
		}
		else{
			return false;
		}
	}	

	public static boolean esParentesisDeCierre(String elemento){
		char caracter = elemento.charAt(0);
		if(caracter == ')'){
			return true;
		}
		else{
			return false;
		}
	}

	public static boolean pilaDerechaVacia(){
		int indice = indiceDer;
		int topeDePila = indice + 1;
		if(topeDePila == pila.length){
			return true;
		}
		else{
			return false;
		}
	}
	
	public static String elementoEnPila(){
		int indice = indiceDer;
		int topeDePila = indice + 1;
		if(topeDePila < pila.length){
			return (pila[indice+1]);
		}
		else{
			return "0";
		}
	}
	

	public static int precedencia(String elemento){
		char caracter = elemento.charAt(0);
		if(caracter == '+' || caracter == '-'){
			return 1;
		}
		else if(caracter == '*' || caracter == '/'){
			return 2;
		}
		else if(caracter == '(' || caracter == ')'){
			return 0;
		}
		else{
			return 0;
		}
	}
	public static boolean esNumero(String elemento){
		char caracter = elemento.charAt(0);
		if(caracter < '0' || caracter > '9'){
			return false;
		}
		else{
			return true;
		}
	}

	public static boolean esSigno(String elemento){
		char caracter = elemento.charAt(0);
		if(caracter == '+' || caracter == '-' || caracter == '*' || caracter == '/'){
			return true;
		}
		else{
			return false;
		}
	}

	public static void push(String elemento){
		//System.out.println("Izquierdo"+indiceIzq);
		//System.out.println("Derecho"+indiceDer);
		if(indiceIzq <= indiceDer){
			pila[indiceIzq] = elemento;
			indiceIzq++;
		}
		else{
			System.out.println("Pila llena");
		}
	}

	public static void pushContrario(String elemento){
		if(indiceIzq <= indiceDer){
			pila[indiceDer] = elemento;
			indiceDer--;
		}
		else{
			System.out.println("Pila llena");
		}
	}

	public static String pop(){
		String elemento = "";
		if(indiceIzq > 0){
			indiceIzq--;
			elemento = pila[indiceIzq];
			pila[indiceIzq] = " ";
			return elemento;
		}
		else{
			System.out.println("Pila vacía");
			return " ";
		}
	}

	public static String popContrario(){
		String elemento = "";
		if(indiceDer < tamanioPila){
			indiceDer++;
			elemento = pila[indiceDer];
			pila[indiceDer] = " ";
			return elemento;
		}
		else{
			System.out.println("Pila vacía");
			return " ";
		}	
	}

	public static void mostrarPila(){
		for(int i=0 ; i < tamanioPila ; i++){
			System.out.print(pila[i] + "|");
		}
		System.out.println();
	}
}
