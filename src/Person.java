public class Person implements CanRun, CanSwim{

  @Override
  public void run(){
    System.out.println("Умеет бегать");
  }

  @Override
  public void swim(){
    System.out.println("умеет плавать");
  }
}
