public class Node{
    protected int value;
    protected Node next;
    protected Node back;

    public Node(int value) {
        this.value = value;
        this.next = null;
    }

    public Node() {
        System.out.println("inserisci il valore di questo nodo");
        this.value = getInt();
        next = null;
    }

    public Node getNext() {
        return next;
    }

    public Node getBack() {
        return back;
    }

    public int getInt(){
        try{
            return new java.util.Scanner(System.in).nextInt();
        }catch (java.util.InputMismatchException e){
            return getInt();
        }
    }

    public Node getLastNode(){
        if(next == null) return this;
        else return next.getLastNode();
    }

    @Override
    public String toString() {
        String info ="";
        info += "\t\tvalore:\n" + value + "\n";
        if(next != null) info += "\tsuccessivo:\n" + next;
        else info += "\tlista terminata\n";
        return info;
    }

    public String toStringContrario() {
        String info ="";
        try{
            info += next.toStringContrario();
        }catch (NullPointerException ignore){
            return "valore:\t" + value + "\n";
        }
        return info;
    }

    public boolean equals(Node n){
        return this.value == n.value;
    }

    public int compareTo(Node i){
        String a = this.toString();
        String b = i.toString();
        return a.compareTo(b);
    }
}
