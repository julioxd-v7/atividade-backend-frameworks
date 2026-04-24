# atividade-backend-frameworks

Este repositório reúne dois projetos back-end desenvolvidos com tecnologias diferentes: Node.js com Express e Java com Spring Boot. A proposta é mostrar como ambos podem ser organizados utilizando o padrão de arquitetura em camadas (MVC), facilitando a compreensão e a manutenção do código.

## Estrutura da atividade

### Node.js / Express

No projeto com Express, a organização foi feita de forma simples e direta, dividindo as responsabilidades em três partes principais:

* **models**: representam os dados da aplicação.
* **controllers**: recebem as requisições e definem como a aplicação deve responder.
* **routes**: definem os caminhos (rotas) que o usuário pode acessar.

### Java / Spring Boot

Já no projeto com Spring Boot, a estrutura segue uma organização mais tradicional e robusta:

* **models**: representam as entidades do sistema.
* **controllers**: recebem e tratam as requisições HTTP.
* **services**: concentram as regras de negócio da aplicação.

## Comparação entre Node.js/Express e Java/Spring Boot

O Express se destaca pela simplicidade e rapidez na configuração inicial. Com poucos arquivos, já é possível criar uma API funcional, o que o torna uma ótima escolha para projetos menores ou protótipos.

Por outro lado, o Spring Boot possui uma estrutura mais completa desde o início. Apesar de exigir mais configuração e código, ele oferece uma base sólida e organizada, ideal para sistemas maiores e mais complexos.

Em relação às dependências, o Node.js utiliza o **npm** com o arquivo `package.json`, enquanto o Spring Boot utiliza **Maven** ou **Gradle**, com configurações em `pom.xml` ou `build.gradle`.

## Comunicação entre as Camadas

Em ambos os projetos, a comunicação segue um fluxo semelhante:

1. As rotas recebem as requisições do usuário.
2. Essas requisições são encaminhadas para os controllers.
3. Os controllers processam as informações e, quando necessário, utilizam os services ou models.
4. Os models representam e manipulam os dados da aplicação.

Essa separação de responsabilidades torna o sistema mais organizado, facilita a manutenção e permite que o projeto cresça de forma mais estruturada.

## Conclusão

Este trabalho mostra que, mesmo utilizando tecnologias diferentes, é possível seguir os mesmos princípios de arquitetura. Tanto o Express quanto o Spring Boot permitem criar aplicações bem organizadas, com código limpo e fácil de entender, desde que as responsabilidades de cada camada sejam bem definidas.

---

