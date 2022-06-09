package br.com.rafaelcosta.application.ejb;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import br.com.rafaelcosta.application.model.Cliente;


@Stateless //Faz a requisição do banco de dados e retorna pra gente.
public class ClienteBean {

	@PersistenceContext // Ele guarda as entidades que estão sendo gerenciadas pelo EntityManager
	private EntityManager em;
	
	public List<Cliente> listar() {
		return em.createQuery("SELECT c FROM Cliente c", Cliente.class).getResultList();
	}
}
