import menu.Menu;
import propriedade.Propriedade;
import usuario.Usuario;

import java.util.ArrayList;
import java.util.List;

public class Main
{
    public static void main(String[] args) {
        List<Usuario> listaUsuarios = new ArrayList<>();
        List<Propriedade> listaPropriedades = new ArrayList<>();
       Menu.abrirMenu(listaUsuarios,listaPropriedades);
    }
}
