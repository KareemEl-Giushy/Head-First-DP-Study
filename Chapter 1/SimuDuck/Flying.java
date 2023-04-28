class FlyWithWings implements IFlyBehaviour {
    public void fly() {
        System.out.println("Flying With Wings");
    }
}

class FlyNoWay implements IFlyBehaviour {
    public void fly() {
        System.out.println("Sorry, I don't fly");
    }
}