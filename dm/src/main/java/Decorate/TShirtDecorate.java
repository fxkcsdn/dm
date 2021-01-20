package Decorate;

public class TShirtDecorate extends DressDecorate {

    public TShirtDecorate(People people) {
        super(people);
    }

    @Override
    public void dress() {
        people.dress();
        System.out.println("开始穿短袖");
    }
}
