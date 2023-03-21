public class Person implements CanRun, CanSwim{

  @Override
  public void run(){
    System.out.println("Люди умеют бегать");
  }

  @Override
  public void swim(){
    System.out.println("Люди умеют плавать");
  }
}
