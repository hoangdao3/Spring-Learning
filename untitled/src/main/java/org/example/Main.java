package org.example;

import com.sun.xml.internal.bind.v2.model.annotation.Quick;
import org.example.tightcoupling.method2.VeryComplexService;
import org.example.tightcoupling.method3.BubbleSort;
import org.example.tightcoupling.method3.ComplexService;
import org.example.tightcoupling.method3.QuickSort;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int[] arr = new int[5];

//        VeryComplexService veryComplexService = new VeryComplexService();
//        veryComplexService.complexBusiness(arr); // tight-coupling method 1
//        VeryComplexService vcs = new VeryComplexService();
//        vcs.complexService(arr);           method 2

        BubbleSort bubbleSort = new BubbleSort();
        QuickSort quickSort = new QuickSort();

        ComplexService cs = new ComplexService(bubbleSort);
        cs.ComplexBussiness(arr);

    }
}