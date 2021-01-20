package FlyWeight;

public class ChessFactory {

    public Chess getChess(String type){
        if("w".equals(type)){
            return new WhiteChess();
        }else if("b".equals(type)){
            return new BlackChess();
        }else{
            return null;
        }
    }
}
