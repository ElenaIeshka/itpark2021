package lesson18.dto;

import lombok.*;

import java.io.*;

@Data
@EqualsAndHashCode()   //(of = "name", exclude = "age")
//@Setter
//@Getter
@NoArgsConstructor
//@ToString
@AllArgsConstructor
//@RequiredArgsConstructor // final  у нужных полей
public class Person implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L;

    private String name;
    private int age;
    private Sex sex;
    private double height;

    public Person(String name) {
        this.name = name;
    }

    public void beOlder () throws Exception {
        this.age++;
    }

//    @Override
//    public void writeExternal(ObjectOutput out) throws IOException {
//        out.writeObject(this);
//    }
//
//    @Override
//    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
//
//    }
}
