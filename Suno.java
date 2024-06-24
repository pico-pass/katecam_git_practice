import java.util.Objects;

public class Suno {
    private String name;
    private int age;
    private String birthDate;

    public Suno(String name, int age, String birthDate) {
        this.name = name;
        this.age = age;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Suno suno = (Suno) o;
        return age == suno.age && Objects.equals(name, suno.name) && Objects.equals(birthDate, suno.birthDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, birthDate);
    }

    @Override
    public String toString() {
        return "Suno{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", birthDate='" + birthDate + '\'' +
                '}';
    }

//    public static void main(String[] args) {
//        Suno suno = new Suno("권순호",26,"0509");
//        System.out.println(suno);
//    }
}
