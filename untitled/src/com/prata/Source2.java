package com.prata;

import javax.swing.text.html.HTMLDocument;
import java.util.*;

class Source2 {

    public static void main(String[] args) {

        List<Integer> list = new LinkedList<>();
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        for(int i =0;i<n;i++){
            list.add(input.nextInt());
        }
        reverse(list);

    }

    public static void reverse(List<Integer> numbers) {

        //Complete the method declaration here
        ListIterator<Integer> it = numbers.listIterator();
        while(it.hasPrevious()){
            System.out.print(it.previous() + " ");
        }
    }
}
