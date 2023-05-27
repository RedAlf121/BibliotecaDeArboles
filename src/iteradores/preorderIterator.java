package iteradores;

import arboles.Tree;

public class PreorderIterator<E> extends DepthIterator<E>{

    public PreorderIterator(Tree<E> toIterate) {
        super(toIterate);
    }
    
}
