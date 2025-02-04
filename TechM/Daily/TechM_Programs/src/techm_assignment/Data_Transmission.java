package techm_assignment;
import java.util.*;

public class Data_Transmission {
		public static void main(String[] args) {
			
	     Scanner haha=new Scanner(System.in);
	     String s=haha.nextLine();
	     s=s.substring(0, s.length()-1);
	     String h[]=s.split("\\s+");
	     
	     List<Integer> n=new ArrayList<Integer>();
	     for(int i=0;i<h.length;i++)
	     {
	    	 int g=Integer.parseInt(h[i]);
	    	 if(isprime(g))
	    		 n.add(g);
	     }
	     Collections.sort(n);
	     int k=0;
	     if(n.size()>0 && n.size()>=2)
	    	 k=n.size()+n.get(n.size()-2);
	     System.out.println(k);
	     haha.close();
		}
	    public static boolean isprime(int n)
	    {
	    	if(n<=1)
	    		return false;
	    	for(int i=2;i<=n/2;i++)
	    	{
	    		if(n%i==0)
	    			return false;
	    	}
	    	return true;
	    }
}
