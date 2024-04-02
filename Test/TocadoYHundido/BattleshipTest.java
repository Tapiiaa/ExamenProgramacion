package TocadoYHundido;

import org.junit.jupiter.api.Test;

class BattleshipTest {
    @Test
    //Test con los métodos de la clase Battleship
    void testBattleship() {
        Battleship battleship = new Battleship();
        battleship.recibirImpacto(1, 1);
    }


}