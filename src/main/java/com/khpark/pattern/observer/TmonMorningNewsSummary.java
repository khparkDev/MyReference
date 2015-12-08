package com.khpark.pattern.observer;

import java.util.ArrayList;
import java.util.List;

public class TmonMorningNewsSummary {
	private List<Observer> observers;
	private String newsSummaryText;

	public TmonMorningNewsSummary() {
		observers = new ArrayList<Observer>();
	}

	public void registerObserver(Observer o) {
		observers.add(o);
	}

	public void removeObserver(Observer o) {
		int idx = observers.indexOf(o);

		if (idx >= 0) {
			observers.remove(idx);
		}
	}

	public void notifyObservers() {
		observers.stream().parallel().forEach(x -> x.update(newsSummaryText));
	}

	public void newsSummaryTextChanged() {
		notifyObservers();
	}

	public void setNewsSummaryText(String newsSummaryText) {
		this.newsSummaryText = newsSummaryText;
		newsSummaryTextChanged();
	}
}
