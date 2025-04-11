public class LeapYear
{
  public static void main(String[] args)
  {
    int n = 2024;

    if ((n % 4 == 0 && n % 100 != 0) || (n % 400 == 0)) 
    {
         System.out.println("It is a leap year.");
    } 
    else 
    {
         System.out.println("It is not a leap year.");
    }
    }
}
