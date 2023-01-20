package exercicio_5;

import java.util.ArrayList;
import java.util.List;

public class Service {
	
	private Double alturaMaxima = 0.00;
	private Double alturaMinima = 0.00;
	private Double media = 0.00;
	
	private List<Pessoa> mulheres = new ArrayList<>();
	
	
	public void CalcularAltura(List<Pessoa> pessoas) {
		for (Pessoa pessoa : pessoas) {
			if(pessoa.getAltura() > alturaMaxima) {
				this.alturaMaxima = pessoa.getAltura();
			}
		}
		alturaMinima = alturaMaxima;
		for (Pessoa pessoa : pessoas) {
			if(alturaMinima > pessoa.getAltura()) {
				this.alturaMinima = pessoa.getAltura();
			}
		}
	}
	public void CalcularMediaAltura(List<Pessoa> pessoas) {
		List<Pessoa> homens = new ArrayList<>();
		Integer divisor = 0;
		Double somaAltura = 0.00;
		for (Pessoa pessoa : pessoas) {
			if(pessoa.getSexo() == 1) {
				homens.add(pessoa);
				divisor++;
			}
		}
		for (Pessoa homem : homens) {
			somaAltura += homem.getAltura();
		}
	   this.media = somaAltura/divisor;
	}
	public void CalcularQtdMulheres(List<Pessoa> pessoas) {
		for (Pessoa pessoa : pessoas) {
			if(pessoa.getSexo() == 2) {
				this.mulheres.add(pessoa);
			}
		}
	}

	public Double getMedia() {
		return media;
	}
	public Double getAlturaMaxima() {
		return alturaMaxima;
	}

	public Double getAlturaMinima() {
		return alturaMinima;
	}
	public Integer getQtdMulheres() {
		return mulheres.size();
	}
	
}
