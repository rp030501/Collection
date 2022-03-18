import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NavigableSet;
import java.util.Scanner;
import java.util.TreeSet;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeSet<String> ts=new TreeSet<String>();
		ts.add("A");
		ts.add("B");
		ts.add("C");
		ts.add("D");
		Map<String,String> m=new HashMap<String,String>();
		m.put("a", "B");
		m.put("b", "C");
		for(Entry<String, String> e: m.entrySet()) {
			System.out.println(e.getKey()+e.getValue());
		}
		NavigableSet<String> reverse=ts.descendingSet();
		
		Iterator it=reverse.iterator();
		System.out.print("Reversed TreeSet ");
		while(it.hasNext()) {
			System.out.print(it.next()+" ");
		}
		System.out.println();
		System.out.print("TreeSet elements ");
		Iterator it1=ts.iterator();
		while(it1.hasNext()) {
			System.out.print(it1.next()+" ");
		}
		System.out.println();
		Scanner sc=new Scanner(System.in);
		String check=sc.next();
		if(ts.contains(check)) {
			System.out.println("Element is exits in tree set");
		}
		else {
			System.out.println("Element not found inXC tree set");
		}
	}

}
