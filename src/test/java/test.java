
import org.testng.annotations.Test;

public class test {

    @Test(priority = 1)
    public void myTest(){
        System.out.println(false&&false);
        System.out.println(false||true);
        System.out.println(false&&true);
        System.out.println(false||true);
        System.out.println(false||false);

    }

    @Test(priority = 2)
    public void switchTest(){
        int month = 4;
        String monthString;
        switch (month) {
            case 1:  monthString = "01";

            case 2:  monthString = "02";

            case 3:  monthString = "03";

            case 4:  monthString = "04";

            case 5:  monthString = "05";

            case 6:  monthString = "06";

            case 7:  monthString = "07";

            case 8:  monthString = "08";
                break;
            case 9:  monthString = "09";
                break;
            case 10: monthString = "10";
                break;
            case 11: monthString = "11";
                break;
            case 12: monthString = "12";
                break;
            default: monthString = "Undefined";
                break;
        }
        System.out.println(monthString);
    }

    @Test(priority = 3)
    public void types(){
     //   int i = 0.8+1;

        int k = 8;
        double z = 0.8;

        int m = k+(int)z;
        System.out.println(("m = "+m));
    }

    @Test(priority = 4)
    public void enumsTest(){
        System.out.println(Language.BIG);
        System.out.println(Language.LITTLE.getItalian());
        System.out.println(Language.SMALL.getUkrainian());
    }
}
