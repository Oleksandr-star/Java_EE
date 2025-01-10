package model;

import java.util.ArrayList;
import java.util.List;

public class DataContainer {
    private final List<String> data;

    public DataContainer() {
        data = new ArrayList<>();
    }

    public List<String> getData() {
        return data;
    }

    public void addData(String item) {
        data.add(item);
    }

    public void removeData(String item) {
        data.remove(item);
    }
}
