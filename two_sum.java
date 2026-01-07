import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        
        System.out.println("enter array size");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        System.out.println("enter target number");
        int target=sc.nextInt();

        boolean found=false;


        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    System.out.println("index:" +i+" "+j);
                    found=true;
                    break;
                }
            }
            if(found==true) break;

        }
        if(!found){
            System.out.println("no pair");
        }

    }
}
