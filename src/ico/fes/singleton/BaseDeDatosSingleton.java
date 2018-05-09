
package ico.fes.singleton;

/**
 *
 * @author jeshc
 */
public class BaseDeDatosSingleton {
    private static BaseDeDatosSingleton _instance;

    private BaseDeDatosSingleton() {
    }
    
    public static BaseDeDatosSingleton getInstance(){
        if (_instance==null) {
            _instance=new BaseDeDatosSingleton();
        }else{
            System.out.println("Ya fué instanciada");
        }
        return _instance;
    }
    
        
    public void simularConsulta(){
        System.out.println("Id:"+this.toString());
        System.out.println("id  |  nombre | telefono");
        System.out.println(" 1  |  Juan   | 2233-3333");
        System.out.println(" 2  |  Pedro  | 3434-5544");
        System.out.println(" 3  |  Dario  | 6655-7777");
        
    }
}
