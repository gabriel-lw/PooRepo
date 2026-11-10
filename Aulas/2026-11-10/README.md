```mermaid 

classDiagram

class Animal{
    <<abstract>>
    nome:String

}

class Corredor{
    <<interface>>
    +correr():String

}

class Voador{
    <<interface>>
    +voar():String

}

class Aquatico{
    <<interface>>
    +nadar():String

}

class Falante{
    <<Interface>>
    +falar():String
}

class GrandesFelinos{
    <<interface>>
    +rugir():String

}

class Canideo{
    <<Interface>>
    +uivar():String
}

class Oviparo{
    <<Interface>>
    +colocarOvo():String
}

class BioSonares{
    <<Interface>>
    +bioSonar():String
}

class Cachorro{

}

class Leao{

}

class Baleia{

}

class Arara{

}

class Lobo{
    
}







Animal <|-- Cachorro
Corredor <|.. Cachorro
Canideo <|.. Cachorro

Animal <|-- Leao
Corredor <|.. Leao
GrandesFelinos <|.. Leao

Animal <|-- Baleia
Aquatico <|.. Baleia
BioSonares<|.. Baleia

Animal <|-- Arara
Voador <|.. Arara
Falante<|.. Arara
Oviparo<|.. Arara

Animal <|-- Lobo
Corredor <|.. Lobo
Canideo <|.. Lobo

