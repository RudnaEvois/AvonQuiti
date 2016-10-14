/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avonquiti.model;

import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author USER
 */
public class NF {
    private String cod;
    private String codproduto;
	private String nome;
	private int quantidade;
        private float precocusto;
        private float precovenda;
        private float lucro;
	

        
public void NF(String cod,String codproduto,String nome, int quantidade,float precocusto, float precovenda,float lucro){
    this.cod=cod;
    this.codproduto=codproduto;
    this.nome=nome;
    this.quantidade=quantidade;
    this.precocusto=precocusto;
    this.precocusto=precovenda;
    this.lucro=lucro;
}
public void setCod(String cod){
    
    this.cod=cod;
}
public String getCod(){
    return cod;
    
}
public void setCodproduto(String codproduto){
   
    this.codproduto=codproduto;
}
public String getCodproduto(){
    return codproduto;
    
}

public void setNome(String nome){
   
    this.nome=nome;
}
public String getNome(){
    return nome;
    
}
public void setQuant(int quant){
   
    this.quantidade=quant;
}
public int getQuant(){
    return quantidade;
    
}
public void setPcusto(float pcusto){
   
    this.precocusto=pcusto;
}
public float getPcusto(){
    return precocusto;
    
}
public void setPvenda(float pvenda){
   
    this.precovenda=pvenda;
}
public float getPvenda(){
    return precovenda;
    
}
public void setLucro(float lucro){
     this.lucro=lucro;
    
}
public float getLucro(){
    return lucro;
    
}

   
}

    

