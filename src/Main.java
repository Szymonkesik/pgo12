public class Main {
    public static void main(String[] args) {
        try {
            Admin a = new Admin("Marek", "Administrator");

            Employee e1 = new Employee("Grzegorz", "Pracownik1");
            Employee e2 = new Employee("Andrzej", "Pracownik2");

            a.addEmployee(e1);
            a.addEmployee(e2);

            Client c1 = e1.addClient("Piotr", "Klient1");
            Client c2 = e1.addClient("Marzena", "Klient2");
            Client c3 = e2.addClient("Marek", "Klient3");
            Client c4 = e2.addClient("Celina", "Klient4");

            e1.acceptDeposit(c1.getAccount(), 1000);
            e1.acceptDeposit(c2.getAccount(), 1500);
            e2.acceptDeposit(c3.getAccount(), 2000);
            e2.acceptDeposit(c4.getAccount(), 2500);

            c1.getAccount().transfer(150, c2.getAccount());
            c2.getAccount().transfer(200, c3.getAccount());
            c3.getAccount().transfer(300, c4.getAccount());
            c4.getAccount().transfer(400, c1.getAccount());
            c1.getAccount().transfer(250, c3.getAccount());
            c2.getAccount().transfer(270, c4.getAccount());
            c3.getAccount().transfer(700, c1.getAccount());
            c4.getAccount().transfer(900, c2.getAccount());
            c1.getAccount().transfer(350, c4.getAccount());
            c2.getAccount().transfer(450, c3.getAccount());

            System.out.println("Stan konta klienta 1: " + c1.getAccount().checkBalance());
            System.out.println("Stan konta klienta 2: " + c2.getAccount().checkBalance());
            System.out.println("Stan konta klienta 3: " + c3.getAccount().checkBalance());
            System.out.println("Stan konta klienta 4: " + c4.getAccount().checkBalance());
        }
        catch (AccountOperationException e){
            System.err.println(e.getMessage());
        }
    }
}