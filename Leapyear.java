class Leapyear
{
  public static void main(String args[])
{
  int year=2022;
  if((year%4==0) && (year%100!=0) || (year%4000==0))

{
  System.out.println("Given Year is Leap year");
}
else
{
   System.out.println("Given Year is not Leap year");

}
 System.out.println("Rest of the code");
}

}