package view;

import model.Pessoa;

public class Execucao{

	public static void main(String[] args)  {
		//TODO Auto-generated method stub
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Wellington Martins");
		pessoa.setendere�o("Rua central");
		pessoa.setbairro("jardim das cam�lias");
		pessoa.setcep(58458968);
		pessoa.setcidade("S�o Paulo");
		pessoa.setestado("S�o Paulo");
		System.out.println(pessoa.getNome());
		System.out.println(pessoa.getendere�o());
		System.out.println(pessoa.getbairro());
		System.out.println(pessoa.getcep());
		System.out.println(pessoa.getcidade());
		System.out.println(pessoa.getestado());
	}
	
	
}
