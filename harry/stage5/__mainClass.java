public class __mainClass {

    public static void main(String[] args) {
        User user = User.getInstance("harry", 30, "Seoul");
        // user. // 내부 값을 바꾸거나 할 수 없다. 제안이 안뜬다. -> 유일무이!

        Device device = Device.iPad;
        device.deviceModel("iPad Air 4 gen");
        device.display();
    }
}
