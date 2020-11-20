
public class Main {
    public static void main(String[] args) {

        AppleChar Apple = new AppleChar("iphone 10", "cba1234", "4.1", 32, 16);System.out.println("Apple characteristic:");
        Apple.call();
        Apple.message();
        Apple.vidiocall();
        Apple.screanshare();

        System.out.println("--------------------------------");

        SamsongChar Samsung = new SamsongChar("Samsung S10", "abc1234", "2.6", 16, 12);
        System.out.println("samsong characteristic:");
        Samsung.call();
        Samsung.message();
        Samsung.fileshare();
        Samsung.listenmp3();

        }
    }
