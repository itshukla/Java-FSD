public class ifelse {
    public static void main(String[] args) {
        int marks = 288;
        if (marks >= 10 && marks <= 100) {
            System.out.println("Ladke ne top kiye h prty to bnti h");
        }
        else if (marks >= 60 &&  marks < 80) {
            System.out.println("Ladka pass hua h bus gali to khayega lekin");
            
        }
        else if (marks >= 40 && marks < 60) {
            System.out.println("Ladka pass hua h lekin gali aur maar dono khayega lekin");
        }
        else if (marks >= 0 && marks < 40) {
            System.out.println("Ladka fail ho gya");
        }
        else {
            System.out.println("ladke ka invalid marks hai");
        }
    }
}
