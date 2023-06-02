import java.util.Scanner;

public class Ring {
static int priority[]=new int[5];
	static boolean status[]= new boolean[5];
	static int n=5;
	static ArrayList <Integer> list = new ArrayList<Integer>();
    static void initalize() {
    	for(int i=0;i<n;i++) {
    		priority[i]=i;
    		status[i]=true;
    	}
    }
    static void election() {
    	System.out.println("Process 5 is failed");
    	status[4]=false;
    	System.out.println("Process 2 started election");
    	int ele=1;
    	int curr=ele+1;
    	list.add(priority[ele]);
    	
    	while(curr!=ele) {
    		
    		if(status[curr]) {
    			list.add(priority[curr]);
    			System.out.println("election msg from "+curr+"to"+((curr+1)%n));
    		}
    		
    		curr=(curr+1)%n;
    	}
    	 int leader =Collections.max(list);
    	 System.out.println("The new Leader is "+(leader+1));
    	
    }
   
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ring.initalize();
		Ring.election();

	}

}
