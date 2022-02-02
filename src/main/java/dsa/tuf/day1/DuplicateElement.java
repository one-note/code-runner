package dsa.tuf.day1;

public class DuplicateElement {
    public static void main(String[] args) {
        int [] array = {2,3,5,4,1,3};
        int result = findDuplicateElement(array);
        System.out.println(result);
    }

    private static int findDuplicateElement(int[] array) {
        int slow = array[0];
        int fast = array[0];
        do {
            slow = array[slow];
            fast = array[array[fast]];
        }while (slow != fast);

        fast = array[0];
        while(slow != fast){
            slow = array[slow];
            fast = array[fast];
        }
        return fast;
    }
}
// time complexity o(N)
//space complexity o(1)
