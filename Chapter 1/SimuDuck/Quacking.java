class Quack implements IQuackBehaiour {
    public void quack() {
        System.out.println("Quack ... Quack");
    }
}

class Squeak implements IQuackBehaiour {
    public void quack() {
        System.out.println("Squeak ... Squeak");
    }
}

class MuteQuack implements IQuackBehaiour {
    public void quack() {
        System.out.println(" ... ");
    }
}