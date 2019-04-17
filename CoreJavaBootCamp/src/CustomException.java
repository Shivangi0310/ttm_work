public class CustomException extends Exception {
    CustomException(String message) {
        super(message);
    }
}

class CustomExceptonImpl {
    public static void main(String[] args) {
        try {
            throw new CustomException("Something went wrong");
        } catch (CustomException e) {
            e.printStackTrace();
        }
    }
}