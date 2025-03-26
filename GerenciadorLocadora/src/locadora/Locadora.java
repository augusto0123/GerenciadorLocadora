package locadora;

import model.Filme;

import java.util.ArrayList;
import java.util.List;

public class Locadora {

    // Criada a lista para adicionar filmes
    List<Filme> filmes = new ArrayList<>();

    // Funcao para adicionar filmes na lista
    public void adicionarFilme(Filme filme){
        filmes.add(filme);
    }
}
