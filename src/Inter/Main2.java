package Inter;

public class Main2{
    public static void main(String[] args){
        Users u1 = new Users("Jonh", "Mal");
        Users u2 = new Users("Mathew","Smith");
        Users u3 = new Users("Temirlan", "Khamidulla");
        Users u4 = new Users("Yerkenaz", "Khamidulla");
        Users u5 = new Users("John","Snow");
        Users u6 = new Users("Will", "Smith");
        Users u7 = new Users("John", "Dolban");
        Users u8 = new Users("William", "Smith");
        Users u9 = new Users("Ryan", "Sabit");
        Users u10 = new Users("Nurlan", "Saburov");
        Users users[] = {u1,u2,u3,u4,u5,u6,u7,u8,u9,u10};

        UsersBeanlmp beanlmp = new UsersBeanlmp(users);
        beanlmp.getAllUsers();
        beanlmp.getUsersByName("John");
        beanlmp.getUsersBySurname("Smith");
    }
}