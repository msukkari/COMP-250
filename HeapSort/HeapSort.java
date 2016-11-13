package heap;

public class HeapSort {
	public static void main(String[] args) {
		Heap heap = new Heap(20);
		
		heap.buildFromList(new int[]{9, 12, 42, 5, 1, 6, 7, 99, 23, 41, 2});
		for(int i : heap.array){
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println(heap.size);

		
		heap.removeMin();
		for(int i : heap.array){
			System.out.print(i + " ");
		}
		System.out.println();
		
		printArr(heapSort(new int[]{9, 12, 42, 5, 1, 6, 7, 99, 23, 41, 2}));
	}
	
	public static int[] heapSort(int[] list){
		Heap heap = new Heap(list.length +1);
		
		heap.buildFromList(list);
		
		
		for(int i = 1; i < heap.size; i++){
			int tmp = heap.array[1];
			heap.array[1] = heap.array[heap.size + 1 - i];
			heap.array[heap.size + 1 - i] = tmp;
			
			heap.downHeap(1, heap.size - i);
		}
		
		
		return heap.array;
	}
	
	public static void printArr(int[] arr){
		for(int i : arr){
			System.out.print(i + " ");
		}	
		System.out.println("Array size: " + arr.length);
		
	}
}
