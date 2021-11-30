package ss23_behavioral_design_pattern.thuc_hanh.trien_khai_strategy;


import java.util.ArrayList;
import java.util.List;

public class SortedList {

    private SortStrategy strategySort;
    private List<String> items = new ArrayList<>();

    public void setSortStrategy(SortStrategy strategy) {
        this.strategySort = strategy;
    }

    public void add(String name) {
        items.add(name);
    }

    public void sort() {
        strategySort.sort(items);
    }
}