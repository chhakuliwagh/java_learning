class TestMutableDemo
{
	public static void main(String args[])
	{
		StringBuffer sb1 = new StringBuffer(10);

		sb1.append("welcome to fct dear all");

		System.out.println("Length: " + sb1.length());

		System.out.println("Reverse String: " + sb1.reverse());

		System.out.println("Character of specific index: " + sb1.charAt(5));

		sb1.setCharAt(5, 'X'); // Correct usage

		System.out.println("After setting char at index 5: " + sb1);

		System.out.println("After deleting char at index 5: " + sb1.deleteCharAt(5));

		System.out.println("Index of f: " + sb1.indexOf("f"));

		System.out.println("is Empty: " + sb1.isEmpty());

		System.out.println("hash code " + sb1.hashCode());

		System.out.println("Substring: " + sb1.substring(3,5));

		System.out.println("get class: " + sb1.getClass());





	}
}
