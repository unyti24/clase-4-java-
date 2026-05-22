import java.util.Scanner;

public class PetShop {

    static Scanner sc = new Scanner(System.in);

    static double total = 0;
    static String factura = "";

    public static void main(String[] args) {
        userName();
        opcionesMenu();
    }

    public static void userName() {

        System.out.println("\n==== ¡REGISTRATE PARA UNA MEJOR EXPERIENCIA! ==== \n");

        String nombreUsuario = iniciarSesion();

        mensajeBienvenida(nombreUsuario);
        mostrarMenu(nombreUsuario);
    }

    // METODO PARA INICIAR SESION
    public static String iniciarSesion() {

        System.out.println("--------- INGRESA TU NOMBRE : \n");

        String nombre = sc.nextLine();

        return nombre;
    }

    public static void mensajeBienvenida(String nombreUsuario) {

        System.out.println("==========================================");
        System.out.println("=== ¡Bienvenido " + nombreUsuario + "! ===");
        System.out.println("==========================================");
    }

    // MENÚ
    public static void mostrarMenu(String nombreUsuario) {

        System.out.println("\n========= MENÚ PET-SHOP =========\n");

        System.out.println("1. Productos");
        System.out.println("2. Servicios");
        System.out.println("3. Salir");
    }

    public static void opcionesMenu() {

        int opcion = sc.nextInt();

        switch (opcion) {

            case 1:
                productos();
                break;

            case 2:
                servicios();
                break;

            case 3:
                System.out.println("--- Saliendo del sistema...");
                break;

            default:
                System.out.println("Opción inválida");
        }
    }

    // MENÚ DE PRODUCTOS
    public static void productos() {

        int opcion = 0;

        while (opcion != 11) {

            System.out.println("\n========= SELECCIONE PRODUCTO =========\n");

            System.out.println("1. DogYurt - Chunky.                    | $ 15.000");
            System.out.println("2. Cama para mascotas.                  | $ 55.000");
            System.out.println("3. Shampoo para mascotas.               | $ 37.000");
            System.out.println("4. Correa de goma.                      | $ 70.000");
            System.out.println("5. Peine cerdas suaves.                 | $ 25.000");
            System.out.println("6. Alimento para perro - 5kg - WOW CAN. | $ 56.000");
            System.out.println("7. Alimento para gato - 3kg - Chunky.   | $ 33.000");
            System.out.println("8. Silla de ruedas.                     | $ 380.000");
            System.out.println("9. ------- SACAR FACTURA DE COMPRA");
            System.out.println("11. ------ REGRESAR A MENÚ PRINCIPAL");
            System.out.println("0. ------- SALIR");

            int opProducto = sc.nextInt();

            switch (opProducto) {

                case 1:

                    System.out.println("Has seleccionado DogYurt - Chunky.");

                    total += 15000;

                    factura += "DogYurt - Chunky.                    | $ 15.000\n";

                    break;

                case 2:

                    System.out.println("Has seleccionado Cama para mascotas.");

                    total += 55000;

                    factura += "Cama para mascotas.                  | $ 55.000\n";

                    break;

                case 3:

                    System.out.println("Has seleccionado Shampoo para mascotas.");

                    total += 37000;

                    factura += "Shampoo para mascotas.               | $ 37.000\n";

                    break;

                case 4:

                    System.out.println("Has seleccionado Correa de goma.");

                    total += 70000;

                    factura += "Correa de goma.                      | $ 70.000\n";

                    break;

                case 5:

                    System.out.println("Has seleccionado Peine cerdas suaves.");

                    total += 25000;

                    factura += "Peine cerdas suaves.                 | $ 25.000\n";

                    break;

                case 6:

                    System.out.println("Has seleccionado Alimento para perro - WOW CAN.");

                    total += 56000;

                    factura += "Alimento para perro - 5kg - WOW CAN. | $ 56.000\n";

                    break;

                case 7:

                    System.out.println("Has seleccionado Alimento para gato - Chunky.");

                    total += 33000;

                    factura += "Alimento para gato - 3kg - Chunky.   | $ 33.000\n";

                    break;

                case 8:

                    System.out.println("Has seleccionado Silla de ruedas.");

                    total += 380000;

                    factura += "Silla de ruedas.                     | $ 380.000\n";

                    break;

                case 9:

                    System.out.println("\n========================================================");

                    System.out.println(
                        "\n----------------- Baucher de Pet-Shop ------------------ \n"
                    );

                    System.out.println(factura);

                    System.out.println("Total de la compra: $" + total);

                    procesarPago();

                    return;

                case 11:

                    System.out.println("Regresando al menú principal...");

                    mostrarMenu("");

                    opcionesMenu();

                    return;

                case 0:

                    System.out.println("\nSaliendo de Pet-Shop...");

                    break;

                default:

                    System.out.println("Opción inválida.");
            }
        }
    }

    // MENÚ DE SERVICIOS
    public static void servicios() {

        System.out.println("========= SELECCIONE SERVICIO =========");

        System.out.println("1. Baño con espuma                       | $130.000");
        System.out.println("2. Paseo por 2 horas en el parque        | $280.000");
        System.out.println("3. Castrar a tu mascota                  | $450.000");
        System.out.println("4. Cita con psicólogo                    | $200.000");
        System.out.println("5. Cita con veterinario                  | $320.000");
        System.out.println("6. ------- REGRESAR A MENÚ PRINCIPAL");
        System.out.println("0. ------- SALIR");

        int opcionServicio = sc.nextInt();

        switch (opcionServicio) {

            case 1:

                System.out.println("\n=== HORARIOS DISPONIBLES ===");

                System.out.println("1. Lunes 8:00 AM");
                System.out.println("2. Martes 10:00 AM");
                System.out.println("3. Domingo 2:00 PM");

                int horarioBaño = sc.nextInt();

                switch (horarioBaño) {

                    case 1:

                        confirmarReserva(
                            "Baño con espuma",
                            "Lunes 8:00 AM"
                        );

                        break;

                    case 2:

                        confirmarReserva(
                            "Baño con espuma",
                            "Martes 10:00 AM"
                        );

                        break;

                    case 3:

                        confirmarReserva(
                            "Baño con espuma",
                            "Domingo 2:00 PM"
                        );

                        break;

                    default:

                        System.out.println("Horario inválido");
                }

                break;

            case 2:

                System.out.println("\n=== HORARIOS DISPONIBLES ===");

                System.out.println("1. Domingo 8:00 AM");
                System.out.println("2. Lunes 10:00 AM");
                System.out.println("3. Martes 2:00 PM");

                int horarioPaseo = sc.nextInt();

                switch (horarioPaseo) {

                    case 1:

                        confirmarReserva(
                            "Paseo por el parque",
                            "domingo 8:00 AM"
                        );

                        break;

                    case 2:

                        confirmarReserva(
                            "Paseo por el parque",
                            "lunes 10:00 AM"
                        );

                        break;

                    case 3:

                        confirmarReserva(
                            "Paseo por el parque",
                            "martes 2:00 PM"
                        );

                        break;

                    default:

                        System.out.println("Horario inválido");
                }

                break;

            case 3:

                System.out.println("\n=== HORARIOS DISPONIBLES ===");

                System.out.println("1. Viernes 8:00 AM");
                System.out.println("2. Sábado 10:00 AM");
                System.out.println("3. Jueves 2:00 PM");

                int horarioCastrar = sc.nextInt();

                switch (horarioCastrar) {

                    case 1:

                        confirmarReserva(
                            "Castrar a tu mascota",
                            "viernes 8:00 AM"
                        );

                        break;

                    case 2:

                        confirmarReserva(
                            "Castrar a tu mascota",
                            "sábado 10:00 AM"
                        );

                        break;

                    case 3:

                        confirmarReserva(
                            "Castrar a tu mascota",
                            "jueves 2:00 PM"
                        );

                        break;

                    default:

                        System.out.println("Horario inválido");
                }

                break;

            case 4:

                System.out.println("\n=== HORARIOS DISPONIBLES CON EL ETÓLOGO CANINO ===");

                System.out.println("1. Miércoles 3:30 PM");
                System.out.println("2. Jueves 2:00 PM");
                System.out.println("3. Viernes 5:30 PM");

                int citaPsicologo = sc.nextInt();

                switch (citaPsicologo) {

                    case 1:

                        confirmarReserva(
                            "Cita con etólogo canino",
                            "Miércoles 3:30 PM"
                        );

                        break;

                    case 2:

                        confirmarReserva(
                            "Cita con etólogo canino",
                            "Jueves 2:00 PM"
                        );

                        break;

                    case 3:

                        confirmarReserva(
                            "Cita con etólogo canino",
                            "Viernes 5:30 PM"
                        );

                        break;

                    default:

                        System.out.println("Horario inválido");
                }

                break;

            case 5:

                System.out.println("\n=== HORARIOS DISPONIBLES ===");

                System.out.println("1. Domingo 8:00 AM");
                System.out.println("2. Lunes 10:00 AM");
                System.out.println("3. Martes 2:00 PM");

                int horarioVeterinario = sc.nextInt();

                switch (horarioVeterinario) {

                    case 1:

                        confirmarReserva(
                            "Cita con veterinario",
                            "domingo 8:00 AM"
                        );

                        break;

                    case 2:

                        confirmarReserva(
                            "Cita con veterinario",
                            "lunes 10:00 AM"
                        );

                        break;

                    case 3:

                        confirmarReserva(
                            "Cita con veterinario",
                            "martes 2:00 PM"
                        );

                        break;

                    default:

                        System.out.println("Horario inválido");
                }

                break;

            case 6:

                System.out.println("Regresando al menú principal...");

                mostrarMenu("");

                opcionesMenu();

                return;

            case 0:

                System.out.println("\nSaliendo de Pet-Shop...");

                break;
        }
    }

    public static void confirmarReserva(String servicio, String horario) {

        System.out.println("\n==================================");
        System.out.println("       RESERVA CONFIRMADA");
        System.out.println("==================================");

        System.out.println("Servicio: " + servicio);
        System.out.println("Horario: " + horario);
        System.out.println("Estado: Confirmado");

        System.out.println("==================================");
    }

    public static void procesarPago() {

        double dineroRecibido = 0;
        double restante = total;

        System.out.println("\n==================================");
        System.out.println("           MÉTODO DE PAGO");
        System.out.println("==================================");

        System.out.println("Total a pagar: $" + total);

        // EL CICLO SE REPITE HASTA COMPLETAR EL PAGO
        while (dineroRecibido < total) {

            System.out.print("\nIngrese dinero: $");

            double pago = sc.nextDouble();

            dineroRecibido += pago;

            // VALIDAR SI AÚN FALTA DINERO
            if (dineroRecibido < total) {

                restante = total - dineroRecibido;

                System.out.println("\nDinero acumulado: $" + dineroRecibido);

                System.out.println("Aún faltan: $" + restante);
            }
        }

        // CALCULAR DEVUELTA
        double devuelta = dineroRecibido - total;

        System.out.println("\n==================================");
        System.out.println("          PAGO EXITOSO");
        System.out.println("==================================");

        System.out.println("Total de la compra : $" + total);
        System.out.println("Dinero recibido    : $" + dineroRecibido);
        System.out.println("Devuelta           : $" + devuelta);

        System.out.println("\n¡Gracias por tu compra!");
    }
}