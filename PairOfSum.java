public class PairOfSum {
    boolean flag=false;
    void sum(int[] arr,int key){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
              if(key==(arr[i]+arr[j]))   
                flag=true;
            }
        }
    }
    
    public static void main(String[] args) {
        PairOfSum obj=new PairOfSum();
        int[] arr={5,2,6,8,1,9};
        int key=12;
        obj.sum(arr,key);
        if(obj.flag==true)
			System.out.println("Pair found");
        else
            System.out.println("Pair not found");
    }
}