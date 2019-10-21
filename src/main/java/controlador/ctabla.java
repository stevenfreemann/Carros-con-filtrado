/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import modelo.carro;



/**
 *
 * @author Wilson Rodriguez, Jhony Rojas
 * @version 1.0
 */

@ManagedBean
@RequestScoped
/**
 * Clase que se encarga de controlar la vista y validar campos
 */
public class ctabla {
    /**
     * Variables Con validaciones de tamaño y año
     */
    @Size(min = 3,max =10 )
    private String nombre;
    @Size(min = 3,max =15 )
    private String marca;
    @Min(1980) @Max(2020)
    private Integer modelo;
    private static List<carro> lista = new ArrayList();
    private List<carro> filteredCars;
    private static List<String> marcas = new ArrayList();

    /**
     * metodo que se encarga de llenar la lista de carros y la lista de marcas 
     */
    public void llenar(){
        carro c1 = new carro();
        c1.setMarca(marca);
        c1.setNombre(nombre);
        c1.setModelo(modelo);
        lista.add(c1);
        if(marcas.contains(marca.toLowerCase())){
            
         }else{
            
                marcas.add(marca);
        }
        
        
    
    }

   /**
    * Getters y Setters de las variables 
    * @return 
    */
    public List<carro> getLista() {
        return lista;
    }

    public void setLista(List<carro> lista) {
        this.lista = lista;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Integer getModelo() {
        return modelo;
    }

    public void setModelo(Integer modelo) {
        this.modelo = modelo;
    } 

    public List<carro> getFilteredCars() {
        return filteredCars;
    }

    public void setFilteredCars(List<carro> filteredCars) {
        this.filteredCars = filteredCars;
    }

    public List<String> getMarcas() {
        return marcas;
    }

    public void setMarcas(List<String> marcas) {
        this.marcas = marcas;
    }
    
    
}
