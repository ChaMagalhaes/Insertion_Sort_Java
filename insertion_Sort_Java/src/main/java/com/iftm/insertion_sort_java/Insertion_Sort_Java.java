package com.iftm.insertion_sort_java;

import java.util.Arrays;

public class Insertion_Sort_Java {

    public static void main(String[] args) {

        int[] numeros = {8,3,2,4,1,5,7,6};

        System.out.println("ANTES DE ORDENAR: " + Arrays.toString(numeros));

        ordenar(numeros);

        System.out.println("DEPOIS DE ORDENAR: " + Arrays.toString(numeros));

    }

    public static int[] ordenar(int[] array){

        int n = array.length;

        for(int i = 1; i < n; i++){

            int chave = array[i];
            int j = i - 1;

            while(j >= 0 && array[j] > chave){
                array[j + 1] = array[j];
                j = j - 1;
            }

            array[j + 1] = chave;
        }
        
        return array;
    }
}