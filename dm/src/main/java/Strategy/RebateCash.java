package Strategy;

public class RebateCash implements CashSuper{

    double rebateRate;
    public RebateCash(double rebateRate){
        this.rebateRate=rebateRate;
    }

    public double computeMoney(double money) {
        return money*rebateRate;
    }
}
