package com.fastsocket;

import com.socket.NetworkSocket;
import com.socket.spi.NetworkSocketProvider;

public class FastNetworkSocketProvider extends NetworkSocketProvider {
    @Override
    public NetworkSocket openNetworkSocket() {
        return new FastNetworkSocket();
    }
}
