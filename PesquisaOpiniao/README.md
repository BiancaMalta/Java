# Pesquisa de Opinião

## Exercício
A empresa de marketing TudoWeb, necessita realizar uma pesquisa de opinião com seus clientes para saber o grau de satisfação no atendimento.

Crie um programa em `Java` utilizando a estrutura de repetição `FOR` para exibir o retorno de uma pesquisa de atendimento ao cliente. Para isso:

O programa deve solicitar  a digitação do `nome`, `idade` e `opinião` do entrevistado sobre o atendimento prestado, sendo: `1-EXCELENTE`, `2-BOM` ou `3-RUIM`. A pesquisa deve ser feita com `50 entrevistados` e o no final, o programa deverá exibir na tela:

a. quantidade de respostas “EXCELENTE”

b. quantidade de respostas “RUIM

**Observações:** utilizar a estrutura de decisão para verificação da opinião e realizar testes com 10 entrevistados.

## Execução

Para realizar a atividade proposta, segui os seguintes passos:

**1. Importei a classe Scanner** 

No início do código, importei a classe `Scanner` do pacote `java.util`, essa classe será usada para obter entradas do usuário.

**2. Defini a classe principal**

Designei uma classe `PesquisaOpiniao` com o método `main`, sendo o ponto de entrada do programa Java.

**3. Criei um objeto Scanner**

Dentro do método main, defini um objeto da `classe Scanner` como `scanner`, que será encerrado pelo método `close()`, após todo o bloco de código ser executado.

**4. Criei as variáveis**

Inicializei duas variáveis inteiras, `excelente` e `ruim`, que serão utilizadas para contar as respostas "EXCELENTE" e "RUIM" respectivamente.

**5. Criei o loop**

O for será responsável por iterar `50 vezes`, contabilizando os dados de cada entrevista.

- Dentro do loop:
    - Solicitei/armazenei o nome do entrevistado.
    - Solicitei/armazenei a idade do entrevistado.
    - Solicitei/armazenei a opinião do entrevistado sobre o atendimento, onde:
        - Se a opção for 1 (EXCELENTE), incrementa o contador excelente.
        - Se a opção for 3 (RUIM), incrementa o contador ruim.

Após o loop, é exibido o resultado da pesquisa, mostrando a quantidade de respostas "EXCELENTE" e "RUIM".


## Autora
[![Linkedin Badge](https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/bianca-malta/)
