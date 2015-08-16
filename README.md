# bancodadosII-2015
Fontes usadas para ministração de Disciplina Banco de Dados II - Horus Faculdades, no segundo semestre de 2015.

Para usá-lo necessita ter instalado a JDK8+(Java Development Kit na versão 8 ou maior).

Em sua IDE(atualmente estamos usando o Eclipse), importe o projeto com o Maven.

No primeiro build, algumas bibliotecas serão baixadas, entre eles, o HSQLDB, um banco de dados

embutido que não necessita ser instalado.

O projeto é uma estrutura padrão do Maven, segue uma explicação mais detalhada.
```java
.
├── LICENSE
├── pom.xml //Arquivo que contém as configuração do Maven
├── README.md //esse arquivo
├── src
│   └── test
│       ├── java
│       │   └── br
│       │       └── edu
│       │           └── horus
│       │               └── bancodadosII
│       │                   ├── AgregacaoTest.java // Exemplo de agregação
│       │                   ├── BaseTest.java //Classe base para os testes
│       │                   ├── ConnectionRule.java //Rule Junit para conexão
│       │                   └── DataBaseRule.java  //Rule Junit para criar a Base de Dados
│       └── resources
│           ├── data.sql //Arquivo com a estrutura do Banco de Dados
│           └── schema.sql //Arquivo com os dados do Banco de Dados
```
