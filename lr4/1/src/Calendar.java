import java.time.LocalDate;

public class Calendar {
    enum DayType {
        WORKING_DAY,
        DAY_OFF,
        HOLIDAY
    }

    public class CalendarDay {
        public LocalDate date;
        public DayType dayType;

        CalendarDay(LocalDate date, DayType dayType) {
            this.date = date;
            this.dayType = dayType;
        }
    }

    CalendarDay[] days;

    Calendar(CalendarDay[] days) {
        this.days = days;
    }
}
