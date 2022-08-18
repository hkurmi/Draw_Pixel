package harshit;

public class Main {
    public static void main(String[] args){
        Resolution nativeResolution=new Resolution(20,30);
        Dimensions dimensions=new Dimensions(20,30,10);
    Monitor monitor=new Monitor("B2CCC","DELL",10,nativeResolution);
    Case theCase=new Case("B@#D","DELL0","230v",dimensions);
    Motherboard motherboard=new Motherboard("BG0098","DELL",4,4,"2.001");

    Pc pc=new Pc(theCase,monitor,motherboard);

pc.getMonitor().drawPixel(30,60,"green");
    }
}
