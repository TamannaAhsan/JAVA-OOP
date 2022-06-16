import java.util.*;
public class ArrayList_UserInput {
	
	public static void main(String [] args) {
		Scanner sc = new Scanner (System.in);
		
		ArrayList<Integer> num = new ArrayList<>();
		int size;
		System.out.println("Enter Size: ");
		size = sc.nextInt();
		System.out.println("Enter Values: ");
		for(int i = 0; i<size; i++) {
			num.add(sc.nextInt());
		}
		for(int value: num) {
			System.out.print(value+" ");
		}
	}

}
