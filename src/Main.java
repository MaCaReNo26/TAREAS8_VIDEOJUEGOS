
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Juego> juegos = new ArrayList<>();
        String opcion1;
        do {
            System.out.println("\n----------|| SISTEMA DE JUEGOS ||----------");
            System.out.println("1. Registrar Mario Bros");
            System.out.println("2. Registrar Carrera de Vehiculos");
            System.out.println("3. Mostrar todos los juegos");
            System.out.println("4. Buscar juego por nombre");
            System.out.println("5. Filtrar por tipo");
            System.out.println("6. Salir");
            System.out.print("Ingrese una opcion: ");
            opcion1 = sc.nextLine();
            int opcion = Integer.parseInt(opcion1);
            try{
                switch(opcion) {
                    case 1:
                        try {
                            System.out.print("Nombre: ");
                            String n1 = sc.nextLine();
                            System.out.print("Dificultad: ");
                            String d1 = sc.nextLine();
                            System.out.print("Precio: ");
                            double p1 = sc.nextDouble();
                            System.out.print("Niveles: ");
                            int nivel = sc.nextInt();
                            System.out.print("Mundos: ");
                            int mundos = sc.nextInt();
                            sc.nextLine();
                            juegos.add(new MarioBros(n1, d1, p1, nivel, mundos));
                            System.out.println("Juego registrado correctamente.");
                        } catch (Exception e) {
                            System.out.println("Error: " + e.getMessage());
                            sc.nextLine();
                        }break;
                    case 2:
                        try {
                            System.out.print("Nombre: ");
                            String n2 = sc.nextLine();
                            System.out.print("Dificultad: ");
                            String d2 = sc.nextLine();
                            System.out.print("Precio: ");
                            double p2 = sc.nextDouble();
                            sc.nextLine();
                            System.out.print("Tipo Vehiculo: ");
                            String tipo = sc.nextLine();
                            System.out.print("Pistas: ");
                            int pistas = sc.nextInt();
                            sc.nextLine();
                            juegos.add(new CarreraVehiculos(n2, d2, p2, tipo, pistas));
                            System.out.println("Juego registrado correctamente.");
                        } catch (Exception e) {
                            System.out.println("Error: " + e.getMessage());
                            sc.nextLine();
                        }break;
                    case 3:
                        System.out.println("\n----------|| LISTA DE JUEGOS ||----------");
                        for (Juego j : juegos) {
                            System.out.println(j.mostrarInfo());
                        }break;
                    case 4:
                        System.out.print("Ingrese nombre a buscar: ");
                        String buscar = sc.nextLine();
                        System.out.println("Resultados:");
                        for (Juego j : juegos) {
                            if (j.getNombre().equalsIgnoreCase(buscar)) {
                                System.out.println(j.mostrarInfo());
                            }
                        }break;
                    case 5:
                        System.out.println("1. Mario Bros");
                        System.out.println("2. Carrera Vehiculos");
                        System.out.print("Selecciona: ");
                        int t = sc.nextInt();
                        sc.nextLine();
                        for (Juego j : juegos) {
                            if (t == 1 && j instanceof MarioBros)
                                System.out.println(j.mostrarInfo());
                            if (t == 2 && j instanceof CarreraVehiculos)
                                System.out.println(j.mostrarInfo());
                        }break;
                    case 6:
                        System.out.println("Saliendo...");
                        break;
                    default:
                        System.out.println("OPCION INVALIDA");
                }
            }catch(NumberFormatException e){
                System.out.println("Ingrese una opcion valida");
            }
        } while (Integer.parseInt(opcion1)!= 6);
    }
}
