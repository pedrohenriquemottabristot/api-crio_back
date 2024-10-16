> # Documentação da API - Sistema de Gerenciamento de Eventos
> 
> ## Visão Geral
> Esta API foi desenvolvida para gerenciar eventos, oferecendo endpoints para criar, atualizar, deletar e listar eventos e participantes.
> 
> ---
> 
> ## Pré-requisitos
> Antes de iniciar o uso desta API, certifique-se de ter os seguintes pré-requisitos atendidos:
> 
> 1. **Docker**: A API é empacotada e executada dentro de containers Docker. Portanto, é necessário ter o Docker instalado em sua máquina.
>    - Você pode seguir as instruções oficiais de instalação do Docker [aqui](https://docs.docker.com/get-docker/).
> 
> 2. **Docker Compose**: Além do Docker, certifique-se de ter o Docker Compose instalado para facilitar o gerenciamento dos serviços.
>    - As instruções de instalação do Docker Compose podem ser encontradas [aqui](https://docs.docker.com/compose/install/).
> 
> ---
> 
> ## Instruções para rodar a API
> 
> 1. **Clone o repositório**
> 
>    ```bash
>    git clone https://github.com/seu-usuario/seu-repositorio.git
>    cd seu-repositorio
>    ```
> 
> 2. **Construa e inicie o container Docker**
> 
>    - Use o Docker Compose para construir e rodar a API:
> 
>    ```bash
>    docker-compose up --build
>    ```
> 
>    Isso irá construir a imagem Docker e iniciar os serviços configurados no `docker-compose.yml`.
> 
> 3. **Acesse a API**
> 
>    - Após iniciar o container, a API estará disponível na seguinte URL:
>      ```
>      http://localhost:8000
>      ```
> 
> ---
> 
> ## Endpoints principais
> 
> - **Criar um evento**
>   - `POST /eventos`
> 
> - **Listar eventos**
>   - `GET /eventos`
> 
> - **Atualizar um evento**
>   - `PUT /eventos/{id}`
> 
> - **Deletar um evento**
>   - `DELETE /eventos/{id}`
> 
> ---
> 
> ## Testes
> Para rodar os testes da API, utilize o comando abaixo:
> 
> ```bash
> docker-compose exec app pytest
> ```
> 
> ---
> 
> ## Encerrando os containers
> Para parar e remover os containers, execute:
> 
> ```bash
> docker-compose down
> ```
> 
> ---
> 
> ## Tecnologias Utilizadas
> - Docker
> - Docker Compose
> - Java
> - Flask / FastAPI (ou outro framework da API)
