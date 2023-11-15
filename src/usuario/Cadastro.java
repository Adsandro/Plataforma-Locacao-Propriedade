package usuario;

import propriedade.Propriedade;

import java.util.List;
import java.util.Scanner;

public class Cadastro {

    public static void cadastrarUsuario(List<Usuario> listaUsuarios) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1-usuario.Cadastro de usuario.Usuario");

        System.out.println("Digite o seu nome");
        String nome = scanner.next();
        System.out.println("Digite o seu email");
        String email = scanner.next();
        System.out.println("Digite uma senha");
        String senha = scanner.next();

        listaUsuarios.add(new Usuario(nome, email, senha));

    }

    public static boolean login(List<Usuario> listaUsuarios) {
        Scanner scanner = new Scanner(System.in);
        boolean teste = false;

        System.out.println("Digite seu email");
        String email = scanner.next();
        System.out.println("Digite seu senha");
        String senha = scanner.next();

        for (int i = 0; i < listaUsuarios.size(); i++) {
            if (listaUsuarios.get(i).getEmail().equals(email) && listaUsuarios.get(i).getSenha().equals(senha)) {
                teste = true;
                Usuario usuarioLogado = listaUsuarios.get(i);
                SessaoUsuario.setUsuarioLogado(usuarioLogado);

            }
        }
        return teste;
    }



    @SuppressWarnings("empty-statement")
    public static void cadastrarPropriedade(Usuario usuario, List<Propriedade> listaPropriedades) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("1-usuario.Cadastro de propriedade.Propriedade");

        System.out.println("Digite o título da propriedade");
        String titulo = scanner.next();
        System.out.println("Digite a descrição");
        String descricao = scanner.next();
        System.out.println("Digite a localização");
        String localizacao = scanner.next();
        System.out.println("Digite a capacidade de pessoas");
        int capacidade = scanner.nextInt();;
        System.out.println("Digite o preço por noite");
        float precoNoite = scanner.nextFloat();


        Propriedade propriedade = new Propriedade(titulo, descricao, localizacao, capacidade, precoNoite);
        usuario.cadastroPropriedadeUsuario(propriedade);
        listaPropriedades.add(propriedade);


    }
}