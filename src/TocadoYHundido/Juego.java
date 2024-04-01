package TocadoYHundido;

import java.util.Scanner;
public class Juego {
    private Jugador jugador1;
    private Jugador jugador2;

    public Juego() {
        jugador1 = new Jugador();
        jugador2 = new Jugador();
    }

    public void iniciarJuego() {
        Scanner sc = new Scanner(System.in);
        // Configuracion INICIAL y COMIENZO DEL JUEGO
        //Colocar barcos
        System.out.println("Jugador 1, ingrese las coordenadas de tu barco");
        int coordenadaXJ1 = sc.nextInt();
        int coordenadaYJ1 = sc.nextInt();
        System.out.println("Jugador 2, ingresa las coordenadas de tu barco");
        int coordenadaXJ2 = sc.nextInt();
        int coordenadaYJ2 = sc.nextInt();
        System.out.println("Jugador 1, ingresa el nombre de barco: BattleShip, Frigate o Canoe");
        String barcoJ1 = sc.nextLine();
        sc.nextLine();
        //Si barcoJ1 es igual a "BattleShip", "Frigate" o "Canoe", añadir el barco correspondiente
        if (barcoJ1.equals("BattleShip")) {
            Battleship barco1 = new Battleship();
        }
        if (barcoJ1.equals("Frigate")) {
            Frigate barco1 = new Frigate();
        }
        if (barcoJ1.equals("Canoe")) {
            Canoe barco1 = new Canoe();
        }
        System.out.println("Jugador 2, ingresa el nombre de barco: BattleShip, Frigate o Canoe");
        String barcoJ2 = sc.nextLine();
        //Si barcoJ2 es igual a "BattleShip", "Frigate" o "Canoe", añadir el barco correspondiente
        if (barcoJ2.equals("BattleShip")) {
            Battleship barco2 = new Battleship();
        }
        if (barcoJ2.equals("Frigate")) {
            Frigate barco2 = new Frigate();
        }
        if (barcoJ2.equals("Canoe")) {
            Canoe barco2 = new Canoe();
        }
        //Imprimir tablero
        System.out.println("Tablero del jugador 1");
        Tablero tableroJ1 = new Tablero();
        tableroJ1.colocarBarco(coordenadaXJ1, coordenadaYJ1);
        tableroJ1.imprimirTablero();
        System.out.println("Tablero del jugador 2");
        Tablero tableroJ2 = new Tablero();
        tableroJ2.colocarBarco(coordenadaXJ2, coordenadaYJ2);
        tableroJ2.imprimirTablero();
        //Comienzan los disparos
        System.out.println("Comienza el juego");
        //Si no se hunde, bucle hasta que se hunda
        while (true) {
            System.out.println("Jugador 1, ingresa las coordenadas de tu disparo");
            int disparoXJ1 = sc.nextInt();
            int disparoYJ1 = sc.nextInt();
            //Disparar al tablero del jugador 2
            tableroJ2.recibirImpacto(disparoXJ1, disparoYJ1);
            //Se comprueba si el barco ha sido hundido
            if (tableroJ2.comprobarHundido(disparoXJ1, disparoYJ1)) {
                System.out.println("Barco hundido");
                System.out.println("Jugador 1 gana");
                menu();
            } else {
                System.out.println("Agua");
            }
            ;
            //Si el jugador 2 sigue vivo, turno del jugador 2
                System.out.println("Jugador 2, ingresa las coordenadas de tu disparo");
                int disparoXJ2 = sc.nextInt();
                int disparoYJ2 = sc.nextInt();
                //Disparar al tablero del jugador 1
                tableroJ1.recibirImpacto(disparoXJ2, disparoYJ2);
                //Se comprueba si el barco ha sido hundido
                if (tableroJ1.comprobarHundido(disparoXJ2, disparoYJ2)) {
                    System.out.println("Barco hundido");
                } else {
                    System.out.println("Agua");
                }
                //Si el jugador 1 sigue vivo, turno del jugador 1
            if(jugador1.estaVivo()){
                jugador1.disparar(jugador2);
            }
            //Si el jugador 2 sigue vivo, turno del jugador 2
            if(jugador2.estaVivo()){
                jugador2.disparar(jugador1);
            }




            //Si se hunde el barco del jugador 1, el jugador 2 gana
            if (!jugador1.estaVivo()) {
                System.out.println("Jugador 2 gana");
                break;
            }
            //Si se hunde el barco del jugador 2, el jugador 1 gana
            if (!jugador2.estaVivo()) {
                System.out.println("Jugador 1 gana");
                break;
            }
        }




    }
    public static void main (String[]args){
        Juego juego = new Juego();
        juego.iniciarJuego();
    }
    public void menu() {
        Scanner sc = new Scanner(System.in);
        System.out.println("¿Quieres jugar otra vez? S/N");
        String respuesta = sc.nextLine();
        if (respuesta.equals("S")) {
            iniciarJuego();
        } else {
            System.out.println("Gracias por jugar");
            sc.close();

        }
    }
}

