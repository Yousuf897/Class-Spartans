package week_14.day_3.maps;

public class WhyMapIsNotApartOfCollection {

       /*
    *
    * The term "Java Collections Framework" (JCF) often refers to the framework in the java.util package,
    * which includes core collection interfaces like List,
    * Set, and Queue. However, Map is a bit of an outlier. While it is part of the same framework and is
    * closely related, it doesn't technically extend
    * the Collection interface, whereas List, Set, and Queue do.


    Key differences:

    Value Storage: The Collection interface handles and stores individual elements, while the Map interface
    * handles key-value pairs.

    Unique Elements: For collections like Set, there's a guarantee of unique elements. In contrast,
    *  a Map guarantees unique keys, but not necessarily unique values.

    Methods: The methods you find in the Collection interface (like add(), remove(), and contains())
    * are not present in the Map interface. Instead, Map has its
    * own set of methods like put(), get(), and containsKey().
    *
    * */

}
