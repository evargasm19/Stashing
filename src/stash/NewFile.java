package stash;

/**
 * to test stashing
 */
class  NewFileImplemetation {
    String display(){
        String s = "This is to stash";
        return s;
    }
<<<<<<< Updated upstream
/*     public void vanishing(){
        System.out.println("This message must be vanished");
    } */
=======
>>>>>>> Stashed changes
    public void vanishing(){
        System.out.println("This message must be vanished");
    }
}
//this is a comment line.
public class NewFile {
    public static void main(String args[]) {
        NewFileImplemetation objvar = new NewFileImplemetation();
        System.out.println(objvar.display() );
    }
}
