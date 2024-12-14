package ch.vorburger.learniningbazel;

import com.google.common.base.MoreObjects;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Main().greeting());
    }

    String greeting() {
        return MoreObjects.toStringHelper(this).add("message", "hello, world").toString();
    }
}
