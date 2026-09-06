package entities;

public class PessoaFisica extends Pessoa{

	private Double gastosComSaude;
	
	public PessoaFisica() {
		super();
	}
	
	public PessoaFisica(String nome, Double rendaAnual, Double gastosComSaude) {
		super(nome, rendaAnual);
		this.gastosComSaude = gastosComSaude;
	}

	public Double getGastosComSaude() {
		return gastosComSaude;
	}

	public void setGastosComSaude(Double gastosComSaude) {
		this.gastosComSaude = gastosComSaude;
	}

	@Override
	public Double calculoImposto() {
		double res=0;
		double res1=0;
		if (rendaAnual <= 20000) {
			res = rendaAnual * 0.15;
		}
		else {
			res = rendaAnual * 0.25;
		}
		if(gastosComSaude > 0) {
			res1 = gastosComSaude * 0.50;
		}
		return res - res1;
	}

}
