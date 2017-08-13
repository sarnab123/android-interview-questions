	public abstract class AbstractDataStructure {
		protected abstract void pushData(int nextData);
		protected abstract int popData();
		protected abstract int searchData(int search);
		
		protected abstract void inOrderList();
	}