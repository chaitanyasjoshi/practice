public class App {
  public static void main(String[] args) throws Exception {
    System.out.println("Max number is " + calMax(5, 9, 3));
  }
    
  static int calMax(int x, int y, int z) {
    return x > y ? (x > z ? x : z) : (y > z ? y : z);
  }

  static boolean checkAlpha(char alph) {
    return alph == 'a' || alph == 'e' || alph == 'i' || alph == 'o' || alph == 'u';
  }

  static double calInterest(int amt) {
    return amt <= 1000 ? (amt * (amt * 0.04)) : amt <= 5000 ? (amt * (amt * 0.045)) : (amt * (amt * 0.05));
  }

  static double calTax(int gp) {
    return gp <= 240 ? 0 : gp <= 480 ? (gp * 0.15) : (gp * 0.28);
  }

  static boolean isPrimeNumber(int num) {
    for (int i = 2; i < num; i++) {
      if (num / i == 0) {
        return false;
      }
    }
    return true;
  }

  static float calculateProfit(int numAttendees) {
    return (float) ((numAttendees * 5) - (20 + (numAttendees * 0.50)));
  }

  
}
