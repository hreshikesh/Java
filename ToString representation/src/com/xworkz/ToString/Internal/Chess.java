package com.xworkz.ToString.Internal;

public class Chess {
    private String boardMaterial;
    private String pieceColor;
    private int price;

    public Chess(String boardMaterial, String pieceColor, int price) {
        this.boardMaterial = boardMaterial;
        this.pieceColor = pieceColor;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Chess board material " + this.boardMaterial + " piece color " + this.pieceColor + " price " + this.price;
    }

    @Override
    public int hashCode() {
        return 58700;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("obj is not null");
            if (obj instanceof Chess) {
                Chess c1 = this;
                Chess c2 = (Chess) obj;
                if (c1.boardMaterial.equals(c2.boardMaterial) && c1.pieceColor.equals(c2.pieceColor)) {
                    System.out.println("Same board material and piece color");
                    return true;
                }
            }
        }
        return false;
    }

}
