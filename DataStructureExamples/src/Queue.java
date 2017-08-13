

	/**
	 * 
	 * This is a linkedList based implementation of a Queue 
	 * Head node is the data which has been in the queue for the longest time.
	 * 
	 * This is a non synchronized implementation - hence external usages would need to 
	 * implement synchronization
	 * @author tkmaov1
	 *
	 */
	public class Queue extends AbstractDataStructure {
		
		Node head;
		
		Queue()
		{
			head = new Node();
		}

		@Override
		protected void pushData(int nextData) {
			Node temp = head;
			
			int timeComplexity = 1;
			
			while(temp.next != null)
			{
				timeComplexity++;
				temp = temp.next;
				
			}
			
			Node next = new Node();
			next.setValue(nextData);
			next.setNextNode(null);
			
			temp.setNextNode(next);
						
			System.out.println("Insertion success\n Time taken to insert == "+timeComplexity);
			
		}

		@Override
		protected int popData() {
			
			int popValue = head.value;
			head = head.next;
			
			return popValue;
		}

		/* (non-Javadoc)
		 * 
		 * Returns searched element if success or -1 if unsuccessful
		 * @see BasicDataStructureTest.AbstractDataStructure#searchData(int)
		 */
		@Override
		protected int searchData(int search) {
			Node temp = head;
			int timeComplexity = 0;
			boolean searched = false;
			
			while(temp != null)
			{
				timeComplexity++;
				if(temp.value == search)
				{
					searched = true;
					System.out.println("Search success\n Time taken to search == "+timeComplexity);
					break;
				}
				temp = temp.next;
			}
			
			if(searched)
			{
				return search;
			}
			else{
				return -1;
			}
		}

		@Override
		protected void inOrderList() {
			Node temp = head;
			
			System.out.println("In order Data ==");
			
			while(temp != null)
			{
				System.out.print(", "+temp.value);
				temp = temp.next;
			}
			
		}
		
	}
