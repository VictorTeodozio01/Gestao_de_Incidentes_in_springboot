# APP de Cadastro de Incidentes

Esta é uma aplicação Spring Boot para gerenciar incidentes, oferecendo funcionalidades como criação, edição, exclusão e listagem de incidentes. O sistema foi desenvolvido utilizando uma API REST e inclui uma interface frontend simples com Thymeleaf e Bootstrap.

## No menu 'Listar todos incidentes', também estarão disponíveis as seguintes opções:"
- **Atualizar Incidentes**
- **Deletar Incidentes**
- **Listar incidente por ID**: consulta pelo ID quando o usuario digitar.


## Frameworks Utilizados

- **Thymeleaf**: para renderização de templates no frontend.
- **Bootstrap**: para estilização da interface.

## Autenticação

Foi implementado o Spring Security com autenticação utilizando as seguintes credenciais:

- **Nome de Usuário**: admin
- **Senha**: 123

## Instruções para Executar o Projeto

### Pré-requisitos

- **Java 17** ou superior
- **Maven** para compilar e gerenciar dependências

### Compilação e Execução

1. **Clonar o Repositório**
   ```bash
   git clone https://github.com/VictorTeodozio01/APP_cadastro_de_incidentes.git
   cd APP_cadastro_de_incidentes


## Abra o prompt de comando ou o terminal do VSCode no diretório do projeto e execute os seguintes comandos:


2. *Use o Maven para compilar e empacotar o projeto:*

mvn clean package

3. *Para executar o projeto localmente:*

mvn spring-boot:run

4. *Caso tenha o Docker e Docker Compose instalados, execute o comando a seguir para iniciar o projeto em contêiner:*

docker-compose up


# Acesso à API e à Interface:

*API Documentada pelo Swagger*: http://localhost:8080/swagger-ui.html.
*Página Inicial da Interface Web*: http://localhost:8080.

*Acesso ao Banco de Dados H2*: 
http://localhost:8080/h2-console 
User: sa
Password: 123


# Utilizei o banco de dados H2 e configurei para execução offline, pois  facilita rodar a aplicação em outras máquinas sem a necessidade de reconfigurações.
