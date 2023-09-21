package com.mycompany.entrega8;

public abstract class Producto {

   String nombreproduct;
   double precioproduct;

    public Producto() {
    }

    public Producto(String nombreproduct, double precioproduct) {
        this.nombreproduct = nombreproduct;
        this.precioproduct = precioproduct;
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
    public String toString() {
        return "Producto{" + "nombreproduct=" + nombreproduct + ", precioproduct=" + precioproduct + '}';
    }
   
   
    
    

}
