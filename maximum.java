import java.util.*;
class maximum {
    
public static void main(String args[])
       { 
    Scanner s=new Scanner(System.in);
    int a[]=new int[25];
   // int max=0;
    ArrayList<Integer> al=new ArrayList();
    for(int i=0;i<25;i++)
    {
        a[i]=s.nextInt();
    
   
    al.add(a[i]);
   
 
 } Integer max=Collections.max(al);
       System.out.println(max);
    
    }
       }
