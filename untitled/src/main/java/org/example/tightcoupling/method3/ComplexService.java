package org.example.tightcoupling.method3;

public class ComplexService {
    private SortAlgorithsm sortAlgorithms;
    public ComplexService() {}
    public ComplexService(SortAlgorithsm sortAlgorithms) {
        this.sortAlgorithms = sortAlgorithms;
    }

    public void ComplexBussiness(int[] array){
        sortAlgorithms.sort(array);
    }

}
