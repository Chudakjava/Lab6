package com.company;

class Weakhash implements Hash{
    int length;
    @Override
    public int hash(String str) {
        length=str.length();
        return length;
    }
}
