import java.util.*;
public class list{
    public static void main(String args[]){
     List<Integer> l=new ArrayList<Integer>();
     l.add(1);
     l.add(2);
     l.add(2);
     l.add(3);
     l.add(1);
     l.add(4);
     System.out.println("before"+l);
     List<Integer> l2=new ArrayList<Integer>();
     for(int i=0;i<l.size();i++){
         int num=l.get(i);
         if(!l2.contains(num)){
             l2.add(num);
         }
     }
     System.out.println("After"+l2);
     System.out.println("max "+Collections.max(l));
     List<Integer> l3=new ArrayList<Integer>();
     for (int i=(l.size()-1);i>=0 ;i-- ){
        int num=l.get(i);
         l3.add(num);
     } 
     System.out.println("reverse:"+l3);
     List<Integer> m1=new ArrayList<>(Arrays.asList(1,3,5));
     List<Integer> m2=new ArrayList<>(Arrays.asList(2,4,6));
     m1.addAll(m2);
     System.out.print("merged:"+m1);
    }
}