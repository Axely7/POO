from account import Account

class User(Account):
    id = int
    email = str
    password = str

    def __init__(self, name, document, id, email, password):
        super().__init__(name, document)
        self.id = id
        self.email = email
        self.password = password

        
        