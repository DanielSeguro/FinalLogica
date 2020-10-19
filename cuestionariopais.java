
public class cuestionariopais {
    public static gran_Breta() {
        int puntaje = 0;
        Banderas.gran_Breta();
        Ascii.capital();
        System.out.print("Su respuesta es: ");
        String respuesta = ConsoleInput.getString();
        String capital = "LONDRES";
        respuesta = respuesta.toUpperCase();
        if (respuesta.equals(capital)) {
          Ascii.acertaste();
          puntaje = puntaje + 300;
        } else {
          Ascii.fallaste();
          System.out.println("Respuesta correcta: " + capital);
        }
        return puntaje;
    
        Ascii.idioma();
        System.out.print("Su respuesta es: ");
        String respuesta1 = ConsoleInput.getString();
        String idioma = "INGLES";
        respuesta1 = respuesta1.toUpperCase();
        if (respuesta1.equals(idioma)) {
          Ascii.acertaste();
        } else {
          Ascii.fallaste();
          System.out.println("Respuesta correcta: " + idioma);
        }
    
        Ascii.continente();
        System.out.print("Su respuesta es: ");
        String respuesta2 = ConsoleInput.getString();
        String continente = "EUROPA";
        respuesta2 = respuesta2.toUpperCase();
        if (respuesta2.equals(continente)) {
          Ascii.acertaste();
        } else {
          Ascii.fallaste();
          System.out.println("Respuesta correcta: " + idioma);
        }
    
      }
    
      public static void colombia() {
        Banderas.colombia();
        Ascii.capital();
        System.out.print("Su respuesta es: ");
        String respuesta = ConsoleInput.getString();
        String capital = "BOGOTA";
        respuesta = respuesta.toUpperCase();
        if (respuesta.equals(capital)) {
          Ascii.acertaste();
        } else {
          Ascii.fallaste();
          System.out.println("Respuesta correcta: " + capital);
          System.out.println("Respuesta correcta: " + puntaje);
        }
      }
    
      public static void peru() {
        Banderas.peru();
        Ascii.capital();
        System.out.print("Su respuesta es: ");
        String respuesta = ConsoleInput.getString();
        String capital = "LIMA";
        respuesta = respuesta.toUpperCase();
        if (respuesta.equals(capital)) {
          Ascii.acertaste();
        } else {
          Ascii.fallaste();
          System.out.println("Respuesta correcta: " + capital);
        }
    
      }
    
      public static void polonia() {
        Banderas.polonia();
        Ascii.capital();
        System.out.print("Su respuesta es: ");
        String respuesta = ConsoleInput.getString();
        String capital = "VARSOVIA";
        respuesta = respuesta.toUpperCase();
        if (respuesta.equals(capital)) {
          Ascii.acertaste();
        } else {
          Ascii.fallaste();
          System.out.println("Respuesta correcta: " + capital);
        }
      }
    
      public static void indonesia() {
          
      }
    
      public static void italia() {
    
      }
    
      public static void nigeria() {
    
      }
    
      public static void noruega() {
    
      }
    
      public static void isla_pascua() {
    
      }
    
      public static void romania() {
    
      }
    
      public static void alemania() {
    
      }
    
      public static void japon() {
    
      }
    
      public static void aland() {
    
      }
    
      public static void corea_sur() {
    
      }
    
      public static void seychelles() {
    
      }
    
      public static void gibraltar() {
    
      }
    
      public static void siria() {
    
      }
    
      public static void rep_checa() {
    
      }
    
      public static void libano() {
    
      }
    
      public static void escocia() {
    
      }
    
      public static void cuba() {
    
      }
    
      public static void rusia() {
    
      }
    
      public static void sri_lanka() {
    
      }
    
      public static void gambia() {
    
      }
    
      public static void chile() {
    
      }
    }
  
}
