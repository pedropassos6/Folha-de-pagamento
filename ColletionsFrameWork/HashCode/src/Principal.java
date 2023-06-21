public class Principal {
    public static void main(String[] args) {

        Contato contato1 = new Contato("Pedro", "pedro@gmail.com", 30);
        Contato contato2 = new Contato("Heisenberg", "ww@gmail.com", 52);
        Contato contato3 = new Contato("Jessie", "jpinkman@gmail.com", 32);

        System.out.println(contato1.hashCode());
        System.out.println(contato2.hashCode());
        System.out.println(contato3.hashCode());

//        System.out.println(contato2.equals(contato3));
//        System.out.println(contato2.hashCode() == contato3.hashCode());

    }
}
