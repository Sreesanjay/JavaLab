//question 16

public class CountObject {
    static int count = 0;

    public CountObject(){
            count+=1;
        }

    public static void main(String[] args) {
    	CountObject obj1 = new CountObject();
    	CountObject obj2 = new CountObject();
    	CountObject obj3 = new CountObject();
    	CountObject obj4 = new CountObject();

        System.out.println("Number of objects created : " + CountObject.count);
    }
}
