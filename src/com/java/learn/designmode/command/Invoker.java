package com.java.learn.designmode.command;

/**
 * 调用者，调用命令
 */
public class Invoker {

    private Command command;

    public Invoker(Command command) {
        this.command = command;
    }

    public void invoke() {
        command.doit();
    }

    public static void main(String[] args) {
        Invoker invoker = new Invoker(new ConceretCommand(new Receiver()));
        invoker.invoke();
    }
}
