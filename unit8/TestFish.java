import java.util.ArrayList;

public class TestFish {
    public static void main(String[] args) {
        //part 1
        ArrayList<JavaFish> school = new ArrayList<JavaFish>();
        for(int i = 0; i < 20; i++) {
            school.add(new JavaFish());
        }        

        //part 2
        JavaFish fish1 = new JavaFish();
        school.add(fish1);
        JavaFish fish2 = new JavaFish();
        school.add(0, fish2);
        JavaFish fish3 = new JavaFish();
        school.add(10, fish3);
        JavaFish fish4 = new JavaFish();
        school.add(20, fish4);

        //part 3
        school.set(2, new JavaFish("yellow"));
        school.set(3, new JavaFish("yellow"));
        school.set(7, new JavaFish("yellow"));
        school.set(14, new JavaFish("yellow"));
        school.set(17, new JavaFish("yellow"));

        for(JavaFish fish : school) {
            fish.setAge((int)(Math.random() * 90));
        }

        JavaFish nemo = school.get(school.size() - 1);
        school.set(10, nemo);
        
        //part 4
        for(int i = 0; i < 5; i++) {
            school.remove((int)(Math.random() * school.size()-1));
        }

        ArrayList<JavaFish> retired = new ArrayList<JavaFish>();
        for(int i = school.size()-1; i >= 0; i--) {
            if(school.get(i).getAge() >= 65) {
                retired.add(school.get(i));
                school.remove(i);
            }
        }

        System.out.println("There are " + retired.size() + " in  the ArrayList retired.");
        for(JavaFish fish : retired) {
            fish.swim();
        }

        
        System.out.println("There are " + school.size() + " in  the ArrayList school.");
        for(JavaFish fish : school) {
            fish.swim();
        }
    }
}