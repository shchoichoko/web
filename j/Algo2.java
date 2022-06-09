import java.util.Scanner;

public class Algo2 {

  public static void main(String[] args) {
    // 첫 번째 줄에는 세 개의 정수 a, b, R 이 입력됩니다.
    // a, b는 각각 공사 현장의 위치의 x 좌표, y 좌표를, R은 공사 현장의 소음의 크기를 나타냅니다.
    // 두 번째 줄에는 나무 그늘의 수를 나타내는 정수 N이 입력됩니다. 이어지는 N 행에는 각 그늘의 좌표를 나타내는 2 개의 정수 x_i,
    // y_i가 입력됩니다.
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int R = sc.nextInt();
    sc.nextLine();
    int N = sc.nextInt();
    sc.nextLine();
    int[] coordinate = new int[N * 2];
    for (int i = 0; i < N * 2; i++) {
      coordinate[i] = sc.nextInt();
    }
    for (int i = 0; i < N * 2; i = i + 2) {
      double xVal = Math.pow((a - coordinate[i]), 2);
      double yVal = Math.pow((b - coordinate[i + 1]), 2);
      System.out.println(getSilent(xVal, yVal, R));
    }
  }

  public static String getSilent(double xVal, double yVal, int R) {
    String result = "noisy";

    if ((xVal + yVal) >= Math.pow(R, 2)) {
      result = "silent";
    }

    return result;
  }

}
