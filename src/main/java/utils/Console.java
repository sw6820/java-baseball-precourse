package utils;

public enum Console {
    INPUT_NUMBER("숫자를 입력해주세요 : ");

    public final String console;

    Console(String console) {
        this.console = console;
    }

    public static void consolePrint(Console msg) {
        System.out.println(msg);
    }
}
