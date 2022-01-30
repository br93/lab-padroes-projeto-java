package one.digitalinnovation.gof.singleton;

/**
 * Singleton "Eager"
 * @author br93
 */

public class SingletonEager {

    private static SingletonEager instancia = new SingletonEager() ;

    private SingletonEager() {
        super();
    }

    public static SingletonEager getInstancia(){
       return instancia;
    }
}