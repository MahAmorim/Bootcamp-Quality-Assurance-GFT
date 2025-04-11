# Desafios Básicos de Java

## 1. Desafio: A Fila do Banco
Crie um programa que simule uma fila de atendimento bancário. O programa deve ler o nome de 3 pessoas (clientes do banco), armazená-los em uma fila, e imprimir a posição de cada cliente.

### Entrada
A entrada será o nome de três pessoas (clientes do banco).

### Saída
O programa deve imprimir o nome de cada pessoa e a sua posição na fila.

| **Exemplo de Entrada** | **Exemplo de Saída** |
| ---------------------- | --------------------- |
| Ana, Sofia, Lucas      | Ana - está na posição: 1, Sofia - está na posição: 2, Lucas - está na posição: 3 |

### Dica:
Utilize uma estrutura de dados do tipo **Fila (Queue)** para armazenar os clientes, já que esse tipo de estrutura segue a ordem de entrada (FIFO - First In, First Out).

---

## 2. Desafio: Média de Idade
Faça um programa que leia a idade de 3 pessoas e, ao final, calcule a média de idade da turma. O programa deve classificar a turma conforme a média calculada, determinando se ela é jovem, adulta ou idosa.

### Entrada
A entrada consistirá em três números inteiros que representam a idade de cada pessoa.

### Saída
O programa deverá imprimir a média de idade e classificar a turma com base nessa média:

- **0 a 25**: Turma jovem.
- **26 a 60**: Turma adulta.
- **Acima de 60**: Turma idosa.

| **Exemplo de Entrada** | **Exemplo de Saída** |
| ---------------------- | --------------------- |
| 70, 60, 61             | Idosa!               |

### Dica:
A média pode ser calculada somando as idades e dividindo por 3. A classificação pode ser feita usando condicionais (`if` ou `switch`).

---

## 3. Desafio: Menor Múltiplo
Dado um número inteiro positivo `n`, crie um programa que retorne o menor múltiplo de `n` e `2`.

### Entrada
A entrada será um número inteiro positivo `n`.

### Saída
O programa deve imprimir o menor múltiplo de `n` e `2`.

| **Exemplo de Entrada** | **Exemplo de Saída** |
| ---------------------- | --------------------- |
| 5                      | O resultado é: 10    |

### Dica:
O menor múltiplo entre dois números pode ser calculado utilizando a fórmula:
```
Mínimo múltiplo = n * 2
```
No caso de números ímpares, o próximo múltiplo será o número vezes 2.

---

## 4. Desafio: Encontrando o Percentual de Desconto
O gerente de uma loja resolveu aplicar descontos em todos os seus produtos. A tarefa é calcular o percentual de desconto aplicado em um produto, dado o preço original e o preço com o desconto.

### Entrada
A entrada será composta por dois valores: `M` e `D`. O valor `M` é o preço original do produto, e o valor `D` é o preço com o desconto já aplicado.

### Saída
O programa deverá calcular e imprimir o percentual de desconto aplicado no produto.

| **Exemplo de Entrada** | **Exemplo de Saída** |
| ---------------------- | --------------------- |
| 40, 30                 | O desconto foi de 25% |

### Dica:
Use a fórmula para calcular o percentual de desconto:

```
Percentual de Desconto = ((M - D) / M) * 100
```


---

## 5. Desafio: Qual é o seu turno?
Faça um Programa que pergunte em que turno você estuda. Peça para digitar M (matutino), V (vespertino) ou N (noturno). Imprima a mensagem correspondente: "Bom Dia!", "Boa Tarde!" ou "Boa Noite!", ou "Valor Inválido!", caso a entrada seja diferente.

### Entrada
A entrada será um caractere (`M`, `V` ou `N`) que informa o turno.

### Saída
O programa deverá imprimir a mensagem conforme o turno informado:

| **Exemplo de Entrada** | **Exemplo de Saída** |
| ---------------------- | --------------------- |
| M                      | Bom Dia!             |
| N                      | Boa Noite!           |
| T                      | Valor Inválido!      |

### Dica:
Use condicionais (`if` ou `switch`) para verificar o valor da entrada e imprimir a mensagem correspondente.


