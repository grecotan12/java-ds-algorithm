public class LinkedListMap {
    public NodeMap head;

    public LinkedListMap() {
        this.head = null;
    }

    public void addToHead(String key, String value) {
        NodeMap newHead = new NodeMap(key, value);
        NodeMap currentHead = this.head;
        this.head = newHead;
        if (currentHead != null) {
            this.head.setNextNodeMap(currentHead);
        }
    }

    public void addToTail(String key, String value) {
        NodeMap tail = this.head;
        if (tail == null) {
            this.head = new NodeMap(key, value);
        } else {
            while (tail.getNextNodeMap() != null) {
                tail = tail.getNextNodeMap();
            }
            tail.setNextNodeMap(new NodeMap(key, value));
        }
    }

    public void removeHead() {
        NodeMap removedHead = this.head;
        if (removedHead == null) {
            return;
        }
        this.head = removedHead.getNextNodeMap();
    }
}