
package finallogicaprogramacion;

public class FinalLogicaProgramacion {

        public static void main(String[] args) {
                int i = 0;
                do {
               Ascii.menuprincipal();
               i=ConsoleInput.getInt();
               if (i==1){
                       ModosDeJuego.juego1();
               }
               else if (i==2){
                       adivinapais.adivina();
               }
               else if (i==3){
               ModosDeJuego.juego3();
        }
        else if (i==4){
                Ascii.agradecer();
         }
                }while (i !=4);
        }    
        }



  

