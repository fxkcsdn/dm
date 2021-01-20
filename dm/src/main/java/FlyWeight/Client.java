package FlyWeight;

import java.awt.*;

public class Client {
    public static void main(String[] args) {
        ChessFactory factory=new ChessFactory();
        Chess blackChess = factory.getChess("b");
        Chess whiteChess = factory.getChess("w");

        blackChess.draw(new Point(1,2));
        blackChess.draw(new Point(3,2));
        blackChess.draw(new Point(1,5));

        whiteChess.draw(new Point(1,2));
        whiteChess.draw(new Point(1,4));
        whiteChess.draw(new Point(1,2));
    }
}
