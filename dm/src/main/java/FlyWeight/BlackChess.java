package FlyWeight;

import java.awt.*;

public class BlackChess implements Chess {
    public void draw(Point point) {
        System.out.println("黑棋落子在，x="+point.x+",y="+point.y);
    }
}
