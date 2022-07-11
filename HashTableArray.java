
public class HashTableArray<T> {
HashTable[] arrayHash;
int size;
	public HashTableArray(int size) {
		this.size = size;
		arrayHash = new HashTable[size];
		for(int i = 0; i  < size; i++) {
			arrayHash[i] = new HashTable();
			
		}
	}
	
	public int getHash(int key) {
		return key % size;
	}
	
	public void put(int key, Object value) {
		int hashIndex = getHash(key);
		HashTable ArrayValue = arrayHash[hashIndex];
		HashTable newItem = new HashTable(key, value);
		newItem.next = ArrayValue.next;
		ArrayValue.next = newItem;
	}
	
	public T get(int key) {
		T value = null;
		int hashIndex = getHash(key);
		HashTable ArrayValue = arrayHash[hashIndex];
		while(ArrayValue != null) {
			if(ArrayValue.getKey() == key) {
				value = (T) ArrayValue.getValue();
				break;
			}
			ArrayValue = ArrayValue.next;
		}
		return value;
	}
}
