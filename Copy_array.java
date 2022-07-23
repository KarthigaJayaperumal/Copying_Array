package april_program;

public class Copy_array {

	public static void main(String[] args) {
		int[]A=new int[] {1,5,7,3,6};
		int[]B = new int[A.length];
		for(int i=0;i<A.length;i++) {
			B[i]=A[i];
		}
		System.out.println("Before Copying");
		for(int i=0;i<A.length;i++) {
			System.out.print(A[i]+"  ");
		}System.out.println();
		System.out.println("After Copying");
		for(int i=0;i<A.length;i++) {
			System.out.print(B[i]+"  ");	
		}

	}

}
