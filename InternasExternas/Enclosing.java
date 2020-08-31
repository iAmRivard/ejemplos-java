package InternasExternas;

public class Enclosing {
    public void run(){
        class Local {
            void run(){
                System.out.println("RUN");
            }
        }
        Local local = new Local();
        local.run();
    }
}
