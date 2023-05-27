package nodos;

public abstract class Node<E> {
    protected E info;
    protected Node<E> left;
    protected Node<E> rigth;

    public Node(E info) {
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

    public Node<E> getRigth() {
        return rigth;
    }

    public void setRigth(Node<E> rigth) {
        this.rigth = rigth;
    }

    public boolean isLeave(){
        return (getLeft()==null && getRigth()==null);    }
}

