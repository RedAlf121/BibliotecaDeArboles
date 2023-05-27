package nodos;

public class RBTNode<E> extends BSTNode<E> {

    private Color color;

    public RBTNode(E info) {
        super(info);
        this.color=Color.RED;
    }

    public boolean isLeftChildren(){
        return this.getFather().getLeft().equals(this);
    }

    public boolean isRed(){
        return this.color.equals(Color.RED);
    }

    public void swapColor(){
        if( color.equals(Color.RED))
            this.color=Color.BLACK;
        else
            this.color=Color.RED;
    }


    private enum Color {
        RED,
        BLACK
    }
}