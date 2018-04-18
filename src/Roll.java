import java.util.Scanner;
import java.util.Random;
public class Roll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int Score=2;
		Random R=new Random();
		
Scanner V=new Scanner(System.in);
System.out.println("Do You want to roll?");
int O=V.nextInt();


if(O==1){
	
	int num=R.nextInt(6-1);
	
	System.out.println(num);
if(num>=2&&num<=6){
System.out.println(Score + num);	
	
}
else{
	
	System.out.println("You lose");
}
}
		
else if  (O==2){
	System.out.println(Score);
}
		
		
		
		
		
	}

}
