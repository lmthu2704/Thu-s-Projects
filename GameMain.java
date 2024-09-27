
import java.util.Scanner;

public class GameMain {
public static void main(String[]args) {
	Scanner sd = new Scanner(System.in);
	int [] PlayerA = {0,0,0,0};
	int [] PlayerB = {0,0,0,0};
	addNum(PlayerA,sd);
	
	
	addNum(PlayerB,sd);

	
	
	
	int command =0;
	while(command!=3) {
		System.out.println("Enter your command"+ "\n"+ "1. Compare numbers"+ "\n" + "2. Compare sum" +"\n"+"3. End game");
		
		command = sd.nextInt();
		
		switch(command) {
		case 1: enterIndex(PlayerA,PlayerB,sd); break;
		
		case 2: compareSum(PlayerA,PlayerB,sd); break;
		
		case 3: System.out.println("Thank you for playing");break;
			
		default: System.out.println("Please try again"); break;
		
		}
		
		
	}
	
	
	
	sd.close();
	
	
	
}


public static void compareSum(int [] array1, int [] array2, Scanner sd) {
	int sumSum =2;
	int index;
	int sum1=0;
	int sum2=0;
	
	
	System.out.println("Please enter indexes for the first player");
	for (int i = 0; i<sumSum;i++) {
		index = sd.nextInt()-1;
		sum1=sum1+ array1[index];
		
	}
	
	System.out.println("Please enter indexes for the second player");
	for (int i = 0; i<sumSum;i++) {
		index = sd.nextInt()-1;
		sum2=sum2+ array2[index];
		
	}
	
	compareNum(sum1,sum2);
	
	

}




public static void enterIndex(int [] array1, int [] array2, Scanner sd) {
	int a =0;
	int b =0; 
	
	System.out.println("Please enter first number's index");
	a =sd.nextInt()-1;
	System.out.println("Please enter second number's index");
	b = sd.nextInt()-1;
	
	a = array1[a];
	b = array2[b];
	
	compareNum(a,b);


}
	
	public static void compareNum(int a, int b) {
		
	
	if(a>b) {
		System.out.println("First one is greater.");
	}
	if(a<b) {
		System.out.println("Second one is greater");
	}
	if(a==b) {
		System.out.println("Both are equal");
	}
}

public static void addNum(int [] array, Scanner sd) {
	
	System.out.println("Please add your numbers");
	
	
	
	for(int i =0; i<array.length;i++) {
	
		array[i]=sd.nextInt();
		
		
	}
	
	for(int i =0;i<20;i++) {
		System.out.println("No peeking!");
	}
	
	
	
}



	
	
}
