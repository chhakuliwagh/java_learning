/// String method
// concat()-it allow you to concat two string e.g s1="Hello" s2="Dipali"
// length=fine length of the string
// charAt(int argument): it will return character at specific index 
// substring: 
// equals()- compare the data within two string and return true-if both strings are equal,it return false-if both strings are not equal

class ConcatDemo
{
	public static void main(String args[])
	{
		String s1="Hello";
		String s2=" Dipali";

		System.out.println(s1.concat( s2));

		String s4="Welcom,Welcom";
	
		String s3=s1+s2;              // cancat using + operator  
		  
		System.out.println("Lenght of string: "+s3.length());              //Length

		System.out.println("Charcter at index 3: "+s3.charAt(4));          //character
	
		System.out.println("substring index 3 to 5: "+s3.substring(0,9));  //substring

		System.out.println("substring index 3 to 5: "+s3.substring(5));

		System.out.println("substring index 3 to 5: "+s3.substring(0));

		System.out.println("substring index 3 to 5: "+s3.indexOf("Hello"));  //indexOf

		System.out.println("substring index 3 to 5: "+s1.equals(s2));     //equal

		System.out.println("substring index 3 to 5: "+s4.equals("Welcom,Welcom"));

		System.out.println("substring index 3 to 5: "+s1.toUpperCase());   //uppercase

		System.out.println("substring index 3 to 5: "+s2.toLowerCase());  //lowercase

	}

}