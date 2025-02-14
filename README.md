Systoque Back-end - Sistema de Gerenciamento de Estoque
Bem-vindo ao Systoque Back-end, a API responsável por gerenciar produtos, vendas, estoque e fornecedores. Este projeto foi desenvolvido com Java e Spring Boot, oferecendo uma solução robusta e escalável para o controle de recursos em empresas.

🚀 Tecnologias Utilizadas
Back-end
Java 17: Linguagem de programação principal
Spring Boot: Framework para desenvolvimento de APIs RESTful
Spring Data JPA: Para acesso e gerenciamento de banco de dados
Spring Security: Para autenticação e autorização
JWT (JSON Web Token): Para autenticação stateless
PostgreSQL: Banco de dados relacional
Docker: Para containerização e deploy
Ferramentas
Maven: Gerenciamento de dependências
Postman: Testes de API
Git & GitHub: Controle de versão e hospedagem do código
📌 Funcionalidades
🔐 Autenticação e Autorização
Login com JWT
Rotas protegidas por roles
📦 Produtos
Cadastro, edição, exclusão e listagem de produtos
Controle de quantidade em estoque
🛒 Vendas
Registro de vendas
Atualização automática do estoque após uma venda
📊 Estoque
Entrada e saída de produtos
Histórico de movimentações
🚛 Fornecedores
Cadastro, edição, exclusão e listagem de fornecedores
🛠️ Como Executar o Projeto
📋 Pré-requisitos
Java 17 instalado e configurado
Maven para gerenciamento de dependências
PostgreSQL instalado e configurado
Docker (opcional) para rodar o banco de dados em um container
🚀 Passos para Execução
Clone o Repositório:

git clone https://github.com/MauricioGoulartOliveira/Systoque.git
cd Systoque/backend
Configure o Banco de Dados:

Crie um banco de dados chamado db_Systoque no PostgreSQL.
Configure as credenciais no arquivo application.properties:
spring.datasource.url=jdbc:postgresql://localhost:5432/db_Systoque
spring.datasource.username=postgres
spring.datasource.password=root
Execute o Projeto:

mvn spring-boot:run
A API estará disponível em http://localhost:8080.

🐳 Usando Docker (Opcional)
Caso prefira usar Docker para o banco de dados, execute:

docker-compose up
Isso criará um container PostgreSQL com as configurações necessárias.

🔥 Testando a API
🌍 Rotas Disponíveis
🔐 Autenticação
POST /auth/login: Realiza o login e retorna um token JWT.
Exemplo de corpo da requisição:
{ "username": "admin", "password": "password" }
📦 Produtos
GET /api/products: Retorna a lista de produtos
POST /api/products: Cria um novo produto
PUT /api/products/{id}: Atualiza um produto existente
DELETE /api/products/{id}: Exclui um produto
🛒 Vendas
POST /api/sales: Registra uma nova venda
📊 Estoque
POST /api/stock: Adiciona uma entrada de estoque
🚛 Fornecedores
GET /api/suppliers: Retorna a lista de fornecedores
POST /api/suppliers: Cria um novo fornecedor
PUT /api/suppliers/{id}: Atualiza um fornecedor existente
DELETE /api/suppliers/{id}: Exclui um fornecedor
🛠️ Testes com Postman
Importe a coleção de requisições disponível na pasta postman do projeto.
Configure o ambiente no Postman com a variável base_url apontando para http://localhost:8080.
📂 Estrutura do Projeto
backend/
├── src/
│   ├── main/
│   │   ├── java/com/Systoque_back_end/
│   │   │   ├── config/         # Configurações do Spring (CORS, Security, etc.)
│   │   │   ├── controller/     # Controladores das APIs
│   │   │   ├── exception/      # Exceções personalizadas
│   │   │   ├── model/          # Entidades do banco de dados
│   │   │   ├── repository/     # Repositórios JPA
│   │   │   ├── security/       # Configurações de segurança e JWT
│   │   │   ├── service/        # Lógica de negócio
│   │   │   └── SystoqueBackEndApplication.java  # Classe principal
│   │   └── resources/
│   │       ├── application.properties  # Configurações do banco de dados
│   │       └── data.sql                 # Dados iniciais (opcional)
│   └── test/ # Testes unitários e de integração
├── Dockerfile            # Configuração do Docker
├── docker-compose.yml    # Configuração do Docker Compose
├── pom.xml               # Dependências do Maven
└── README.md             # Este arquivo
🤝 Como Contribuir
Faça um fork do projeto.
Crie uma branch para sua feature:
git checkout -b feature/nova-feature
Faça commit das suas alterações:
git commit -m 'Adicionando nova feature'
Faça push para a branch:
git push origin feature/nova-feature
Abra um Pull Request.
👤 Autor
Nome: Mauricio Goulart de Oliveira
✉️ Email: snarfalternativa@gmail.com
🐙 GitHub: MauricioGoulartOliveira

📜 Licença
Este projeto está licenciado sob a Licença MIT. Consulte o arquivo LICENSE para mais detalhes.

🔹 Systoque - Gerencie seu estoque com eficiência e segurança! 🚀

Email: snarfalternativa@gmail.com

GitHub: MauricioGoulartOliveira

Licença Este projeto está licenciado sob a licença MIT. Consulte o arquivo LICENSE para mais detalhes.
