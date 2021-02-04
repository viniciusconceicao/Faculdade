/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author vinic
 */
public class Departamento {
    
   private List<VendedorComissao> listaVendedor;

    public Departamento() {
        this.listaVendedor = new ArrayList<>();
    }


   
   
   public void adicionarVendedor(VendedorComissao vendedor){
       listaVendedor.add(vendedor);
   }
   
   Double salarioTotal = 0.0;
   public Double calculaSalarioTotal(){
       for (VendedorComissao vendedorComissao : listaVendedor) {
           
           salarioTotal+=vendedorComissao.calculaSalario();
       }
       return salarioTotal;
   }
   
   public void exibirTodos(){
       System.out.println(listaVendedor);
   }

    public List<VendedorComissao> getListaVendedor() {
        return listaVendedor;
    }

    public void setListaVendedor(List<VendedorComissao> listaVendedor) {
        this.listaVendedor = listaVendedor;
    }

    public Double getSalarioTotal() {
        return salarioTotal;
    }

    public void setSalarioTotal(Double salarioTotal) {
        this.salarioTotal = salarioTotal;
    }

    @Override
    public String toString() {
        return "\n\nDepartamento" + 
                "\nLista vendedor: " + listaVendedor 
                + "\nSalario total: " + salarioTotal;
    }
   
   
    
}
