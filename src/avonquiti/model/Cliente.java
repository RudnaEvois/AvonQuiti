/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package avonquiti.model;

/**
 *
 * @author USER
 */

import javax.swing.JOptionPane;

public class Cliente {

	private String id;
	private String nome;
	private String telefone;
        private String nomep;
	

        
public void Cliente(String id,String nome,String telefone){
    this.id=id;
    this.nome=nome;
    this.telefone=telefone;
}
public void setNomep(){
    String nomep=JOptionPane.showInputDialog("Digite o nome do(a) Cliente: ");
    this.nomep=nomep;
}
public String getNomep(){
    return nomep;
}
public void setId(String id){
    
    this.id=id;
}
public String getId(){
    return id;
    
}

public void setNome(String nome){
   
    this.nome=nome;
}
public String getNome(){
    return nome;
    
}
public void setTel(String telefone){
   
    this.telefone=telefone;
}
public String getTel(){
    return telefone;
    
}
}

