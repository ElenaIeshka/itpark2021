package lesson14.HW14;


import java.util.Collection;
import java.util.HashSet;
import java.util.stream.Collectors;

public class Contact {
  private final String name;
    private final String surname;
    private final String patronymic;
    private final String phone;
    private Collection<Contact> linkedContacts;

    public Contact(){
        this(NameUtils.randomizeName(), NameUtils.randomizeSurName(), NameUtils.randomizePatronymics(), PhoneUtils.generatePhone());
    }

    public Contact(String name, String surname, String patronymic, String phone) {
        this.name = name;
        this.surname = surname;
        this.patronymic = patronymic;
        this.phone = phone;
        this.linkedContacts = new HashSet<>();
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getPhone() {
        return phone;
    }

    public Collection<Contact> getLinkedContacts() {
        return linkedContacts;
    }

    @Override
    public String toString() {
        return "Contact{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", patronymic='" + patronymic + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
