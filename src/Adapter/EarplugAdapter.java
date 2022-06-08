package Adapter;

public class EarplugAdapter implements Socket{
    private Earplug earPlug;

    public EarplugAdapter(Earplug e) {
        this.earPlug = e;
    }

    @Override
    public void connect() {
        this.earPlug.plugIn();
    }
}
