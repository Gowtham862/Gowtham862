package string;
import java.util.*;
import java.util.Map.Entry;

class Emp implements Comparable<Emp> {
    int id;

    public Emp(int id) {
        this.id = id;
    }

    @Override
    public int compareTo(Emp o) {
        return Integer.compare(this.id, o.id);
    }

    @Override
    public String toString() {
        return "Emp[id=" + id + "]";
    }
}

class Emp1 {
    String name;

    public Emp1(String name)
    {
        this.name = name;
    }

    @Override
    public String toString() 
    {
        return "Emp1[name=" + name + "]";
    }
}

public class Main {

    public static void main(String[] args)
    {
        Map<Emp, Emp1> tm = new TreeMap<>();
        tm.put(new Emp(3), new Emp1("GGHJ"));
        tm.put(new Emp(2), new Emp1("Go"));
        tm.put(new Emp(1), new Emp1("Gow"));

        Set<Entry<Emp, Emp1>> set = tm.entrySet();
        
        for (Entry<Emp, Emp1> e : set) 
        {
            System.out.println(e.getKey() + " " + e.getValue());
        }
    }
}
