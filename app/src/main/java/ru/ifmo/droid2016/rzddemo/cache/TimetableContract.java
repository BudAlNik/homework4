package ru.ifmo.droid2016.rzddemo.cache;

/**
 * Created by Nik on 17.03.2017.
 */

public class TimetableContract {
    private interface TimetableColumns {
        String DEPARTURE_DATE = "departure_date";
        String DEPARTURE_STATION_ID = "departure_station_id";
        String DEPARTURE_STATION_NAME = "departure_name";
        String DEPARTURE_TIME = "departure_time";
        String ARRIVAL_STATION_ID = "arrival_station_id";
        String ARRIVAL_STATION_NAME = "arrival_Station_Name";
        String ARRIVAL_TIME = "arrival_time";
        String TRAIN_ROUTE_ID = "train_route_id";
        String TRAIN_NAME = "train_name";
        String ROUTE_START_STATION_NAME = "route_start_station_name";
        String ROUTE_END_STATION_NAME = "route_end_station_name";
    }

    static final class Timetable implements TimetableColumns {
        static final String TABLE = "timetable";

        static final String CREATE_TABLE = "CREATE TABLE " + TABLE
                + " ("
                + DEPARTURE_DATE + " INTEGER, "
                + DEPARTURE_STATION_ID + " TEXT, "
                + DEPARTURE_STATION_NAME + " TEXT, "
                + DEPARTURE_TIME + " INTEGER, "
                + ARRIVAL_STATION_ID + " TEXT, "
                + ARRIVAL_STATION_NAME + " TEXT, "
                + ARRIVAL_TIME + " INTEGER, "
                + TRAIN_ROUTE_ID + " TEXT, "
                + ROUTE_START_STATION_NAME + " TEXT, "
                + ROUTE_END_STATION_NAME + " TEXT";
        static final String CREATE_TABLE_V1 = CREATE_TABLE + ")";
        static final String CREATE_TABLE_V2 = CREATE_TABLE + ", " + TRAIN_NAME +  "TEXT)";

    }
    private TimetableContract() {}
}
