package com.baibin;

/**
 * 装饰模式，常规的我们为person里来增加方法来实现装饰，
 * 当出现了新的装饰，就需要去修改这个方法，
 * 而装饰模式不会对已有代码带来干扰,
 * 并且保证了顺序性
 */
public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("白彬");

        BigTrouser bigTrouser = new BigTrouser();
        TShirts tShirts = new TShirts();
        Underpants underpants = new Underpants();
        bigTrouser.decorate(person);
        tShirts.decorate(bigTrouser);
        underpants.decorate(tShirts);
        underpants.show();

    }

}
