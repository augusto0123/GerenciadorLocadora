package locadora;

import model.Filme;

import java.util.ArrayList;
import java.util.List;

public class Locadora {

    List<Filme> filmes = new ArrayList<>();

    public void adicionarFilme(Filme filme){
        filmes.add(filme);
    }
}
