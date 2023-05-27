package nodos;

public class AVLNode<E> extends BSTNode<E> {
    private int height;

    public AVLNode(E info) {
        super(info);
        this.height=1;
    }

    public int getBalance(){
        int balance;
        AVLNode<E> nodeLeft= (AVLNode<E>) this.getLeft();
        AVLNode<E> nodeRigth= (AVLNode<E>) this.getRigth();
        if(nodeLeft==null && nodeRigth==null )
            balance=0;
        else if(nodeLeft==null)
            balance=-nodeRigth.getHeight();
        else if(nodeRigth==null)
            balance=nodeLeft.getHeight();
        else
            balance=nodeLeft.getHeight()-nodeRigth.getHeight();

        return balance;
    }

    public int getHeight(){
        return this.height;
    }

    public void heigthRefresh(){
        AVLNode<E> nodeLeft= (AVLNode<E>) this.getLeft();
        AVLNode<E> nodeRigth= (AVLNode<E>) this.getRigth();
        if(nodeLeft==null && nodeRigth==null )
            this.height=1;
        else if(nodeLeft==null)
            this.height=nodeRigth.getHeight()+1;
        else if(nodeRigth==null)
            this.height=nodeLeft.getHeight()+1;
        else
            this.height=Math.max(nodeLeft.getHeight(),nodeRigth.getHeight())+1;
    }


}