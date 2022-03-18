import java.util.Map;
import java.util.TreeMap;

class ContactList{
	TreeMap<String,String> tm=new TreeMap<String,String>();
	public void addContact(String contactName,String phoneNumber) {
		tm.put(contactName, phoneNumber);
	}
	public String getPhoneNumber(String ContactName) {
		return tm.get(ContactName);
	}
	
	public String getContactName(String phoneNumber) {
				for(Map.Entry<String,String> entry: tm.entrySet()) {
			if(entry.getValue().equals(phoneNumber)) {
				return entry.getKey();
			}
		}
		return "phoneNumber not Found";
	}
	public void Display() {
		for(Map.Entry<String,String> entry: tm.entrySet()) {
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
		for(int i=0;i<tm.size();i++) {
			System.out.println(tm.get(i));
		}

	}

}
public class Assignment2 {

	public static void main(String[] args) {
		ContactList cl=new ContactList();
		cl.addContact("Prath", "8459477885");
		cl.addContact("Raut", "9511899642");
		cl.Display();
				

	}

}
