import ru.netology.sqr.SQRService;

public class Main {
    public static void main(String[] args) {
        SQRService service = new SQRService();
        int sqrNumber = service.calcSQRT(0,0);
        System.out.print(sqrNumber);
    }
}