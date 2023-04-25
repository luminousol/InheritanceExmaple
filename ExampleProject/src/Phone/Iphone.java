package Phone;

// Phone 클래스를 상속받는 Iphone 클래스
public class Iphone extends Phone {
    // Iphone은 Phone 클래스의 생성자를 호출하기 위해 super(brand, model)메서드 사용
//    String brand;
//    String model;

    public Iphone(String brand, String model) {
        super(brand, model);
    }

    // Iphone을 켤 때 Iphone 클래스에서만 동작
    void appleTurnon(String brand, String model){
        System.out.println(brand+"휴대폰을 켭니다.");
        System.out.println(model+"기종입니다.");
    }

    // Iphone에서만 동작하는 applePay
    void applePay(String brand){
        System.out.println(brand+"Pay를 시작합니다.");
    }

}
