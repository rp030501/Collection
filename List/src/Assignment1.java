import java.util.ArrayList;
import java.util.Iterator;

public class Assignment1 {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> arr=new ArrayList<String>();
		arr.add("Sam");
		arr.add("Ram");
		arr.add("Wipro");
		arr.add("Talent");
		Iterator it=arr.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
