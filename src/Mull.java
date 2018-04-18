import java.util.Scanner;
public class Mull {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

int[] Num=new int[8];		
		
Scanner C=new Scanner(System.in);
System.out.println("Type eight numbers");
Num[0]=C.nextInt();
Num[1]=C.nextInt();
Num[2]=C.nextInt();
Num[3]=C.nextInt();		
Num[4]=C.nextInt();
Num[5]=C.nextInt();
Num[6]=C.nextInt();
Num[7]=C.nextInt();			
	
int multi;
for(int i=0;i<Num.length;i++){
multi=(Num[i]*5);	
	
System.out.println(multi);	
}


	}

}
