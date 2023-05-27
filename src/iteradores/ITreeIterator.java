package iteradores;

import arboles.Tree;

public interface ITreeIterator<E> {
    public E next();
    public E actual();
    public boolean hasNext();
    public boolean add(E element);
    public E remove();
    public void set(E element);
    public Tree<E> getTree();   
}
