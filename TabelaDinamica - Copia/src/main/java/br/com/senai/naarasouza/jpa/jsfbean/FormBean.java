package br.com.senai.naarasouza.jpa.jsfbean;

import java.io.Serializable;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.context.FacesContext;
import javax.faces.event.AjaxBehaviorEvent;
import javax.inject.Inject;
import javax.inject.Named;

import br.com.senai.naarasouza.application.model.Cadastro;


@Named("form")
@RequestScoped
public class FormBean implements Serializable {
	
	@EJB
	private FormBean tarefaBean;

	@Inject
	private FacesContext context;
	
	private UIComponent searchInputText;
	
	private Integer cadastroid;
	
	private Cadastro cadastro;
	
	public void gravar(AjaxBehaviorEvent event) {
		if(cadastro.getData()==null) {
			FormBean.inserir(cadastro);
		}else {
			FormBean.atualizar(cadastro);
		}		
	}
	
	public void pesquisar(AjaxBehaviorEvent event) {
		cadastro = FormBean.carregar(cadastroid);
		
		if(cadastro == null) {
			context.addMessage(searchInputText.getClientId(context),
					new FacesMessage("Tarefa n�o encontrada"));
		}
		cadastroid = null;		
	}
	
	public void excluir(AjaxBehaviorEvent event) {
		FormBean.excluir(cadastro);
		cadastro = null;
	}
	public Cadastro getCadastro() {
		if(cadastro==null) {
			cadastro = new Cadastro();
		}
		return cadastro;
	}

	public UIComponent getSearchInputText() {
		return searchInputText;
	}

	public void setSearchInputText(UIComponent searchInputText) {
		this.searchInputText = searchInputText;
	}

	public Integer getTarefaId() {
		return cadastroid;
	}

	public void setTarefaId(Integer tarefaId) {
		this.cadastroid = tarefaId;
	}
	
	
	
}
