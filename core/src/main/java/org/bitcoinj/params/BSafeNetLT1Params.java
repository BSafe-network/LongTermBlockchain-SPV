package org.bitcoinj.params;

import org.bitcoinj.core.Utils;

public class BSafeNetLT1Params extends BSafeNetParams {
    public BSafeNetLT1Params() {
        super();
        id = ID_BSAFENETLT1;
        packetMagic += 0x10L << 24;
        port += 100;
    }

    private static BSafeNetLT1Params instance;
    public static synchronized  BSafeNetLT1Params get() {
        if (instance == null) {
            instance = new BSafeNetLT1Params();
        }
        return instance;
    }

    @Override
    public String getPaymentProtocolId() {
        return PAYMENT_PROTOCOL_ID_BSAFENETLT1;
    }
}
