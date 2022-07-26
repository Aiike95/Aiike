package junit5tests;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.*;

import java.util.Arrays;
import java.util.List;

public class ParameterizedTests {

    @ParameterizedTest(name ="Run: {index} - value: {arguments}")
    @ValueSource(ints = {1,5,6})
    void intValues(int theParam){
        System.out.println("theParam"+ theParam);
    }

    @ParameterizedTest

    @NullSource

    @EmptySource

    @ValueSource(strings = {"firstString", "secondString","fifthString"})
    void stringValues(String theParam){
        System.out.println("theParam =" + theParam);
    }

    @ParameterizedTest
    @CsvSource(value = {"Aiike, love","Thomas, smart"})
    void csvSource_StringString(String param1, String param2){
        System.out.println("param1 = "+param1+", param2 =" +param2);
    }



    @ParameterizedTest
    @CsvSource(value = {"Aiike, 25, true","Thomas,40, false","Charlie, 7,true"})
    void csvSource_StringIntBoolean(String param1, int param2, boolean param3){
        System.out.println("param1 = "+param1+", param2 =" +param2+ "param3"+param3);
    }

@ParameterizedTest
@CsvFileSource(files = {"src/test/resources/params/shoppinglist.csv","src/test/resources/params/shoppinglist2.csv"}, numLinesToSkip = 1)
    void csvFileSource_StringDoubleIntStringString(String name, double price,
                                                   int qty, String uom,
                                                   String provider){
    System.out.println("name ="+ name + "price =" +price +
    "qny =" +qty + "uom ="+ uom+
            "provider ="+ provider);
}
//
//    @ParameterizedTest
//    @CsvFileSource(files = {"src/test/resources/params/shoppinglist3.csv"},
//            numLinesToSkip = 1, delimiterString = "___")
//    void csvFileSource_StringDoubleIntStringStringDelimiter(String name, double price,
//                                                   int qty, String uom,
//                                                   String provider){
//        System.out.println("name ="+ name + "price =" +price +
//                "qny =" +qty + "uom ="+ uom+
//                "provider ="+ provider);
//    }
@ParameterizedTest
    @MethodSource(value = "sourceString")
    void methodSource(String param1){
    System.out.println("param1"+param1);
}
List<String>sourceString(){
        return Arrays.asList("tomato", "carrot", "cabbage");
}












}
