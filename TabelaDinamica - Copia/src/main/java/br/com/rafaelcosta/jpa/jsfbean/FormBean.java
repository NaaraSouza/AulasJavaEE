package br.com.rafaelcosta.jpa.jsfbean;

import java.io.Serializable;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.event.AjaxBehaviorEvent;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.sena.naarasouza.jpa.jsfbean.DespesasBean;
import br.com.senai.naarasouza.jpa.model.Despesa;

@Named("form")
@RequestScoped // o CICLO DE VIDA DELE.
public class FormBean implements Serializable {
	
	@EJB //EJB é um componente server-side que encapsula o código que preenche os objetivos da aplicação.
	private FormBean despesaBean;

	@Inject //  @Inject nos permite definir um ponto de injeção que é injetado durante a instanciação do bean
	
	private FacesContext context; //O FacesContext contém todas as informações do estado e a renderização de uma requisição Java Server Faces.
	
	private UIComponent searchInputText; //é a classe base para todos os componentes da interface do usuário no JavaServer Faces.
	
	private Integer tarefaId;
	
	private Despesa despesa;
	
	public void gravar(AjaxBehaviorEvent event) {
		if(despesa.getId()==null) {
			despesaBean.inserir(despesa);
		}else {
			despesaBean.atualizar(despesa);
		}		
	}
	
	public void pesquisar(AjaxBehaviorEvent event) { // AjaxBehaviorEvent representa o comportamento do componente específico para Ajax
		despesa = despesaBean.carregar(tarefaId);
		
		if(despesa == null) {
			context.addMessage(searchInputText.getClientId(context),
					new FacesMessage("Tarefa n�o encontrada"));
		}
		tarefaId = null;		
	}
	
	public void excluir(AjaxBehaviorEvent event) {
		despesa.excluir(despesa);
		despesa = null;
	}
	public Despesa getTarefa() {
		if(despesa==null) {
			despesa = new Despesa();
		}
		return despesa;
	}

	public UIComponent getSearchInputText() {
		return searchInputText;
	}

	public void setSearchInputText(UIComponent searchInputText) {
		this.searchInputText = searchInputText;
	}

	public Integer getTarefaId() {
		return tarefaId;
	}

	public void setTarefaId(Integer tarefaId) {
		this.tarefaId = tarefaId;
	}
	
	
	
}
