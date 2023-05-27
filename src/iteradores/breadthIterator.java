package iteradores;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import arboles.Tree;
import nodos.Node;

public class BreadthIterator<E> extends TreeIterator<E>{    
    private Queue<Node<E>> visitorQueue;

    public BreadthIterator(Tree<E> toIterate) {
        super(toIterate);
        visitorQueue = new LinkedList<Node<E>>();
        visitorQueue.offer(actual);
    }

    @Override
    public E next() {
        List<Node<E>> sonList = (previous==null)? new LinkedList<Node<E>>():previous.getSons();
        for(Node<E> son : sonList)
            visitorQueue.offer(son);
        previous = visitorQueue.poll();
        return previous.getInfo();
    }
    
    @Override
    public boolean hasNext() {
        return !visitorQueue.isEmpty();
    }
}
