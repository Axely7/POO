class User extends Account{
    Integer id;
    String email;
    String password;
    public User(String name, String document, Integer id, String email, String password){
        super(name, document);
        this.id = id;
        this.email = email;
        this.password = password;
    }

    void printDataUser(){
        System.out.println("Name: " + name + " Document: " + document + " ID: " + 
        id + " Email: " + email + " Password: " + password);
    }

}