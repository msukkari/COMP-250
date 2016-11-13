package heap;

public class Heap {
	
	int[] array;
	int size = 0;
	
	Heap(int _size){
		this.array = new int[_size];
	}

	public void add(int e){
		size++;	
		array[size] = e;
		
		int i = size;
		
		while(i > 1 && array[i/2] > array[i]){
			int tmp = array[i];
			array[i] = array[i/2];
			array[i/2] = tmp;
			
			i = i/2;
		}
	}
	
	public int removeMin(){
		int min = array[1];
		
		if(size == 0){
			System.out.println("Heap does not contain any elements");
			return -1;
		}
		
		array[1] = array[size];
		array[size] = 0;
		size--;
		
		downHeap(1, size);
	
		return min;
	}
	
	public void downHeap(int start, int max){
		
		
		int i = start;
		while(2 * i <= max){
			int child = 2 * i;
			
			if(child < max){
				if(array[child] > array[child + 1]){
					child++;
				}
			}		
			
			if(array[i] > array[child]){
				int tmp = array[i];
				array[i] = array[child];
				array[child] = tmp;
				
				i = child;
			}
			else
				break;
			
		}
	
	}
	
	public void buildFromList(int[] list){
		for(int i : list){
			this.add(i);
		}
	}
}
 