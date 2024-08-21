public class Main {
    public static void main(String[] args) {

//        Срок сдачи : 21.08.2024 / 18:00
//        Class Cow (weight, age, gender, nickName)
//
//        Класс Sheep(weight, age, gender, nickName)
//
//        Класс Horse weight, age, color, gender, nickName)
//
//        Класс Farm(address, cows, horses, sheep, OwnerName)
//
//        2 Farm tuzunuz.
//
//        1-Farm: 3 sheep, 5 cows, 2 horses.
//
//        2-Farma 1 sheep, 1 cow, 1 horse bobbler.

        Animal[] animals = new Animal[]{
                new Horse(200.50, 7, "Yellow", "Male", "Spirit"),
                new Horse(150.45, 3, "Black", "Female", "Jorgo"),

                new Cow(164.3, 5, "Male", "Mulka"),
                new Cow(150.1, 3, "Female", "Sary ui"),
                new Cow(170, 6, "Male", "Kara ui"),
                new Cow(110.70, 5, "Female", "Kyzyl ui"),
                new Cow(100.90, 2, "Male", "Torpok"),

                new Sheep(40.60, 5, "Male", "Jakshy koi"),
                new Sheep(25.56, 3, "Female", "Chiksa koi"),
                new Sheep(28.80, 5, "Male", "Kara koi")};

        System.out.println();

        Farm farm1 = new Farm("Tokmok", animals, "Talgat");
        System.out.println(farm1);

        Animal[] animal = {
                new Sheep(100.56, 6, "Female", "Gisar"),

                new Horse(150.45, 8, "Toru", "Male", "Toru Aigyr"),

                new Cow(90.90, 9, "Female", "Milka")};


        Farm farm2 = new Farm("Orok", animal, "Veselyi Molochnik");
        System.out.println(farm2);
    }
}