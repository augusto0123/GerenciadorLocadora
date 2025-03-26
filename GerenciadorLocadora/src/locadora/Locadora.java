package locadora;

import model.Filme;

import java.util.*;
import java.util.stream.Collectors;

public class Locadora {

    // Criada a lista para adicionar filmes
    List<Filme> filmes = new ArrayList<>();

    // Funcao para adicionar filmes na lista
    public void adicionarFilme(Filme filme){
        filmes.add(filme);
    }

    // Funcao para buscar filme por titulo
    public List<Filme> buscarFilmePorTitulo(String titulo){
        return filmes.stream()
                .filter(filme -> filme.getTitulo().equalsIgnoreCase(titulo))
                .collect(Collectors.toList());
    }

    // Funcao para ordenar de forma crescente filmes por ano de publicacao
    public List<Filme> ordenarFilmesPorAno(){
        return filmes.stream()
                .sorted(Comparator.comparingInt(Filme::getAnoLancamento))
                .collect(Collectors.toList());
    }

    // Funcao para contar filmes por autor
    public Map<String, Integer> contagemFilmesPorDiretor(){
        Map<String, Integer> contagemPorAutor = new HashMap<>();

        for (Filme filme : filmes){
            contagemPorAutor.put(filme.getDiretor(),
            contagemPorAutor.getOrDefault(filme.getDiretor(),0) +1);
        }
        return contagemPorAutor;
    }

    // Funcao para listar filmes unicos
    public Set<Filme> listarFilmesUnicos(){
        return new HashSet<>(filmes);
    }

    // Funcao para mostrar filmes antes de um determinado periodo
    public List<Filme> listarFilmesAntesDeAno(int ano){
        return filmes.stream()
                .filter(filme -> filme.getAnoLancamento() < ano) // filtra os filmes antes do ano forneçido
                .collect(Collectors.toList()); // converte o resultado da pesquisa em uma lista
    }
}
