import java.util.Scanner;

public class Problem41 {

	public static void main(String[] args) {
		System.out.println("양수 5개를 입력하세요.");
		Scanner in = new Scanner(System.in);
		int intArray[] = new int[5];
		int max = 0;
		
		for (int i=0; i<intArray.length; i++){
			intArray[i] = in.nextInt();
			if(intArray[i] > max)
				max = intArray[i];
		}
		System.out.println("입력된 수에서 가장 큰 수는" + max + "입니다.");

	}

}
