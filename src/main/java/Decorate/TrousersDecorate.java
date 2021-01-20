package Decorate;

public class TrousersDecorate extends DressDecorate {
    public TrousersDecorate(People people) {
        super(people);
    }

    @Override
    public void dress() {
        people.dress();
        System.out.println("开始穿裤子");
    }
}
