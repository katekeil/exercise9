package com.kate;

/**
 * Created by 016006 on 3/12/2019.
 */
public class PhoneNumber extends Contacts {
    private String phone;

    public PhoneNumber(String phone) {
        this.phone = phone;
    }

    @Override
    public void contacts() {
        System.out.println("Calling: " + phone);
    }
}
