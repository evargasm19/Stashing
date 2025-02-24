package stash;
/*
 * to test stashing
 */
class  NewFileImplemetation {
    String display(){
        String s = "This is to stash";
        return s;
    }
}
public class NewFile {
    public static void main() {
        NewFileImplemetation objvar = new NewFileImplemetation();
        System.out.println(objvar.display() );
    }
}
