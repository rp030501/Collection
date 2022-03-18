import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class Assignment3 {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		// TODO Auto-generated method stubbds
		Vector<Number> ve=new Vector<Number>();
		ve.add(12);
		Iterator it=ve.iterator();
		Enumeration e=Collections.enumeration(ve);
		while(e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
