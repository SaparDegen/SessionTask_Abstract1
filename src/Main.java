import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input name: ");
        String name1 = scanner.nextLine();

        Person[] people = {
                new Person("Asan", 21, "Bishkek"),
                new Person("Uson", 22, "Batken"),
                new Person("Adyl", 23, "Talas"),
        };

        int[][] arrInt = {{1, 1, 5, 3, 2}, {1, 2, 4, 2, 3}, {2, 1, 6, 5, 2}};

        for (int u = 0; u < 3; u++) {
            if (name1.equals(people[u].getName())) {
                int sum = 0;
                for (int f : arrInt[u]) {
                    sum += f;
                }
                Animal[] arrAnimalsNew = new Animal[sum];
                int k = 0, p = 0, k1 = 0, k2 = 0, k3 = 0, k4 = 0, k5 = 0;
                for (int i = 0; i < arrInt[u].length; i++) {
                    for (int j = 0; j < arrInt[u][i]; j++) {
                        if (i == 0) {
                            k1++;
                            p = k1;
                            arrAnimalsNew[k] = new Cat("Cat" + p, random.nextInt(1, 5), random.nextInt(1, 8));
                        } else if (i == 1) {
                            k2++;
                            p = k2;
                            arrAnimalsNew[k] = new Dog("Dog" + p, random.nextInt(1, 5), random.nextInt(3, 10));
                        } else if (i == 2) {
                            k3++;
                            p = k3;
                            arrAnimalsNew[k] = new Horse("Horse" + p, random.nextInt(1, 5), random.nextInt(50, 100));
                        } else if (i == 3) {
                            k4++;
                            p = k4;
                            arrAnimalsNew[k] = new Fish("Fish" + p, random.nextInt(1, 5), random.nextInt(1, 3));
                        } else if (i == 4) {
                            k5++;
                            p = k5;
                            arrAnimalsNew[k] = new Cow("Cow" + p, random.nextInt(1, 5), random.nextInt(50, 80));
                        }
                        k++;
                    }
                }
                people[u].setAnimals(arrAnimalsNew);
                System.out.println(people[u].toString());
                break;
            }
        }
    }
}