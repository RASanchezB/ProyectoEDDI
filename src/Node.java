
import java.util.List;
import java.util.ArrayList;

public class Node<T> {

    private T data = null;

    private List<Node<T>> children = new ArrayList<>();

    private Node<T> parent = null;

    String value;
    int count;
    Node izquierda;
    Node derecha;
    Node linker;
    Node linkerBack;

    public Node(String value, int count) {
        this.value = value;
        this.count = count;
        this.izquierda = null;
        this.derecha = null;
        this.linker = null;
        this.linkerBack = null ;
    }
    
    

    public Node(T data) {
        this.data = data;
    }

    public Node<T> addChild(Node<T> child) {
        child.setParent(this);
        this.children.add(child);
        return child;
    }

    public void addChildren(List<Node<T>> children) {
        children.forEach(each -> each.setParent(this));
        this.children.addAll(children);
    }

    public Node() {
    }

    public List<Node<T>> getChildren() {
        return children;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    private void setParent(Node<T> parent) {
        this.parent = parent;
    }

    public Node<T> getParent() {
        return parent;
    }
}
