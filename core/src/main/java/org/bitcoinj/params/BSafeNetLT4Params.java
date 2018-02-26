package org.bitcoinj.params;

import org.bitcoinj.core.Utils;

public class BSafeNetLT4Params extends BSafeNetParams {
    public BSafeNetLT4Params() {
        super();
        id = ID_BSAFENETLT4;
        packetMagic += 0x10L << 24;
        port += 400;
    }

    private static BSafeNetLT4Params instance;
    public static synchronized  BSafeNetLT4Params get() {
        if (instance == null) {
            instance = new BSafeNetLT4Params();
        }
        return instance;
    }

    @Override
    public String getPaymentProtocolId() {
        return PAYMENT_PROTOCOL_ID_BSAFENETLT4;
    }
}
