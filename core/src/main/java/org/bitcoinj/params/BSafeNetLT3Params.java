package org.bitcoinj.params;

import org.bitcoinj.core.ArchiveHashParameters;
import org.bitcoinj.core.Utils;

public class BSafeNetLT3Params extends BSafeNetParams {
    public BSafeNetLT3Params() {
        super();

        id = ID_BSAFENETLT3;
        packetMagic += 0x30L << 24;
        port += 300;

        newPoWHashStartHeight = 100;

        archiveHashParameters = new ArchiveHashParameters[1];
        archiveHashParameters[0] = new ArchiveHashParameters();
        archiveHashParameters[0].startHeight = 200;
        archiveHashParameters[0].blocksPerHash = 10;
        archiveHashParameters[0].nBlocks = 10;
    }

    private static BSafeNetLT3Params instance;
    public static synchronized  BSafeNetLT3Params get() {
        if (instance == null) {
            instance = new BSafeNetLT3Params();
        }
        return instance;
    }

    @Override
    public String getPaymentProtocolId() {
        return PAYMENT_PROTOCOL_ID_BSAFENETLT3;
    }
}
