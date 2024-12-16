package Q2.LP3_9;

public class lp3_9class {
        private int myYear;
        private int myMonth;
        private int myDay;
        private int yourDay;
        private int yourMonth;
        private int yourYear;
        private int myDays;
        private int mySleep;
        private int myAge;

    public lp3_9class(int mYear, int mMonth, int mDay, int day, int month, int year) {
            myYear  = mYear;
            myMonth = mMonth;
            myDay   = mDay;
            yourDay   = day;
            yourMonth = month;
            yourYear  = year;
            mySleep = 0;
            myAge   = 0;
        }

        public void calc() {
            myAge = ((myYear * 365) + (myMonth * 30) + myDay) - ((yourYear * 365) + (yourMonth * 30) + yourDay);
            mySleep = myAge*8;

        }
        public int getAge()   {return myAge;}
        public int getSleep() {return mySleep;}
    }
