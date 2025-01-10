package controller;

import jakarta.enterprise.context.SessionScoped;
import jakarta.inject.Named;
import model.DataContainer;

import java.io.Serializable;

@Named
@SessionScoped
public class DataController implements Serializable {
    private final DataContainer container;
    private String newItem;

    public DataController() {
        container = new DataContainer();
    }

    public DataContainer getContainer() {
        return container;
    }

    public String getNewItem() {
        return newItem;
    }

    public void setNewItem(String newItem) {
        this.newItem = newItem;
    }

    public void addItem() {
        if (newItem != null && !newItem.isEmpty()) {
            container.addData(newItem);
            newItem = null;
        }
    }

    public void removeItem(String item) {
        container.removeData(item);
    }
}