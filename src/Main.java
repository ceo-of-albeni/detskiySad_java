import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.io.*;
import java.io.BufferedReader;
import java.util.HashMap;
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
                    directorActions();
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


//////

    // Действия директора
    public static void directorActions() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Меню:");
        System.out.println("(1)Показать список предметов");
        System.out.println("(2)Показать количество студентов");
        System.out.println("(3)Показать список учителей");
        System.out.println("(4)Добавить учителя");
        System.out.println("(5)Удалить учителя");
        System.out.println("(6)Добавить детей");
        System.out.println("(7)Удалить детей");
        System.out.println("(0)Выход");
        do {
            System.out.print("Ваш выбор: ");
            String chooseAction = sc.nextLine();
            switch (chooseAction) {
                case "action1":
                case "Action1":
                case "1":
                    System.out.println("Действие 1");
                    action1();
                    directorActions();
                    break;
                case "action2":
                case "Action2":
                case "2":
                    System.out.println("Действие 2");
                    action2();
                    directorActions();
                    break;
                case "action3":
                case "Action3":
                case "3":
                    System.out.println("Действие 3");
                    action3();
                    directorActions();
                    break;
                case "action4":
                case "Action4":
                case "4":
                    System.out.println("Действие 4");
                    action4();
                    directorActions();
                    break;
                case "action5":
                case "Action5":
                case "5":
                    System.out.println("Действие 5");
                    action5();
                    directorActions();
                    break;
                case "action6":
                case "Action6":
                case "6":
                    System.out.println("Действие 6");
                    action6();
                    directorActions();
                    break;
                case "action7":
                case "Action7":
                case "7":
                    System.out.println("Действие 7");
                    action7();
                    directorActions();
                    break;
                default:
                    System.out.println("Такого действия нет в программе!");
                    directorActions();
                    break;
                case "n":
                    try {
                        chooseUsers();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                case "action0":
                case "Action0":
                case "0":
                    System.out.println("Выход");
                    break;
            }
            break;
        } while (true);
    }

    public static void action1() {
        try {
            BufferedReader br = new BufferedReader(new FileReader(""));
            while (br.ready()) {
                System.out.print(br.readLine() + " ");
            }
            System.out.println();
            br.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public static void action2() {
        try {
            BufferedReader br = new BufferedReader(new FileReader(""));
            int count = 0;
            while (br.ready()) {
                br.readLine();
                count++;
            }
            BufferedReader br1 = new BufferedReader(new FileReader(""));
            int count1 = 0;
            while (br1.ready()) {
                br1.readLine();
                count1++;
            }
            System.out.println("Всего студентов = " + (int) (count + count1));
            br1.close();
            br.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public static void action3() {
        try {
            BufferedReader br = new BufferedReader(new FileReader(""));
            while (br.ready()) {
                System.out.print(br.readLine() + " ");
            }
            System.out.println();
            br.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public static void action4() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\ainura_inai\\IdeaProjects\\Sample\\src\\dos.txt"));
            HashMap<String, Integer> d = new HashMap<>();
            while (br.ready()) {
                String line = br.readLine();
                if (d.containsKey(line)) {
                    d.put(line, (int) (d.get(line) + 1));
                } else {
                    d.put(line, 1);
                }
            }
            System.out.println(d);
            String s = "dsd";
            int m = 100;
            for (String i : d.keySet()) {
                if (d.get(i) < m) {
                    m = d.get(i);
                    s = i;
                }
            }
            System.out.println("Минимальное количество бытовой техники:" + s);
            br.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public static void action5() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\ainura_inai\\IdeaProjects\\Sample\\src\\dos.txt"));
            System.out.print("Доставленная бытовая техника ");
            int countLine = 0;
            while (br.ready()) {
                System.out.print(br.readLine() + ", ");
                countLine++;
            }
            System.out.println("Количество = " + countLine);
            BufferedReader br1 = new BufferedReader(new FileReader("C:\\Users\\ainura_inai\\IdeaProjects\\Sample\\src\\zak.txt"));
            System.out.print("Заказанная бытовая техника ");
            int countline = 0;
            while (br1.ready()) {
                System.out.print(br1.readLine() + ", ");
                countline++;
            }
            System.out.println("Количество = " + countline);
            br1.close();
            br.close();
        } catch (FileNotFoundException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public static void action6() {
        try {
            BufferedReader br = new BufferedReader(new FileReader(""));
            while (br.ready()) {
                System.out.print(br.readLine() + " ");
            }
            System.out.println();
            br.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }

    public static void action7() {
        try {
            BufferedReader br = new BufferedReader(new FileReader(""));
            while (br.ready()) {
                System.out.print(br.readLine() + " ");
            }
            System.out.println();
            br.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}}
