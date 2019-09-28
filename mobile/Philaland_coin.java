
import java.util.Scanner;


 class Price {
	public static void main(String[] args) {
		int t,n,i,j,sum;
		Scanner sc=new Scanner(System.in);
		t=sc.nextInt();
		for(i=0;i<t;i++)
		{
			n=sc.nextInt();
			int add=4*2*n+1;
			Double add1=Math.sqrt(add);
			add1=add1-1;
			  add1=add1/2; 
			    	
			    	
			//System.out.println(add1);
			
			 
			// System.out.println(add1);
			System.out.println((int)Math.ceil(add1));
			
		}
	}

}
