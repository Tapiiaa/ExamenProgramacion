package TocadoYHundido;
import java.util.*;

public class Jugador {
    private ArrayList<Barco> barcos;
    private boolean sigueVivo;

    public Jugador(){
        barcos = new ArrayList<Barco>();
        sigueVivo = true;
    }

    public void añadirBarco(Barco barco){
        barcos.add(barco);
    }

    public boolean estaVivo(){
        return sigueVivo;
    }
    // Metodo que recibe un disparo en una posicion con lo programado anteriormente

    public void disparar(Jugador jugador2){
        //Lógica para disparar al jugador del segundo parámetro
        Random random = new Random();
        int posicion = random.nextInt(100);
        jugador2.recibirAtaque(posicion);
    }

    private void recibirAtaque(int posicion) {
    }

}
