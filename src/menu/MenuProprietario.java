package menu;

import propriedade.Propriedade;
import usuario.Cadastro;
import usuario.SessaoUsuario;

import java.util.List;
import java.util.Scanner;

public class MenuProprietario{
    public static void abrirMenuProprietario(List<Propriedade> listaPropriedades){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Selecione uma opção\n1- Cadastrar propriedade\n2- Exibir minhas propriedades\n3- Exibir propriedades alugadas");
        int opcao2 = scanner.nextInt();
        switch (opcao2) {
            case 1:
                Cadastro.cadastrarPropriedade(SessaoUsuario.getUsuarioLogado(), listaPropriedades);
                break;
            case 2:
                SessaoUsuario.getUsuarioLogado().listaPropriedadeUsuario();

                //Media de avaliações
                break;
            case 3:
                //Lista de propriedadesUsuario
                SessaoUsuario.getUsuarioLogado().propridadesAlugadas();
                // adicionar a media de avaliações

                //propriedade.Propriedade disponivel = false
                break;
            default:
                System.out.println("Inválido");
                break;
        }
    }
}
