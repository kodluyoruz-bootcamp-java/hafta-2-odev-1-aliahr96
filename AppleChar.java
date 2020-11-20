
public class AppleChar implements Mobile,AppleCharacteristics{

    private String name;
    private String IMEI;
    private String version;
    private double memory;
    private double screenSize;

    public AppleChar(String name, String IMEI, String version, int memory, int screenSize) {
        System.out.println("The deateals:");
        System.out.println( " name ="+ name +"\n IMEI = " +IMEI +"\n version ="+ version
                +"\n memory ="+ memory + "\n screenSize =" +screenSize);
        System.out.println();


    }

    @Override
    public String call() {
        System.out.println("calling");
        return null;
    }

    @Override
    public String message() {
        System.out.println("messaging");
        return null;
    }

    @Override
    public String vidiocall() {
        System.out.println("calling vidio");
        return null;
    }

    @Override
    public String screanshare() {
        System.out.println("sharing screan");
        return null;
    }
}
