package menu;

import propriedade.Propriedade;
import propriedade.Reserva;
import usuario.Cadastro;
import usuario.SessaoUsuario;
import usuario.Usuario;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {

    public static void abrirMenu() {
        Scanner scanner = new Scanner(System.in);

        List<Usuario> listaUsuarios = new ArrayList<>();
        CopulaMenu.implementaUsuario(listaUsuarios);
        List<Propriedade> listaPropriedades = new ArrayList<>();
        CopulaMenu.implementaPropriedade(listaPropriedades, listaUsuarios);

        System.out.println("Selecione uma opção\n1- Cadastrar novo usuario\n2- Sou usuario\n3- Sou proprietario");
        int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    Cadastro.cadastrarUsuario(listaUsuarios);
                    break;
                case 2:
                    if (Cadastro.login(listaUsuarios)) {
                        MenuUsuario.abrirMenuUsuario(listaPropriedades);
                    } else {
                        System.out.println("Login incorreto");
                        Menu.abrirMenu();
                    }   break;
                case 3:
                    if (Cadastro.login(listaUsuarios)){
                        MenuProprietario.abrirMenuProprietario(listaPropriedades);
                    } else {
                        System.out.println("Inválido");
                        Menu.abrirMenu();
                    }   break;
                default:
                    System.out.println("Opção incorreta");
                    Menu.abrirMenu();
            }
    }
}