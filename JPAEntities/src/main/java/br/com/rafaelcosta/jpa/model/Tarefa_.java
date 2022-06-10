package br.com.rafaelcosta.jpa.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="Dali", date="2022-05-27T16:38:43.194-0300")
@StaticMetamodel(Tarefa.class) //permite gerar e referenciar estaticamente os atributos de cada entidade do seu modelo.
public class Tarefa_ {
	public static volatile SingularAttribute<Tarefa, Integer> id;
	public static volatile SingularAttribute<Tarefa, String> descricao;
	public static volatile SingularAttribute<Tarefa, Integer> prioridade;
	public static volatile SingularAttribute<Tarefa, Boolean> concluida;
}
