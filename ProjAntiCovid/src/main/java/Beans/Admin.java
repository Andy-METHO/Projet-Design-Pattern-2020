package Beans;

import java.util.ArrayList;

public class Admin {

    private ArrayList<User> users;
    private ArrayList<Event> events;
    
    public Admin() {
    	super();
    }
    
    public Admin(ArrayList<User> users, ArrayList<Event> events) {
    	this.users=users;
    	this.events=events;
    }

	public ArrayList<User> getUsers() {
		return users;
	}

	public void setUsers(ArrayList<User> users) {
		this.users = users;
	}
	
	public int getUsersSize() {
		return users.size();
	}

    public void removeUser(User user) {
    	users.remove(user);
    }

	public ArrayList<Event> getEvents() {
		return events;
	}

	public void setEvents(ArrayList<Event> events) {
		this.events = events;
	}
	
	public int getEventsSize() {
		return events.size();
	}

    public void removeEvent(Event event) {
    	events.remove(event);
    }

    
    

}
