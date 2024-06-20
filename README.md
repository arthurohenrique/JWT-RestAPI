# JWT-RestAPI

Descrição de Microserviços
A aplicação consiste em um serviço que utiliza JSON Web Tokens (JWT) para autenticação e autorização de usuários. Ela oferece endpoints para login, obtenção de informações do usuário e acesso restrito para administradores.

Informações de Contato
Email: arthurhlsouza@gmail.com
Telefone: (31)98580-8480
Links para Informações Importantes
GitHub do Projeto: https://github.com/arthurohenrique/JWT-RestAPI

Informações sobre os Fluxos de Solicitação
Login:

Endpoint: POST /login
Descrição: Permite que um usuário faça login e receba um token JWT válido.
Parâmetros: Objeto LoginRequest contendo username e password.
Retorna: Token JWT válido.
Obter Username a partir do Token:

Endpoint: GET /username/{token}
Descrição: Retorna o nome de usuário (username) associado ao token JWT fornecido.
Parâmetros: token - Token JWT válido.
Retorna: Nome de usuário associado ao token.
Obter Usuário Logado:

Endpoint: GET /user
Descrição: Retorna informações do usuário autenticado.
Requerimentos: Autenticação JWT.
Retorna: Nome do usuário autenticado.
Acesso Restrito para Administradores:

Endpoint: GET /admin
Descrição: Endpoint protegido que retorna informações específicas para administradores.
Requerimentos: Autenticação JWT com papel (role) de "ADMIN".
Retorna: Nome do administrador autenticado.
Endpoints e Dependências do Serviço
JwtRestApiApplication:

Classe principal que inicia a aplicação Spring Boot.
Pacote base para escaneamento: com.example
SecurityConfig:

Configuração de segurança da aplicação.
Define políticas de acesso e autenticação baseadas em HTTP Security.
Dependências: Utiliza BCryptPasswordEncoder para criptografar senhas e configura usuários em memória.
AuthController:

Controlador REST que define endpoints para autenticação e autorização.
Dependências: Usa o serviço AuthService para gerar tokens JWT e extrair informações de usuário.
LoginRequest:

Modelo que representa a requisição de login com username e password.
JwtUtil:

Utilitário para operações relacionadas a tokens JWT.
Gera tokens JWT com tempo de expiração configurável.
Extrai informações de usuário a partir de tokens JWT válidos.
AuthService:

Serviço que encapsula lógica de negócio para autenticação.
Dependências: Usa JwtUtil para gerar tokens JWT e extrair informações de usuário.

![image](https://github.com/arthurohenrique/JWT-RestAPI/assets/61984909/5f8f3b98-f1a6-46a1-a47e-4cdd0e6eda6d)

