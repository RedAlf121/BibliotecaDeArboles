package arboles;

import nodos.Node;

public abstract class Tree<E>{
    protected Node<E> root;

    public Node<E> getRoot() {
        return root;
    }
}