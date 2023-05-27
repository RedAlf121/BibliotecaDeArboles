package iteradores;

import arboles.Tree;
import nodos.*;

public abstract class TreeIterator<E> implements ITreeIterator<E>{
    protected Node<E> actual;
    protected Node<E> root;
    protected Node<E> previous;
    protected TreeIterator(Node<E> root){
        actual = root;
        this.root = root;
    }
    protected TreeIterator(Tree<E> toIterate){
        this(toIterate.getRoot());
    }
    public E actual()
    {
        return actual.getInfo();
    }
    public boolean add(E element) {
        boolean added = false;
        if(validModification())
            added = actual.add(element);
        return added;
    }
    private boolean validModification() {
        boolean valid = !(actual instanceof BSTNode);
        if(!valid) throw new IllegalArgumentException("Los arboles ordenados no pueden ser modificados");
        return valid;
    }
    public E remove(){
        if(validModification()){
            Node<E> parent = actual.getParent();
            parent.removeChild(actual);
        }
        return actual.getInfo();
    }
    public void set(E element){
        if(validModification())
            actual.setInfo(element);
    }
    public Tree<E> getTree(){
        Tree<E> subTree = null;
        return subTree;
    }
    public Node<E> getActual() {
        return actual;
    }
    public void setActual(Node<E> actual) {
        this.actual = actual;
    }
    public Node<E> getRoot() {
        return root;
    }
    public void setRoot(Node<E> root) {
        this.root = root;
    }
}
