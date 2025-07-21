class dec2d
{
    public static void main(String[] args)
    {
        int target = 5;
        int a [] = {1,2,3,4,5,6,7};
        for(int i = 0; i < a.length ; i++){
            for (int j = i+1; j<a.length ; j++){
                if(a[i]+a[j]==target){
                    System.out.print("[" + a[i] + "," + a[j] +"]");
                
                }
break;
            }
        }
    }
} 