package buginteger;

import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * @version 1.0
 * @author Mariottini
 * @author Gregorelli
 * @author Palestro
 * @author Sakurti
 */
public class EsercizioBugInteger {

    public static void menu() throws IOException {
        System.out.println(" ____  _   _  ____   ___ _   _ _____ _____ ____ _____ ____  \n"
                + "| __ )| | | |/ ___| |_ _| \\ | |_   _| ____/ ___| ____|  _ \\ \n"
                + "|  _ \\| | | | |  _   | ||  \\| | | | |  _|| |  _|  _| | |_) |\n"
                + "| |_) | |_| | |_| |  | || |\\  | | | | |__| |_| | |___|  _ < \n"
                + "|____/ \\___/ \\____| |___|_| \\_| |_| |_____\\____|_____|_| \\_\\\n"
                + "============================================================\n"
                + "[ 1 ]\tShow all tools.\n"
                + "[ 2 ]\tOpen Javadoc.\n"
                + "[ x ]\tExit.\n"
                + "============================================================\n"
                + "                 - Gregorelli, Mariottini, Palestro, Sakurti");
    }

    public static String input() {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        return input;
    }

    public static void toolsList() {
        System.out.println("============================================================\n"
                + "Select the tool you want to execute:\n"
                + "[ 1 ]\tabs\n"
                + "[ 2 ]\tadd\n"
                + "[ 3 ]\tdivide\n"
                + "[ 4 ]\tdoubleValue\n"
                + "[ 5 ]\tequals\n"
                + "[ 6 ]\tgcd\n"
                + "[ 7 ]\tmax\n"
                + "[ 8 ]\tmin\n"
                + "[ 9 ]\tmultiply\n"
                + "[ 10 ]\tpow\n"
                + "[ 11 ]\tremainder\n"
                + "[ 12 ]\tsubtract\n"
                + "[ 13 ]\ttoString\n"
                + "[ 14 ]\tvalueOf\n"
                + "============================================================\n"
                + "[ v ]\tview operations times\n"
                + "[ 00 ]\tback\n"
                + "============================================================");
    }

    public static void openJavadoc() throws IOException {
        String url = "dist\\javadoc\\index.html";
        File html = new File(url);
        String path = html.getCanonicalPath();
        String javadocUrl = path;
        File htmlFile = new File(path);
        Desktop.getDesktop().browse(htmlFile.toURI());
    }

    public static void main(String[] args) throws IOException, CustomizedException {
        String input = "";
        String input2 = "";
        long inizio = 0;
        boolean time = false;
        try {
            while (true) {
                if (input2.equals("")) {
                    menu();
                    input = input();
                }
                if (input.equals("1")) {
                    toolsList();
                    input2 = input();
                    String num1, num2;
                    if (input2.equals("1")) {
                        System.out.println("Insert a number...");
                        num1 = input();
                        BugInteger a = new BugInteger(num1);
                        inizio = System.nanoTime();
                        System.out.println("|" + a + "| = " + a.abs());
                        if (time) {
                            System.out.println("Time = " + ((System.nanoTime() - inizio) / 1E9) + " s");
                        }
                    } else if (input2.equals("2")) {
                        System.out.println("Insert two numbers...");
                        num1 = input();
                        num2 = input();
                        BugInteger a = new BugInteger(num1);
                        BugInteger b = new BugInteger(num2);
                        inizio = System.nanoTime();
                        System.out.println(a + " + " + b + " = " + a.add(b));
                        if (time) {
                            System.out.println("Time = " + ((System.nanoTime() - inizio) / 1E9) + " s");
                        }
                    } else if (input2.equals("3")) {
                        System.out.println("Insert two numbers...");
                        num1 = input();
                        num2 = input();
                        BugInteger a = new BugInteger(num1);
                        BugInteger b = new BugInteger(num2);
                        inizio = System.nanoTime();
                        System.out.println(a + " / " + b + " = " + a.divide(b));
                        if (time) {
                            System.out.println("Time = " + ((System.nanoTime() - inizio) / 1E9) + " s");
                        }
                    } else if (input2.equals("4")) {
                        System.out.println("Insert a number...");
                        num1 = input();
                        BugInteger a = new BugInteger(num1);
                        inizio = System.nanoTime();
                        System.out.println(a + " = " + a.doubleValue());
                        if (time) {
                            System.out.println("Time = " + ((System.nanoTime() - inizio) / 1E9) + " s");
                        }
                    } else if (input2.equals("5")) {
                        System.out.println("Insert two numbers...");
                        num1 = input();
                        num2 = input();
                        BugInteger a = new BugInteger(num1);
                        BugInteger b = new BugInteger(num2);
                        inizio = System.nanoTime();
                        if (a.equals(b)) {
                            System.out.println(a + " = " + b);
                        } else {
                            System.out.println(a + " != " + b);
                        }
                        if (time) {
                            System.out.println("Time = " + ((System.nanoTime() - inizio) / 1E9) + " s");
                        }
                    } else if (input2.equals("6")) {
                        System.out.println("Insert two numbers...");
                        num1 = input();
                        num2 = input();
                        BugInteger a = new BugInteger(num1);
                        BugInteger b = new BugInteger(num2);
                        inizio = System.nanoTime();
                        System.out.println("GCD(" + a + "; " + b + ")" + a.gcd(b));
                        if (time) {
                            System.out.println("Time = " + ((System.nanoTime() - inizio) / 1E9) + " s");
                        }
                    } else if (input2.equals("7")) {
                        System.out.println("Insert two numbers...");
                        num1 = input();
                        num2 = input();
                        BugInteger a = new BugInteger(num1);
                        BugInteger b = new BugInteger(num2);
                        inizio = System.nanoTime();
                        if (a.max(b) == a) {
                            System.out.println(a + " > " + b);
                        } else if (a.max(b) == b) {
                            System.out.println(b + " > " + a);
                        } else {
                            System.out.println(a + " = " + b);
                        }
                        if (time) {
                            System.out.println("Time = " + ((System.nanoTime() - inizio) / 1E9) + " s");
                        }
                    } else if (input2.equals("8")) {
                        System.out.println("Insert two numbers...");
                        num1 = input();
                        num2 = input();
                        BugInteger a = new BugInteger(num1);
                        BugInteger b = new BugInteger(num2);
                        inizio = System.nanoTime();
                        if (a.min(b) == a) {
                            System.out.println(a + " < " + b);
                        } else if (a.min(b) == b) {
                            System.out.println(b + " < " + a);
                        } else {
                            System.out.println(a + " = " + b);
                        }
                        if (time) {
                            System.out.println("Time = " + ((System.nanoTime() - inizio) / 1E9) + " s");
                        }
                    } else if (input2.equals("9")) {
                        System.out.println("Insert two numbers...");
                        num1 = input();
                        num2 = input();
                        BugInteger a = new BugInteger(num1);
                        BugInteger b = new BugInteger(num2);
                        inizio = System.nanoTime();
                        System.out.println(a + " x " + b + " = " + a.multiply(b));
                        if (time) {
                            System.out.println("Time = " + ((System.nanoTime() - inizio) / 1E9) + " s");
                        }
                    } else if (input2.equals("10")) {
                        System.out.println("Insert two numbers...");
                        num1 = input();
                        num2 = input();
                        BugInteger a = new BugInteger(num1);
                        BugInteger b = new BugInteger(num2);
                        inizio = System.nanoTime();
                        long exp = (long) b.doubleValue();
                        System.out.println(a + " ^ " + b + " = " + a.pow(exp));
                        if (time) {
                            System.out.println("Time = " + ((System.nanoTime() - inizio) / 1E9) + " s");
                        }
                    } else if (input2.equals("11")) {
                        System.out.println("Insert two numbers...");
                        num1 = input();
                        num2 = input();
                        BugInteger a = new BugInteger(num1);
                        BugInteger b = new BugInteger(num2);
                        inizio = System.nanoTime();
                        System.out.println(a + " % " + b + " = " + a.remainder(b));
                        if (time) {
                            System.out.println("Time = " + ((System.nanoTime() - inizio) / 1E9) + " s");
                        }
                    } else if (input2.equals("12")) {
                        System.out.println("Insert two numbers...");
                        num1 = input();
                        num2 = input();
                        BugInteger a = new BugInteger(num1);
                        BugInteger b = new BugInteger(num2);
                        inizio = System.nanoTime();
                        System.out.println(a + " - " + b + " = " + a.subtract(b));
                        if (time) {
                            System.out.println("Time = " + ((System.nanoTime() - inizio) / 1E9) + " s");
                        }
                    } else if (input2.equals("13")) {
                        System.out.println("Insert a number...");
                        num1 = input();
                        BugInteger a = new BugInteger(num1);
                        inizio = System.nanoTime();
                        System.out.println(a.toString());
                        if (time) {
                            System.out.println("Time = " + ((System.nanoTime() - inizio) / 1E9) + " s");
                        }
                    } else if (input2.equals("14")) {
                        System.out.println("Insert a number...");
                        num1 = input();
                        BugInteger a = new BugInteger(num1);
                        inizio = System.nanoTime();
                        long num = (long) a.doubleValue();
                        System.out.println("(long)"+a+" = "+"(BugInteger)"+BugInteger.valueOf(num));
                        if (time) {
                            System.out.println("Time = " + ((System.nanoTime() - inizio) / 1E9) + " s");
                        }
                    } else if (input2.equals("00") || input2.equals("0")) {
                        input2 = "";
                        continue;
                    } else if (input2.equals("v") || input2.equals("V")) {
                        time = !time;
                    } else {
                        System.out.println("******************** INVALID  INSERTION ********************\n"
                                + "============================================================");
                        continue;
                    }
                }
                else if (input.equals("2")) {
                    openJavadoc();
                    continue;
                } else if ("x".equals(input) || "X".equals(input)) {
                    System.exit(0);
                } else {
                    System.out.println("******************** INVALID  INSERTION ********************\n"
                            + "============================================================");
                    continue;
                }
            }
        } catch (CustomizedException ex) {
            System.out.println(ex);
        }
    }
}
