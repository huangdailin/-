package com.dailin.Strateg;

/**
 * 策略模式实现代码
 *
 * @author huangdailin on 2019/8/4 14:48
 * @version 1.0
 */
public class StrategyPattern {
    public static void main(String[] args) {
        Context c = new Context();
        Strategy s = new ConcreteStraegyA();
        c.setStrategy(s);
        c.straegyMethod();
        System.out.println("------------------");
        s = new ConcreteStraegyB();
        c.setStrategy(s);
        c.straegyMethod();
    }
}

//抽象策略类
interface Strategy{
    //策略方法
    public void strategyMethod();
}
//具体策略类A
class ConcreteStraegyA implements Strategy{
    @Override
    public void strategyMethod() {
        System.out.println("具体的策略A的策略方法被访问！");
    }
}
//具体的策略方法B
class ConcreteStraegyB implements Strategy{
    @Override
    public void strategyMethod() {
        System.out.println("具体的策略B的策略方法被访问！");
    }
}
class Context{
    private Strategy strategy;
    public Strategy getStrategy(){
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
    public void straegyMethod(){
        strategy.strategyMethod();
    }
}

