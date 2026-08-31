package io.github.olive325;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        byte d = 127; // 1 byte
        byte neg_d = -128;
        short b = 32767; // 2 bytes
        short neg_b = -32768;
        int a = 2147483647; // 4 bytes
        int neg_a = -2147483648;
        long c = 9223372036854775807L; // 8 bytes
        long neg_c = -9223372036854775808L;

        double dd = 3.1415; // 8 bytes
        float f = 3.14f; // 4 bytes

        int[] int_array = {1,2,4,5,6,7};

        for (int i = 0; i < int_array.length; i++){
            System.out.println(int_array[i]);
        }

        for (int i : int_array){
            System.out.println(i);
        }

        List<Integer> dyn_list = new ArrayList<>();

        dyn_list.add(1);
        dyn_list.add(2);
        dyn_list.add(7);
        dyn_list.add(42);
        dyn_list.add(65);
        dyn_list.add(67);

        for(int i : dyn_list){
            System.out.println(i);
        }

        for (Integer integer : dyn_list) {
            System.out.println(integer);
        }

    }
}