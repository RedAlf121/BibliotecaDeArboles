package iteradores;

public interface IFullIterator<E> extends ITreeIterator<E>{
    public void change();
    public boolean isGoingLeft();
    public FullIterator<E> fullIterator();
}
