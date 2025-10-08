// Logical/Binary Operators:- And (&&), Or(||), Not(!)   
// &&= t-t=t ,allcondition are false
// ||= if any one condition are true
// != t convert too f and f convert too t

class Logical
{
public static void main(String args[])
{
 int a=50,b=100;

 System.out.println("Logical And= "+((a<b)&&(a>b)));
System.out.println("Logical Or= "+((a<b)||(a>b)));
System.out.println("Logical Not= "+(!(a<b && a>b)));


}
}