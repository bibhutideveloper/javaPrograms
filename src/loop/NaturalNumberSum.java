package loop;

public class NaturalNumberSum {

	public static void main(String[] args) {
		int sum = 0;		
		for(int i=1; i<=10; i++) {
			sum = sum+i;
		}
		System.out.println(sum);
		
		sum = 0;
		int i = 1;
		while(i<=10) {
			sum = sum+i; 
			i++;
		}
		System.out.println(sum);
	}

}
