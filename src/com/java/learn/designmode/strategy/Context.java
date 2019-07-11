package com.java.learn.designmode.strategy;

/**
 * 环境类
 */
public class Context {

    private Strategy strategy;

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public void test() {
        strategy.hello();
    }

    public static void main(String[] args) {
        Context context = new Context();
        context.setStrategy(new Strategy1());
        context.test();
    }
}
