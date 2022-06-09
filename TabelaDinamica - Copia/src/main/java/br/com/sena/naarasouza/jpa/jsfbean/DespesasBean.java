package br.com.sena.naarasouza.jpa.jsfbean;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


import br.com.senai.naarasouza.jpa.model.Despesa;


@Stateless //Isso significa que as variáveis de instância do bean podem manter dados relativos entre invocações de métodos. E isso possibilita as chamadas de método interdependentes
public class DespesasBean {

	@PersistenceContext //O PersistenceContext funciona como Container que guarda as entidades que estão sendo gerenciadas pelo EntityManager
	private EntityManager em; //EntityManager insere dados/objetos no banco de dados. 
	
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


