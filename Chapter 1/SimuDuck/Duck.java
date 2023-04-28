class Duck {
    
    IFlyBehaviour flyBehaviour;
    IQuackBehaiour quackBehaiour;


    public void swim() {

        System.out.println("Swiming");

    }

    public void display() {
        System.out.println("This is a Duck shape");
    }

    public void performFly() {
        flyBehaviour.fly();
    }

    public void performQuack() {
        quackBehaiour.quack();
    }

    public void setFly() {

    }

    public void setQuack() {

    }
}