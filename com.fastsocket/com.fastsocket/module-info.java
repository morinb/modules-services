module com.fastsocket {
    requires com.socket;

    provides com.socket.spi.NetworkSocketProvider with com.fastsocket.FastNetworkSocketProvider;
}