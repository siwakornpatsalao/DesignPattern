public class QuackCounter implements Quackable{
     private Quackable duck;
     static int numberOfQuacks;

     public QuackCounter (Quackable duck) {
         this.duck = duck;
     }

     public void quack() {
         duck.quack();
         numberOfQuacks++;
     }

     public static int getQuacks() {
         return numberOfQuacks;
     }
}
