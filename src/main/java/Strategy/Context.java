package Strategy;

/**
 * Context上下文角色，也叫Context封装角色，起承上启下的作用，屏蔽高层模块对策略、算法的直接访问，封装可能存在的变化。
 */
public class Context {
    CashSuper cashSuper;
    public Context(CashSuper cashSuper){
        this.cashSuper=cashSuper;
    }
    public double getCash(double money){
        return cashSuper.computeMoney(money);
    }
}
