package Enum;//enum finaldir extend edilemez;


enum Day{
   SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY;

    public static void main(String[] args) {
        String nameofDay=Day.FRIDAY.name();
        System.out.println(nameofDay);

        int ordinal=Day.TUESDAY.ordinal();
        System.out.println(ordinal);


        Day[] days=Day.values();

        for(Day day:days){
            System.out.println(day);
        }

        System.out.println("toString() of Enum.Day.MONDAY: "+Day.MONDAY.toString());

        boolean b1=Day.MONDAY==Day.MONDAY;
        System.out.println("IsEqual:"+b1);

        boolean b2=Day.MONDAY==Day.SUNDAY;
        System.out.println("IsEqual:"+b2);

    }
}
