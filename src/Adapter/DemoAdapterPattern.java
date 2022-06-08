package Adapter;



public class DemoAdapterPattern {
    public static void main(String[] args) {
        Socket connector = new ChargingCable();
        connector.connect();
        connector = new EarplugAdapter(new Earplug());
        connector.connect();
    }
}
