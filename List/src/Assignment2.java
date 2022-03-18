import java.util.ArrayList;
import java.util.Iterator;

public class Assignment2 {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Number> arr=new ArrayList<Number>();
		arr.add(11.0);
		arr.add(1);
		arr.add(112F);
		arr.add(-12);
		Iterator it=arr.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		for(int i=0;i<arr.size();i++) {
			System.out.println(arr.get(i));
		}
	}

}
