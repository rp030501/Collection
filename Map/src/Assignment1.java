import java.util.*;
import java.util.Map.Entry;

class Country{
	Map<String,String> map=new HashMap<String,String>();
	public String saveCountryCapital(String countryName,String capital) {
		map.put(countryName, capital);
		return capital;
	}
	public String getCapital(String countryName) {
		if(map.containsKey(countryName)) {
			return map.get(countryName);
		}
		else {
			return "No Country Found";
		}
	}
	public String getCountry(String capitalName) {
		for(Entry<String,String> entry:map.entrySet()) {
			if(entry.getValue().equals(capitalName)) {
				return entry.getKey();
			}
		}
		return "Capital not Found";
	}
	public Map<String,String> swapKeyValue(){
		Map<String,String> map1=new HashMap<String,String>();
		for(Entry<String,String> entry: map.entrySet()) {
			map1.put(entry.getValue(), entry.getKey());
		}
		return map1;
	}
	public ArrayList listKey() {
		ArrayList al=new ArrayList();
		for(Entry<String,String> entry: map.entrySet()) {
			al.add(entry.getKey());
		}
		return al;
	}
	public ArrayList listValue() {
		ArrayList al1=new ArrayList();
		for(Entry<String,String> entry: map.entrySet()) {
			al1.add(entry.getValue());
		}
		return al1;
	}
}
public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Country c=new Country();
		c.saveCountryCapital("India", "Delhi");
		System.out.println(c.swapKeyValue());

	}

}
