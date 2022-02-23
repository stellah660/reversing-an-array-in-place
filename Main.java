import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in =new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n=in.nextInt();
        int arr[]=new int[n];
        System.out.println("enter values of an array");
        for(int i=0;i < n;i++){
             arr[i]=in.nextInt();

        }
        int temp;
        int start=0;
        int end=n-1;
        while(start<end){
            temp=arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
        System.out.println("reversed array");
        for (int j=0;j< n;j++){
            System.out.println(arr[j]);

        }
    }
}
