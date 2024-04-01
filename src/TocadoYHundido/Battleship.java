package TocadoYHundido;

public class Battleship extends Barco{

    public Battleship(){
        super(4);
    }

    @Override
    public void recibirImpacto(int x, int y){
        contadorImpactos++;
    }

}
