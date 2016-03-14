package singleton;

import java.util.Scanner;

public class IOTestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(IOTest.getInstance().getData());
		Scanner scanner = new Scanner(System.in);
		String str = scanner.next();
		IOTest.getInstance().setData(str);
		System.out.println(IOTest.getInstance().getData());
		scanner.close();
	}
}

