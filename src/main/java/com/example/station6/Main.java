package com.example.station6;

public class Main {
    public static void main(String[] args) {
        int users[] = new int[5];
        users[0] = 23;
        users[1] = 36;
        users[2] = 31;
        users[3] = 48;
        users[4] = 58;

        int all = users[0] + users[1] + users[2] + users[3] + users[4];
        
        System.out.println((all + 0.0) / users.length);
    }
}
