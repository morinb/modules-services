package com.greetings;

import com.socket.NetworkSocket;
import org.astro.World;

public class Main {
    public static void main(String[] args) {
        System.out.format("Greetings %s!%n", World.NAME);

        NetworkSocket s = NetworkSocket.open();
        System.out.println(s.getClass());
    }
}
