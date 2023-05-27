package nodos;
public class BSTNode<E> extends BinaryNode<E> {
    protected BSTNode<E> father;


    public BSTNode(E info) {
        super(info);
    }

    public BSTNode<E> getFather() {
        return father;
    }

    public void setFather(BSTNode<E> father) {
        this.father = father;
    }
}
