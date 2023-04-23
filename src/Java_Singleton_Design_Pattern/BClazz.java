package Java_Singleton_Design_Pattern;

//Class는 예약어 이기 때문에, "Clazz"로 변경 합시다.
public class BClazz {

    private SocketClient socketClient;

    public BClazz() {
        //ⓧ this.socketClient = new SocketClient(); ->  Defalut Constructor를 Private으로 해서 안됩니다.
        //ⓧ-1 this.socketClient = new SocketClient(); -> 새로운 객체를 만드는 방식
        this.socketClient = SocketClient.getInstance();
    }
        public SocketClient getSocketClient() {
         return  this.socketClient;


    }
}
