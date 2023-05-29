package iteradores;

import java.util.LinkedList;

import arboles.Tree;
import nodos.Node;

public class InorderIterator<E> extends DepthIterator<E>{

    public InorderIterator(Tree<E> toIterate) {
        super(toIterate);
    }

    @Override
    public E next() {
        LinkedList<Node<E>> sonList = (previous==null)? new LinkedList<Node<E>>():previous.getSons();
        
        return previous.getInfo();
    }


    @Override
    public boolean hasNext() {
        return !visitorStack.isEmpty();
    }
    
}
