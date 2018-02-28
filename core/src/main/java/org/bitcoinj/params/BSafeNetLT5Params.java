package org.bitcoinj.params;

import org.bitcoinj.core.ArchiveHashParameters;
import org.bitcoinj.core.Utils;

public class BSafeNetLT5Params extends BSafeNetParams {
    public BSafeNetLT5Params() {
        super();
        id = ID_BSAFENETLT5;
        packetMagic += 0x50L << 24;
        port += 500;

        newPoWHashStartHeight = 100;

        archiveHashParameters = new ArchiveHashParameters[1];
        archiveHashParameters[0] = new ArchiveHashParameters();
        archiveHashParameters[0].startHeight = 200;
        archiveHashParameters[0].blocksPerHash = 10;
        archiveHashParameters[0].nBlocks = 10;
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
