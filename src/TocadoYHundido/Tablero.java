package TocadoYHundido;

public class Tablero {
    //Clase para crear un tablero 10x10
    private int[][] tablero = new int[10][10];

    public Tablero(){
        //Constructor que inicializa el tablero con 0
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                tablero[i][j] = 0;
            }
        }
    }

    public void colocarBarco(int x, int y){
        //Metodo para colocar un barco en una posicion
        tablero[x][y] = 1;
    }

    public void recibirImpacto(int x, int y){
        //Metodo para recibir un impacto en una posicion
        if(tablero[x][y] == 1){
            tablero[x][y] = 2;
        }
    }

    //Imprime el tablero

    public void imprimirTablero(){
        for(int i = 0; i < 10; i++){
            for(int j = 0; j < 10; j++){
                System.out.print(tablero[i][j] + " ");
            }
            System.out.println();
        }
    }

    public boolean comprobarHundido(int disparoXJ1, int disparoYJ1) {
        return tablero[disparoXJ1][disparoYJ1] == 2;
    }
}
