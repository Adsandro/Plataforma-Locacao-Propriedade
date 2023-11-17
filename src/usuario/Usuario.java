package usuario;

import propriedade.Avaliacao;
import propriedade.Propriedade;
import propriedade.Reserva;

import java.util.ArrayList;
import java.util.List;

public class Usuario{
    private String nome;
    private String email;
    private String senha;
    private List<Propriedade> propriedadesDoUsuario;
    private List<Reserva> reservaDoUsuario;
    private List<Avaliacao> avaliacaoDoUsuario;

    public Usuario(String nome, String email, String senha){
        this.nome = nome;
        this.email = email;
        this.senha = senha;

        this.propriedadesDoUsuario = new ArrayList<>();
        this.reservaDoUsuario = new ArrayList<>();
        this.avaliacaoDoUsuario = new ArrayList<>();
    }

    public String getDados() {
        return getEmail() + getSenha();
    }
    public String getNome(){
        return nome;
    }

    public String getEmail(){
        return email;
    }

    public String getSenha(){
        return senha;
    }

    public void cadastroPropriedadeUsuario(Propriedade propriedade){
        propriedadesDoUsuario.add(propriedade);
    }

    public void listaPropriedadeUsuario(){
        for(int i = 0; i<propriedadesDoUsuario.size();i++){
            System.out.printf("----------------%d------------------\n", i + 1);
            System.out.println(propriedadesDoUsuario.get(i).getDados());
            propriedadesDoUsuario.get(i).listaAvaliacoes();
            System.out.println("------------------------------------");
            // adicionar a media de avaliações
        }
    }

    public void propridadesAlugadas(){
        for(int i = 0; i<propriedadesDoUsuario.size();i++){
            if(!propriedadesDoUsuario.get(i).isDisponivel()) {
                System.out.println("Propriedades alugadas");
                System.out.printf("----------------%d------------------\n", i + 1);
                System.out.println(propriedadesDoUsuario.get(i).getDados());
                System.out.println("------------------------------------");
                return;
            }

        }
        System.out.println("------------------------------------");
        System.out.println("Você não tem nenhuma propriedade alugada ou ainda não cadastrou nenhuma.");
        System.out.println("------------------------------------");
    }

    public void pedidoDeReserva(Reserva reserva){
        reservaDoUsuario.add(reserva);
    }

    public void listaReservaUsuario(){
        int i = 1;
        System.out.println("Propriedades a serem avaliadas: ");
        for (Reserva reserva : reservaDoUsuario) {
            System.out.print(i +"- ");
            System.out.println(reserva.getNomePropriedade().getTitulo());
            i += 1;
        }
    }
}