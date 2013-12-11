Projeto BonusTeoComp
==============
**Responsável:** Prof. Esdras Lins Bispo Jr. &nbsp; &nbsp; &nbsp; &nbsp; **Email:** bispojr@ufg.br <br>
**Data de criação:** 28 de novembro de 2013


1. Introdução
-------------

No semestre de 2013.2, está sendo ministrada a disciplina de Teoria da Computação no Bacharelado em Ciência da Computação na Universidade Federal de Goiás (UFG) no Câmpus Jataí. Nesta disciplina, tópicos em Teoria da Computabilidade estão sendo abordados, como por exemplo, decidibilidade. Foi proposto pelo Prof. Esdras Bispo Jr. a implementação da máquina de Turing que decide a linguagem **L<sub>AFD</sub>**. Será apresentado a seguir a descrição do problema (Seção 2), a metodologia (Seção 3), e os critérios a serem utilizados para atribuição do ponto bônus (Seção 4).

2. Descrição do Problema
-------------------------

O **problema da aceitação** é um problema clássico em Teoria da Computação. Podemos descrever ele informalmente da seguinte forma: 

> Para um dado modelo computacional **MC** e uma cadeia **w**, é possível identificar se **MC** aceita **w**?
    
Como estratégia de resolução deste problema, podemos definir uma linguagem **L**, de forma que, 

> **L** = { \<**M**,**w**\> | **M** é um **MC** que aceita a cadeia de entrada **w**}.
    
E, se para um dado par \<**M**,**w**\> conseguirmos decidir se \<**M**,**w**\> &isin; **L**, então conseguiremos resolver o problema da aceitação. Com outras palavras, uma forma de resolver o problema da aceitação é provar que **L** é decidível.

### 2.1 Problema de aceitação em um AFD ######

Podemos aplicar o problema da aceitação em um Autômato Finito Determinístico (AFD). Definiremos uma linguagem **L<sub>AFD</sub>**, como se segue,

> **L<sub>AFD</sub>** = { <**B**,**w**> | **B** é um AFD que aceita a cadeia de entrada *w*}.
  
Logo, se provarmos que **L<sub>AFD</sub>** é decidível, então teremos uma solução para o problema da aceitação em um AFD. Segue abaixo a demonstração proposta por Sipser (2007):

> **IDÉIA DA PROVA:** Simplesmente precisamos apresentar uma máquina de Turing **M<sub>AFD</sub>** que decide **L<sub>AFD</sub>**.
>  
> **M<sub>AFD</sub>** = "Sobre a entrada \<**B**,**w**\>, em que **B** é um AFD e **w** é uma cadeia:

> 1.  Simule **B** sobre a entrada **w**.
> 2.  Se a simulacão não termina em um estado de aceitação, *aceite*. Se ela termina em um estado de não-aceitação, *rejeite*."
>
> **PROVA:** Mencionamos apenas alguns poucos detalhes de implementação dessa prova. Para aqueles de vocês familiarizados com escrever programas em alguma linguagem de programação padrão, imagine como você escreveria um programa para realizar a simulação. 
>
> Primeiro, vamos examinar a entrada \<**B**,**w**\>. Ela é uma representação de um AFD **B** juntamente com uma cadeia **w**. Uma representação razoável de **B** é simplesmente uma lista de seus cinco componentes, **Q**, **Σ**, **δ**, **q<sub>0</sub>** e **F**. Quando **M<sub>AFD</sub>** recebe sua entrada, **M<sub>AFD</sub>** primeiro determina se ela representa apropriadamente
um AFD **B** e uma cadeia **w**. Se não, **M<sub>AFD</sub>** *rejeita*. 
>
> Então **M<sub>AFD</sub>** realiza a simulação diretamente. Ela mantém registro do estado atual de **B** e da posição atual de **B** na entrada **w** escrevendo essa informação na sua fita. Inicialmente, o estado atual de **B** é **q<sub>0</sub>** e a posição atual de **B** sobre a entrada é o símbolo mais à esquerda de **w**. Os estados e a posição são atualizados conforme a função de transição especificada δ. Quando **M<sub>AFD</sub>** termina de processar o último símbolo de **w**, **M<sub>AFD</sub>** aceita a entrada se **B** está em um estado de aceitação; **M<sub>AFD</sub>** rejeita a entrada se **B** está em um estado de não-aceitação.

### 2.2 Desafio proposto ######

O Prof. Esdras Bispo Jr. durante a aula do dia 28 de novembro de 2013 propôs aos alunos a implementação da **M<sub>AFD</sub>**. A proposta foi no sentido de implementar uma máquina de Turing genérica e, depois, instanciar um algoritmo específico para implementar **M<sub>AFD</sub>**. Logo o desafio só será resolvido se **M<sub>AFD</sub>** decidir **L<sub>AFD</sub>** (i.e. para qualquer para \<**B**,**w**\>, **M<sub>AFD</sub>** aceitará ou rejeitará o par). Os pormenores da metodologia da proposta é descrito na seção seguinte.

3. Metodologia
-------------------------

O desafio deve ser resolvido utilizando a linguagem Java e a IDE NetBeans 7.3 (ou superior). Será o utilizado o repositório no GitHub (https://github.com/FreeUFG/bonus-teo-comp) e as contribuições se darão através de *commits* enviados para o projeto. As contribuições se darão através de implementação de *issues* criadas no repositório referido. Qualquer um poderá criar *issues*, porém apenas aquelas validadas pelo Prof. Esdras Bispo Jr. serão passíveis de serem pontuadas para a disciplina. O paradigma de linguagem utilizado será a orientação para objetos.

4. Critérios de Pontuação
-------------------------

* Cada *issue* terá uma pontuação específica;
* Cada aluno terá que implementar pelo menos uma *issue* para obter a pontuação mínima;
* A pontuação será dada de acordo com a complexidade de cada *issue* e com o número de *issue* desenvolvida por cada contribuidor do projeto;
* A pontuação máxima no projeto será de hum ponto extra na média da disciplina de Teoria da Computação.

5. Referências
-------------------------

* SIPSER, Michael. Introdução à teoria da Computação, 2a Edição, Editora Thomson Learning, 2007.
