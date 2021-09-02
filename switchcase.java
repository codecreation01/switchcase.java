import java.util.scanner;
public class Decisionmaking
{
  public static void main(String[]args)
  {
    int input;
    system.out.println("enter your age:");
    Scanner s=new Scanner(System.in);
    input=s.nextInt();
    if(input>18)
    {
      System.out.println("you are eligible to vote:");
    }
    else if(input>20)
    {
      System.out.println("you are a major");
    }
  }
}
