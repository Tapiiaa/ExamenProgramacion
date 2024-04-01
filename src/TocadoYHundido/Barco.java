package TocadoYHundido;

public abstract  class Barco {
    private int tamaño;
    int contadorImpactos;

    public Barco(int tamaño){
        this.tamaño = tamaño;
        this.contadorImpactos = 0;
    }

    public boolean estaHundido(){
        return contadorImpactos >= tamaño;
    }

    public int getTamaño(){
        return tamaño;
    }

    public abstract void recibirImpacto(int x, int y);
}
