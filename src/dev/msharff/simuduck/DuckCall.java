package dev.msharff.simuduck;

public class DuckCall {
    QuackBehavior quackBehavior;

    public DuckCall() {
        this.quackBehavior = new Quack();
    }

    public void performQuack() {
        this.quackBehavior.quack();
    }
}
