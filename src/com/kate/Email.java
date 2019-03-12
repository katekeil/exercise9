package com.kate;

/**
 * Created by 016006 on 3/12/2019.
 */
public class Email extends Contacts {
    private String email;

    public Email(String email) {
        this.email = email;
    }

    @Override
    public void contacts() {
        System.out.println("Emailing: " + email);
    }
}
