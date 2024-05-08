# product-catalog-java
# Catálogo de Produtos

Este projeto é uma API REST para um catálogo de produtos, onde os usuários podem visualizar, pesquisar e filtrar produtos.

## Regras de Negócio

### 1. Autenticação

- A autenticação não é necessária para visualizar os produtos.
- As operações de criação, atualização e exclusão de produtos exigem autenticação.

### 2. Produtos

- Cada produto tem os seguintes atributos:
    - **ID**: Identificador único do produto.
    - **Nome**: Nome do produto.
    - **Descrição**: Descrição detalhada do produto.
    - **Preço**: Preço do produto.
    - **Categoria**: Categoria à qual o produto pertence.
    - **Disponibilidade**: Indica se o produto está disponível para compra.
    - **Data de Criação**: Data em que o produto foi adicionado ao catálogo.
    - **Última Atualização**: Data da última atualização do produto.

### 3. Operações de Produto

- Os usuários podem realizar as seguintes operações em produtos:
    - **Visualizar Produtos**: Os usuários podem visualizar todos os produtos no catálogo.
    - **Pesquisar Produtos**: Os usuários podem pesquisar produtos por nome, categoria ou preço.
    - **Filtrar Produtos**: Os usuários podem filtrar produtos por categoria, preço mínimo/máximo e disponibilidade.
    - **Adicionar Produto**: Os usuários autenticados podem adicionar novos produtos ao catálogo.
    - **Atualizar Produto**: Os usuários autenticados podem atualizar as informações de um produto existente.
    - **Excluir Produto**: Os usuários autenticados podem excluir produtos do catálogo.

### 4. Paginação

- A listagem de produtos deve suportar paginação para facilitar a navegação pelos resultados.

### 5. Respostas

- As respostas da API devem seguir os padrões HTTP adequados.
- Erros devem ser tratados e retornados com códigos de status apropriados, juntamente com mensagens de erro descritivas.

### 6. Documentação

- O projeto deve incluir uma documentação clara sobre como usar a API, incluindo exemplos de solicitações e respostas.

## Tecnologias Utilizadas

- Java com Spring Boot
- Banco de dados H2
