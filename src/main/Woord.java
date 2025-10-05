package main;

public class Woord {

    private String woord;

    public Woord(String woord) {
        this.woord = woord;
    }

    public boolean isPalindroom() {
        return woord.equalsIgnoreCase(new StringBuilder(woord.toLowerCase()).reverse().toString());
    }

    public String getWoord() {
        return woord;
    }
}
