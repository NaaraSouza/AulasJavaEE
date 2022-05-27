package br.com.senai.naarasouza.application.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;



@Generated(value="Dali", date="2022-05-27T16:38:43.194-0300")
@StaticMetamodel(Cadastro.class)


public class Cadastro_ {
	public static volatile SingularAttribute<Cadastro, Integer> id;
	public static volatile SingularAttribute<Cadastro, String> descricao;
	public static volatile SingularAttribute<Cadastro, Integer> prioridade;
	public static volatile SingularAttribute<Cadastro, Boolean> concluida;
}
