package ppj.wynagrodzenie;

import java.util.Scanner;

public class Wynagrodzenie {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Wynagrodzenie godzinowe: ");
		short shrValue1 = Short.parseShort(in.next());
		System.out.println("Ilo�� godzin: ");
		short shrValue2 = Short.parseShort(in.next());
		in.close();

		if (shrValue2 > 40)
			System.out.printf("Nale�no��: %d", shrValue2 * (int) (shrValue1 * 1.5));
		else
			System.out.printf("Nale�no��: %d", shrValue1 * shrValue2);

	}
}