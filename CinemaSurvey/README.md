# Cinema Survey
## Exercício
Um cinema possui capacidade de 40 lugares e está sempre com ocupação total. Certo dia, cada espectador respondeu a um questionário, no qual constava:

  - idade;

  - opinião em relação ao filme, segundo as seguintes notas:

      A - Ótimo /  B - Bom / C - Regular  / D - Ruim  / E -  Péssimo.

 

Elabore a codificação em JAVA para que leia os dados, calcule e exiba na tela:

 - a quantidade de respostas "ótimo";

- a média de idade das pessoas que responderam "ruim";

- a porcentagem de respostas "péssimo".

## Execução

Para realizar a atividade proposta, segui os seguintes passos:

**1. Importações e Declarações de Variáveis**

Comecei importando a classe Scanner do pacote java.util, que nos permite ler entradas do usuário. Em seguida, declarei algumas variáveis para armazenar dados relevantes, como a `capacidade máxima do cinema`, `contadores` para as diferentes respostas e a `idade total` das pessoas que responderam "ruim".

**2. Loop Principal**

O programa começa exibindo uma mensagem indicando que está coletando dados dos espectadores. Ele ficará em loop enquanto o número total de respostas for menor que a capacidade máxima do cinema.

**3. Coleta de Idade**

Dentro do loop, o programa solicita a idade do espectador. Antes de aceitar a entrada, há uma validação para garantir que o valor inserido seja um número inteiro e esteja dentro do intervalo de 1 a 100.

**4. Coleta de Opinião**

Após a idade ser validada, o programa solicita a opinião do espectador. Neste ponto, foi adicionado um novo loop para garantir que apenas as opções válidas (A, B, C, D ou E) sejam aceitas como entrada.

**5. Processamento de Respostas**

Após coletar a idade e a opinião do espectador, o programa verifica a opinião e realiza as operações correspondentes:
- Incrementa o contador para respostas "ótimo" se a opinião for A.
- Adiciona a idade à soma das idades das pessoas que responderam "ruim".
- Incrementa o contador de respostas "ruim" se a opinião for D.
- Incrementa o contador de respostas "péssimo" se a opinião for E.

**6. Cálculos Finais e Exibição dos Resultados**

Fora do loop principal, o programa calcula a média de idade das pessoas que responderam "ruim" e a porcentagem de respostas "péssimo". Por fim, os resultados são exibidos na tela.

## Autora
[![Linkedin Badge](https://img.shields.io/badge/LinkedIn-0077B5?style=for-the-badge&logo=linkedin&logoColor=white)](https://www.linkedin.com/in/bianca-malta/)