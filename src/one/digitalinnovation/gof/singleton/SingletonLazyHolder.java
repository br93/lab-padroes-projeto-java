package one.digitalinnovation.gof.singleton;

/**
 * Singleton "Lazy Holder"
 * @author br93
 */

public class SingletonLazyHolder {

    private static class InstanceHolder {
        public static SingletonLazyHolder instancia = new SingletonLazyHolder() ;
    }

    private SingletonLazyHolder() {
        super();
    }

    public static SingletonLazyHolder getInstancia(){
       return InstanceHolder.instancia;
    }
}