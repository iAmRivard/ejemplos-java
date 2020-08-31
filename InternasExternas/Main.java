package InternasExternas;

import InternasExternas.Outer;

public class Main {
    public static void main(String[] args) {

        // InternasExternas.Locales a un metodo
         Enclosing enclosing = new Enclosing();
         enclosing.run();

        // Clases Internas
        Outer outer = new Outer();
        Outer.Inner inner = outer.new Inner();
    }
}
