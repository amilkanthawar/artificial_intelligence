import java.util.Scanner;

public class Solution {
	static void displayPathtoPrincess(int n, String[] grid) {
		findPrincessLocation(n, grid);
	}

	static int findPrincessLocation(int m, String[] grid) {
		return 0;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int m;
		m = in.nextInt();
		String grid[] = new String[m];
		for (int i = 0; i < m; i++) {
			grid[i] = in.next();
		}

		displayPathtoPrincess(m, grid);
	}
}
