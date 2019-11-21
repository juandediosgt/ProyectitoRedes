/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans;

import java.io.Serializable;

/**
 *
 * @author Obed
 */
public class MenuInventarioBean implements Serializable{

    public MenuInventarioBean() {
    }
    
    public String irProducto(){
        String resultado="producto";
        return resultado;
    }
    public String irInventario1(){
        String resultado="inventario";
        return resultado;
    }
    public String irMenu(){
        String resultado="regresare";
        return resultado;
    }
}
