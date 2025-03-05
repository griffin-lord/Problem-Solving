public class teay{
  public static void main(String[]args){
    Cat c1= new Cat();
    c1.color="Red";
    c1.action="Sitting";
    Cat c2=new Cat();
    c2.color="Purple";
    c2.action="Sitting";
    System.out.println("c1========");
    c1.details();
    System.out.println("c2================");
    c2.details();
    c1.increaseDoor("Dancing");
    System.out.println("c1========");
    c1.details();
  }
}