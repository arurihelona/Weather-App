import java.util.*;
class Main{
    public static void main(String[] args)
    {
        Employee e1 = new Employee("101","A",5000);
        Employee e2 = new Employee("102","B",6000);
        Employee e3 = new Employee("103","C",4000);
        List<Employee> l = new ArrayList<Employee>();
        l.add(e1);
        l.add(e2);
        l.add(e3);
    
        for(Employee e : l)
        {
            System.out.println(e.id+" "+e.name);
        }//or
        // for(int i=0;i<l.size();i++)
        // {
        //     Employee e = l.get(i);
        //     System.out.println(e.id + " " + e.name);
        // }
        System.out.println(l);
        Employee e4 = new Employee("200","Geeta",4000);
        l.add(2,e4);
        System.out.println("\n"+l+"\n");
        for(Employee e : l)
        {
          if(e.name.contains("iy"))
          {
              e.sal = e.sal+(e.sal*0.20);
          }
          System.out.println(e.id+" "+e.name+" "+e.sal);
            
        }
        Collections.sort(l);
        System.out.println("\n"+l);
    }
}
class Employee implements Comparable{
    String id;
    String name;
    double sal;
    Employee(String id,String name,float sal)
    {
        this.id = id;
        this.name = name;
        this.sal = sal;
    }
    public String toString()//to print without address
    {
        return id+"-"+name+":"+sal;
    }
    public int compareTo(Object o)
    {
        Employee e = (Employee)o;
        return (int)(this.sal - e.sal);
    }
}
class SalComparator implements Comparator{
    int compare(Employee o1, Employee o2){
        return (int)(o1.sal - o2.sal);
    }
}