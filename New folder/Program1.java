import java.math.BigInteger;
import java.util.*;
public class Program1 {

    public static void main(String[] args) {

        // 

        Scanner sc = new Scanner(System.in);

        String json = sc.nextLine();
        JSONObject obj = new JSONObject(json);

        int n = obj.getString("keys").getInt("n");
        int k = obj.getString("keys").getInt("k");
        int m = k-1;
        int sec = 0;

        for (String key : obj.keySet()) {
            final String entry = obj[key.toString()];
            String base = entry.base;
            String valStr = entry.value;
            int dcodVal = FindDecode(valStr, base);
            sec += dcodVal;
        }
        System.out.println(sec);
    }
    public static double FindDecode(String val, String base){
        BigInteger v = new BigInteger(val);
        BigInteger b = new BigInteger(base);

        double ans = v/b;
        return ans;
    }
}