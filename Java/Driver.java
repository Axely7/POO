class Driver extends Account{
    Integer id;
    String email;
    String password;

    public Driver(Integer id, String email, String password, String name, String document){
        super(name, document);
        this.id = id;
        this.email = email;
        this.password = password;
    }

    void printDataDriver(){
        System.out.println("ID: "+ id + " Email: " + email + " Password: " + password + " Name: " + name + " Document: " + document);
    }

}