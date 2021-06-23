import java.util.Scanner;

public class ContestStart {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		while(k-- > 0) {
			int N = sc.nextInt();
			int s = sc.nextInt();
			int t = sc.nextInt();
			int[] A  = new int[N];
			int x = 0;
			for(int i = 0; i < N; i++) {
				A[i] = x;
				x = (x+s)%1000000007;
			}
			int[] B = new int[N];
			for(int i = 0; i < N; i++) {
				B[i] = (t + A[i])%1000000007;
			}
			long count = 0;
			for(int i = 0; i < N-1; i++) {
				long y = B[i];
				for(int j = i + 1; j < N; j++) {
					if(A[j] <= y)count++;
					else break;
				}
			}
			System.out.println(count);
		}
		sc.close();
	}

}

