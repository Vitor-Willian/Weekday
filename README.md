## Comportamento por DIa da Semana

## Execução 

Sua Execução é feita a partir do arquivo App.java

Instaciamos DailyAssigment , onde criaremos a frabrica dos strategy

Em DailyAssigment existem dois métodos
- DailyExecute para exibição a partir da data atual
- ManualExecute para exibição a partir da escolha do user

No App então executamos seus respectivos testes

## Estrutura Strategy

Composta por uma interface Strategy e implementada para cada dia da semana e evento neutro.

Cada dia da semana é uma classe concreta que implementa uma estrategia diferente para os metódos da interface, sendo eles Execute() e getPriority().

A classe FactoryStrat possuí um hashmap para guardar as classes de estrategias para serem associadas ao dia da semana.

Ainda em FactoryStrat, em getStrategy(), fazemos a comparação do dia da semana com a estrategia que será utilizada



## Questões de Reflexão

1. Como evitar verificações repetidas de valores nulos no código principal?
> Essa verificação foi feita dentro de FactoryStrat, onde é feito a busca do dia da semana no hashMap e logo em seguida salvando a estrategia que será utilizda. Assim o código principal fica limpo, já que as verificações não são feitas nele.

2. Qual padrão de projeto pode ser utilizado para representar a ausência de uma estratégia de
forma segura?
> É possivel usar o padrão Null Object.

3. Explique brevemente como esse padrão seria incorporado à solução.
> O padrão Null Object cria uma classe concreta que vai implementar a mesma interface que as estrategias dos dias, mas que ao invés de criar uma nova estratégia, ele apenas exibirá uma mensagem de invalidação de entrada, assim evitando um possivel erro no código por conta de uma entrada invalida. No caso do nosso projeto, essa classe seria a StrategyNeutral que exibe a mensagem de "DIA DA SEMANA INVÁLIDO".

>Fonte: https://www.baeldung.com/java-null-object-pattern

