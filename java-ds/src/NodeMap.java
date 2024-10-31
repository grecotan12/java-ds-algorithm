public class NodeMap {
    public String key;
    public String value;
    private NodeMap next;

    public NodeMap(String key, String value) {
        this.key  = key;
        this.value = value;
        this.next = null;
    }

    public void setNextNodeMap(NodeMap NodeMap) {
        this.next = NodeMap;
    }

    public NodeMap getNextNodeMap() {
        return this.next;
    }

    public void setKeyValue(String key, String value) {
        this.key = key;
        this.value = value;
    }
}