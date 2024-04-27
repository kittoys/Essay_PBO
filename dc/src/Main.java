import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nama anjing: ");
        String dogName = scanner.nextLine();
        System.out.print("Masukkan usia anjing: ");
        int dogAge = scanner.nextInt();
        scanner.nextLine(); // Membuang newline karakter setelah nextInt()

        System.out.print("Masukkan nama kucing: ");
        String catName = scanner.nextLine();
        System.out.print("Masukkan usia kucing: ");
        int catAge = scanner.nextInt();

        Animal dog = new Dog(dogName, dogAge);
        Animal cat = new Cat(catName, catAge);

        System.out.println("Suara anjing:");
        dog.sound(); // Output: Woof!
        System.out.println("Suara kucing:");
        cat.sound(); // Output: Meow!

        System.out.println("Nama anjing sebelum diubah: " + dog.getName());
        System.out.println("Nama kucing sebelum diubah: " + cat.getName());

        // Mengubah nama hewan
        System.out.print("Masukkan nama baru untuk anjing: ");
        String newDogName = scanner.next();
        dog.setName(newDogName);

        System.out.print("Masukkan nama baru untuk kucing: ");
        String newCatName = scanner.next();
        cat.setName(newCatName);

        System.out.println("Nama anjing setelah diubah: " + dog.getName());
        System.out.println("Nama kucing setelah diubah: " + cat.getName());

        scanner.close();
    }
}
