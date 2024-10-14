public class P64PosNegAlter
{
    public static void main(String x[])
    {
       int a[]=new int[]{-4 ,8,-5 ,-6, 5 ,-9 ,7 ,1 ,-21 ,-11 ,19};
        int pos[]=new int [a.length];
        int neg[]=new int[a.length];
        int k=0,j=0;
        for(int i=0 ;i<a.length;i++)
        {
            if(a[i]>0)
            {
                pos[k++]=a[i];
            }
            else
            {
                neg[j++]=a[i];
            }
        }

        //rearrangement
        int n=0,m=0;
        for(int i=0;i<a.length;i++)
        {
            if(i%2==0 && neg[i]<0)
            {
                a[i]=neg[n++];
            }
            else if(  pos[i]>0)
            {
                a[i]=pos[m++];
            }
            else{
                a[i]=neg[n++];
            }
        }
       
       for(int i=0;i<a.length;i++)
       {
        System.out.print(a[i]+" ");
       }
    }
}