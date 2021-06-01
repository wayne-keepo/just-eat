package edu.waynekeepo.je;

import edu.waynekeepo.je.domain.client.Client;

public class AppRun {

    public static void main(String[] args) {
        Client client = new Client();

        System.out.println(client.id());
    }
}
