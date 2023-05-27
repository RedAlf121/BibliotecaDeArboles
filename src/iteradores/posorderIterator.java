package iteradores;

import java.util.HashMap;

import arboles.Tree;
import nodos.BinaryNode;
import nodos.Node;

public class PosorderIterator<E> extends DepthIterator<E>{
    private HashMap<Node<E>,Boolean> visited;
    public PosorderIterator(Tree<E> toIterate) {
        super(toIterate);
        visited = new HashMap<Node<E>,Boolean>();
        visited.put(actual, true);
    }
    
    @Override
    public E next() {
        BinaryNode<E> actual = (BinaryNode<E>) visitorStack.getFirst();
        BinaryNode<E> itLeft = (BinaryNode<E>) actual.getLeft();
        BinaryNode<E> itRight = (BinaryNode<E>) actual.getRight();
        while(itLeft != null && !visited.getOrDefault(itLeft, false))
        {
            addToStack(itLeft);
            itLeft = (BinaryNode<E>) itLeft.getLeft();
        }
        while(itRight != null && !visited.getOrDefault(itRight, false))
        {
            addToStack(itRight);
            itRight = (BinaryNode<E>) itRight.getRight();   
        }
        previous = visitorStack.getFirst();
        visited.put(previous, true);
        return previous.getInfo();
    }

    private void addToStack(BinaryNode<E> itLeft) {
        visitorStack.addFirst(itLeft);        
    }
}
