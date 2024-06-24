public class SelfIntroduction {
    // 필드
    private String name;
    private String birthDate; // 생일은 String 타입으로 간단하게 처리

    // 생성자
    public SelfIntroduction(String name, String birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }

    // 이름의 getter
    public String getName() {
        return name;
    }

    // 생일의 getter
    public String getBirthDate() {
        return birthDate;
    }

    // 생일의 setter
    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

}

