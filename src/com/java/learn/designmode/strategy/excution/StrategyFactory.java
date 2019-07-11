package com.java.learn.designmode.strategy.excution;

import com.java.learn.designmode.strategy.Strategy;
import com.java.learn.designmode.strategy.Strategy1;
import com.java.learn.designmode.strategy.Strategy2;

import java.util.HashMap;
import java.util.Map;

/**
 * 策略工厂角色，管理策略
 */
public class StrategyFactory {

    private Map<String, Strategy> strategys = new HashMap<>();

    public void put(String key, Strategy strategy) {
        strategys.put(key,strategy);
    }

    public Strategy get(String key) {
       return strategys.get(key);
    }

    //调用策略
    public void test(String key) {
        get(key).hello();
    }

    public static void main(String[] args) {
        StrategyFactory strategyFactory = new StrategyFactory();
        strategyFactory.put("1", new Strategy1());
        strategyFactory.put("2", new Strategy2());

        strategyFactory.test("2");
    }
}
