public class Main {

    public static void main(String[] args) {
        UsersCrud usersCrud=new UsersCrud();
        Users user1=new Users();
        user1.setName("Oleg");
        user1.setEmail("oleg_olegov@yandex.ru");
        user1.setPassword("mynameisoleg1122");
        usersCrud.save(user1);

        Users user2=new Users();
        user2.setName("Petr");
        user2.setEmail("petr_petrov@yandex.ru");
        user2.setPassword("petr2233");
        usersCrud.save(user2);

        usersCrud.getAll().forEach(it->System.out.println(it));

        Users userWithId=usersCrud.getById(1);
        System.out.println(userWithId);
        usersCrud.delete(userWithId);
        usersCrud.getAll().forEach(it->System.out.println(it));

    }
}
