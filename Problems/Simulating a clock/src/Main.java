class Clock {

    int hours = 12;
    int minutes = 0;

    void next() {
        if (this.minutes == 59 && this.hours == 12) {
            this.minutes = 0;
            this.hours = 1;
        } else if (this.minutes == 59 && this.hours < 12) {
            minutes = 0;
            hours++;
        } else {
            minutes++;
        }
        // implement me
    }
}