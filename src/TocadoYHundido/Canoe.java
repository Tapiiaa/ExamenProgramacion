package TocadoYHundido;

public class Canoe extends Barco{
    public Canoe(){
        super(1);
    }

    public void recibirImpacto(){
        contadorImpactos++;
    }
}
