void main(){
    IO.println("Ola mundo");

    //String nome = IO.readln("Entre  com seu nome:");
   // int a = Integer.parseInt(IO.readln("entre com um numero:"));


    char sexo =IO.readln("qual seu sexo(m/f)?:").toUpperCase().charAt(0);
    int idade = Integer.parseInt(IO.readln("qual sua idade?:"));

   



    if(sexo == 'M' && idade>=18){
        System.out.println("voce precisa apresentar seu atestado de reservista");
    }
    else{
        System.out.println("voce nao precisa apresentar atestado de reservista ");
    }
    

}