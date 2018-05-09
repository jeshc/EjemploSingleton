/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ico.fes.singleton;

/**
 *
 * @author jeshc
 */
public class Test {
    public static void main(String[] args) {
        BaseDeDatosSingleton db=BaseDeDatosSingleton.getInstance();
        db.simularConsulta();
        db.simularConsulta();
        db.simularConsulta();
        BaseDeDatosSingleton db2=BaseDeDatosSingleton.getInstance();
        db.simularConsulta();
        BaseDeDatosSingleton db3=BaseDeDatosSingleton.getInstance();
        db.simularConsulta();
    }
}
