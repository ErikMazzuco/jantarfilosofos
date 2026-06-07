# 🍚 Jantar dos Filósofos

## 📖 Descrição

O problema do **Jantar dos Filósofos** é um dos exemplos clássicos utilizados no estudo de **concorrência**, **sincronização de processos** e **compartilhamento de recursos** em Sistemas Operacionais.

O cenário é composto por um grupo de filósofos sentados ao redor de uma mesa circular. Cada filósofo alterna continuamente entre dois estados:

* Meditando (pensando);
* Comendo.

No centro da mesa há um grande prato de arroz e, entre cada par de filósofos, existe um único hashi compartilhado. Para conseguir comer, um filósofo precisa obter simultaneamente os dois hashis adjacentes: o da esquerda e o da direita.

Como os hashis são recursos compartilhados, dois filósofos vizinhos não podem utilizá-los ao mesmo tempo. Além disso, os filósofos não se comunicam entre si e não podem observar diretamente o estado dos demais participantes.

---

## 🎯 Objetivo

Desenvolver uma solução utilizando **Threads em Java** que permita a coordenação dos filósofos de forma segura, garantindo que todos consigam alternar entre os estados de meditação e alimentação sem causar problemas de sincronização.

---

## ⚠️ Problemas Envolvidos

Durante a implementação desse cenário, alguns desafios clássicos da computação concorrente devem ser considerados:

### Deadlock

Situação em que todos os filósofos ficam esperando indefinidamente por um recurso que está sendo utilizado por outro filósofo.

### Starvation

Situação em que um filósofo permanece esperando por recursos durante muito tempo, sem conseguir se alimentar.

### Exclusão Mútua

Garantia de que um mesmo hashi não seja utilizado simultaneamente por mais de um filósofo.

---

## 🛠️ Tecnologias Utilizadas

* Java
* Threads
* Sincronização com `synchronized`
* Eclipse IDE
* Astah UML

---

## 🏗️ Estrutura do Projeto

```text
src/
└── jantarfilosofos/
    ├── Main.java
    ├── Filosofo.java
    └── Hashi.java
```

### Main.java

Responsável pela criação dos filósofos, hashis e inicialização das threads.

### Filosofo.java

Representa cada filósofo como uma thread independente, executando continuamente os estados de pensar e comer.

### Hashi.java

Representa os recursos compartilhados utilizados pelos filósofos.

---

## 🔄 Fluxo de Execução

```text
Pensar
   ↓
Pegar Hashi Esquerdo
   ↓
Pegar Hashi Direito
   ↓
Comer
   ↓
Liberar Hashis
   ↓
Pensar Novamente
```

---

## 📊 Diagramas UML

O projeto foi modelado utilizando UML para representar:

* Diagrama de Comunicação (Colaboração)
* Diagrama de Atividades

Esses diagramas auxiliam na compreensão das interações entre os objetos e do fluxo de execução do sistema.

---

## 🚀 Como Executar

1. Clone o repositório:

```bash
git clone https://github.com/seu-usuario/seu-repositorio.git
```

2. Abra o projeto no Eclipse.

3. Execute a classe:

```text
Main.java
```

4. Informe a quantidade de filósofos desejada.

5. Observe a execução concorrente das threads no console.

---

## 👨‍💻 Autor

Projeto desenvolvido para fins acadêmicos, com o objetivo de estudar conceitos de concorrência, sincronização e programação multithread em Java.
