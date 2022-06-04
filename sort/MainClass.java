package sort;
import java.util.Scanner;
public class MainClass {
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		System.out.println("Enter array size:");
		int length = input.nextInt();
		int[] array = new int[length];
		for (int i =0; i<array.length; i++) {
			array[i] = input.nextInt();
		}
		input.close();
		Sort obj = new Sort(array);
		int[] sortedArray = obj.sortedArray();
		for (int i =0; i<sortedArray.length; i++) {
			System.out.print(sortedArray[i]+" ");
		}
	}
}