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

        for (int n = 21; n < 40; n++) {
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

        for (int n = 41; n < 60; n++) {
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

        for (int n = 61; n < 80; n++) {
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

        for (int n = 81; n < 100; n++) {
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

        for (int n = 101; n < 120; n++) {
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

        for (int n = 121; n < 140; n++) {
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

    public static void noruega() {
        String[] archivox = ConsoleFile.read("recursos/info_banderas.csv");

        for (int n = 141; n < 160; n++) {
            String[] archivo = archivox[n].split(";"); // Archivox es el documento sin comas
            for (int i = 0; i < archivo.length; i++) {
                switch (archivo[i]) {
                    case "1":
                        System.out.print(ConsoleColors.RED_BACKGROUND + "   ");
                        break;
                    case "3":
                        System.out.print(ConsoleColors.WHITE_BACKGROUND + "   ");
                        break;
                    case "2":
                        System.out.print(ConsoleColors.BLUE_BACKGROUND + "   ");
                        break;

                    default:
                        System.out.print("   ");
                }
                System.out.print(ConsoleColors.RESET);

            }
            System.out.println();
        }
    }

    public static void isla_pascua() {
        String[] archivox = ConsoleFile.read("recursos/info_banderas.csv");

        for (int n = 161; n < 180; n++) {
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

    public static void romania() {
        String[] archivox = ConsoleFile.read("recursos/info_banderas.csv");

        for (int n = 181; n < 200; n++) {
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

    public static void alemania() {
        String[] archivox = ConsoleFile.read("recursos/info_banderas.csv");

        for (int n = 201; n < 220; n++) {
            String[] archivo = archivox[n].split(";"); // Archivox es el documento sin comas
            for (int i = 0; i < archivo.length; i++) {
                switch (archivo[i]) {
                    case "1":
                        System.out.print(ConsoleColors.RED_BACKGROUND + "   ");
                        break;
                    case "8":
                        System.out.print(ConsoleColors.BLACK_BACKGROUND + "   ");
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

    public static void japon() {
        String[] archivox = ConsoleFile.read("recursos/info_banderas.csv");

        for (int n = 221; n < 240; n++) {
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

    public static void aland() {
        String[] archivox = ConsoleFile.read("recursos/info_banderas.csv");

        for (int n = 241; n < 260; n++) {
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

    public static void corea_sur() {
        String[] archivox = ConsoleFile.read("recursos/info_banderas.csv");

        for (int n = 261; n < 280; n++) {
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
                    case "8":
                        System.out.print(ConsoleColors.BLACK_BACKGROUND + "   ");
                        break;

                    default:
                        System.out.print("   ");
                }
                System.out.print(ConsoleColors.RESET);

            }
            System.out.println();
        }
    }

    public static void seychelles() {
        String[] archivox = ConsoleFile.read("recursos/info_banderas.csv");

        for (int n = 281; n < 300; n++) {
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
                    case "4":
                        System.out.print(ConsoleColors.YELLOW_BACKGROUND + "   ");
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

    public static void gibraltar() {
        String[] archivox = ConsoleFile.read("recursos/info_banderas.csv");

        for (int n = 301; n < 320; n++) {
            String[] archivo = archivox[n].split(";"); // Archivox es el documento sin comas
            for (int i = 0; i < archivo.length; i++) {
                switch (archivo[i]) {
                    case "1":
                        System.out.print(ConsoleColors.RED_BACKGROUND + "   ");
                        break;
                    case "3":
                        System.out.print(ConsoleColors.WHITE_BACKGROUND + "   ");
                        break;
                    case "4":
                        System.out.print(ConsoleColors.YELLOW_BACKGROUND + "   ");
                        break;
                    case "8":
                        System.out.print(ConsoleColors.BLACK_BACKGROUND + "   ");
                        break;

                    default:
                        System.out.print("   ");
                }
                System.out.print(ConsoleColors.RESET);

            }
            System.out.println();
        }
    }
    public static void siria() {
        String[] archivox = ConsoleFile.read("recursos/info_banderas.csv");

        for (int n = 321; n < 340; n++) {
            String[] archivo = archivox[n].split(";"); // Archivox es el documento sin comas
            for (int i = 0; i < archivo.length; i++) {
                switch (archivo[i]) {
                    case "1":
                        System.out.print(ConsoleColors.RED_BACKGROUND + "   ");
                        break;
                    case "3":
                        System.out.print(ConsoleColors.WHITE_BACKGROUND + "   ");
                        break;
                    case "8":
                        System.out.print(ConsoleColors.BLACK_BACKGROUND + "   ");
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
    public static void rep_checa() {
        String[] archivox = ConsoleFile.read("recursos/info_banderas.csv");

        for (int n = 341; n < 360; n++) {
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
    public static void libano() {
        String[] archivox = ConsoleFile.read("recursos/info_banderas.csv");

        for (int n = 361; n < 380; n++) {
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
    public static void escocia() {
        String[] archivox = ConsoleFile.read("recursos/info_banderas.csv");

        for (int n = 381; n < 400; n++) {
            String[] archivo = archivox[n].split(";"); // Archivox es el documento sin comas
            for (int i = 0; i < archivo.length; i++) {
                switch (archivo[i]) {
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
    public static void cuba() {
        String[] archivox = ConsoleFile.read("recursos/info_banderas.csv");

        for (int n = 401; n < 420; n++) {
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
    public static void rusia() {
        String[] archivox = ConsoleFile.read("recursos/info_banderas.csv");

        for (int n = 421; n < 440; n++) {
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
    public static void sri_lanka() {
        String[] archivox = ConsoleFile.read("recursos/info_banderas.csv");

        for (int n = 441; n < 460; n++) {
            String[] archivo = archivox[n].split(";"); // Archivox es el documento sin comas
            for (int i = 0; i < archivo.length; i++) {
                switch (archivo[i]) {
                    case "1":
                        System.out.print(ConsoleColors.RED_BACKGROUND + "   ");
                        break;
                    case "4":
                        System.out.print(ConsoleColors.YELLOW_BACKGROUND + "   ");
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
    public static void gambia() {
        String[] archivox = ConsoleFile.read("recursos/info_banderas.csv");

        for (int n = 461; n < 480; n++) {
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
    public static void chile() {
        String[] archivox = ConsoleFile.read("recursos/info_banderas.csv");

        for (int n = 481; n < 500; n++) {
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
    
}
