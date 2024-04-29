public class Main {

    public static void main(String[] args) {
        Author mBulgakov = new Author("Михаил", "Булгаков");
        System.out.println("mBulgakov.getFirstName() = " + mBulgakov.getFirstName());
        System.out.println("mBulgakov.getLastName() = " + mBulgakov.getLastName());

        Book masterAndMargarita = new Book("Мастер и Маргарита", mBulgakov, 1966);
        System.out.println("masterAndMargarita.name = " + masterAndMargarita.getName());
        System.out.println("masterAndMargarita.author = " + masterAndMargarita.getAuthor().getFirstName() + " " +
                masterAndMargarita.getAuthor().getLastName());
        System.out.println("masterAndMargarita.year = " + masterAndMargarita.getYear());

        Author aPushkin = new Author("Александр", "Пушкин");
        System.out.println("aPushkin.getFirstName() = " + aPushkin.getFirstName());
        System.out.println("aPushkin.getLastName() = " + aPushkin.getLastName());

        Book fairyTales = new Book("Сказки", aPushkin, 2023);
        System.out.println("fairyTales.name = " + fairyTales.getName());
        System.out.println("fairyTales.author = " + fairyTales.getAuthor().getFirstName() + " " +
                fairyTales.getAuthor().getLastName());
        System.out.println("fairyTales.year = " + fairyTales.getYear());

        fairyTales.setYear(2022);
        System.out.println("fairyTales.getYear() = " + fairyTales.getYear());
        System.out.println(masterAndMargarita);
        System.out.println(fairyTales);


    }
}