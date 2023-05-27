package iteradores;

import arboles.Tree;

public class InorderIterator<E> extends DepthIterator<E>{

    public InorderIterator(Tree<E> toIterate) {
        super(toIterate);
    }
    
}
