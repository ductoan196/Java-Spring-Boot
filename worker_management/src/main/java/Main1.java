import java.util.ArrayList;
import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1. Nhập vào ds công nhân và in ra
        ArrayList<Worker> workers = new ArrayList<>();
        System.out.println("Nhập vào số lượng công nhân: ");
        int workerNums = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < workerNums; i++) {
            System.out.println("Thông tin cho công nhân thứ: " + (i+1));
            System.out.println("Họ và tên: ");
            String name = scanner.nextLine();
            System.out.println("Địa chỉ: ");
            String address = scanner.nextLine();
            System.out.println("Số điện thoại:");
            String phone = scanner.nextLine();
            System.out.println("Cấp bậc: ");
            int level = Integer.parseInt(scanner.nextLine());

            Worker worker = Worker.builder()
                    .fullName(name)
                    .address(address)
                    .phone(phone)
                    .level(level)
                    .build();

            workers.add(worker);
        }
        System.out.println("Danh sách công nhân: ");
        for(Worker worker: workers){
            System.out.println(worker);
        }

        //1. Nhập vào ds xưởng sản xuất và in ra
        ArrayList<Factory> factories = new ArrayList<>();
        System.out.println("Nhập vào số lượng công nhân: ");
        int factoryNums = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < workerNums; i++) {
            System.out.println("Thông tin cho xưởng thứ: " + (i+1));
            System.out.println("Tên xưởng: ");
            String name = scanner.nextLine();
            System.out.println("Mô tả: ");
            String description = scanner.nextLine();
            System.out.println("Hệ số công việc: ");
            int productivity = Integer.parseInt(scanner.nextLine());

            Factory factory = Factory.builder()
                    .name(name)
                    .description(description)
                    .productivity(productivity)
                    .build();

            factories.add(factory);
        }
        System.out.println("Danh sách công nhân: ");
        for(Factory factory: factories){
            System.out.println(factory);
        }

    }
}
