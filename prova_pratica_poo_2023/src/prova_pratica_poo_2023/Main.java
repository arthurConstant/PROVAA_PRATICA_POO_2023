package prova_pratica_poo_2023;

import java.util.List;

public class Main {
    private static List<Rodovia> acidentesNoCarnaval;
	private static List<Rodovia> rodoviasNoCarnaval;

	public static void main(String[] args) {

        Rodovia br101 = new Rodovia("BR-101", "alto");
        Rodovia br116 = new Rodovia("BR-116", "médio");

        Veiculo carro = new Veiculo(2018, 0);
        Veiculo moto = new Veiculo(2020, 0);
        Veiculo caminhao = new Veiculo(2015, 1500);

        Acidente acidente1 = new Acidente(br101, 2, 3, 7);
        acidente1.adicionarVeiculoEnvolvido(carro);
        acidente1.adicionarVeiculoEnvolvido(moto);
        acidente1.adicionarVeiculoEnvolvido(caminhao);
        acidente1.adicionarVeiculoEnvolvido(new Bicicleta(2019));
        acidente1.adicionarVeiculoEnvolvido(new Bicicleta(2022));

        br101.cadastrarAcidente(acidente1);

        Acidente acidente2 = new Acidente(br116, 1, 2, 8);
        acidente2.adicionarVeiculoEnvolvido(carro);
        acidente2.adicionarVeiculoEnvolvido(new Bicicleta(2021));

        br116.cadastrarAcidente(acidente2);

        System.out.println("acidentes com bicicletas na BR-101: " + br101.contarAcidentesComBicicletas());
        System.out.println("Rodovia com mais acidentes fatais: " + (br101.contarAcidentesComVitimasFatais() > br116.contarAcidentesComVitimasFatais() ? br101.getSigla() : br116.getSigla()));
        System.out.println("acidentes com veiculos novos em 2023: " + br101.contarAcidentesComVeiculosNovos(2023));

        setRodoviasNoCarnaval(Rodovia.rodoviasComAcidentesNoCarnaval(List.of(br101, br116), 2));
        System.out.println("Rodovias com acidentes no carnaval:"+ (br101.contarAcidentesComVitimasFatais() > br116.contarAcidentesComVitimasFatais() ? br101.getSigla() : br116.getSigla()));
        br101.listarAcidentesComCondutorEmbriagado();
        br116.listarAcidentesComCondutorEmbriagado();
        
        br101.listarAcidentesPorNivelPericulosidade();
        br116.listarAcidentesPorNivelPericulosidade();
        
	}

	public static List<Rodovia> getAcidentesNoCarnaval() {
		return acidentesNoCarnaval;
	}

	public static void setAcidentesNoCarnaval(List<Rodovia> acidentesNoCarnaval) {
		Main.acidentesNoCarnaval = acidentesNoCarnaval;
	}

	public static List<Rodovia> getRodoviasNoCarnaval() {
		return rodoviasNoCarnaval;
	}

	public static void setRodoviasNoCarnaval(List<Rodovia> rodoviasNoCarnaval) {
		Main.rodoviasNoCarnaval = rodoviasNoCarnaval;
	}
}