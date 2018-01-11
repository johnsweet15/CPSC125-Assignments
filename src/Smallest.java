import java.util.Scanner;
public class Smallest {
	
	public static int getSmall(int a, int b, int c){
		int smallest = 0;
		if(a < b && a < c)
			smallest = a;
		if(b < a && b < c)
			smallest = b;
		if(c < a && c < b)
			smallest = c;
		return smallest;
	}
	
	public static void main(String[] args){
		Scanner kb = new Scanner(System.in);
		int in1 = kb.nextInt();
		int in2 = kb.nextInt();
		int in3 = kb.nextInt();
		
		int answer = getSmall(in1, in2, in3);
		System.out.println(answer);
	}
}
