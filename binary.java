public class binary
{
  public static void main(String [] args)
  {
     
  }
    int a[]={45,62,10,70,20};
    int low=0;
    int high=5-1;
    int mid;
    int key=10;
   while(low<=high)
   {
     mid=(low+high)/2;
     if(a[mid]==key)
          return 1;
     if(key<a[mid])
           high=mid-1;
     if(key>a[mid])
          low=mid+1;
    }
       
   
  }
}
