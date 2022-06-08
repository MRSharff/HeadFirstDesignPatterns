package dev.msharff.simuduck;

// TODO: Again, I don't think this should be a thing, like the FlyNoWay class.
public class MuteQuack implements QuackBehavior{
    @Override
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
