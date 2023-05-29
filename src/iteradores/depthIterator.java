package iteradores;

import java.util.LinkedList;

import arboles.Tree;
import nodos.Node;

public class DepthIterator<E> extends TreeIterator<E>{
    
    protected LinkedList<Node<E>> visitorStack;

    public DepthIterator(Tree<E> toIterate) {
        super(toIterate);
        visitorStack = new LinkedList<Node<E>>();
    }

    @Override
    public E next() {
        actual = visitorStack.removeFirst();
        LinkedList<Node<E>> sonList = (previous==null)? new LinkedList<Node<E>>():previous.getSons();
        while(!sonList.isEmpty())
            visitorStack.addFirst(sonList.removeLast());
        previous = actual;
        return actual.getInfo();
    }


    @Override
    public boolean hasNext() {
        return !visitorStack.isEmpty();
    }
}
