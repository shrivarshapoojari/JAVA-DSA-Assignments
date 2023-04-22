public class fifth 
{
    public static void main(String[] args) 
    {
        int i=0,j=0;
        int peak=0;
        int a[]={1,4,7,2,6,5};
        for(i=1;i<a.length;i++)
        {
            if((a[i]>a[i-1]) && (a[i]>a[i+1]))
            {
                peak=a[i];
                break;
            }

        }
        System.out.println(peak);
        
    }
    
}
