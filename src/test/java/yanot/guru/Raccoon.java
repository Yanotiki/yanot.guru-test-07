package yanot.guru;


public class Raccoon {
    public static void main(String[] args) {
        PetRaccoon.sayClassName();
        System.out.println(PetRaccoon.className + "\n");

        PetRaccoon sonya = new PetRaccoon("Соня", "жен", "Краснодарский край", 25, "темно-серый",
                45, 10, 3, 20);
        sonya.subspecies = new PetRaccoon.Subspecies("Енот-полоскун");
        sonya.saySpecificationsRaccoon();
        sonya.subspecies.saySubspecies();
        sonya.getGenderOne();
        sonya.getFriendliness();
        sonya.getGenderTwo();
        sonya.getPlay();

        System.out.println();

        PetRaccoon tema = new PetRaccoon("Тема", "муж", "Северная Америка", 29, "серый",
                60, 25, 5, 5);
        tema.subspecies = new PetRaccoon.Subspecies("Гваделупский енот");
        tema.saySpecificationsRaccoon();
        tema.subspecies.saySubspecies();
        tema.getGenderOne();
        tema.getFriendliness();
        tema.getGenderTwo();
        tema.getPlay();
    }
}
