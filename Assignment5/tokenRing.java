import java.util.Scanner;

class TokenRing {
   public static void main(String arg[]) {
Scanner sc = new Scanner(System.in);
System.out.println("Enter number of process");
int n= sc.nextInt();
int t=0;
int ch=1;
int sender,reciver;
String message;
boolean msg_pass=false;
System.out.println("Intializing ring");

for(int i=0;i<n;i++) {
	System.out.print(" "+i+"->");
}
System.out.println();
System.out.println("Enter sender: ");
sender = sc.nextInt();
System.out.println("Enter Reciver: ");
reciver = sc.nextInt();
sc.nextLine();
System.out.println("Enter the message: ");
message= sc.nextLine();
for(t=0;t<n;t++) {
	System.out.println("Token at process"+t);
	if(t==sender) {
		System.out.println("Sender found");
		System.out.println("Attaching msg");
		msg_pass=true;
	}
	
	}
    
for(t=0;t<n;t++) {
	if(t==reciver) {
		System.out.println("Reciver found");
		System.out.println("Msg "+message+" is recived");
		msg_pass=false;
		
		
	}
	
	
}

	
	


}
