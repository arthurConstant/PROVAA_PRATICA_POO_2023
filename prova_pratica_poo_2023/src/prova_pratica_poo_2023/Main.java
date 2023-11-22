package prova_pratica_poo_2023;

import java.util.List;

public class Main {
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

        System.out.println("Quantidade de acidentes com bicicletas na BR-101: " + br101.contarAcidentesComBicicletas());
        System.out.println("Rodovia com mais acidentes fatais: " + (br101.contarAcidentesComVitimasFatais() > br116.contarAcidentesComVitimasFatais() ? br101.getSigla() : br116.getSigla()));
        System.out.println("Quantidade de acidentes com veículos novos em 2023: " + br101.contarAcidentesComVeiculosNovos(2023));

        List<Rodovia> rodoviasNoCarnaval = Rodovia.rodoviasComAcidentesNoCarnaval(List.of(br101, br116), 2);
        System.out.println("Rodovias com acidentes no carnaval:");
        for (Rodovia rodovia : rodoviasNoCarnaval) {
            System.out.println(rodovia.getSigla());
        }
    }
}