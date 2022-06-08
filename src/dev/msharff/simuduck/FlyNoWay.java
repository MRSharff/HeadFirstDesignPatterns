package dev.msharff.simuduck;

// TODO: I honestly think this shouldn't be a thing. If it can't fly, it shouldn't implement fly.
public class FlyNoWay implements FlyBehavior {

    @Override
    public void fly() {
        System.out.println("Not Flying");
    }
}
