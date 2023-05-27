package iteradores;

import arboles.Tree;
import nodos.*;

public class FullIterator<E> extends TreeIterator<E> implements IFullIterator<E>{
    
    private boolean leftMoving;
    
    public FullIterator(Tree<E> toIterate) {
        super(toIterate);
    }
    public FullIterator(Node<E> root, boolean leftMoving) {
        super(root);
        setActual(root);
        this.leftMoving = leftMoving;
    }

    @Override
    public E next() {
        if(leftMoving)
            actual = actual.getLeft();
        else
            actual = actual.getRight();
        return actual();
    }

    @Override
    public E actual() {
        return actual.getInfo();
    }

    @Override
    public boolean hasNext() {
        boolean has = false;
        if(leftMoving)
            has = actual.getLeft() != null;
        else
            has = actual.getRight() != null;
        return has;
    }

    @Override
    public void change() {
        leftMoving = !leftMoving;
    }

    @Override
    public boolean isGoingLeft() {
        return leftMoving;
    }
    public FullIterator<E> fullIterator()
    {
        FullIterator<E> newIterator = new FullIterator<>(actual, leftMoving);
        return newIterator;
    }
}
