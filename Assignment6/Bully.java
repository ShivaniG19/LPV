
import java.util.Scanner;
public class Bully {

    static int n=5;
	static int arr[]=new int[5];
	static boolean status[]=new boolean[5];
	static int priority[]=new int[5];
	
	public static void initialize() {
		for(int i=0;i<n;i++) {
			priority[i]=i;
			status[i]=true;
		}
	}
	
	public static void election() {
		System.out.println("Process 5 is Failed");
		status[4]=false;
		System.out.println("Election initiated by process 2");
		int ele =1;
		int cord;
		int temp= fetchmax(ele);
		if(ele==temp) {
			cord=ele+1;
		}
		else {
			cord=temp;
		}
		
		System.out.println("New leader is Process"+cord);
		for(int i=0;i<n;i++) {
			if(i!=cord) {
				System.out.println("coordinator msg from"+(cord)+"to "+(i+1));
			}
		}
	}
	public static int fetchmax(int ele) {
		int max=ele;
		for(int i=ele+1;i<n;i++) {
			System.out.println("election msg send from"+(ele+1)+"to"+(i+1));
			if(status[i]) {
				System.out.println("Ok from"+(i+1));
				if(priority[i]>priority[ele]) {
					max=i;
				}
			}
		}
		return max+1;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Bully.initialize();
		Bully.election();
		Bully.status[3]=false;
		Bully.election();
		
		

	}
}

