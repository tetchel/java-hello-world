package com.hello.world;

import java.net.InetAddress;
import java.time.Instant;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Hello {
    public static void main(String[] a) throws Exception {
        String date = DateTimeFormatter.ISO_INSTANT.withZone(ZoneId.systemDefault()).format(Instant.now().truncatedTo(ChronoUnit.SECONDS));
        String hostname = InetAddress.getLocalHost().getHostName();
        System.out.printf("Hello! It's %s here on %s\n", date, hostname);
    }
}
