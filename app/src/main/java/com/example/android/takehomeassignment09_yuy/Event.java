package com.example.android.takehomeassignment09_yuy;

public class Event {
    private String event_name;
    private int lasted_hours;
    private boolean on_campus;

    public Event() {
    }

    public Event(String event_name, int lasted_hours, boolean on_campus) {
        this.event_name = event_name;
        this.lasted_hours = lasted_hours;
        this.on_campus = on_campus;
    }

    public String getEvent_name() {
        return event_name;
    }

    public int getLasted_hours() {
        return lasted_hours;
    }

    public boolean isOn_campus() {
        return on_campus;
    }

    public void setEvent_name(String event_name) {
        this.event_name = event_name;
    }

    public void setLasted_hours(int lasted_hours) {
        this.lasted_hours = lasted_hours;
    }

    public void setOn_campus(boolean on_campus) {
        this.on_campus = on_campus;
    }
}
