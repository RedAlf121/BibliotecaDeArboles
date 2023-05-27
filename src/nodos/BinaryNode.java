package nodos;
import java.util.LinkedList;

public class BinaryNode<E> extends Node<E>{

    public BinaryNode(E info) {
        super(info);
    }

    @Override
    public LinkedList<Node<E>> getSons() {
        LinkedList<Node<E>> list = new LinkedList<>();
        list.add(this.getLeft());
        list.add(this.getRight());
        return list;

    }
}
