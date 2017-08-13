import java.util.Scanner;


public class BasicDataStructureTest {
	
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		AbstractDataStructure dataStructure = null;
		System.out.println("Which Data Structure you want to test?\n");
		
		System.out.println("1. Queues\n");
		System.out.println("2. Priority Queue\n");
		System.out.println("3. Binary Search Tree\n");
		
		int choice = scan.nextInt(); 
		
		
		
		switch(choice){
		case 1:		
			dataStructure = new Queue();
			break;
		case 2:
			break;
		case 3:
			break;
		}
		char ch;
		
		do {
			
			System.out.println("1. Insert Data\n");
			System.out.println("2. Delete Data\n");
			System.out.println("3. Search Data\n");
			int nextChoice = scan.nextInt(); 
			switch (nextChoice)
            {
            case 1 : 
                System.out.println("Enter integer element to insert");
                dataStructure.pushData( scan.nextInt() );                     
                break;                          
            case 2 : 
                System.out.println("The oldest element will be deleted == "+dataStructure.popData());
                break;                         
            case 3 : 
                System.out.println("Enter integer element to search");
                System.out.println("Search result : "+ dataStructure.searchData( scan.nextInt() ));
                break;  
            }
			
			dataStructure.inOrderList();
			
            System.out.println("\nDo you want to continue (Type y or n) \n");
            ch = scan.next().charAt(0);   
		}while(ch =='y' || ch =='Y');
		
		
	}
	
}
