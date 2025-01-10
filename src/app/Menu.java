package app;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import model.Cep;
import service.ConsultaCepService;
import service.GeraArquivoService;

public class Menu {
    private final Scanner scanner = new Scanner(System.in);
    private final ConsultaCepService consultaCepService = new ConsultaCepService();
    private final GeraArquivoService geraArquivoService = new GeraArquivoService();

    public void exibirMenu(){
        String busca;
        List<Cep> ceps = new ArrayList<>();


        do {
            System.out.println("Para sair, digite 'sair'.");
            System.out.println("Digite o CEP (somente numeros) que deseja verificar: ");
            busca = scanner.nextLine();

            if (busca.equalsIgnoreCase("sair"))
            break;

            if (busca.length() != 8) {
                System.out.println("CEP inválido, digite novamente.");
            } else {
                try {
                    System.out.println("Buscando...");
                    Cep cep = consultaCepService.consultarCep(busca);
                    System.out.println(cep);
                    ceps.add(cep);
                } catch (Exception e) {
                    System.out.println("Erro ao buscar CEP: " + e.getMessage());
                }
            }

        } while (!busca.equalsIgnoreCase("sair"));

        try {
            geraArquivoService.gerarArquivo(ceps, "Ceps.json");
        } catch (Exception e) {
            System.out.println("Erro ao criar o arquivo: "  + e.getMessage());
        }

        System.out.println("Programa finalizado.");
    }
}
