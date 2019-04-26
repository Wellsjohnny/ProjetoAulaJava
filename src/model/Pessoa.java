package model;

public class Pessoa {
	private String nome;
	private	String endereço;
	private	String bairro;
	private long cep;
	private String cidade;
	private String estado;
	
	public void setNome(String nome) {
	 this.nome = nome;	
    }

	public String getNome() {
		return nome;
	}
	
	public void setendereço(String endereço) {
		 this.endereço = endereço;	
	    }
	
	public String getendereço() {
		return endereço;
	}
	public void setbairro(String bairro) {
		 this.bairro = bairro;	
	    }
	
	public String getbairro() {
		return bairro;
	}
	public void setcep(long cep) {
		 this.cep = cep;	
	    }
	
	public long getcep() {
		return cep;
	}
	public void setcidade(String cidade) {
		 this.cidade = cidade;	
	    }
	
	public String getcidade() {
		return cidade;
	}
	public void setestado(String estado) {
		 this.estado = estado;	
	    }
	
	public String getestado() {
		return estado;
	}
}