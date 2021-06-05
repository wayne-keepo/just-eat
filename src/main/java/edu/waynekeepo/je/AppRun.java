package edu.waynekeepo.je;

import edu.waynekeepo.je.domain.client.Partner;

public class AppRun {

    public static void main(String[] args) {
        Partner partner = new Partner();

        System.out.println(partner.id());
    }
}
