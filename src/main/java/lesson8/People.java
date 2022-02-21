package lesson8;

public class People {
    public static void main(String[] args) {
        Male me = new Male("Иешкин Максим Николаевич", 36,"русский", true);
       Female nataliaIvanovna = new Female("Федотова Наталья Ивановна", 65, "ручсская", false);
    me.beOlder();
    nataliaIvanovna.changeNationality("немка");
    nataliaIvanovna.changeName("Меркель Ангела");
    nataliaIvanovna.setAge(67);
        System.out.println(me);
        System.out.println(nataliaIvanovna);
        Human[] people = new Human[]{me, nataliaIvanovna};
        for (Human human: people) {
            human.setAge(40);
        }
        System.out.println("----------"
        );
        System.out.println(me);
        System.out.println(nataliaIvanovna);
    }

}
