# bancodadosII-2015
Fontes usadas para ministração de Disciplina Banco de Dados II - Horus Faculdades, no segundo semestre de 2015.

Para usá-lo necessita ter instalado a JDK8+(Java Development Kit na versão 8 ou maior).

Em sua IDE(atualmente estamos usando o Eclipse), importe o projeto com o Maven.

No primeiro build, algumas bibliotecas serão baixadas, entre eles, o HSQLDB, um banco de dados

embutido que não necessita ser instalado.

O projeto é uma estrutura padrão do Maven, segue uma explicação mais detalhada.
.
├── LICENSE
├── pom.xml
├── README.md
├── src
│   └── test
│       ├── java
│       │   └── br
│       │       └── edu
│       │           └── horus
│       │               └── bancodadosII
│       │                   ├── AgregacaoTest.java
│       │                   ├── BaseTest.java
│       │                   ├── ConnectionRule.java
│       │                   └── DataBaseRule.java
│       └── resources
│           ├── data.sql 
│           └── schema.sql