class Account{
    Integer id;
    String name;
    String document;
    String email;
    String password;
    /*Creando método constructor porque account otorgará parte (o todos) de sus atributos hacia el atributo driver en la
    clase car*/
    public Account(String name, String document){
        this.name = name;
        this.document = document;
    }
}