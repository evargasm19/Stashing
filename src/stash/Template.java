package stash;
/**
 * to test stashing
 */
class  TemplateImplemetation {
    String display(){
        String s = "Find solutions";
        return s;
    }
    public void disappearing(){
        System.out.println("This message is to appear and disappear");
    }
<<<<<<< Updated upstream
    public void hardWork(){
        System.out.println("HARDWORK");
    public void eyevee(){
       System.out.println("!STASHING"); 
    }
=======
>>>>>>> Stashed changes
}
public class Template {
    public static void main(String args[]) {
        TemplateImplemetation objvar = new TemplateImplemetation();
        System.out.println(objvar.display() );
    }
}
