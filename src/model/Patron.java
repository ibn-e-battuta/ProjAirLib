package model;

import model.base.BaseModel;

import java.util.ArrayList;
import java.util.List;

public class Patron extends BaseModel {
    private String name;
    private String email;
    private final List<BookCheckout> borrowingHistory;
    private final List<String> preferences;

    public Patron(String id, String name, String email, List<String> preferences) {
        super(id);
        this.name = name;
        this.email = email;
        this.borrowingHistory = new ArrayList<>();
        this.preferences = preferences;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<BookCheckout> getBorrowingHistory() {
        return borrowingHistory;
    }

    public void addReservation(BookCheckout bookCheckout) {
        borrowingHistory.add(bookCheckout);
    }

    public List<String> getPreferences() {
        return preferences;
    }

    public void setPreferences(List<String> preferences) {
        this.preferences.clear();
        this.preferences.addAll(preferences);
    }
}