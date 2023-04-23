package Java_Adapter_Design_Pattern;

public class HairDryer implements Electronic110V{
    @Override
    public void powerOn() {
        System.out.println("헤어 드라이기 110v on");
    }
}
