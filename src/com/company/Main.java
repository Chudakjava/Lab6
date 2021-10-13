package com.company;
import java.util.Scanner;
import java.io.*;
import com.company.Hash;
import com.company.Weakhash;
import com.company.Stronghash;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        String str;
        System.out.println("Введите Str:");
        str = input.readLine();
        Weakhash weak = new Weakhash();
        Stronghash strong = new Stronghash();
        System.out.println("Ваш хэш: ");
        System.out.println(weak.hash(str));
        System.out.println(strong.hash(str));
    }
}
