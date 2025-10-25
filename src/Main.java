import LAB1algorithms.Palindrome;
import LAB1algorithms.Primes;
import LAB2oop.*;
import LAM3hashmap.HashTable;
import LAM3hashmap.Student;

import java.util.HashMap;

public class Main {

    //Автономов И.В. УБСТ2305
    public static void main(String[] args) {

        // Лаб 1
        //Задание 1 - Все простые числа, которые меньше 100
        System.out.println("Лабораторная работ №1\nПростые числа от 2 до 100:");

        for (int i = 2; i <= 100; i++) {
            if (Primes.isPrime(i)) {
                System.out.println(i);
            }
        }

        //Задание 2 -  Палиндром
        for (int i = 0; i < args.length; i++) {
            String s = args[i];
            System.out.println(s + " - " + (Palindrome.isPalindrome(s) ? "палиндром" : "не палиндром"));
        }

        // Лаб 2
        // Принципы ООП - Создание объектов
        Cat cat = new Cat("Мурка", 3, 4.5, "Сиамская");
        PersianCat persian = new PersianCat("Бобик", 2, 5.0, true);
        Parrot parrot = new Parrot("Кеша", 1, 0.3, "Зеленый");
        Fish fish = new Fish("Немо", 1, 0.05, "Клоун");

        // Демонстрация полиморфизма
        System.out.println("\nЛабораторная работа №2\n=== Звуки животных ===");
        cat.makeSound();
        persian.makeSound();
        parrot.makeSound();
        fish.makeSound();

        // Демонстрация методов
        System.out.println("\n=== Действия животных ===");
        cat.eat();
        cat.scratch();

        parrot.sleep();
        parrot.fly();

        fish.eat();
        fish.swim();

        // Работа с геттерами/сеттерами
        System.out.println("\n=== Информация ===");
        System.out.println("Имя кошки: " + cat.getName());
        System.out.println("Возраст: " + cat.getAge());
        System.out.println("Порода: " + cat.getBreed());

        cat.setAge(4);
        System.out.println("Новый возраст: " + cat.getAge());

        // Счетчик объектов
        System.out.println("\n=== Статистика ===");
        System.out.println("Всего животных создано: " + Animal.getCount());


        // Лаб 3
        // ===== ЗАДАНИЕ 1: Собственная реализация HashTable =====
        System.out.println("\nЛабораторная работа №3\n=== ЗАДАНИЕ 1: Собственная HashTable ===\n");

        HashTable<String, Integer> myTable = new HashTable<>(7);

        // Добавление
        myTable.put("apple", 5);
        myTable.put("banana", 3);
        myTable.put("orange", 7);
        myTable.put("pear", 2);

        System.out.println("Размер: " + myTable.size());
        System.out.println("apple = " + myTable.get("apple"));
        System.out.println("banana = " + myTable.get("banana"));

        // Обновление
        myTable.put("banana", 10);
        System.out.println("banana после обновления = " + myTable.get("banana"));
        System.out.println("Размер: " + myTable.size());

        // Удаление
        myTable.remove("orange");
        System.out.println("Размер после удаления: " + myTable.size());
        System.out.println("Пустая? " + myTable.isEmpty());


        // ===== ЗАДАНИЕ 2: HashMap для студентов =====
        System.out.println("\n=== ЗАДАНИЕ 2: HashMap для студентов ===\n");

        HashMap<String, Student> students = new HashMap<>();

        // Добавление студентов
        students.put("12345", new Student("Иван", "Иванов", 20, 4.5));
        students.put("23456", new Student("Ирия", "Петрова", 19, 4.8));
        students.put("34567", new Student("Алексей", "Сидоров", 21, 3.9));
        students.put("45678", new Student("Елена", "Смирнова", 20, 4.2));

        System.out.println("Всего студентов: " + students.size());

        // Поиск студента
        System.out.println("\nПоиск студента 23456:");
        Student s = students.get("23456");
        if (s != null) {
            System.out.println(s);
        }

        // Вывод всех студентов
        System.out.println("\nВсе студенты:");
        for (String key : students.keySet()) {
            System.out.println("Зачетка " + key + ": " + students.get(key));
        }

        // Обновление
        System.out.println("\nОбновление студента 34567:");
        students.put("34567", new Student("Алексей", "Сидоров", 21, 4.5));
        System.out.println(students.get("34567"));

        // Удаление
        System.out.println("\nУдаление студента 45678:");
        students.remove("45678");
        System.out.println("Всего студентов: " + students.size());

        // Поиск по условию
        System.out.println("\nСтуденты со средним баллом >= 4.5:");
        for (String key : students.keySet()) {
            Student student = students.get(key);
            if (student.getGpa() >= 4.5) {
                System.out.println("Зачетка " + key + ": " + student);
            }
        }
    }
}