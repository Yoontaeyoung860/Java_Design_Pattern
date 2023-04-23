package Java_Singleton_Design_Pattern;

public class SingletonMain {
    public static void main(String[] args) {
        //객체 생성
        AClazz aClazz = new AClazz();
        BClazz bClazz = new BClazz();
        //두 개의 Client가 서로 동일 한가?
        SocketClient aClient = aClazz.getSocketClient();
        SocketClient bClient = bClazz.getSocketClient();

        System.out.printf("두 개의 객체가 동일 합니까? ");
        boolean equls = aClient.equals(bClient);
        //ⓧ-1 처럼, 자신의 Default Constructor에서 새로운 객체를 생성하면, false가 반환 됩니다.
        System.out.println(equls); //true

        System.out.println(aClazz.getSocketClient());

    }
}