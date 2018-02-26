package org.bitcoinj.params;

import org.bitcoinj.core.Utils;

public class BSafeNetLT5Params extends BSafeNetParams {
    public BSafeNetLT5Params() {
        super();
        id = ID_BSAFENETLT5;
        packetMagic += 0x10L << 24;
        port += 500;
    }

    private static BSafeNetLT5Params instance;
    public static synchronized  BSafeNetLT5Params get() {
        if (instance == null) {
            instance = new BSafeNetLT5Params();
        }
        return instance;
    }

    @Override
    public String getPaymentProtocolId() {
        return PAYMENT_PROTOCOL_ID_BSAFENETLT5;
    }
}
