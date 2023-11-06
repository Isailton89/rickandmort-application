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