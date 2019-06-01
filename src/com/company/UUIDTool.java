package com.company;

import java.util.UUID;

public class UUIDTool {

    public static void main(String[] args) {
        if(args.length == 0) {
            System.out.println("NEEDS ARGUMENTS");
        }
        if(args.length  == 1) {
            UUID id = UUID.fromString(args[0]);
            System.out.println("Least: " + id.getLeastSignificantBits());
            System.out.println("Most: " + id.getMostSignificantBits());
        }
        if(args.length  == 2) {
            UUID id = new UUID(Long.valueOf(args[1]),Long.valueOf(args[0]));
            System.out.println("UUID: "+ id.toString());
        }
        if(args.length > 2) {
            System.out.println("TOO MANY ARGUMENTS");
        }
    }
}
