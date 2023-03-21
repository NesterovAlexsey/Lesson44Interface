//Задача 1
//Напишите интерфейсы "Умеет летать" CanFly с методом fly(), "Умеет бегать" CanRun с методом
// run и "умеет плавать" CanSwim с методом swim и реализуйте их в классе "Супермен" Superman.
//
//Задача 2
//    Реализуйте соответствующие интерфейсы из предыдущей задачи
//    в классах "Человек", "Утка", "Пингвин" и "Самолёт".
public class Superman implements CanFly, CanRun, CanSwim {

  @Override
  public void fly() {
    System.out.println("Умеет летать");
  }

  @Override
  public void run() {
    System.out.println("Умеет бегать");
  }

  @Override
  public void swim() {
    System.out.println("умеет плавать");
  }
}
