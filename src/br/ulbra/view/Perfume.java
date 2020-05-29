/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ulbra.view;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Jeferson Leon
 */
public class Perfume {
    
    ArrayList<String> perfume;
    
    public Perfume(){
        perfume = new ArrayList();
    }
    
    /*
    Agora crie um programa onde contenha uma lista de perfumes, a pessoa
    pode adicionar perfumes a lista, ver a lista, remover perfumes e verificar 
    a quantidade de perfumes que contém a lista.
    */
    //MÉTODO CRIADO PARA ADICIONAR OS PERFUMES NO ARRAYLIST
    public void addPerfume(String nomeP){
        perfume.add(nomeP);
        JOptionPane.showMessageDialog(null, "O perfume "+nomeP 
                +" foi salvo com sucesso!");
        
    }
    //MÉTODO CRIADO PARA FAZER A LISTAGEM DOS PERFUMES DO ARRAYLIST
    public String ListarPerfume(){
        String r = "Listagem de Perfumes\n";
        if(!perfume.isEmpty()){
        for(int i=0;i < perfume.size();i++ ){
            r += (i+1)+"º:"+perfume.get(i)+"\n";
        }
        }else{
            r = "A lista de perfumes encontra-se vazia!";
        }
        return r;
    }
    public void mostrarQuantidade(){
        
        if(!perfume.isEmpty()){
            JOptionPane.showMessageDialog(null, "Existe(m) "+perfume.size()
                    +" perfume(s) cadastrado(s)");
        }else{
            JOptionPane.showMessageDialog(null, "Existe zero (0) cadastrados");
        }
    }     
    public void removerPerfume(int i){
        int ind = (i-1);
        if(!perfume.isEmpty()){
          if(ind>=0 && ind<perfume.size()) {
              if(JOptionPane.showConfirmDialog(null,"Tem certeza que "
                      + "deseja apagar o perfume "+perfume.get(ind)+"?","confirme"
              ,JOptionPane.YES_NO_OPTION)==JOptionPane.YES_OPTION){
              perfume.remove(ind);
              JOptionPane.showMessageDialog(null,"Perfume removido com sucesso!");
              
              
              }else{
                  JOptionPane.showMessageDialog(null,"Exclusão cancelada!");
              }
          }else{
              JOptionPane.showMessageDialog(null,"Este perfume não existe");
          }
        }else{
              JOptionPane.showMessageDialog(null,"Impossivel remover da base,"
                      + " lista vazia");
        }
        
    }
    
}
