package com.mycompany.entrega8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Martin
 */
public class Carrito extends ProductoDeAlmacen {

    public Scanner getEntrada() {
        return entrada;
    }

    public void setEntrada(Scanner entrada) {
        this.entrada = entrada;
    }

    public List<ProductoDeAlmacen> getCarro() {
        return carro;
    }

    public void setCarro(List<ProductoDeAlmacen> carro) {
        this.carro = carro;
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

    public Carrito() {
    }

    public Carrito(int codigo) {
        super(codigo);
    }

    public Carrito(int codigo, String nombreproduct, double precioproduct) {
        super(codigo, nombreproduct, precioproduct);
    }

    @Override
    public String toString() {
        return "Carrito{" + "carro=" + carro + '}';
    }

    Scanner entrada = new Scanner(System.in);
  
        List<ProductoDeAlmacen> carro = new ArrayList<>();
    public void agregarProducto(){
        try {
            System.out.println("PRODUCTO");
            String producto = entrada.next();
            if (producto.isEmpty()) {
                System.out.println("no puedes comprar algo sin nombre");
            } else {
                System.out.println("PRECIO");
                Double precio = entrada.nextDouble();
                System.out.println("Codigo");
                int codigo = entrada.nextInt();
                ProductoDeAlmacen productonuevo = new ProductoDeAlmacen(codigo, producto, precio);
              
                productonuevo.calcularIva();
                carro.add(productonuevo);
                System.out.println(carro.toString());
              
                
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
    
    public int cantidaproductos(){
        if (carro.size()<=0) {
            System.out.println("no compraste nada ");
        } else {
              return carro.size();
        }
        return carro.size();
    
    }
    
    public void total(){
        int total=0;
        for (ProductoDeAlmacen productoDeAlmacen : carro) {
            total += productoDeAlmacen.getPrecioproduct();
        }
        System.out.println("total de productos"+total);
    }

  
}
