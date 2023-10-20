public class main {

    public static void main(String[] args) {
        bankKR bankKR = new bankKR();
        Account korea = bankKR.createAccount();
        korea.status();

        System.out.println("");

        bankUS bankUS = new bankUS();
        Account usa = bankUS.createAccount();
        usa.status();

    }

}
