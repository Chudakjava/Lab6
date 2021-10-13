package com.company;

class Stronghash implements Hash {
    @Override
    public int hash(String str) {
        int h = 0;
        for (int i = 0; i < str.length(); i++) {
            h = (h << 5) | (h >>> 27); // 5-bit cyclic shift of the running sum
            h += (int) str.charAt(i); // add in next character
        }
        return h;
    }
}
