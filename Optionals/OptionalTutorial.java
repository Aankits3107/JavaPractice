//Optional - either it has something init or doesn't
// Better way to handle a situation where methods don't have any value to return.
//

package Optionals;

import java.util.Optional;

public class OptionalTutorial {
    public static void main(String[] args) {
    //    Cat myCat = findCatByName("Fred");
    //    if(myCat != null) {
    //     System.out.println(myCat.age);
    //    }
    //    else {
    //     System.out.println(0);
    //    }
    // }
        Optional<Cat> optionalCat = findCatByName("Fred");
        if(optionalCat.isPresent()) {
            System.out.println(optionalCat.get().age);
        }
        else {
            System.out.println(0);
        }
        Cat myCat = optionalCat.orElse(new Cat("Unkown", 0)); //if value not present then this method don't give any exception it will provide an default value.
    }
    private static Optional<Cat> findCatByName(String name) {
        Cat cat = new Cat(name, 3);
        // return Optional.of(cat);
        // return Optional.empty();
        return Optional.ofNullable(cat);
    }
}