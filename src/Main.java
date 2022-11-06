import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
class Try {
    class Main {

        public static void main(String args[]) throws IOException {
            System.out.println("Пожалуйста, авторизуйтесь");
            chooseUsers();
        }

        // Выбор Аккаунта
        public static String chooseUsers() throws IOException {
            Scanner sc = new Scanner(System.in);

            System.out.println("Выберите вашу специальность :");
            System.out.println("(1) Директор");
            System.out.println("(2) Воспитатель");
            System.out.println("(3) Учитель");
            do {
                System.out.print("Ваш выбор: ");
                String choose = sc.nextLine();
                switch (choose) {
                    case "director":
                    case "Director":
                    case "1":
                        System.out.println("Добро пожаловать Директор");
                        System.out.println("Введите логин и пароль");
                        directorInputLgPw();
                        break;
                    case "mentor":
                    case "Mentor":
                    case "2":
                        System.out.println("Добро пожаловать Воспитатель");
                        System.out.println("Введите логин и пароль");
                        mentorInputLgPw();
                        break;
                    case "teacher":
                    case "Teacher":
                    case "3":
                        System.out.println("Добро пожаловать Учитель");
                        System.out.println("Введите логин и пароль");
                        teacherInputLgPw();
                        break;
                    default:
                        System.out.println("Кто ты воин?");
                        System.out.print("Желаете выйти[1] или повторить[0]? ");
                        int ex = sc.nextInt();
                        if (ex == 0) {
                            chooseUsers();
                        } else if (ex == 1) {
                            System.exit(0);
                        }
                }
                break;
            } while (true);
            return "";
        }
        // Авторизация директора
        public static void directorInputLgPw() {
            Scanner sc = new Scanner(System.in);

            ArrayList<String> loginArrayList = new ArrayList<>();
            ArrayList<String> passwordArrayList = new ArrayList<>();
            loginArrayList.add("Director");
            loginArrayList.add("Worker");
            loginArrayList.add("Del");
            passwordArrayList.add("Director1");
            passwordArrayList.add("Worker1");
            passwordArrayList.add("Del1");
            loginArrayList.add("Dir");
            passwordArrayList.add("Dir1");
            loginArrayList.add("Wor");
            passwordArrayList.add("Wor1");

            do {
                System.out.print("Введите логин: ");
                String input_lg = sc.next();
                sc.nextLine();
                System.out.print("Введите пароль: ");
                String input_pw = sc.next();
                sc.nextLine();
                int indexArray = 0;
                boolean haveInArray = false;
                while (indexArray < loginArrayList.size()) {
                    if (input_lg.equals(loginArrayList.get(indexArray)) &&
                            input_pw.equals(passwordArrayList.get(indexArray))) {
                        haveInArray = true;
                        break;
                    } else {
                        haveInArray = false;
                    }
                    indexArray++;
                }

                if (haveInArray == true) {
                    System.out.println("Директор, вы успешно вошли!");
//                    directorActions();
                    break;
                } else {
                    System.out.println("Попытайтесь снова");
                }
            } while (true);
        }
        // Авторизация Воспитателя
        public static void mentorInputLgPw() throws IOException {
            Scanner sc = new Scanner(System.in);

            ArrayList<String> loginArrayList = new ArrayList<>();
            ArrayList<String> passwordArrayList = new ArrayList<>();
            loginArrayList.add("Men");
            passwordArrayList.add("Men1");

            do {
                System.out.print("Введите логин: ");
                String input_lg = sc.next();
                sc.nextLine();
                System.out.print("Введите пароль: ");
                String input_pw = sc.next();
                sc.nextLine();
                int indexArray = 0;
                boolean haveInArray = false;
                while (indexArray < loginArrayList.size()) {
                    if (input_lg.equals(loginArrayList.get(indexArray)) &&
                            input_pw.equals(passwordArrayList.get(indexArray))) {
                        haveInArray = true;
                        break;
                    } else {
                        haveInArray = false;
                    }
                    indexArray++;
                }
                if (haveInArray == true) {
                    System.out.println("Воспитатель,вы успешно вошли!");
//                    Menu();
                    break;
                } else {
                    System.out.println("Попытайтесь снова");
                }
            } while (true);
        }

        // Авторизация Учителя
        public static void teacherInputLgPw() throws IOException {
            Scanner sc = new Scanner(System.in);

            ArrayList<String> loginArrayList = new ArrayList<>();
            ArrayList<String> passwordArrayList = new ArrayList<>();
            loginArrayList.add("Teach");

            passwordArrayList.add("Teach1");

            do {
                System.out.print("Введите логин: ");
                String input_lg = sc.next();
                sc.nextLine();
                System.out.print("Введите пароль: ");
                String input_pw = sc.next();
                sc.nextLine();
                int indexArray = 0;
                boolean haveInArray = false;
                while (indexArray < loginArrayList.size()) {
                    if (input_lg.equals(loginArrayList.get(indexArray)) &&
                            input_pw.equals(passwordArrayList.get(indexArray))) {
                        haveInArray = true;
                        break;
                    } else {
                        haveInArray = false;
                    }
                    indexArray++;
                }

                if (haveInArray == true) {
                    System.out.println("Приветствую дорогой Учитель!");
                    teacherInputLgPw();
                    break;
                } else {
                    System.out.println("Попытайтесь снова.");
                }
            } while (true);
        }
    }}