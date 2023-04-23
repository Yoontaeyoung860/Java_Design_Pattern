package Java_Proxy_Pattern.aop;

import Java_Proxy_Pattern.Html;
import Java_Proxy_Pattern.IBrowser;

public class AopBrowser implements IBrowser {
 private String url;
 private Html html;
 private Runnable before;
 private Runnable after;

 public AopBrowser(String url,Runnable before, Runnable after){
     this.url = url;
     this.before = before;
     this.after = after;
 }

    @Override
    public Html show() {

        if(html == null) {
            this.html = new Html(url);
            System.out.println("AopBrowser html loading from :" +url);
            try {  //1.5초 걸리도록
                Thread.sleep(1500);
            }catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        after.run();

        System.out.println("AopBrowser html cache : "+url );
        return null;
    }
}
