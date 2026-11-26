``` mermaid

classDiagram

class Usuario{
    -id:String
    -nome;
    -livrosEmprestados:Livro[3]
    +receberLivro(livro: Livro)
    +devolverLivro(isbn:String)

}

class Livro{
    -ISBN:String
    -nomeLivro:String
    -emprestado:boolean
}

class Biblioteca{

    -livros: HashMap<String,Livro>
    -usuariosCadastrados: HashMap<int,Usuario>

    +emprestarLivro(idUsuario:String, isbn:String)
    +receberLivro(idUsuario:String, isbn:String)
    +cadastrarUsuario(nome:String)
}




Usuario "1" o-- "0..3" Livro
Biblioteca "1" *-- "0..*" Livro
Biblioteca "1" *-- "0..*" Usuario


```