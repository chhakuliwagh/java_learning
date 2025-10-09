public class FactorialCalculator 
{
    public static void main(String[] args) 
{
        int num = 5; 
        long factorial = 1; 

        if (num < 0)
	 {
            System.out.println("Factorial is not defined for negative numbers.");
        }
 else if (num == 0)
	 {
            System.out.println("Factorial of 0 is 1.");
        } 
	else 
	{
            for (int i = 1; i <= num; i++) {
                factorial *= i;
            }
            System.out.println("Factorial of " + num + " is: " + factorial);
        }
    }
}