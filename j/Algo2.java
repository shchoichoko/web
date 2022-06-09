import java.util.Scanner;

public class Algo2 {

  public static void main(String[] args) {
    // 첫 번째 줄에는 세 개의 정수 a, b, R 이 입력됩니다.
    // a, b는 각각 공사 현장의 위치의 x 좌표, y 좌표를, R은 공사 현장의 소음의 크기를 나타냅니다.
    // 두 번째 줄에는 나무 그늘의 수를 나타내는 정수 N이 입력됩니다. 이어지는 N 행에는 각 그늘의 좌표를 나타내는 2 개의 정수 x_i,
    // y_i가 입력됩니다.
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt(); // 공사 현장 x좌표
    int b = sc.nextInt(); // 공사 현장 y좌표
    int R = sc.nextInt(); // 공사 현장 소음 거리
    sc.nextLine();
    int N = sc.nextInt(); // 나무 그늘의 수
    sc.nextLine();
    int[] coordinate = new int[N * 2]; // 좌표를 넣기 위한 배열 생성
    for (int i = 0; i < N * 2; i++) {
      coordinate[i] = sc.nextInt(); // 좌표를 배열에 넣어준다.
    }
    for (int i = 0; i < N * 2; i = i + 2) {
      double xVal = Math.pow((a - coordinate[i]), 2); // x좌표 거리
      double yVal = Math.pow((b - coordinate[i + 1]), 2); // y 좌표 거리
      System.out.println(getSilent(xVal, yVal, R)); // 소음 거리 판별해서 출력하기
    }
  }

  public static String getSilent(double xVal, double yVal, int R) {
    String result = "Noisy!!";

    if ((xVal + yVal) >= Math.pow(R, 2)) {
      result = "Silent!!";
    }

    return result;
  }

}
