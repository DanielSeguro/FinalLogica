public class Banderas {

    public static void gran_Breta() {
        String[] archivox = ConsoleFile.read("recursos/info_banderas.csv");

        for (int n = 0; n < 20; n++) {
            String[] archivo = archivox[n].split(";"); // Archivox es el documento sin comas
            for (int i = 0; i < archivo.length; i++) {
                switch (archivo[i]) {
                    case "1":
                        System.out.print(ConsoleColors.RED_BACKGROUND + "   ");
                        break;
                    case "2":
                        System.out.print(ConsoleColors.BLUE_BACKGROUND + "   ");
                        break;
                    case "3":
                        System.out.print(ConsoleColors.WHITE_BACKGROUND + "   ");
                        break;
                    default:
                        System.out.print("   ");
                }
                System.out.print(ConsoleColors.RESET);

            }
            System.out.println();
        }
    }

    public static void colombia() {
        String[] archivox = ConsoleFile.read("recursos/info_banderas.csv");

        for (int n = 22; n < 40; n++) {
            String[] archivo = archivox[n].split(";"); // Archivox es el documento sin comas
            for (int i = 0; i < archivo.length; i++) {
                switch (archivo[i]) {
                    case "1":
                        System.out.print(ConsoleColors.RED_BACKGROUND + "   ");
                        break;
                    case "2":
                        System.out.print(ConsoleColors.BLUE_BACKGROUND + "   ");
                        break;
                    case "4":
                        System.out.print(ConsoleColors.YELLOW_BACKGROUND + "   ");
                        break;
                    default:
                        System.out.print("   ");
                }
                System.out.print(ConsoleColors.RESET);

            }
            System.out.println();
        }
    }

    public static void peru() {
        String[] archivox = ConsoleFile.read("recursos/info_banderas.csv");

        for (int n = 42; n < 60; n++) {
            String[] archivo = archivox[n].split(";"); // Archivox es el documento sin comas
            for (int i = 0; i < archivo.length; i++) {
                switch (archivo[i]) {
                    case "1":
                        System.out.print(ConsoleColors.RED_BACKGROUND + "   ");
                        break;
                    case "3":
                        System.out.print(ConsoleColors.WHITE_BACKGROUND + "   ");
                        break;

                    default:
                        System.out.print("   ");
                }
                System.out.print(ConsoleColors.RESET);

            }
            System.out.println();
        }
    }

    public static void polonia() {
        String[] archivox = ConsoleFile.read("recursos/info_banderas.csv");

        for (int n = 62; n < 80; n++) {
            String[] archivo = archivox[n].split(";"); // Archivox es el documento sin comas
            for (int i = 0; i < archivo.length; i++) {
                switch (archivo[i]) {
                    case "1":
                        System.out.print(ConsoleColors.RED_BACKGROUND + "   ");
                        break;
                    case "3":
                        System.out.print(ConsoleColors.WHITE_BACKGROUND + "   ");
                        break;

                    default:
                        System.out.print("   ");
                }
                System.out.print(ConsoleColors.RESET);

            }
            System.out.println();
        }
    }

    public static void indonesia() {
        String[] archivox = ConsoleFile.read("recursos/info_banderas.csv");

        for (int n = 82; n < 100; n++) {
            String[] archivo = archivox[n].split(";"); // Archivox es el documento sin comas
            for (int i = 0; i < archivo.length; i++) {
                switch (archivo[i]) {
                    case "1":
                        System.out.print(ConsoleColors.RED_BACKGROUND + "   ");
                        break;
                    case "3":
                        System.out.print(ConsoleColors.WHITE_BACKGROUND + "   ");
                        break;

                    default:
                        System.out.print("   ");
                }
                System.out.print(ConsoleColors.RESET);

            }
            System.out.println();
        }
    }

    public static void italia() {
        String[] archivox = ConsoleFile.read("recursos/info_banderas.csv");

        for (int n = 102; n < 120; n++) {
            String[] archivo = archivox[n].split(";"); // Archivox es el documento sin comas
            for (int i = 0; i < archivo.length; i++) {
                switch (archivo[i]) {
                    case "1":
                        System.out.print(ConsoleColors.RED_BACKGROUND + "   ");
                        break;
                    case "3":
                        System.out.print(ConsoleColors.WHITE_BACKGROUND + "   ");
                        break;
                    case "5":
                        System.out.print(ConsoleColors.GREEN_BACKGROUND + "   ");
                        break;

                    default:
                        System.out.print("   ");
                }
                System.out.print(ConsoleColors.RESET);

            }
            System.out.println();
        }
    }

    public static void nigeria() {
        String[] archivox = ConsoleFile.read("recursos/info_banderas.csv");

        for (int n = 122; n < 140; n++) {
            String[] archivo = archivox[n].split(";"); // Archivox es el documento sin comas
            for (int i = 0; i < archivo.length; i++) {
                switch (archivo[i]) {

                    case "3":
                        System.out.print(ConsoleColors.WHITE_BACKGROUND + "   ");
                        break;
                    case "5":
                        System.out.print(ConsoleColors.GREEN_BACKGROUND + "   ");
                        break;

                    default:
                        System.out.print("   ");
                }
                System.out.print(ConsoleColors.RESET);

            }
            System.out.println();
        }
    }

}