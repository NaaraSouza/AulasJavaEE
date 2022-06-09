package br.com.senai.naarasouza.jpa.ejbbean;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.senai.naarasouza.application.model.Cadastro;


public class CadastroBean {
	@PersistenceContext //Utilizado quando você tem uma classe que apenas representa um serviço, mas sem precisar guardar informações dois clientes, ou seja, a cada requisição um cliente pode ser atendido por uma instancia de ejb distinta, e basicamente o ejb vai executar um metodo e devolver alguma coisa pra ele.
	private EntityManager em; //
	
	public void inserir(Cadastro cadastro) {
		em.persist(cadastro);
	}
	
	public void atualizar(Cadastro cadastro) {
		em.merge(cadastro);
	}
	
	public void excluir(Cadastro cadastro) {
		cadastro = carregar(Cadastro.getData());
		em.remove(cadastro);
	}
	
	public Tarefa carregar(int id) {
		return em.find(Cadastro.class, data);
	}
	

}
