public class Duck implements CanFly, CanSwim, CanRun{

  @Override
  public void fly() {
    System.out.println("Утки умеют летать");
  }

  @Override
  public void swim() {
    System.out.println("Утки умеют плавать");
  }

  @Override
  public void run() {
    System.out.println("Утки умеют бегать, но очень плохо");
  }
}
