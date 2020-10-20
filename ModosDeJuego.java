public class ModosDeJuego{

  
	public static void mainCuestionario{
		int puntuacion = 0;
		int acumulado = 0;


		int opcion = 0;
		do {
			Ascii.paises();
			opcion = ConsoleInput.getInt();
        switch (opcion) {
          case 1:
            puntuacion = cuestionariopais.gran_Breta(puntuacion);
            System.out.println("Tu puntaje acumulado es: "+puntuacion);
            break;
          case 2:
            puntuacion = cuestionariopais.colombia(puntuacion);
            System.out.println("Tu puntaje acumulado es: "+puntuacion);
            break;
          case 3:
            puntuacion = cuestionariopais.peru(puntuacion);
            System.out.println("Tu puntaje acumulado es: "+puntuacion);
            break;
          case 4:
            puntuacion = cuestionariopais.polonia(puntuacion);
            System.out.println("Tu puntaje acumulado es: "+puntuacion);
            break;
          case 5:
            puntuacion = cuestionariopais.indonesia(puntuacion);
            System.out.println("Tu puntaje acumulado es: "+puntuacion);
            break;
          case 6:
            puntuacion = cuestionariopais.italia(puntuacion);
            System.out.println("Tu puntaje acumulado es: "+puntuacion);
            break;
          case 7:
            puntuacion = cuestionariopais.nigeria(puntuacion);
            System.out.println("Tu puntaje acumulado es: "+puntuacion);
            break;
          case 8:
            puntuacion = cuestionariopais.noruega(puntuacion);
            System.out.println("Tu puntaje acumulado es: "+puntuacion);
            break;
          case 9:
            puntuacion = cuestionariopais.isla_pascua(puntuacion);
            System.out.println("Tu puntaje acumulado es: "+puntuacion);
            break;
          case 10:
            puntuacion = cuestionariopais.romania(puntuacion);
            System.out.println("Tu puntaje acumulado es: "+puntuacion);
            break;
          case 11:
            puntuacion = cuestionariopais.alemania(puntuacion);
            System.out.println("Tu puntaje acumulado es: "+puntuacion);
            break;
          case 12:
            puntuacion = cuestionariopais.japon(puntuacion);
            System.out.println("Tu puntaje acumulado es: "+puntuacion);
            break;
          case 13:
            puntuacion = cuestionariopais.aland(puntuacion);
            System.out.println("Tu puntaje acumulado es: "+puntuacion);
            break;
          case 14:
            puntuacion = cuestionariopais.corea_sur(puntuacion);
            System.out.println("Tu puntaje acumulado es: "+puntuacion);
            break;
          case 15:
            puntuacion = cuestionariopais.seychelles(puntuacion);
            System.out.println("Tu puntaje acumulado es: "+puntuacion);
            break;
          case 16:
            puntuacion = cuestionariopais.gibraltar(puntuacion);
            System.out.println("Tu puntaje acumulado es: "+puntuacion);
            break;
          case 17:
            puntuacion = cuestionariopais.siria(puntuacion);
            System.out.println("Tu puntaje acumulado es: "+puntuacion);
            break;
          case 18:
            puntuacion = cuestionariopais.rep_checa(puntuacion);
            System.out.println("Tu puntaje acumulado es: "+puntuacion);
            break;
          case 19:
            puntuacion = cuestionariopais.libano(puntuacion);
            System.out.println("Tu puntaje acumulado es: "+puntuacion);
            break;
          case 20:
            puntuacion = cuestionariopais.escocia(puntuacion);
            System.out.println("Tu puntaje acumulado es: "+puntuacion);
            break;
          case 21:
            puntuacion = cuestionariopais.cuba(puntuacion);
            System.out.println("Tu puntaje acumulado es: "+puntuacion);
            break;
          case 22:
            puntuacion = cuestionariopais.rusia(puntuacion);
            System.out.println("Tu puntaje acumulado es: "+puntuacion);
            break;
          case 23:
            puntuacion = cuestionariopais.sri_lanka(puntuacion);
            System.out.println("Tu puntaje acumulado es: "+puntuacion);
            break;
          case 24:
            puntuacion = cuestionariopais.gambia(puntuacion);
            System.out.println("Tu puntaje acumulado es: "+puntuacion);
            break;
          case 25:
            puntuacion = cuestionariopais.chile(puntuacion);
            System.out.println("Tu puntaje acumulado es: "+puntuacion);
            break;
            case 26:
            
            break;
          default:
            System.out.print("Elija opcion valida");
    }}
    while (opcion != 26);
  }


}