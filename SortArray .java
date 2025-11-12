// task5: Arrange all number of your array in asscending / desending order



import java.util.Arrays;

class SortArray 
{
    public static void main(String args[])
	 {
        int arr[] = {5, 2, 9, 1, 7};
        System.out.println("Original Array: " + Arrays.toString(arr));

        
        Arrays.sort(arr);
        System.out.println("Ascending Order: " + Arrays.toString(arr));

    
        System.out.print("Descending Order: [");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]);
            if (i != 0) System.out.print(", ");
        }
        System.out.println("]");
    }
}







