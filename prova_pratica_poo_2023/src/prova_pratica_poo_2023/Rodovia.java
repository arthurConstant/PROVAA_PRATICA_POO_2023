package prova_pratica_poo_2023;

import java.util.ArrayList;
import java.util.List;

public class Rodovia {
    private String sigla;
    private String grauPericulosidade;
    private List<Acidente> acidentes;

    public Rodovia(String sigla, String grauPericulosidade) {
        this.sigla = sigla;
        this.grauPericulosidade = grauPericulosidade;
        this.acidentes = new ArrayList<>();
    }

    public void cadastrarAcidente(Acidente acidente) {
        this.acidentes.add(acidente);
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public String getGrauPericulosidade() {
        return grauPericulosidade;
    }

    public void setGrauPericulosidade(String grauPericulosidade) {
        this.grauPericulosidade = grauPericulosidade;
    }

    public List<Acidente> getAcidentes() {
        return acidentes;
    }

    public void setAcidentes(List<Acidente> acidentes) {
        this.acidentes = acidentes;
    }

	public String contarAcidentesComBicicletas() {
		return null;
	}

	public int contarAcidentesComVitimasFatais() {
		return 0;
	}

	public String contarAcidentesComVeiculosNovos(int i) {
		return null;
	}

	public static List<Rodovia> rodoviasComAcidentesNoCarnaval(List<Rodovia> of, int i) {
		return null;
	}
}