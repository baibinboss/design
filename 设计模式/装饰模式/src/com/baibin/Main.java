package com.baibin;

public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("白彬");

        BigTrouser bigTrouser = new BigTrouser();
        TShirts tShirts = new TShirts();
        bigTrouser.decorate(person);
        tShirts.decorate(bigTrouser);

        tShirts.show();

    }

}
