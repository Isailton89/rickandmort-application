Este projeto é uma API de código aberto desenvolvida em Java que tem como objetivo fornecer informações detalhadas sobre personagens de séries de TV. Com essa API, os desenvolvedores podem acessar dados relevantes, como nome do personagem, descrição, imagens, histórico de episódios em que o personagem aparece e muito mais.

Recursos Principais
Informações de Personagens: A API fornece informações detalhadas sobre os personagens, incluindo nome, biografia, características, etc.

Imagens de Personagens: Os desenvolvedores podem acessar imagens dos personagens para uso em seus próprios aplicativos.

Histórico de Episódios: A API permite consultar o histórico de episódios em que o personagem apareceu, bem como sua importância na trama.

Dados de Séries: Além das informações do personagem, a API oferece detalhes sobre as séries em que os personagens estão presentes.

Tecnologias Utilizadas
Linguagem de Programação: Java

Frameworks: Spring Boot para criação da API RESTful

Banco de Dados: MySQL para armazenamento das informações

Documentação: Swagger para documentação da API

Contribuições
Este projeto é de código aberto e incentiva contribuições da comunidade de desenvolvedores. Se você é um entusiasta de séries de TV e deseja melhorar ou expandir a API, sinta-se à vontade para enviar solicitações de pull e fazer parte deste projeto emocionante!

Objetivo
O objetivo principal deste projeto é facilitar o acesso a informações detalhadas sobre personagens de séries de TV, permitindo que desenvolvedores criem aplicativos, websites e outras ferramentas que envolvam o mundo das séries de forma mais completa e envolvente.

Este projeto é uma ótima maneira de combinar tecnologia e entretenimento, proporcionando uma experiência aprimorada aos fãs de séries.
***
## Classe Connection
***
A classe Connection é criada a partir do HTTPClient, HTTPRequest e HTTPResponse. Existe um método chamado sendAddress que recebe um parâmetro:

```sendAddress(String addressRequest)```.

O parâmetro a ser passado é a URL da API desejada para obter o retorno. Por exemplo:

```String urlTeste = "https://rickandmortyapi.com/api/character/1"; ```

### Como utilizar o sendAddress()
***
Para utilizar o sendAddress, basta instanciar a classe Connection, em seguida, criar uma variável que irá receber a URL e, finalmente, utilizar o método Record AddressCharacter para obter as informações da API que serão utilizadas.
```
//Instanciando a classe Connection
Connection connection = new Connection();
//Variável que irá alocar a URL desejada
String urlTeste = "https://rickandmortyapi.com/api/character/1";
//Instanciando o retorno da API com o Record AddressCharacter
AddressCharacter retornoBodyUrl = connection.sendAddress(urlTeste);
//Print no console para ver o que foi retornado
System.out.println(retornoBodyUrl);
```
### Tipos de URL e seus retornos da API
***
No começo, usaremos duas URLs para consulta de personagem.

***Por Id***

```https://rickandmortyapi.com/api/character/2```

O número no final da URL representa o ID do personagem, retornando assim um objeto em JSON.

***Por Nome***

```https://rickandmortyapi.com/api/character/?name=rick```

O nome 'rick' no final da URL representa o personagem a ser buscado, podendo variar de acordo com as entradas do usuário.

<span style="color: red;">Atenção!</span> Este tipo de busca retorna vários objetos JSON para que não haja retornos *null*. É necessário criar um array de objetos para que funcione.