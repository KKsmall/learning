package com.java.learn.designmode.proxy.dynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 动态代理，实现invocationHandler接口
 */
public class ProxyHandler implements InvocationHandler {
    private Object realSubject;

    public ProxyHandler(Object realSubject) {
        this.realSubject = realSubject;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("====进入代理了====");
        method.invoke(realSubject, args);
        return null;
    }

    public static void main(String[] args) {
        ProxyHandler handler = new ProxyHandler(new RealSubject());
        Subject proxy = (Subject) Proxy.newProxyInstance(handler.getClass().getClassLoader(), new Class[]{Subject.class}, handler);
        proxy.say();
    }
}
