//Enums (short for Enumerations) are used in Java to hold types that have a certain finite set of values.
//Predefined set of values that don't change. ex 7 days of week, no of month in a years etc.
//Can't use by a new keyword to create a object or use at object.
//Extends from java.lang.enum class.
//Enums can have fields
//Should be final so they can't be change for each entry.
public class JavaEnums {
    public static void main(String[] args) {
        DaysOfTheWeek day = DaysOfTheWeek.THURSDAY;
        if (day == DaysOfTheWeek.THURSDAY) {
            System.out.println("Yeahhhhh it's alsmost Friday");
        }else {
            System.out.println("Hmmmmm");
        }
        for (DaysOfTheWeek myDay : DaysOfTheWeek.values()){//enum.values = return an array of all possible values.
            System.out.println(myDay);
        } 
        //Cereals.CAPTAIN_CRUNCH.levelOfDeliciousness = 107;
        System.out.println("Deleciousness of Cereal: "+ Cereals.CAPTAIN_CRUNCH.levelOfDeliciousness + ", Prices of cereal: " + Cereals.CAPTAIN_CRUNCH.priceInRupees);
    }
}