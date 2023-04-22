public class forth 
{
    public static void main(String[] args) 
    {
        int arr[]={34,21,54,65,43};
        int max =arr[0];
        int maxindex=0;
        int secmax=arr[0];
        int i;
        for( i =0;i<arr.length;i++)
        {
            if(arr[i]>max)
            {
                max = arr[i];
                maxindex=i;
                
            }
           
            

        }
        arr[maxindex]=-1;
         

       
        i=0;
        for( i=0;i<arr.length;i++)
        {
            if(arr[i]>secmax)
            {
                secmax=arr[i];
            }
        }
System.out.println(" The second maximum element is "+ secmax);





    }
    
}
