
package com.mycompany.entrega8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Martin
 */
public class ProductoDeAlmacen extends Producto implements Iva {
    
    int codigo;

    public ProductoDeAlmacen() {
    }

    public ProductoDeAlmacen(int codigo) {
        this.codigo = codigo;
    }

    public ProductoDeAlmacen(int codigo, String nombreproduct, double precioproduct) {
        super(nombreproduct, precioproduct);
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombreproduct() {
        return nombreproduct;
    }

    public void setNombreproduct(String nombreproduct) {
        this.nombreproduct = nombreproduct;
    }

    public double getPrecioproduct() {
        return precioproduct;
    }

    public void setPrecioproduct(double precioproduct) {
        this.precioproduct = precioproduct;
    }

    
    
    @Override
    public double calcularIva() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
   

    
    
}