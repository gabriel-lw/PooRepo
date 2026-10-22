```mermaid

classDiagram

class  Personagem{
    -vida:double
    -ataque:double
    -velocidade:double
    +andar():String
    +atacar():String
}

class Aldeao{

    +andar():String
    +atacar():String

}

class Arqueiro{

    +andar():String
    +atacar():String

}

class Cavaleiro{

    +andar():String
    +atacar():String

}

Personagem <| -- Aldeao
Personagem <| -- Arqueiro
Personagem <| -- Cavaleiro


