package javaTraining.Looping;

public class spiral {
    public static void main(String[] args) {
        int arr[] ={ 3,2,1,5,4,3,4,7};
int largest = arr[0];
int secondLargest = 0;

        for(int x: arr){
            if(x > largest){
                secondLargest = largest;
                largest = x;
            }
            else if(x > secondLargest && x != largest){
                secondLargest = x;
            }

        }
        System.out.println(secondLargest);
    }
}
