package Java_Proxy_Pattern;

import Java_Proxy_Pattern.aop.AopBrowser;

import java.util.concurrent.atomic.AtomicLong;

public class BrowserMain {
    public static void main(String[] args) {

        IBrowser browser = new BrowerProxy("www.naver.com");
        // browser.show();
        //browser.show();

        AtomicLong start = new AtomicLong();
        AtomicLong end = new AtomicLong();
        IBrowser aopBrowser = new AopBrowser("www.naver.com",
                () -> {
                    System.out.println("before");
                    start.set(System.currentTimeMillis());
                },
                () -> {
                    long now = System.currentTimeMillis();
                    end.set(now - start.get());
                }
        );

        aopBrowser.show();
        System.out.println("loading time : " + end.get());

        aopBrowser.show();
        System.out.println("loading time : " + end.get());
    }
}