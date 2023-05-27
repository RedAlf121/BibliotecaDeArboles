package nodos;
import java.util.LinkedList;

public class GeneralNode<E> extends Node<E>{
    public GeneralNode(E info) {
        super(info);
    }

    @Override
    public LinkedList<Node<E>> getSons() {
        LinkedList<Node<E>> list=new LinkedList<>();
        Node<E> nodeAux=this.getLeft();

        if(nodeAux!=null) {
            list.add(nodeAux);
            nodeAux=nodeAux.getRight();

            while(nodeAux!=null){
                list.add(nodeAux);
                nodeAux=nodeAux.getRight();
            }
        }
        return list;
    }

    public Node<E> getChild(){
        return this.getLeft();
    }

    public Node<E> getBrother(){
        return this.getRight();
    }
}
