public class Kadane{

    // Printing the maximum Sum in contiguous sub array of arr[]
    public void algorithm(int [] arr, int size) {

        int gMax = arr[0];
        int curMax = arr[0];

        for (int i =1; i<size;i++) {
            // compare and update the cur arr ele and the curMax + a[i]
            curMax = Math.max(arr[i], curMax + arr[i]);
            // compare and update the gMax  with curMax
            gMax = Math.max(gMax, curMax);
        }

        System.out.println(gMax);
    }

    public void algoFindSubArray(int [] arr, int size){

        int gStart = 0,s = 0,
                end = 0,
                curMax = arr[0],
                gMax = arr[0];

        for (int i =1; i<size;i++) {
            curMax = curMax+arr[i];
            // if cur sum is greater than global sum then update the gMax
            // and update the global start and end of the sub array
            if(curMax > gMax) {
                gStart = s;
                end = i;
                gMax = curMax;

            }

            if(curMax < 0){
                curMax = 0;
                s = i+1; // if the cur sum is less than zero update the start index to cur ele plus one
            }
        }

        System.out.println("Start Index :" +gStart + "  End index: " + end);

    }
}

//Main Driver Program
//public class Main {
//    public static void main(String[] args) {
//
//        Kadane kadane = new Kadane();
//        int [] arr = {-1,-2,-3,-4};
//        int [] arr1 = { -2, -3, 4, -1, -2, 1, 5, -3 };
//        kadane.algorithm(arr,arr.length);
//        kadane.algoFindSubArray(arr1,arr1.length);
//    }
//}
