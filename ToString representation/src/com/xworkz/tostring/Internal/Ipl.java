package com.xworkz.tostring.Internal;

public class Ipl {
    private String teamName;
    private String captain;
    private int wins;

    public Ipl(String teamName, String captain, int wins) {
        this.teamName = teamName;
        this.captain = captain;
        this.wins = wins;
    }

    @Override
    public String toString() {
        return "IPL Team: " + teamName + ", Captain: " + captain + ", Wins: " + wins;
    }

    @Override
    public int hashCode() {
        return -8;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("Object is not null");
            if (obj instanceof Ipl) {
                Ipl ipl1 = this;
                Ipl ipl2 = (Ipl) obj;
                if (ipl1.teamName.equals(ipl2.teamName) &&
                        ipl1.captain.equals(ipl2.captain) &&
                        ipl1.wins == ipl2.wins) {
                    System.out.println("Same teamName, captain, and wins");
                    return true;
                }
            }
        }
        return false;
    }
}