import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        String lowerA = a.toLowerCase();
        String lowerB = b.toLowerCase();
        
        
        if(a.length() == b.length()){
            int lettA[] = new int[a.length()];
            int lettB[] = new int[b.length()]; 
            
            for(int i=0; i < a.length(); i++){
                lettA[i] = lowerA.charAt(i);
                lettB[i] = lowerB.charAt(i);
            }
            
            int c[] = sort(lettA);
            int d[] = sort(lettB);
            
            for(int i = 0; i < c.length; i++){
                if(c[i] != d[i]) return false;
            }
            
            return true; 
        }
        
        else return false;
        
    }
    
    public static int[] sort(int arr[]){
        int temp = 0;
            for(int i = 0; i < arr.length; i++){
                for(int j = i + 1; j < arr.length; j++){
                    if(arr[i] > arr[j]){
                        temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
            
        return arr;
    }

  public static void main(String[] args) {
    
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
