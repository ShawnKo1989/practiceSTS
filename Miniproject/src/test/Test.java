package test;

public class Test {
	public static void main(String[] args) {
		int z = 1;
		for(int i = 1; i<=5; i++) {
			for(int j= z; j<=z+4; j++) {
				System.out.print(j);
			}
			z+=5;
			System.out.println();
		}
	}
}
