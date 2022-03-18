package dsa450.arrays;

public class One_RepeatAndMissingNumber_Array_1_N {

    public static void main(String[] args) {

    }

    // repeat is absIndex = abs(arr[i]) when arr[absIndex-1] < 0
    // missing is (1+1) when arr[i] > 0
    public void oneRepeatAndMissingNumber1_N_Array(int[] arr){
        int i =0;
        while(i < arr.length){

            int absIndex = Math.abs(arr[i]);

            if(arr[absIndex-1] > 0){
                arr[absIndex-1] = -arr[absIndex-1];
            }
            else{
                System.out.println("repeating element is: "+absIndex);
            }
            i++;
        }
        i = 0;
        while(i < arr.length)
        {
            if(arr[i] > 0)
            {
                System.out.println("missing element is: "+(i+1));
            }
            i++;
        }
    }
}
