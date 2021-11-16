import java.util.Arrays;
public class BubbleSort {
	int flag=0;
	// My Logic
    void bubbleSort(int[] arr){
     for(int i=0;i<arr.length-1;i++){
         for(int j=0;j<arr.length-1-i;j++){
             if(arr[j]>arr[j+1]){
				 flag++;
                 int temp=arr[j];
                 arr[j]=arr[j+1];
                 arr[j+1]=temp;
				}
			System.out.println(Arrays.toString(arr));
			}
			if(flag==0)
				break;
		}
	 System.out.println();
    }
	
	  
	
	void selectionSort(int[] arr){
		for(int i=0;i<arr.length-1;i++){ 
			int min=i;//i=0
			for(int j=i+1;j<arr.length;j++){
				if(arr[j]<arr[min])
					min=j;
			}
			int temp=arr[min];
			arr[min]=arr[i];
			arr[i]=temp;
		}
	}
	
	void insertionSort(int[] arr){
		for(int i=1;i<arr.length;i++){
			int key=arr[i];
			int j=i-1;
			while(j>=0 && arr[j]>key){
				arr[j+1]=arr[j];
				j=j-1;
			}
			arr[j+1]=key;
		}
	}
	
    public static void main(String[] args) {
        BubbleSort obj=new BubbleSort();
        int[] arr={3,5,8,4,1,9,-2};
		System.out.println("Before sorting");
		System.out.println(Arrays.toString(arr));
        obj.bubbleSort(arr);
        // obj.selectionSort(arr);
        // obj.insertionSort(arr);
		System.out.println("After sorting");
        System.out.println(Arrays.toString(arr));
    }
}

