package Java_Singleton_Design_Pattern;

public class SocketClient {

    //Singleton 이라는 것은 자기 자신을 객체로 가지고 있어야 합니다.
    //public static SocketClient getInstance()가 static이기 때문에 마찬가지로, static으로 바꿔줍니다.
    private static SocketClient socketClient = null;

    //기본 생성자는 private으로 막아야 합니다.
    private SocketClient() {

    }

    //static Method getInstance()를 만들어 줍니다.
    //외부에서 static method이기 때문에 SocketClient.getInstance() 메서드에 접근이 가능합니다.
    public static SocketClient getInstance(){
        //현재 내가 가지고 있는 객체가 null인지 확인 합니다.
        //Null인 경우, 생성 해줍니다.
        if(socketClient == null) {
            socketClient = new SocketClient();
            System.out.println("만들었습니다.");
        }

        //객체가 있는 경우,자신이 가지고 있는 SocketClient를 return 해줍니다. 최초에 한번만 생성 될 수 있도록 해줍니다.
        return socketClient;
    }
    public void connect(){
        System.out.println("connect");
    }

    // toString 메소드를 오버라이딩하여 원하는 출력 형식을 반환하도록 수정합니다.
    @Override
    public String toString() {
        return "SocketClient 객체입니다.";
    }
}

