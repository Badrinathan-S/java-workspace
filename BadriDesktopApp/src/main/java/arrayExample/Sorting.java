package arrayExample;

public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("before print");
		SortingArray.addBegin(1);
		SortingArray.addEnd(2);
		SortingArray.addEnd(5);
		SortingArray.addEnd(3);
		SortingArray.addEnd(4);
		SortingArray.addEnd(7);
		SortingArray.addEnd(9);
		SortingArray.addEnd(6);
		SortingArray.addEnd(0);
		SortingArray.addEnd(8);
		SortingArray.ArrayPrint();
		System.out.println("After print");
//		SortingArray.bubbleSort();
//		SortingArray.selectionSort();
		SortingArray.quickSort();
		SortingArray.ArrayPrint();
		
	}

}

class SortingArray{
	private static Integer[] Arr = new Integer[10];
	public static void addBegin(Integer data) {
		if(Arr[0] == null) {
			Arr[0] = data;
		}
	}
	public static void addEnd(Integer data) {
		if(Arr[0] == null) {
			Arr[0] = data;
		}
		else {
			int i = 0;
			for(i=0;i<Arr.length;i++) {
				if(Arr[i] == null) {
					Arr[i] = data;
					return;
				}
			}
			if(i == Arr.length) {
				System.out.println("Array is full");
				return;
			}
		}
	}
	
	public static void ArrayPrint() {
		for(int i=0;i<Arr.length;i++) {
			System.out.print(Arr[i] + " ");
		}
		System.out.println();
	}
	
	public static void bubbleSort() {
		for(int i=0;i<Arr.length-1;i++) {
			for(int j=0;j<Arr.length-i-1;j++) {
//				System.out.print(j + " ");
				if(Arr[j]>Arr[j+1]) {
					Arr[j] = Arr[j] + Arr[j+1];
					Arr[j+1] = Arr[j] - Arr[j+1];
					Arr[j] = Arr[j] - Arr[j+1];
				}
			}
			System.out.println();
		}
	}
	
	public static void selectionSort() {
		for(int i=0;i<Arr.length;i++) {
			for(int j=i+1;j<Arr.length-1;j++) {
//				System.out.print(j+ " ");
				if(Arr[i]>Arr[j]) {
					Arr[i] = Arr[i] + Arr[j];
					Arr[j] = Arr[i] - Arr[j];
					Arr[i] = Arr[i] - Arr[j];
				}
			}
			System.out.println();
		}
	}
	
	public static void quickSort() {
		Integer start = 0, end = Arr.length - 1;
		quickque(start, end);
	}
	
	
	public static void quickque(int start, int end) {
		if(start<end) {
			Integer pivot = partition(start, end);
			quickque(start, pivot-1);
			quickque(pivot + 1, end);
		}
	}
	private static Integer partition(Integer start, Integer end) {
		Integer pivot = Arr[start];
		Integer initial = start + 1;
		
		for(int current = initial;current<=end;current++) {
			if(Arr[current] < pivot) {
				Arr[initial] = Arr[initial] + Arr[current];
				Arr[current] = Arr[initial] - Arr[current];
				Arr[initial] = Arr[initial] - Arr[current];
				initial += 1;
			}
		}
		Arr[initial] = Arr[initial] + Arr[start];
		Arr[start] = Arr[initial] - Arr[start];
		Arr[initial] = Arr[initial] - Arr[start];
		// TODO Auto-generated method stub
		return initial - 1;
	}
}



