package POO.Trabalhando_com_records;

public class Principal {
    public static void main (String[] args) {
        Person person = new Person("João", 12);
        System.out.println(person);
        System.out.println(person.name());

    }
}
