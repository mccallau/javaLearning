public class Main {

    public static void main(String[] args) {

        // Regular operators

        int result = 1+2;

        // Abbreviating operators

        result++;

        result -=7;

        System.out.println(result);

        // Logical operators

        if (result>3) {
            System.out.println("eat shit");
        } else {
            System.out.println("don't eat shit I guess \"");
        }

        boolean somebool = false;

        if (somebool) {
            System.out.println("never gonna give you up");
        } else if (!somebool) {
            System.out.println("never gonna let you down");
        } else {
            System.out.println("never gonna run around");
        }

        boolean anotherbool = true;

        if (somebool && anotherbool) {
            System.out.println("never gonna give you up again");
        } else if (!somebool && anotherbool) {
            System.out.println("never gonna let you down again");
        } else {
            System.out.println("never gonna run around again");
        }
    }
}
