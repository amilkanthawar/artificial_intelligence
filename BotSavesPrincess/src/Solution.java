import java.util.Scanner;

public class Solution {
	static void displayPathtoPrincess(int n, String[] grid) {
		int princessLocation = findPrincessLocation(n, grid);

		if (princessLocation <= 2) {
			for (int i = 0; i < n / 2; i++) {
				System.out.println("LEFT");
			}
		} else {
			for (int i = 0; i < n / 2; i++) {
				System.out.println("RIGHT");
			}
		}

		if (princessLocation % 2 == 0) {
			for (int i = 0; i < n / 2; i++) {
				System.out.println("DOWN");
			}
		} else {
			for (int i = 0; i < n / 2; i++) {
				System.out.println("UP");
			}
		}

	}

	static int findPrincessLocation(int m, String[] grid) {

		if ("p".equals(grid[0].substring(0, 1))) {
			return 1;
		} else if ("p".equals(grid[m - 1].substring(0, 1))) {
			return 2;
		} else if ("p".equals(grid[0].substring(m - 1, m))) {
			return 3;
		} else if ("p".equals(grid[m - 1].substring(m - 1, m))) {
			return 4;
		}
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
