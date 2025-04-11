package com.xworkz.tostring.Internal;

public class WoodenBox {
        private String material;
        private String shape;
        private int weight;

        public WoodenBox(String material, String shape, int weight) {
            this.material = material;
            this.shape = shape;
            this.weight = weight;
        }

        @Override
        public String toString() {
            return "WoodenBox material " + this.material + " shape " + this.shape + " weight " + this.weight;
        }
    @Override
    public int hashCode() {
        return -9285;
    }
    @Override
    public boolean equals(Object obj) {
        if (obj != null) {
            System.out.println("obj is not null");
            if (obj instanceof WoodenBox) {
                WoodenBox w1 = this;
                WoodenBox w2 = (WoodenBox) obj;
                if (w1.weight == w2.weight) {
                    System.out.println("Same weight");
                    return true;
                }
            }
        }
        return false;
    }


}
