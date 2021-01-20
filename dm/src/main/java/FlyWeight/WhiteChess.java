package FlyWeight;

import java.awt.*;

public class WhiteChess implements Chess {
    public void draw(Point point) {
        System.out.println("白棋落子在，x="+point.x+",y="+point.y);
    }
}
