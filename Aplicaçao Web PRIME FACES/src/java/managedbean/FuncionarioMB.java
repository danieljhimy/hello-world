/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managedbean;

import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import modelo.Funcionario;
import org.primefaces.event.RowEditEvent;
import servico.FuncionarioService;

@ManagedBean
@SessionScoped
public class FuncionarioMB {
    private FuncionarioService service = new FuncionarioService();
    private Funcionario funcionario = new Funcionario();
    private Funcionario funcionarioSelecionado;

    public void salvar(){
        service.salvar(funcionario);
        funcionario = new Funcionario();
    }

    public void onRowEdit(RowEditEvent event) {
        FacesMessage msg = new FacesMessage("Edição Funcionário", 
                ((Funcionario) event.getObject()).getNome());
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
    
    public void deleteFunc() {
        service.remover(funcionarioSelecionado);
        
    }

    public Funcionario getFuncionarioSelecionado() {
        return funcionarioSelecionado;
    }

    public void setFuncionarioSelecionado(Funcionario funcionarioSelecionado) {
        this.funcionarioSelecionado = funcionarioSelecionado;
    }
    
    
   
    public List<Funcionario> getFuncionarios(){
       return service.getAllFuncionarios();
    }
    public Funcionario getFuncionario() {
        return funcionario;
    }
    public void setFuncionario(Funcionario funcionario) {
        this.funcionario = funcionario;
    }
    
    
    
}
