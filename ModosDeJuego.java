public class ModosDeJuego{

  
	public static void juego1(){
		int puntuacion = 0;
		
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
    }
  }
    while (opcion != 26);
  }
  public static void juego3(){

      int opcion = 0;
      do {
      Ascii.paises();
      opcion = ConsoleInput.getInt();
      if (opcion == 1) {
        Banderas.gran_Breta();
      }
      else if (opcion == 2) {
        Banderas.colombia();
      }
      else if (opcion == 3) {
        Banderas.peru();
      }
      else if (opcion == 4) {
        Banderas.polonia();
      }
      else if (opcion == 5) {
        Banderas.indonesia();
      }
      else if (opcion == 6) {
        Banderas.italia();
      }
      else if (opcion == 7) {
        Banderas.nigeria();
      }
      else if (opcion == 8) {
        Banderas.noruega();
      }
      else if (opcion == 9) {
        Banderas.isla_pascua();
      }
      else if (opcion == 10) {
        Banderas.romania();
      }
      else if (opcion == 11) {
        Banderas.alemania();
      }
      else if (opcion == 12) {
        Banderas.japon();
      }
      else if (opcion == 13) {
        Banderas.aland();
      }
      else if (opcion == 14) {
        Banderas.corea_sur();
      }
      else if (opcion == 15) {
        Banderas.seychelles();
      }
      else if (opcion == 16) {
        Banderas.gibraltar();
      }
      else if (opcion == 17) {
        Banderas.siria();
      }
      else if (opcion == 18) {
        Banderas.rep_checa();
      }
      else if (opcion == 19) {
        Banderas.libano();
      }
      else if (opcion == 20) {
        Banderas.escocia();
      }
      else if (opcion == 21) {
        Banderas.cuba();
      }
      else if (opcion == 22) {
        Banderas.rusia();
      }
      else if (opcion == 23) {
        Banderas.sri_lanka();
      }
      else if (opcion == 24) {
        Banderas.gambia();
      }
      else if (opcion == 25) {
        Banderas.chile();}
        else if (opcion == 26) {
          
      }
      else {
        System.out.println("Ingrese opcion valida");
      }
    }while (opcion !=26);

}
  }


