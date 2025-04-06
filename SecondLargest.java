public class SecondLargest {
        public static int getSecondLargest(int[] a, int n){
        int temp;
        for (int i = 0; i < n; i++) 
                {
                    for (int j = i + 1; j < n; j++) 
                    {
                        if (a[i] > a[j]) 
                        {
                            temp = a[i];
                            a[i] = a[j];
                            a[j] = temp;
                        }
                    }
                }
               return a[n-2];
        }
        public static void main(String args[]){
        int a[]={1,2,5,6,3,2};
        int b[]={44,66,99,78,33,22,55};
        System.out.println("Second Largest: "+getSecondLargest(a,6));
        System.out.println("Second Largest: "+getSecondLargest(b,7));
    }
}        
