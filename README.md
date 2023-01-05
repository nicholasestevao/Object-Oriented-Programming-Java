# Listas De Exercícios de Programação Orientada  a Objetos

Neste Repositorio temos as listas de exercícios, feitas em grupo, durante a disciplina de Programação Orientada a Objetos (SCC0604), 
lecionada pelo Professor Robson Leonardo Ferreira Cordeiro, para o curso de Engenharia de Computação - USP São Carlos.

## Integrantes do Grupo

* Asafe Henrique de França - 12745212 (A partir da Lista 2)
* Isaac Santos Soares - 12751713
* Nicholas Estevao Pereira de Oliveira Rodrigues Braganca - 12689616

---

## Lista 1 – Modelagem e conceitos de POO

Composta por 3 exercícios onde devemos utilizar da linguagem UML para criarmos nossos projetos de classes e depois implementar esses projetos em C++ ou Java.

### Exercío 1 - Telefone

No exercício 1 devemos imgainar quais atributos e funções definem um telefone, sendo que esse telefone é composto por CPU, Tela, Sistema de Som e Sistema de Comunicação.
Cada classe cujo o telefone é composto deve ter no mínimo 2 funcionalidaes uma pública e uma privada.
  
### Exercío 2 - Drivers

No exercícoi 2 devemos imaginar quais atributos e funções definem um driver e implementar drivers para dispositivos de rede, de impressão e de vídeo.
Todo driver possui funcionalidades e dados como ligaDispositivo, verificaStatus e executaTeste. Mas cada driver para um dispositivo específico
possui funcionalidades específicas, como enviaPacoteDeDados, imprimePaginas e alteraBrilhoDeExibicao.  

### Exercío 3 - Polinomios

No exercio 3 devemos implementar uma classe capaz de definir polinômios do tipo __*P(x) = a<sub>n</sub>x<sup>n</sup> + a<sub>(n-1)</sub>x<sup>(n-1)</sup> + ... + a<sub>1</sub>x<sup>1</sup> + a<sub>0</sub>x<sup>0</sup>*__. 
Cada termo do polinômio deve ser representado como um objeto de uma classe Termo. 
A classe Polinomio deve possuir os seguintes métodos:  
* um construtor que recebe o grau máximo do polinômio;  
* um método Add que adiciona um termo __*a<sub>n</sub>x<sup>n</sup>*__, o qual deve garantir que o grau máximo do polinômio seja respeitado; caso um termo adicionado anxn já exista, ele deverá ser somado ao termo já existente somando-se os valores de seus coeficientes (__*a<sub>n_existente</sub> + a<sub>n_novo</sub>*__);  
* um método Mostra que exibe o polinômio;  
* um método Calcula que recebe um valor de __*x*__ e retorna o valor calculado.  

---

## Lista 2 - UML 

 **OBS:** Para cada um dos exercícios a seguir, foi usado a ferramenta StarUML para criar o diagrama de classes, e exportado o código para a linguagem Java, e foi criado um projeto NetBeans para ele. A implementação das funcionalidades do sistema não era obrigaória a menos que explicitado. Todos os projetos compilam e executam (mesmo os que não fazem nada).

### Exercío 1 -  Sistema Bancário

No exercício 1 foi feita a modelagem em UML de um sistema bancário, relacionando o modelo à administração de contas bancárias. 

Em um banco:

* há gerentes, cada um responsável por um grupo de clientes;
* um gerente poderá aceitar pedidos de produtos: conta bancária, empréstimo ou cartão de crédito;
* cada cliente poderá ter acesso à sua conta bancária a qual é exclusiva para ele;
* cada conta bancária poderá oferecer serviços tais como: depositar, sacar e transferir dinheiro entre contas;
* o banco só pode manter dados de um cliente caso ele possua algum produto.

### Exercío 2 - Sistema de Controle de Cursos de Informática

No exercicio 2 foi feita a modelagem em UML de um sistema de controle de cursos de informática equivalente a um módulo de matrícula de acordo com os seguintes fatos: 

* o curso pode ter mais de uma turma, no entanto, uma turma se relaciona exclusivamente com um único curso;
* uma turma pode ter diversos alunos matriculados, no entanto uma matrícula refere-se exclusivamente a uma determinada turma; 
* cada turma tem um número mínimo de 10 matriculas para iniciar o curso;
* um aluno pode realizar muitas matrículas, mas cada matrícula refere-se exclusivamente a uma turma
específica e a um único aluno.

### Exercío 3 - Supers

No exercício 3 foi considerado o seguinte diagrama no qual há uma hierarquia de classes Personagem=>SuperHeroi e Personagem=>Vilao; e uma agregação da classe Personagem com a classe Superpoder, isto é, um personagem pode ter nenhum ou vários superpoderes.

![diagramaEx3](./Lista%202/diagramaEx3.png)

Para a implementação do projeto em Java descrito no diagrama a cima além de acrescentar as seguintes características:
  
  * uma propriedade (atributo) vida em Personagem que registre a quantidade de energia que ele ainda possui – crie os métodos de acesso (get e set) adequados para a propriedade;
  * um método para adicionar superpoderes aos personagens;
  * um método atacar para os personagens, o qual deve receber como parâmetro a “intensidade do ataque”, o nome do superpoder usado, o qual deve existir, e um objeto Personagem que irá receber o ataque;
  * este método deverá tirar (subtrair) “intensidade do ataque” da vida do personagem atacado
com probabilidade de 50%. Para tanto, use o método Math.random().

Após a implementação tivemos que criar diferentes superpoderes, cada um com um fator multiplicador para a intensidade, além de definir superpoderes de defesa capazes de anular determinados ataques e definir diferentes interações de probabilidade de acordo com os personagens envolvidos.

### Exercío 4 - Sistema de Reserva

No exercício 4 foi feita a modelagem em UML de um sistema de reserva para uma empresa aérea. Onde:

* cada voo deverá estar cadastrado no sistema, pois as reservas serão relacionadas a eles;
* uma reserva também possui um passageiro; 
* os voos podem ser internacionais, nacionais, comerciais ou militares;
* a um dado voo são atribuídos um código, um horário e uma data, além de um aeroporto de partida e um de destino;
* também deve-se saber o número de assentos livres e sua tripulação (conjunto de aeroviários);
* um aeroporto possui uma cidade onde se localiza, uma capacidade (número máximo) de decolagens por hora e um nome;
* operadores são funcionários da empresa responsáveis pela operacionalização das reservas;
* eles fazem reservas e cancelam reservas;
* os passageiros podem pedir reservas nos voos, podem cancelar reservas e podem pagar as reservas.

### Exercío 5 - Operação matemática

No exercício 5 foi feita a modelagem em UML e implementação em Java utilizando a descrição a abaixo.

Um software de cálculo matemático possui diversas funcionalidades. Uma delas se refere a operação matemática entre dois operandos (float), a qual pode ser: soma, subtração, multiplicação ou divisão. A operação matemática possui a função “realizar cálculo” que retorna o resultado da respectiva operação. O resultado da operação é descrito pelas seguintes informações: usuário que realizou a operação; o tipo da operação; além da data (dia, mês e ano) da operação. Um usuário é descrito por seu nome, idade e foto. Uma foto possui o caminho do arquivo de foto do usuário e a data da foto (dia, mês e ano).
Em sua implementação Java, no programa principal, crie alguns objetos do seu modelo, realize algumas
operações e exiba dados dos resultados.

---

## Lista 3 - Herança, polimorfismo e interfaces

## Exercício 1 -

## Exercício 2 -

## Exercício 3 -

## Exercício 4 - 

## Exercício 5 - 

## Exercício 6 - 

## Exercício 7 -

## Exercício 8 -

---