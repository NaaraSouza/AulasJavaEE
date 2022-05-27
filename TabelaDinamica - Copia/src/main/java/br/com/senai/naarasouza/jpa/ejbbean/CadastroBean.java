package br.com.senai.naarasouza.jpa.ejbbean;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.senai.naarasouza.application.model.Cadastro;


@Stateless
public class CadastroBean {
	@PersistenceContext
	private EntityManager em;
	
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
