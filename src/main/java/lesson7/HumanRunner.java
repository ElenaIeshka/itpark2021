package lesson7;

public class HumanRunner {
    public static void main(String[] args) {
        Human me = new Human();
        me.name = "Elena";
        me.surname = "Ieshkina";
        me.age = 36;
        me.weight = 50;
        me.height = 164;
        me.hasQrCode = true;

        Human friend = new Human();
        friend.name = "fjhfjt";
        friend.surname = "ytdyd";
        friend.age = 20;
        friend.weight = 47;
        friend.height = 150;
        friend.hasQrCode = false;

        Human incognito = new Human("Unknown","Unknown",-1,-1,-1,null);

        Human klukaIvanovna = new Human("Kluka","Fedorova", 69);

        System.out.println(me==klukaIvanovna);
        System.out.println(me==me);

        Human[] humans = new Human[] {me,friend,incognito,klukaIvanovna};
        for (Human human: humans){
        if (69==human.age){
                System.out.println("..."+ human.name + "..." + human.surname+ " 69");
            }
        }
        me.beOlder();
        System.out.println("" + me.age);
        me.vaccinated();
        System.out.println("..."+ me.hasQrCode);


        me.setName("Lena");
        System.out.println("теперь я "+ me.setName);



    }
}
