public class SwapElement {
    public static void main(String[] args) throws Exception {
        DoublyLinkedList list = new DoublyLinkedList();
        list.addToHead("one");
        list.addToTail("two");
        list.addToTail("three");
        list.addToTail("four");
        list.addToTail("five");
        
        list.printList();
        String data1 = "two";
        String data2 = "four";
        
        Node node1 = list.head;
        Node node2 = list.head;
        Node node1Prev = null;
        Node node2Prev = null;
        
        if (data1 == data2) {
            System.out.println("Elements are the same - no swap needed");
            return;
        }
        
        while (node1 != null) {
            if (node1.data == data1) {
                break;
            }
            node1Prev = node1;
            node1 = node1.getNextNode();
        }
        while (node2 != null) {
            if (node2.data == data2) {
                break;
            }
            node2Prev = node2;
            node2 = node2.getNextNode();
        }

        if (node1 == null || node2 == null) {
            System.out.println("Not Possible - one of the element is not in the list");
            return;
        }
        if (node1Prev == null) {
            list.head = node2;
        }
        else {
            node1Prev.setNextNode(node2);
        }
        if (node2Prev == null) {
            list.head = node1;
        } else {
            node2Prev.setNextNode(node1);
        }
        Node temp = node1.getNextNode();
        node1.setNextNode(node2.getNextNode());
        node2.setNextNode(temp);

        list.printList();
    }
}
