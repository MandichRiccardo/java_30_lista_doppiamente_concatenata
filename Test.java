public class Test{
    public static void main(String[] args){
        List l = new List();
        while(getInput()){
            l.addNode(new Node());
            System.out.println(l.toString());
            System.out.println(l.toStringContrario());
        }
    }

    public static boolean getBoolean(){
        try{
            return new java.util.Scanner(System.in).nextBoolean();
        }catch(java.util.InputMismatchException e){
            System.out.println("devi inserire un boolenao nel formato \"true\" o \"false\"");
            return getBoolean();
        }
    }

    public static boolean getInput(){
        System.out.println("vuoi inserire un'altro nodo?");
        return getBoolean();
    }
}