import java.util.ArrayList;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        int n = in.nextInt();
        for (int i = 0; i < n; i++) {
            int a = in.nextInt();
            arr.add(a);
        }
        int m = in.nextInt();
        reverseArray(arr,m+1,arr.size()-1);
        System.out.println(arr);
    }
    public static void reverseArray(ArrayList<Integer> arr, int s,int e)
    {
       if(s>=e) return;
       int temp = arr.get(s);
       arr.set(s,arr.get(e));
       arr.set(e,temp);
       s++; e--;
       reverseArray(arr,s,e);
    }
}
