public class Constants {

    private Constants() { //so that no ther class or object can create a new object for by this constructer as this class have constant/default values in it.
                          //as its set to private it will not be visible/usable to other class but can be used with this class only.
    }                     //other classes can't use this constructor but can use all ther static varibles present in this class.
    public static final int NUMBER_OF_MONTH_IN_A_YEAR = 12;

    public static final int NUMBER_OF_DAYS_IN_A_WEEK = 7;

    public static final String MY_NAME = "Ankit Sharma";
}
