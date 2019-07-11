package com.java.learn.designmode.facade;

/**
 * 外观模式组件，外观构件（统一入口），子系统角色，客户端
 */
public class Facade {
    private System1 system1 = new System1();
    private System2 system2 = new System2();
    private System3 system3 = new System3();

    public void method() {
        system1.method();
        system2.method();
        system3.method();
    }

    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.method();
    }
}
