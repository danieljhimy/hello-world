/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servico;

import java.util.ArrayList;
import modelo.Funcionario;

/**
 *
 * @author glauc
 */
public class FuncionarioService {

    private static ArrayList<Funcionario> lista = new ArrayList();
   
 

    public void salvar(Funcionario f) {

        lista.add(f);
    }
    
    public void remover(Funcionario f){
        lista.remove(f);
    }

   

    
    
    public ArrayList<Funcionario> getAllFuncionarios() {
        return lista;
    }

}
