package Java_Adapter_Design_Pattern;

//220V->110V로...고로 원형은 110V 입니다.
public class SocketAdapter implements Electronic110V {
    //호환 시켜 줘야 할 220V를 가져옵니다.
    private  Electronic220V electronic220V;

    //기본 생성자에 호환 시켜 줘야 할 220V를 넣어줍니다.
    public SocketAdapter(Electronic220V electronic220V){
        this.electronic220V = electronic220V;
    }
    //110V에 220V가 연결 되었을 때, 220V를 호출 해줍니다.
    @Override
    public void powerOn() {
       electronic220V.connect();
    }
}
