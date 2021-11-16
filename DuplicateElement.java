public class DuplicateElement {
    int flag=0;
    void duplicate(int[] arr, int key){
        for(int i=0;i<arr.length;i++){
            if(key==arr[i])
                flag++;
        }
    }
    public static void main(String[] args) {
        DuplicateElement obj = new DuplicateElement();
        int[] arr={5,6,8,2,4,6,9};
        int key=4;
        obj.duplicate(arr,key);
        if(obj.flag>0)
            System.out.println("Duplicates found");
        else
            System.out.println("Duplicates not found");
    }
}