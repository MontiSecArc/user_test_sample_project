package de.monticore.lang.montisecarc.simple.msg;

public class HTTPS implements Protocol {
    public boolean isEncrypted() {
        return true;
    }

    public String getProtocolName() {
        return "HTTPS";
    }
}
