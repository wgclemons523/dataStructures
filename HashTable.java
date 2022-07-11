
public class HashTable {
	public int key;
	public Object value;
	public HashTable next;
	
	public HashTable(int k, Object v) {
		this.key = k;
		this.value = v;
		next = null;
	}
	
	public HashTable() {
		next = null;
	}
	
	public int getKey() {
		return key;
	}
	
	public Object getValue() {
		return value;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashTableArray<String> hm = new HashTableArray<String>(10);
		hm.put(11, "WG");
		hm.put(12, "Chuck");
		hm.put(13, "Vanessa");
		System.out.print(hm.get(13));
	}

}
