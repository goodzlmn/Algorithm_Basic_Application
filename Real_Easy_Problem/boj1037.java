package Real_Easy_Problem;

import java.util.*;

public class boj1037 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int num[] = new int[t];
		for(int i=0; i<t; i++) {
			num[i] = sc.nextInt();
		}
		Arrays.sort(num);
		System.out.println(num[0] * num[t-1]);
	}
}
