package Java_Adapter_Design_Pattern;

public class AdapterMain {
    public static void main(String[] args)
    {

        //헤어 드라이기를 가져 와서, 110V콘센트에 연결 하였습니다.헤어드라이기는 110V전용이기에, 호환이 잘 되고 있습니다.
        HairDryer hairDryer = new HairDryer();
        connect(hairDryer);
        //청소기를 가져 와서, 110V 콘센트에 연결 하였더니,
        Cleaner cleaner = new Cleaner();
        //청소기는 220V 전용이기에, 호환이 안되고 있습니다.
        //connect(cleaner);  ⓧ
        //그래서 110V 콘센트에 SocketAdapter라는 220V를 110V로 변환 해주는 변환기를 가져와서, 청소기를 연결 시켜 줍니다.
        Electronic110V adapter = new SocketAdapter(cleaner);
        //청소기가 아니라, 변환 기기를 호출 해야 정상 작동 됩니다.
        connect(adapter);
        //에어컨을 가져와서, 110V 콘센트에 연결 하였더니, 220V 전용  에어컨 이었습니다. 그래서 호환이 안되고 있습니다.
        AirConditioner airConditioner = new AirConditioner();
        //그래서 또 변환기를 가져와서, 변환기에 에어컨을 연결 시켜 줍니다.
        Electronic110V adapter2 = new SocketAdapter(airConditioner);
        //잘 작동 합니다.
        connect(adapter2);
    }

    //110V 콘센트
    public static void connect(Electronic110V electronic110V) {
        electronic110V.powerOn();
    }
}