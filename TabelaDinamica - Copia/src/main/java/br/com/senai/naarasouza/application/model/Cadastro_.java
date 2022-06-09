package br.com.senai.naarasouza.application.model;

import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;



@Generated(value="Dali", date="2022-05-27T16:38:43.194-0300") //
@StaticMetamodel(Cadastro.class) //@StaticMetamodel é a anotação especifica que a classe é uma classe de metamodelo que representa a entidade, superclasse mapeada ou classe incorporável designada pelo elemento de valor.


public class Cadastro_ {
	public static volatile SingularAttribute<Cadastro, Integer> id; //volatile é usado para indicar que o valor de uma variável será modificado por diferentes threads
	public static volatile SingularAttribute<Cadastro, String> descricao; //As instâncias do tipo SingularAttributerepresentam propriedades ou campos persistentes de valor único.
	public static volatile SingularAttribute<Cadastro, Integer> prioridade;
	public static volatile SingularAttribute<Cadastro, Boolean> concluida;
}
