package prova_pratica_poo_2023;

import java.util.ArrayList;
import java.util.List;

public class Acidente {
    private Rodovia rodovia;
    private int vitimasFatais;
    private int feridos;
    private int mes;
    private List<Veiculo> veiculosEnvolvidos;
	private Object veiculosEn;

    public Acidente(Rodovia rodovia, int vitimasFatais, int feridos, int mes) {
        this.rodovia = rodovia;
        this.vitimasFatais = vitimasFatais;
        this.feridos = feridos;
        this.mes = mes;
        this.veiculosEnvolvidos = new ArrayList<>();
    }

    public void adicionarVeiculoEnvolvido(Veiculo veiculo) {
        this.veiculosEnvolvidos.add(veiculo);
    }

    public Rodovia getRodovia() {
        return rodovia;
    }

    public void setRodovia(Rodovia rodovia) {
        this.rodovia = rodovia;
    }

    public int getVitimasFatais() {
        return vitimasFatais;
    }

    public void setVitimasFatais(int vitimasFatais) {
        this.vitimasFatais = vitimasFatais;
    }

    public int getFeridos() {
        return feridos;
    }

    public void setFeridos(int feridos) {
        this.feridos = feridos;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public List<Veiculo> getVeiculosEnvolvidos() {
        return veiculosEnvolvidos;
    }

	public Object getVeiculosEn() {
		return veiculosEn;
	}

	public void setVeiculosEn(Object veiculosEn) {
		this.veiculosEn = veiculosEn;
	}
}
        
  