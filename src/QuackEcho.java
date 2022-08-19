public class QuackEcho implements Quackable{
    private Quackable duck;

    static int numberOfEchos;

    public QuackEcho(Quackable duck) {
        this.duck = duck;
    }

    @Override
    public void quack() {
        duck.quack();
        numberOfEchos++;
    }

    public static int getNumberOfEchos() {
        return numberOfEchos;
    }
}
