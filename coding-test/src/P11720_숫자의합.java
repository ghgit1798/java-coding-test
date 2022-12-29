import java.util.Scanner;

public class P11720_숫자의합 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        // 입력값을 String형 변수 sNum에 저장한 후 char[]형 변수로 변환하기
        String sNum = sc.next();
        char[] cNum = sNum.toCharArray();
        int sum = 0;
        for(int i=0; i<cNum.length; i++) {
            sum += cNum[i]-'0';     // cNum[i]를 정수형으로 변환하면서 sum에 더하여 누적하기
        }
        System.out.print(sum);
    }
}

/*
String sNum = "1234";
int i1 = Integer.parseInt(sNum);
int i2 = Integer.valueOf(sNum);
double d1 = Double.parseDouble(sNum);
double d2 = Double.valueOf(sNum);
float f1 = Float.parseFloat(sNum);
float f2 = Float.valueOf(sNum);
long l1 = Long.parseLong(sNum);
long l2 = Long.valueOf(sNum);
short s1 = Short.parseShort(sNum);
short s2 = Short.valueOf(sNum);

int i = 1234;
String i1 = String.valueOf(i);
String i2 = Integer.toString(i);
double d = 1.23;
String d1 = String.valueOf(d);
String d2 = Double.toString(d);
float f = (float) 1.23;
String f1 = String.valueOf(f);
String f2 = Float.toString(f);
long l = 1234;
String l1 = String.valueOf(l);
String l2 = Long.toString(l);
short s = 1234;
String s1 = String.valueOf(s);
String s2 = Short.toString(s);
 */