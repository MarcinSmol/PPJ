package ppj.git;

public class Main {

	public static void main(String[] args) {

		int tab[][];

		tab = new int[10][];
		for (int i = 0; i < tab.length; i++) {
			tab[i] = new int[i];
		}
		for (int i = 0; i < tab.length; i++) {
			for (int j = 0; j < tab[i].length; j++)
				tab[i][j] = j + 1;
			i++;
		}
		for (int i = 0; i < tab.length; i++) {
			for (int j = 0; j < tab[i].length; j++)

				System.out.print(" " + tab[i][j]);
			System.out.println();
		}
	}
}