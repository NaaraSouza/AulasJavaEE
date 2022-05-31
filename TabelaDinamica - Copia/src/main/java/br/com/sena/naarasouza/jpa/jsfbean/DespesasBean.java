package br.com.sena.naarasouza.jpa.jsfbean;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


import br.com.senai.naarasouza.jpa.model.Despesa;


@Stateless
public class DespesasBean {

	@PersistenceContext
	private EntityManager em;
	
	public void inserir(Despesa despesa) {
		em.persist(despesa);
	}
	
	public void atualizar(Despesa despesa) {
		em.merge(despesa);
	}
	
	public void excluir(Despesa despesa) {
		despesa = carregar(despesa.getId());
		em.remove(despesa);
	}
	
	public Despesa carregar(int id) {
		return em.find(Despesa.class, id);
	}
}


