public class TwoPointerTechnique {
    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();
        list.addToHead("one");
        list.addToTail("two");
        list.addToTail("three");
        list.addToTail("four");
        list.addToTail("five");
        
        list.printList();

        // RETURN THE NTH last element 
        int n = 2;
        Node current = null;
        Node tailSeeker = list.head;
        int count = 0;
        while (tailSeeker != null) {
            tailSeeker = tailSeeker.getNextNode();
            if (count >= n) {
                if (current == null) {
                    current = list.head;
                }
                current = current.getNextNode();
            }
            count++;
        }
        System.out.println(current.data);


        // FIND THE MIDDLE ELEMENT
        Node fp = list.head;
        Node sp = list.head;
        while (fp != null) {
            fp = fp.getNextNode();
            if (fp != null) {
                fp = fp.getNextNode();
                sp = sp.getNextNode();
            }
        }
        System.out.println(sp.data);
    }
}
