package Phone;

public class Phone {

    String brand; // 필드
    String model; // 필드

    public Phone(String brand, String model) { // 생성자
        this.brand = brand;
        this.model = model;
    }

    public void call(String phoneNumber) {
        // 전화 걸기 로직
        System.out.println(phoneNumber + "로 전화를 겁니다.");
    }

    public void sendMessage(String phoneNumber, String message) {
        // 문자 보내기 로직
        System.out.println(phoneNumber + "로 문자를 보냅니다.");
        System.out.println(message);
        System.out.println( "💭메세지를 전송합니다.");
    }

    public class Camera { // 이너 클래스
        public void takePicture() {
            // 사진 촬영 로직
            System.out.println("사진을 촬영합니다.");
        }

        public void recordVideo() {
            // 동영상 촬영 로직
            System.out.println("동영상을 촬영합니다.");
        }
    }
}
