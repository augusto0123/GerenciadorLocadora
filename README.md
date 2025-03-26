# Gerenciador de Filmes - Catalogo de Filmes

## Descrição

Este é um sistema simples para gerenciar filmes em uma locadora. O objetivo é permitir a adição, busca, ordenação e visualização de filmes com base em atributos como título, diretor, e ano de lançamento.

## Funcionalidades

O sistema oferece as seguintes funcionalidades:

1. **Adicionar Filmes**: Adiciona um novo filme ao catálogo.
2. **Buscar Filmes por Título**: Pesquisa filmes pelo título.
3. **Listar Filmes Ordenados pelo Ano de Lançamento**: Exibe a lista de filmes ordenada por ano de lançamento de forma crescente.
4. **Contagem de Filmes por Diretor**: Exibe a contagem de filmes disponíveis para cada diretor.
5. **Filmes Únicos**: Exibe filmes sem repetições no catálogo.
6. **Filmes Lançados Antes de um Ano Específico**: Exibe filmes que foram lançados antes de um ano fornecido.

## Requisitos Técnicos

- **Linguagem**: Java
- **Estruturas de Dados**: 
  - `List<Filme>` para armazenar filmes.
  - `Map<String, Integer>` para contar filmes por diretor.
  - `Set<Filme>` para garantir que os filmes sejam únicos.
  - **Stream API** para filtrar filmes com base no ano de lançamento.
- **Classe Filme**: Cada filme possui os atributos `titulo`, `diretor` e `anoLancamento`.
