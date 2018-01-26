package org.bitcoinj.params;

import org.bitcoinj.core.Utils;

public class BSafeNetLT2Params extends BSafeNetParams {
    public BSafeNetLT2Params() {
        super();

        id = ID_BSAFENETLT2;
        packetMagic += 0x20L << 24;
        port += 200;

        newPoWHashStartHeight = 100;
    }

    private static BSafeNetLT2Params instance;
    public static synchronized  BSafeNetLT2Params get() {
        if (instance == null) {
            instance = new BSafeNetLT2Params();
        }
        return instance;
    }

    @Override
    public String getPaymentProtocolId() {
        return PAYMENT_PROTOCOL_ID_BSAFENETLT2;
    }
}
