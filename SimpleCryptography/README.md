# SimpleCryptography - Programa de Criptografia Simples em Java

Este projeto implementa um programa simples de criptografia utilizando a linguagem **Java** e a biblioteca **JOptionPane** para interação gráfica com o usuário. O objetivo do programa é criptografar uma mensagem somando **10 unidades** ao valor ASCII de cada caractere da entrada.

---

## 📌 **Funcionamento do Programa**

O programa segue as seguintes etapas:

1. **Leitura da String de entrada** via **JOptionPane**;
2. **Separação dos caracteres** da String e exibição ao usuário;
3. **Conversão dos caracteres** para seus respectivos valores ASCII e exibição;
4. **Soma de 10 unidades** a cada valor ASCII (criptografia) e exibição do resultado;
5. **Conversão de volta** dos valores modificados para caracteres e exibição da mensagem criptografada final.

Exemplo de execução:

- **Entrada:** `CPS`
- **Processo:**
  - Separação de caracteres: `C P S`
  - Conversão para ASCII: `67 80 83`
  - Soma de 10 unidades: `77 90 93`
  - **Mensagem criptografada:** `MZ]`

---

## 🛠 **Requisitos para Executar**
- **Java JDK 8 ou superior**
- **Sistema operacional compatível:** Linux, Windows ou macOS
- **Compilador Java (`javac`)** instalado e configurado no `PATH`

---

## 📚 **Explicação Técnica**
1. **`JOptionPane.showInputDialog()`**: Exibe uma caixa de diálogo para o usuário inserir a mensagem.
2. **Conversão de caracteres para ASCII**: Utiliza `char` → `int`.
3. **Criptografia**: Soma **10 unidades** ao valor ASCII de cada caractere.
4. **Conversão de volta**: `int` → `char` para exibir a mensagem criptografada.
5. **Uso de `JOptionPane.showMessageDialog()`**: Exibe cada etapa do processo para o usuário.

---

📌 **Sugestão de melhoria:** Implementar uma opção de **descriptografia**, subtraindo **10 unidades** dos valores ASCII para restaurar a mensagem original. 🔐

---


