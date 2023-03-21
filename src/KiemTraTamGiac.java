public class KiemTraTamGiac {
    private double a;
    private double b;
    private double c;
    public static boolean checkTamGiac (double a, double b, double c) {
        boolean check = true;
        if ( a + b < c || a + c < b || b + c < a || a == 0 || b == 0 || c== 0){
            check = false;
        }
        return check;
    }
    public static boolean checkVuong(double a, double b, double c){
        boolean check = false;
      if (checkTamGiac(a , b , c)){
          if ( a*a + b*b == c*c || a*a + c*c == b*b || c*c + b*b == a*a){
              check = true;
          }
      }
        return check;
    }
    public static boolean checkCan(double a, double b, double c){
        boolean check = false;
        if (checkTamGiac(a,b,c)){
            if ( a == b || a == c || b == c){
                check = true;
            }
        }
        return check;
    }
    public static boolean checkDeu( double a, double b, double c){
        boolean check = false;
        if (checkTamGiac(a,b,c)){
            if (a == b && b == c){
                check = true;
            }
        }
        return check;
    }
}
