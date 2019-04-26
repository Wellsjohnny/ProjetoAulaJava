package view;

import model.Pessoa;

public class Execucao{

	public static void main(String[] args)  {
		//TODO Auto-generated method stub
		Pessoa pessoa = new Pessoa();
		pessoa.setNome("Wellington Martins");
		pessoa.setendereço("Rua central");
		pessoa.setbairro("jardim das camélias");
		pessoa.setcep(58458968);
		pessoa.setcidade("São Paulo");
		pessoa.setestado("São Paulo");
		System.out.println(pessoa.getNome());
		System.out.println(pessoa.getendereço());
		System.out.println(pessoa.getbairro());
		System.out.println(pessoa.getcep());
		System.out.println(pessoa.getcidade());
		System.out.println(pessoa.getestado());
	}
	
	
}
