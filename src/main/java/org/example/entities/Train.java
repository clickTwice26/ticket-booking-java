package org.example.entities;

import java.sql.Time;
import java.util.*;

public class Train {

    private String name;
    private String trainId;
    private int trainNumber;
    private List<List<Integer>> seats;
    private Map<String, Time> stationsTimes;
    private List<String> stations;

}
