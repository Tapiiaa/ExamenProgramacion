package TocadoYHundido;

public class Frigate extends Barco{
    public Frigate(){
        super(3);
    }

    public void recibirImpacto(){
        contadorImpactos++;
    }
}
