public class MissingNumber{

    public static void main(String[] args) {
        int[] arr={0,1,2,6,9,11,15};
        int a=arr[0];
        outer : for(int i=0;i<arr.length;i++){
            if(arr[i]!=a){
                System.out.println("The smallest missing element is "+a);
                break outer;
            }
            a++;
        }
    }
}