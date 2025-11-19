import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
import java.util.*;
class SetTest {
    public static void main (String[] args){
        Set<Integer> s = new HashSet<Integer>();
        s.add(67);
        s.add(23);
        s.add(7);
        s.add(89);
        s.add(90);
        s.add(45);
        System.out.println(s);
        Iterator<Integer> r = s.iterator();
        while(r.hasNext()){
            Integer x = r.next();
            System.out.println(x);
        }

        s.remove(90);
        s.add(95);
        System.out.println(s);
        System.out.println(Collections.max(s)+" \n "+ Collections.min(s));
        Set<Integer> sing = new HashSet<>();
        sing.add(12);
        sing.add(11);
        sing.add(23);
        sing.add(16);
        Set<Integer> dance = new HashSet<>();
        dance.add(21);
        dance.add(12);
        dance.add(23);
        dance.add(16);
        dance.add(90);
        Iterator<Integer> r1 = sing.iterator();
        while(r1.hasNext())
        {
            Integer z = r1.next();
            if(dance.contains(z))
            {
                System.out.println(z);
            }
        }
        
        
    }
}






