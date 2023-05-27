package nodos;

import java.util.LinkedList;

public abstract class Node<E> {
    protected E info;
    protected Node<E> left;
    protected Node<E> right;

    protected Node(E info) {
        this.info = info;
    }

    public abstract LinkedList<Node<E>> getSons();

    public E getInfo() {
        return info;
    }

    public void setInfo(E info) {
        this.info = info;
    }

    public Node<E> getLeft() {
        return left;
    }

    public void setLeft(Node<E> left) {
        this.left = left;
    }

    public Node<E> getRight() {
        return right;
    }

    public void setRight(Node<E> rigth) {
        this.right = rigth;
    }

    public boolean isLeave(){
        return (getLeft()==null && getRight()==null);    }

    public boolean add(E element) {
        return false;
    }

    public Node<E> getParent() {
        return null;
    }

    public void removeChild(Node<E> actual) {
    }
}

