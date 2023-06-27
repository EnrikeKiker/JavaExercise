import java.util.Scanner;

public class JuegoEspiasEleccion{
    static String nombreDeJugador = "";
    static int limiteMental = 15;
    static int sigilo = 5;
    public static void main(String[] args) {
        inicioDelJuego();
    }

    public static void inicioDelJuego(){
        Scanner ingresarNombreDeJugador = new Scanner(System.in);
        Scanner opcionTecleada = new Scanner(System.in);
        int opcion = 0;
        System.out.println("-------------------------");
        System.out.println("|ABSOLUCION DE ESTOCOLMO|");
        System.out.println("-------------------------");
        System.out.println("Enter para iniciar");
        do{
            System.out.println("1. Jugar");
            System.out.println("2. Salir");
            System.out.print("Ingresa la opción: ");
            opcion = opcionTecleada.nextInt();
            if(opcion == 1){
                System.out.print("Bienvenido al juego de decisión\n");
                System.out.print("                   --Enter continuar\n");
                introduccionDelJuego();
                System.out.println();
                System.out.print("Por favor introduce el nombre de tu personaje: ");
                nombreDeJugador = "\""+ingresarNombreDeJugador.nextLine()+"\"";
                System.out.println();
                System.out.println("\nRecluta "+ nombreDeJugador +", has entrado a la \"Organización de Naciones para el Control de Incidencias\" (ONCI)\n");
                primerTrabajo();
                segundoTrabajo();
                
            }
            else if(opcion < 1 || opcion > 2){
                System.out.println("\nLa opción no es válida\n");
            }
        }while(opcion != 2);
    }

    private static void introduccionDelJuego(){
        Scanner enterParaContinuar = new Scanner(System.in);
        int totalDeParrafos = 3;
        String[] textoDeIntroduccion = new String[totalDeParrafos];

        textoDeIntroduccion[0] = "Hace mucho tiempo despues de la segunda disputa internacional, se creo una organización\n" +
                                "con el fin de mediar las relaciones entre los paises y evitar así una tercera disputa\n" +
                                "internacional, está organización era mejor conocida por sus siglas \"ONCI\" \n" +
                                "Organización de Naciones para el Control de Incidencias.\n" +
                                "                   --Enter para más\n";
        textoDeIntroduccion[1] = "Aunque había un problema en la organización por que se formo una organización secreta \n" +
                                "llamada \"La orden\" que quería tomar el poder para hacer un orden que era una dictadura,\n" +
                                "todo esto a base de engaños, asesinatos, entre otras actividades sin ética o moral.\n" +
                                "esta organización delictiva estaba formada por líderes del ONCI, ocultos a los demás.\n" +
                                "                   --Enter para más\n";
        textoDeIntroduccion[2] = "Por algunas sospechas de un líder de la ONCI llamado Gregory, contrato un espía de una\n" +
                                "organización de espionaje para que se infiltrará en la posible otra organización delictiva,\n" +
                                "por rumores quese oyen sobre que existe una organización que tiene actividades contrarias a\n" +
                                "las que busca ONCI\n" +
                                "                   --Enter para más\n";
        int finalDeTexto = 0;

        do {
            // Simulamos (presionar Enter) para ir desplegando el texto
            if(finalDeTexto < totalDeParrafos){
                String continuar = "";
                continuar = enterParaContinuar.nextLine();
            }
            System.out.print(textoDeIntroduccion[finalDeTexto]);
            finalDeTexto++;
        } while (finalDeTexto < totalDeParrafos);
    }

    private static void primerTrabajo(){
        Scanner opcionTecleada = new Scanner(System.in);
        int opcion = 0;
        System.out.println("Director Gregory: Agente "+nombreDeJugador+" tu primer trabajo es descubrir la organización y formar parte de ella.\n"+
                            "¡No hay más información encargate del resto!\n\n");
        System.out.println("Para poder descubrir la organización tienes las siguientes opciones:\n\n"+
                        "1. Ser sigiloso y espíar directamente a los líderes de la ONCI\n"+
                        "2. Interrogar un posible miembro\n");
        do{
            System.out.print("Número de la opción:   ");
            opcion = opcionTecleada.nextInt();
            if(opcion == 1){
                int tipoDeSigilo = serSigiloso();
                if(tipoDeSigilo == 1){
                    System.out.println();
                    System.out.println("Estas en unos baños, escondido en donde almacenan los articulos de aseo\n"+
                                    "líder Ruso Chompsky: Tenemos que silenciar a Michael White por qu esta hablando\n"+
                                    "demasiado, \"por el orden\". Sigue con tu trabajo de aseo y silencia a White.\n\n"+
                                    "De repente el mercenario que trabajaba con Chompsky, que hacia el aseo se dirigia\n"+
                                    "hacia el alamcen del aseo. Abre y mira que estas escondido.\n"+
                                    "Se preocupan y te silencian.");
                    finalDescubierto();
                }
                else if(tipoDeSigilo == 2){
                    System.out.println();
                    System.out.println("Estas camuflado de personal del aseo y llegas a espíar a los baños, aunque\n"+
                                    "encuentras a otro de personal del aseo, ambos empiezan a hacer el aseo independientemente\n"+
                                    "sin cruzar palabra alguna y constantemente entran distintas personas desde empleados hasta\n"+
                                    "hasta líderes de la ONCI, hubo dos líderes que hablaron con los del aseo, el líder Chompsky\n"+
                                    "que dijo: \"buen trabajo hasta el momento aunque hay algo sucio que deben limpiar\" y el líder\n"+
                                    "Meyer que dijo: \"se atasco el retrete, arreglarlo más tarde\", Ruso y Alemán respectivamente.");
                    System.out.println("Tu y tu compañero de aseo llamado \"Ray\", entablan una conversación sobre como dividirse y limpiar,\n"+
                                    "quejandose de lo duro que es trabajar por poca paga, entonces te ofrece un trabajo para poder\n"+
                                    "ganar dinero fácil, aunque con un riesgo alto, que solo es para algunos.");
                    System.out.println("¿Quieres trabajar para mí, si o no?\n"+
                                        "1. Si\n"+
                                        "2. No");
                    int eleccion = 0;
                    Scanner tomarEleccion = new Scanner(System.in);
                    System.out.print("Opción:   ");
                    eleccion =  tomarEleccion.nextInt();
                    if(eleccion == 1){
                        System.out.println();
                        System.out.println("Ray: Para poder ganarme tu confianza tienes que completar ciertos trabajos\n"+
                                        "Tu trabajo es: \n"+
                                        "Asesinar sin que te descubran a Michael White, cantante pop que era negro");
                        System.out.println("Tu no te inmutas, ya que es parte de tu trabajo como espía entrar a la organización\n"+
                                        "por lo que tienes que cumplir la misión");
                        int resultado = silenciarAWhite();
                        if(resultado == 1){
                            formarParteDeOrganizacion();
                        }
                        else if(resultado == 2){
                            System.out.println("Perfecto pero tienes que cumplir otra misión, antes de ganarme tu confianza.");
                            System.out.println("Tu siguiente trabajo es: ");
                            System.out.println("Amenazar anonimamente al director Meyer y Chompsky, para que desistan de promover la ley"+
                                                " de protección de testigos.");
                            int opcionAmenaza = amenazarDirectores();
                            if(opcionAmenaza == 1){
                                finalDescubierto();
                            }
                            else if(opcionAmenaza == 2){
                                formarParteDeOrganizacion();
                            }
                            else if(opcionAmenaza == 3){
                                nivelDeGolpiza();
                            }

                        }
                        else{
                            System.out.println("Error");
                        }
                    }
                    else if(eleccion == 2){
                        System.out.println();
                        System.out.println("Ray: No fue una buena desición espero que no hables de esto con nadie\n"+
                                        "Te investigan y como no hay registro sobre tí, sospechan");
                        finalDescubierto(); 
                    }

                }
                else if(tipoDeSigilo == 3){
                    System.out.println();
                    System.out.println("Te encuentras en un cuarto de un edificio en el piso 50, con un monocular con oído biónico\n"+
                                    "para poder escuchar conversaciones a la distancia, no descubres nada reelevante.");
                    sinFinal();
                }

                opcion = -154986;
            }
            else if (opcion == 2){
                interrogar();
                opcion  = -154986;
            }
            else if(opcion < 1 || opcion > 2){
                System.out.println("Error: ingresa una opción válida");
            }
        }while(opcion != -154986);

    }

    private static void segundoTrabajo(){

    }


    private static void finalDescubierto(){
        System.out.println("FUISTE DESCUBIERTO Y TE SILENCIAN\n");
        mostrarEstadisticas();
        System.out.println("___regresando al menú principal...\n");
    }

    private static void finalEstocolmo(){
        System.out.println("Empatizas con la causa de \"La orden\", entendiendo erroneamente que a veces tienes que hacer el mal para lograr exito");
        mostrarEstadisticas();
        System.out.println("___regresando al menú principal...\n");
    }

    private static void sinFinal(){
        System.out.println("Esta vez no hay un final empieza de nuevo");
        mostrarEstadisticas();
        System.out.println("___regresando al menú principal...\n");
    }

    private static int serSigiloso(){
        Scanner opcionTecleada = new Scanner(System.in);
        int opcion = 0;
        System.out.println();
        System.out.println("**Observas con el peligro de que te descubran\n");
        System.out.println("1. Observar desde un escondite");
        System.out.println("2. Observar haciendote pasar por otra persona");
        System.out.println("3. Observas a una gran distancia");
        do{
            System.out.print("Número de la opción:   ");
            opcion = opcionTecleada.nextInt();
            if(opcion == 1){
                sigilo = sigilo + 2;
                opcion = -154986;
                return 1;
            }
            else if(opcion == 2){
                sigilo = sigilo + 3;
                opcion = -154986;
                return 2;
            }
            else if(opcion == 3){
                sigilo = sigilo + 1;
                opcion = -154986;
                return 0;
            }
            else if(opcion < 1 || opcion > 3){
                System.out.println("¡Por favor elige una opción disponible!");
            }
        }while(opcion != -154986);
        return 0;
    }

    private static void interrogar(){
        sinFinal();
    }

    private static int silenciarAWhite(){
        Scanner opcionTecleada = new Scanner(System.in);
        int opcion = 0;
        System.out.println("Al buscar y por fin lograr encontrate a solas con Michael White\n"+
                        "tienes que tomar una decisión\n");
        System.out.println("1. Silenciarlo");
        System.out.println("2. Secuestrarlo");
        System.out.println("3. Ofrecerle esconderse");
        do{
            System.out.print("Opción:  ");
            opcion = opcionTecleada.nextInt();
            if(opcion == 1){
                System.out.println("¡Has silenciado a Michael White!");
                limiteMental = limiteMental + 15;
                opcion = -154986;
                return 1;
            }
            else if(opcion == 2){
                System.out.println("Secuestras a Michael, hasta que descubras al líder de \"La orden\"");
                limiteMental = limiteMental + 5;
                opcion = -154986;
                return 2;
            }
            else if(opcion == 3){
                System.out.println("Hablas con Michael sobre que lo quieren silenciar y le ofreces desaparecer");
                System.out.println("Pero Michael al no creerte nada lo deja pasar y matan al imbecil"+
                                "Buscan pruebas de ti y...");
                finalDescubierto();
                limiteMental++;
                opcion = -154986;
                return 3;
            }
            else if(opcion < 1 || opcion > 3){
                System.out.println("Por favor elige una opción disponible");
            }
        }while(opcion != -154986);
        return 0;
    }

    private static int amenazarDirectores(){
        Scanner opcionTecleada = new Scanner(System.in);
        int opcion = 0;
        System.out.println("Para amenazar a los directores eliges: \n");
        System.out.println("1. Hacer una llamada telefonica de forma anonima");
        System.out.println("2. Mandar a un desconocido a amedrentarlos y amenazarlos");
        System.out.println("3. Mandar secuestrar y golpear alguno de sus familiares");
        do{
            System.out.print("Opción:  ");
            opcion = opcionTecleada.nextInt();
            if(opcion == 1){
                System.out.println("Con una voz falsa decides hablar con cada uno de los miembros directivos de la ONCI");
                sigilo = sigilo + 1;
                limiteMental = limiteMental + 5;
                opcion = -154986;
                return 1;
            }
            else if(opcion == 2){
                System.out.println("Contratas a un mercenario profesional, para amenazarlos en persona y funciona");
                sigilo = sigilo + 3;
                limiteMental = limiteMental + 10;
                opcion = -154986;
                return 2;
            }
            else if(opcion == 3){
                System.out.println("Decides secuestrar a un familiar de cada uno de los directivos");
                System.out.println("Golpeas a los familiares, para poder amenazar y asustar");
                sigilo = sigilo + 4;
                limiteMental = limiteMental + 20;
                opcion = -154986;
                return 3;
            }
            else if(opcion < 1 || opcion > 3){
                System.out.println("Por favor elige una opción disponible");
            }
        }while(opcion != -154986);
        return 0;
    }

    private static void nivelDeGolpiza(){
        Scanner opcionTecleada = new Scanner(System.in);
        int opcion = 0;
        System.out.println("Ahora para poder amenazar, tienes que tomar las siguientes desiciones: \n");
        System.out.println("1. Golpearlos para poder enviar fotos de ellos a su respectivo familiar, dejandolos libres");
        System.out.println("2. Cortarle el tipico dedo para enviarlo a su familiar, dejandolos libres");
        System.out.println("3. Golpear hasta la muerte para enviar fotos a sus familiares, matandolos");
        do{
            System.out.print("Opción:  ");
            opcion = opcionTecleada.nextInt();
            if(opcion == 1){
                System.out.println("Al dejarlos libres siguen tu rastro...");
                finalDescubierto();
                opcion = -154986;
            }
            else if(opcion == 2){
                System.out.println("Al dejarlos libres solo atrapan a quien contrataste y como es muy profesional, no habla de ti");
                formarParteDeOrganizacion();
                opcion = -154986;
            }
            else if(opcion == 3){
                System.out.println("Al matar otra persona, cumples con la misión, aunque con secuelas y algo de desconfianza de tu empleador");
                if(limiteMental >= 35){
                    System.out.println("Cumples con la misión, pero...");
                    finalEstocolmo();
                }
                else{
                    System.out.println("Logras cumplir con la misión");
                    formarParteDeOrganizacion();
                }
                opcion = -154986;
            }
            else if(opcion < 1 || opcion > 3){
                System.out.println("Por favor elige una opción disponible");
            }
        }while(opcion != -154986);
    }

    private static int formarParteDeOrganizacion(){
        System.out.println("Has formado parte de la organización");
        System.out.println("¡MISION CUMPLIDA!");
        mostrarEstadisticas();
        System.out.println("Continuará...");
        System.out.println("___regresando al menú principal...\n");
        return 0;
    }

    private static void mostrarEstadisticas(){
        System.out.println("Tu limite mental fue: "+limiteMental);
        System.out.println("Tu nivel de sigilo fue: "+sigilo);
    }
}
