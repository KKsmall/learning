package com.java.learn.designmode.adapter.extension;

/**
 * 双向适配器
 */
public class AdapterDouble implements Adaptee, Target{

    private Adaptee adapteeReal;
    private Target targetReal;

    public AdapterDouble(Target targetReal) {
        this.targetReal = targetReal;
    }

    public AdapterDouble(Adaptee adapteeReal) {
        this.adapteeReal = adapteeReal;
    }

    @Override
    public void say() {
        targetReal.doIt();
    }

    @Override
    public void doIt() {
        adapteeReal.say();
    }

    public static void main(String[] args) {
        AdapterDouble adapterDouble = new AdapterDouble(new AdapteeReal());
        adapterDouble.doIt();
        AdapterDouble adapterDouble2 = new AdapterDouble(new TargetReal());
        adapterDouble2.say();
    }
}
