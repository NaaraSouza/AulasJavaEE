package br.com.rafaelcosta.application.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
public class Pedido implements Serializable {

	@Id
	@GeneratedValue
	private Integer id;
	
	@Column(name = "valor_total")
	private Double valorTotal;
	
	@Temporal(TemporalType.DATE) //Esta anotação deve ser especificada para campos persistentes ou propriedades do tipo java.util.Datee java.util.Calendar.A Temporalanotação pode ser usada em conjunto com a Basicanotação, a Id anotação ou a ElementCollectionanotação (quando o valor da coleção de elementos for desse tipo temporal.
	@Column(nullable = false)
	private Date data;

	@OneToOne
	@JoinColumn(name = "pagamento_id")//indica que a classe na qual você está utilizando-a é a dona ou o lado forte do relacionamento.
	private Pagamento pagamento;
	
	@ManyToOne //"Muitos para um"
	@JoinColumn(name = "cliente_id")
	private Cliente cliente;
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(name = "pedido_produto", //Usado no mapeamento de associações. É especificado no lado proprietário de uma associação.
		joinColumns = @JoinColumn(name = "pedido_id"),
		inverseJoinColumns = @JoinColumn(name = "produto_id"))
	private List<Produto> produtos = new ArrayList<Produto>();

	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public Pagamento getPagamento() {
		return pagamento;
	}

	public void setPagamento(Pagamento pagamento) {
		this.pagamento = pagamento;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	@Override
	public String toString() {
		return "Pedido [id=" + id + ", valorTotal=" + valorTotal + ", data="
				+ data + "]";
	}
}
