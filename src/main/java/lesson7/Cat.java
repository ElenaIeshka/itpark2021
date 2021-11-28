package lesson7;

public class Cat {
 public static void main(String[] args) {
  Animals cat = new Animals();
  cat.nameAnimals = "Cat";
  cat.nickname = "Mila";
  cat.run = 200;
  cat.swim = 0;
  cat.maxrun = 201;
  cat.maxswim = 0;

  cat.runAnimals(cat.run);
  cat.swimAnimals(cat.swim);


 }


// public static void runCat(int run) {
//  if (run < 200) {
//   System.out.println("test");
//  } else {
//   System.out.println("err");
//  }
// }
}














