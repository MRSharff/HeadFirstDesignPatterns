package dev.msharff.simuduck;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("Flap Flap Flap");
    }
}