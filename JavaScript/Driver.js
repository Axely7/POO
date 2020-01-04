class Driver extends Account{
    constructor(name, document, id, email, password){
        super(name, document);
        this.id = id;
        this.email = email;
        this.password = password;
    }

    printDataDriver(){
        console.log(this.name);
        console.log(this.document);
        console.log(this.id);
        console.log(this.email);
        console.log(this.password);
    }

}