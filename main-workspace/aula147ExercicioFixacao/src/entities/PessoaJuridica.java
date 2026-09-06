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
		double res=0;
		if (numeroDeFuncionarios >= 10) {
			res = rendaAnual * 0.14;
		}
		else {
			res = rendaAnual * 0.16;
		}
		return res;
	}
	
}
