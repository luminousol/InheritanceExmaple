package Phone;

public class Main {
    public static void main(String[] args) {

        //  Phone 클래스의 객체 생성
        Phone p = new Phone("SAMSUNG", "울트라 23");
        // 참조변수 p에서 객체의 동작 호출
        p.call("010-1234-5678");
        p.sendMessage("010-1234-5678", "안녕하세요");
        // 내부 클래스 호출을 위해 객체 생성
        Phone.Camera c = p.new Camera();
        c.takePicture();
        c.recordVideo();

        System.out.println();

        // Iphone 클래스의 객체 생성
        Iphone ip = new Iphone("🍏APLLE", "아이폰 13Pro");
        ip.appleTurnon(ip.brand, ip.model);
        ip.applePay(ip.brand);
        ip.call("010-9876-5432");
        ip.sendMessage("010-9876-5432","큰일났어... 레옹이 죽은 것 같아 ");
        // 내부 클래스의 호출을 위해 객체 생성
        Phone.Camera ic = ip.new Camera();
        ic.takePicture();
        ic.recordVideo();

    }
}
