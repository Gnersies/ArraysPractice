public class Tester_a {
	public static void main(String[] args) {
		int []a = {4,12,6,8,90,5,2,7};
		ArrayMethods_a l = new ArrayMethods_a(a);
		l.swapFirstAndLast();
		for (int n = 0; n < a.length; n++){
			System.out.print(a[n] + ", ");}
		System.out.println();
		l.shiftRight();
		for (int n = 0; n < a.length; n++){
			System.out.print(a[n] + ", ");}
		System.out.println();
		l.replaceEven();
		for (int n = 0; n < a.length; n++){
			System.out.print(a[n] + ", ");}
		System.out.println();
		l.replaceLarger();
		for (int n = 0; n < a.length; n++){
			System.out.print(a[n] + ", ");}
		System.out.println();
		l.removeMiddle();
		for (int n = 0; n < a.length; n++){
			System.out.print(a[n] + ", ");}
		System.out.println();
		l.moveEvenFront();
		for (int n = 0; n < a.length; n++){
			System.out.print(a[n] + ", ");}
		System.out.println( l.findSecondLargest());
		System.out.println( l.increasingOrder());
		System.out.println( l.adjacentDuplicate());
		System.out.println( l.duplicate());}}
