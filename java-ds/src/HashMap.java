public class HashMap {

    public LinkedListMap[] hashmap;

    public HashMap(int size) {
        this.hashmap = new LinkedListMap[size];
        for (int i = 0; i < size; i++) {
            this.hashmap[i] = new LinkedListMap();
        }
    }

    public int hash(String key) {
        int hashCode = 0;
        for (int i = 0; i < key.length(); i++) {
            hashCode = hashCode + Character.codePointAt(key, i);
        }
        hashCode = hashCode % this.hashmap.length;
        return hashCode;
    }

    public void assign(String key, String value) {
        int arrayIndex = this.hash(key);
        LinkedListMap list = this.hashmap[arrayIndex];
        if (list.head == null) {
            list.addToHead(key, value);
            return;
        }
        NodeMap current = list.head;
        while (current != null) {
            if (current.key == key) {
                current.setKeyValue(key, value);
            }
            if (current.getNextNodeMap() == null) {
                current.setNextNodeMap(new NodeMap(key, value));
                break;
            }
            current = current.getNextNodeMap();
        }
    }

    public String retrieve(String key) {
        int arrayIndex = this.hash(key);
        NodeMap current = this.hashmap[arrayIndex].head;
        while (current != null) {
            if (current.key == key) {
                return current.value;
            }
            current = current.getNextNodeMap();
        }
        return null;
    }

    public static void main(String[] args) {
      HashMap birdCensus = new HashMap(15);
      birdCensus.assign("mandarin duck", "Central Park Pond");
      birdCensus.assign("monk parakeet", "Brooklyn College");
      birdCensus.assign("horned owl", "Pelham Bay Park");
      System.out.println(birdCensus.retrieve("mandarin duck"));
      System.out.println(birdCensus.retrieve("monk parakeet"));
      System.out.println(birdCensus.retrieve("horned owl"));
    } 
}