package yanot.guru;

public class PetRaccoon {
    public static String className = "Еноты";
    private String raccoonName; // имя енота
    private String gender; // имя енота
    private String placeOfBirth; // место рождения
    private int lengthTail; // длина хвоста
    private String colorCoat;// окрас меха
    private int lengthBody; // длина тела
    private int weightBody; // масса тела
    private int age; // возраст
    private int nutsDay; // суточное количество орехов
    private int reserve; // остаток орехов
    private boolean friendliness; // уровень дружелюбности
    Subspecies subspecies; // подвид

    public PetRaccoon(String raccoonName, String gender, String placeOfBirth, int lengthTail, String colorCoat, int lengthBody,
                      int weightBody, int age, int nutsDay) {
        this.raccoonName = raccoonName;
        this.gender = gender;
        this.placeOfBirth = placeOfBirth;
        this.lengthTail = lengthTail;
        this.colorCoat = colorCoat;
        this.lengthBody = lengthBody;
        this.weightBody = weightBody;
        this.age = age;
        this.nutsDay = nutsDay;
    }

    public String getRaccoonName() {
        return raccoonName;
    }

    public void setRaccoonName(String raccoonName) {
        this.raccoonName = raccoonName;
    }

    public String getGender(){
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPlaceOfBirth() {
        return placeOfBirth;
    }

    public void setPlaceOfBirth(String placeOfBirth) {
        this.placeOfBirth = placeOfBirth;
    }

    public int getLengthTail() {
        return lengthTail;
    }

    public void setLengthTail(int lengthTail) {
        this.lengthTail = lengthTail;
    }

    public String getColorCoat() {
        return colorCoat;
    }

    public void setColorCoat(String colorCoat) {
        this.colorCoat = colorCoat;
    }

    public int getLengthBody() {
        return lengthBody;
    }

    public void setLengthBody(int lengthBody) {
        this.lengthBody = lengthBody;
    }

    public int getWeightBody() {
        return weightBody;
    }

    public void setWeightBody(int weightBody) {
        this.weightBody = weightBody;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNutsDay() {
        return nutsDay;
    }

    public void setNutsDay(int age) {
        this.nutsDay = nutsDay;
    }

    public int getReserve() {
        return reserve;
    }

    public void setReserve(int reserve) {
        this.reserve = reserve;
    }

    public void getGenderOne(){
        if (gender.equals("жен")) {
            System.out.print(raccoonName + " получила ");
        } else {
            System.out.print(raccoonName + " получил ");       }
    }

    public void getFriendliness() {
        if (nutsDay >= 10) {
            friendliness = true;
            {
                System.out.print(nutsDay + " орешков " + "поэтому " + raccoonName + " очень");
            }
        } else {
            System.out.print(nutsDay + " орешков " + "поэтому " + raccoonName + " совершенно не");
        }
    }

    public void getGenderTwo(){
        if (gender.equals("жен")) {
            System.out.println(" дружелюбна");
        } else {
            System.out.println(" дружелюбен");       }
    }

    public void getPlay() {
        if (friendliness) {
            {
                System.out.println(raccoonName + " будет играть");
            }
        } else {
            System.out.println(raccoonName + " не хочет играть ");
        }
    }

    public void saySpecificationsRaccoon() {
        System.out.println("Имя енота: " + raccoonName);
        System.out.println("Возраст енота: " + age);
        System.out.println("Место рождения енота: " + placeOfBirth);
        System.out.println("Длина хвоста енота: " + lengthTail);
        System.out.println("Окрас енота: " + colorCoat);
        System.out.println("Длина тушки енота: " + lengthBody);
        System.out.println("Вес тушки енота: " + weightBody);
        System.out.println("Съеденое кол-во орехов за день: " + nutsDay);
    }

    public static void sayClassName() {
        System.out.println(PetRaccoon.class.getName());
    }

    static class Subspecies {
        String classSpecies;

        public Subspecies(String classSpecies) {
            this.classSpecies = classSpecies;
        }

        public void saySubspecies() {
            System.out.println("Подвид енота: " + classSpecies + "\n");
        }
    }
}



