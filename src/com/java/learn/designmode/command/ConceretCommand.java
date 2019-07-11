package com.java.learn.designmode.command;

/**
 * 具体命令
 */
public class ConceretCommand implements Command{

    private Receiver receiver;

    public ConceretCommand(Receiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void doit() {
        receiver.hello();
    }
}
