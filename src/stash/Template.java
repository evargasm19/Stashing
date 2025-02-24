package stash;
/*
 * to test stashing
 */
class  TemplateImplemetation {
    String display(){
        String s = "Find solutions";
        return s;
    }
}
public class Template {
    public static void main(String args[]) {
        TemplateImplemetation objvar = new TemplateImplemetation();
        System.out.println(objvar.display() );
    }
}
