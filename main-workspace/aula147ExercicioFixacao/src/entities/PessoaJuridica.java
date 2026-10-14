package entities;

public class PessoaJuridica extends Pessoa{
	
	private int numeroDeFuncionarios;
	
	public PessoaJuridica() {
		super();
	}
	
	public PessoaJuridica(String nome, Double rendaAnual, int numeroDeFuncionarios) {
		super(nome, rendaAnual);
		this.numeroDeFuncionarios = numeroDeFuncionarios;
	}

	public int getNumeroDeFuncionarios() {
		return numeroDeFuncionarios;
	}

	public void setNumeroDeFuncionarios(int numeroDeFuncionarios) {
		this.numeroDeFuncionarios = numeroDeFuncionarios;
	}

	@Override
	public Double calculoImposto() {
		if (numeroDeFuncionarios >= 10) {
			return rendaAnual * 0.14;
		}
		else {
			return rendaAnual * 0.16;
		}
	}
	
}
