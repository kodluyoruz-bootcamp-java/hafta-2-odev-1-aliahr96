
public class SamsongChar implements Mobile,SamsongCharacteristics{

    private String name;
    private String IMEI;
    private String version;
    private double memory;
    private double screenSize;


    public SamsongChar(String name, String IMEI, String version, int memory, int screenSize) {

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
    public String fileshare() {
        System.out.println("file sharing");
        return null;
    }

    @Override
    public String listenmp3() {
        System.out.println("listening to music");
        return null;
    }

}
