# 🔢 Insertion Sort em Java

Implementação do algoritmo **Insertion Sort** utilizando **Java**.
Este projeto demonstra como ordenar um vetor de números inteiros utilizando um dos algoritmos clássicos de ordenação.

O objetivo é apresentar de forma simples o funcionamento do algoritmo e servir como material de estudo para **estrutura de dados e algoritmos**.

---

## 📌 Sobre o Algoritmo

O **Insertion Sort** funciona de maneira semelhante a como organizamos cartas na mão.

A ideia é:

1. Começar pelo segundo elemento do vetor
2. Comparar esse elemento com os anteriores
3. Deslocar os valores maiores para a direita
4. Inserir o valor na posição correta

Esse processo se repete até que todo o vetor esteja ordenado.

---

## ⚙️ Complexidade

| Caso        | Complexidade |
| ----------- | ------------ |
| Melhor caso | O(n)         |
| Caso médio  | O(n²)        |
| Pior caso   | O(n²)        |

📍 O melhor caso ocorre quando o vetor **já está ordenado**.

---

## 🧠 Exemplo

Vetor inicial:

```
[8, 3, 2, 4, 1, 5, 7, 6]
```

Saída após ordenação:

```
[1, 2, 3, 4, 5, 6, 7, 8]
```

---

## 💻 Código Principal

```java
int[] numeros = {8,3,2,4,1,5,7,6};

System.out.println("ANTES DE ORDENAR: " + Arrays.toString(numeros));

ordenar(numeros);

System.out.println("DEPOIS DE ORDENAR: " + Arrays.toString(numeros));
```

---

## 🔎 Método de Ordenação

```java
public static int[] ordenar(int[] array){

    int n = array.length;

    for(int i = 1; i < n; i++){

        int chave = array[i];
        int j = i - 1;

        while(j >= 0 && array[j] > chave){
            array[j + 1] = array[j];
            j = j - 1;
        }

        array[j + 1] = chave;
    }

    return array;
}
```

---

## ▶️ Como Executar

1. Clone o repositório

```bash
git clone https://github.com/seu-usuario/insertion-sort-java.git
```

2. Compile o código

```bash
javac Insertion_Sort_Java.java
```

3. Execute o programa

```bash
java Insertion_Sort_Java
```

---

## 📚 Tecnologias

* Java
* Algoritmos de Ordenação
* Estrutura de Dados

---

## 🎯 Objetivo do Projeto

Este projeto foi criado para **fins educacionais**, com foco em:

* Aprender algoritmos de ordenação
* Praticar lógica de programação
* Entender como funciona o Insertion Sort

---

## 👨‍💻 Autor

Desenvolvido por **Charles Magalhães**
