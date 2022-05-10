
 import java.util.*;
public class oddlength 
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String arr[] = new String[n];

        for(int i=0;i<n;i++)
        arr[i]=sc.next();

        int len=0;
        ArrayList<String> oddlength=new ArrayList<String>();
        for (int i=0;i<n;i++)
        {
            len=arr[i].length();
            if(len%2==1)
            oddlength.add(arr[i]);

        }
        if(oddlength.size()==0)
           System.out.println("Better Luck Next time");
           
        else
        {
            iterator itr=oddlength.iterator();
            int max=-1;
            String res="";
            while(itr.hasNext())
            {
                String temp=(String)itr.Next();
                if(temp.length()>max) 
                {
                    res=temp;
                    max=temp.length();
                }
            }
            System.out.println(res);
        }
    }                  
}
