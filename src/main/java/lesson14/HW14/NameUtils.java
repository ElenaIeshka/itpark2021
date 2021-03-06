package lesson14.HW14;

import java.util.List;
import java.util.Random;

public class NameUtils {
    private static final List<String> NAMES = List.of("Ава",
            "Августа",
            "Аврелия",
            "Аврора",
            "Агата",
            "Агафья",
            "Агнеса",
            "Агнесса",
            "Агния",
            "Аделаида",
            "Аделина",
            "Адриенна",
            "Азиза",
            "Аида",
            "Айгульа",
            "Алдона",
            "Алевтина",
            "Александра",
            "Алима",
            "Алина",
            "Алиса",
            "Алия",
            "Алла",
            "Альбина",
            "Аманда",
            "Амина",
            "Амира",
            "Анаиса",
            "Анастасия",
            "Ангелина",
            "Анжела",
            "Анжелика",
            "Анисия",
            "Анна",
            "Антонина",
            "Анука",
            "Анфиса",
            "Аполлинария",
            "Аполлония",
            "Ассольа",
            "Аурелия",
            "Бажена",
            "Беата",
            "Беатриса",
            "Белла",
            "Блерта",
            "Божена",
            "Дана",
            "Дарерка",
            "Дарья",
            "Дебора",
            "Джанета",
            "Дженифера",
            "Дженна",
            "Джессика",
            "Джоана",
            "Джулия",
            "Диана",
            "Дина",
            "Дита",
            "Домна",
            "Дора",
            "Доротея",
            "Магалиа",
            "Магдалина",
            "Мадина",
            "Майя",
            "Малика",
            "Мальвина",
            "Маргарета",
            "Маргарита",
            "Марианна",
            "Марина",
            "Мариса",
            "Марисоль",
            "Мария",
            "Марлена",
            "Марфа",
            "Мастридия",
            "Матильда",
            "Матрёна",
            "Мафтуха",
            "Мелания",
            "Мелисса",
            "Меропа",
            "Мерседеса",
            "Милица",
            "Миранда",
            "Мирейа",
            "Миропия",
            "Мирослава",
            "Михримаха",
            "Мэдисон",
            "Мэри",
            "Мю",
            "Надежда",
            "Наджия",
            "Надия",
            "Назгуль",
            "Наиля",
            "Наоми",
            "Наталья",
            "Невена",
            "Нелли",
            "Неонилла",
            "Ника",
            "Николетта",
            "Нилуфара",
            "Нинельа",
            "Ноа",
            "Нонна",
            "Нора",
            "Нэнси",
            "Камилла",
            "Камиля",
            "Карена",
            "Карина",
            "Каролина",
            "Кима",
            "Кира",
            "Клавдия",
            "Клара",
            "Клементина",
            "Констанция",
            "Консуэло",
            "Корнелия",
            "Кристина",
            "Ксения"
    );
    private static final List<String> SURNAMES = List.of("Смирнова",
            "Иванова",
            "Кузнецова",
            "Соколова",
            "Попова",
            "Лебедева",
            "Козлова",
            "Новикова",
            "Морозова",
            "Петрова",
            "Волкова",
            "Соловьёва",
            "Васильева",
            "Зайцева",
            "Павлова",
            "Семёнова",
            "Голубева",
            "Виноградова",
            "Богданова",
            "Воробьёва",
            "Фёдорова",
            "Михайлова",
            "Беляева",
            "Тарасова",
            "Белова",
            "Комарова",
            "Орлова",
            "Киселёва",
            "Макарова",
            "Андреева",
            "Ковалёва",
            "Ильина",
            "Гусева",
            "Титова",
            "Кузьмина",
            "Кудрявцева",
            "Баранова",
            "Куликова",
            "Алексеева",
            "Степанова",
            "Яковлева",
            "Сорокина",
            "Сергеева",
            "Романова",
            "Захарова",
            "Борисова",
            "Королёва",
            "Герасимова",
            "Пономарёва",
            "Григорьева",
            "Лазарева",
            "Медведева",
            "Ершова",
            "Никитина",
            "Соболева",
            "Рябова",
            "Полякова",
            "Цветкова",
            "Данилова",
            "Жукова",
            "Фролова",
            "Журавлёва",
            "Николаева",
            "Крылова",
            "Максимова",
            "Сидорова",
            "Осипова",
            "Белоусова",
            "Федотова",
            "Дорофеева",
            "Егорова",
            "Матвеева",
            "Боброва",
            "Дмитриева",
            "Калинина",
            "Анисимова",
            "Петухова",
            "Антонова",
            "Тимофеева",
            "Никифорова",
            "Веселова",
            "Филиппова",
            "Маркова",
            "Большакова",
            "Суханова",
            "Миронова",
            "Ширяева",
            "Александрова",
            "Коновалова",
            "Шестакова",
            "Казакова",
            "Ефимова",
            "Денисова",
            "Громова",
            "Фомина",
            "Давыдова",
            "Мельникова",
            "Щербакова",
            "Блинова",
            "Колесникова",
            "Карпова",
            "Афанасьева",
            "Власова",
            "Маслова",
            "Исакова",
            "Тихонова",
            "Аксёнова",
            "Гаврилова",
            "Родионова",
            "Котова",
            "Горбунова",
            "Кудряшова",
            "Быкова",
            "Зуева",
            "Третьякова",
            "Савельева",
            "Панова",
            "Рыбакова",
            "Суворова",
            "Абрамова",
            "Воронова",
            "Мухина",
            "Архипова",
            "Трофимова",
            "Мартынова",
            "Емельянова",
            "Горшкова",
            "Чернова",
            "Овчинникова",
            "Селезнёва",
            "Панфилова",
            "Копылова",
            "Михеева",
            "Галкина",
            "Назарова",
            "Лобанова",
            "Лукина",
            "Белякова",
            "Потапова",
            "Некрасова",
            "Хохлова",
            "Жданова",
            "Наумова",
            "Шилова",
            "Воронцова",
            "Ермакова",
            "Дроздова",
            "Игнатьева",
            "Савина",
            "Логинова",
            "Сафонова",
            "Капустина",
            "Кириллова",
            "Моисеева",
            "Елисеева",
            "Кошелева",
            "Костина",
            "Горбачёва",
            "Орехова",
            "Ефремова",
            "Исаева",
            "Евдокимова",
            "Калашникова",
            "Кабанова",
            "Носкова",
            "Юдина",
            "Кулагина",
            "Лапина",
            "Прохорова",
            "Нестерова",
            "Харитонова",
            "Агафонова",
            "Муравьёва",
            "Ларионова",
            "Федосеева",
            "Зимина",
            "Пахомова",
            "Шубина",
            "Игнатова",
            "Филатова",
            "Крюкова",
            "Рогова",
            "Кулакова",
            "Терентьева",
            "Молчанова",
            "Владимирова",
            "Артемьева",
            "Гурьева",
            "Зиновьева",
            "Гришина",
            "Кононова",
            "Дементьева",
            "Ситникова",
            "Симонова",
            "Мишина",
            "Фадеева",
            "Комиссарова",
            "Мамонтова",
            "Носова",
            "Гуляева",
            "Шарова",
            "Устинова",
            "Вишнякова",
            "Евсеева",
            "Лаврентьева",
            "Брагина",
            "Константинова",
            "Корнилова",
            "Авдеева",
            "Зыкова",
            "Бирюкова",
            "Шарапова",
            "Никонова",
            "Щукина",
            "Дьячкова",
            "Одинцова",
            "Сазонова",
            "Якушева",
            "Красильникова",
            "Гордеева",
            "Самойлова",
            "Князева",
            "Беспалова",
            "Уварова",
            "Шашкова",
            "Бобылёва",
            "Доронина",
            "Белозёрова",
            "Рожкова",
            "Самсонова",
            "Мясникова",
            "Лихачёва",
            "Бурова",
            "Сысоева",
            "Фомнаёва",
            "Русакова",
            "Стрелкова",
            "Гущина",
            "Тетерина",
            "Колобова",
            "Субботина",
            "Фокина",
            "Блохина",
            "Селиверстова",
            "Пестова",
            "Кондратьева",
            "Силина",
            "Меркушева",
            "Лыткина",
            "Турова");
    private static final List<String> PATRONYMICS = List.of("Барниевна",
            "Бартоломеевна",
            "Басиревна",
            "Бахтияревна",
            "Бенеевна",
            "Бехрузеевна",
            "Билялщвна",
            "Богдановна",
            "Болеславовна",
            "Болотовна",
            "Бонавентуровна",
            "Борисовна",
            "Бориславовна",
            "Бояновна",
            "Брониславовна",
            "Брячиславовна",
            "Булатовна",
            "Бурхановна",
            "Бямбасурэновна");
    public static String randomizeName(){
        return randomize(NAMES);
    }
    public static String randomizeSurName(){
        return randomize(SURNAMES);
    }public static String randomizePatronymics(){
        return randomize(PATRONYMICS);
    }
    private static String randomize(List<String> values) {
        return values.get(new Random().nextInt(values.size()));
    }
}
