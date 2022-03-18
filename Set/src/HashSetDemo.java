import java.util.Collections;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.ListIterator;

public class HashSetDemo {
	HashSet<String> set=new HashSet<String>();
	public boolean addCountry(String CountryName) {
		return set.add(CountryName);
	}
	public String findCountry(String countryName) {
		Iterator it=set.iterator();
		while(it.hasNext()) {
			if(it.next().equals(countryName)) {
				return countryName;
			}
		}
		return "Country Not Found";
	}
	public void printAllCountries() {
		Iterator it=set.iterator();
		System.out.println("Printing with help of Iterator");
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("Printing with help of Enumerator");
		Enumeration em=Collections.enumeration(set);
		while(em.hasMoreElements()) {
			System.out.println(em.nextElement());
		}
		
	}
	public static void main(String[] args) {
		HashSetDemo HSD=new HashSetDemo();
		HSD.addCountry("India");
		System.out.println(HSD.addCountry("America"));
		HSD.addCountry("USA");
		HSD.addCountry("Russia");
		System.out.println("Find Country "+HSD.findCountry("India"));;
		HSD.printAllCountries();

	}

}
