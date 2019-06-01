package com.company;

import java.util.UUID;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println(args.length);
        if(args.length  == 1) {
            UUID id = UUID.fromString(args[0]);
            System.out.println("Least: " + id.getLeastSignificantBits());
            System.out.println("Most: " + id.getMostSignificantBits());
        } else {
            UUID id = new UUID(Long.valueOf(args[1]),Long.valueOf(args[0]));
            System.out.println("UUID: "+ id.toString());
        }
    }
}
