import locadora.Locadora;
import model.Filme;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Locadora locadora = new Locadora();

        Filme filme1 = new Filme("Filme1", "Diretor1", 1950);
        Filme filme2 = new Filme("Filme2", "Diretor1", 1960);
        Filme filme3 = new Filme("Filme3", "Diretor2", 2010);
        Filme filme4 = new Filme("Filme4", "Diretor1", 1990);
        Filme filme5 = new Filme("Filme5", "Diretor3", 2002);
        Filme filme6 = new Filme("Filme6", "Diretor3", 2015);

        locadora.adicionarFilme(filme1);
        locadora.adicionarFilme(filme2);
        locadora.adicionarFilme(filme3);
        locadora.adicionarFilme(filme4);
        locadora.adicionarFilme(filme5);
        locadora.adicionarFilme(filme6);

    }
}