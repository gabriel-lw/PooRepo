```mermaid

classDiagram


class registroEscrito{
    id:int
    titulo:String
    paginas:int
    linguagem:String
    data:LocalDate
    autor: Autor
    
}

class Livro{
    isbn:String
}

class Revista{
    segmento:String
}

class Jornal{
    diretorChefe:String
}

class Gibi{
    numeroGibi:int
}

class Periodico{
    issn:String
    periodicidadeDias: int
}

registroEscrito <| -- Livro
registroEscrito <| -- Periodico


Periodico <| -- Revista
Periodico <| -- Jornal
Periodico <| -- Gibi
