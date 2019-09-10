
public class Main {
    public static void main(String[] args) {
        String value = dealString(5, "xun fei!");
        System.out.println(value);
    }

    private static String dealString(int index, String str) {
        // 取数组行标
        double a = (double) str.length();
        double c = a / (double) index;
        double length = Math.ceil(c);
        // 转char[]
        char[] chars = str.toCharArray();
        // 遍历char[] 放入新数组
        Object[][] obj = new Object[(int) length][index];

        for (int i = 0; i < chars.length; i++) {
            obj[(int) Math.floor((double) i / index)][i % index] = chars[i];
        }
        // 取列上的值
        String targetChar = "";
        String result = "";
        for (int i = 0; i < obj.length; i++) {
            for (int j = 0; j < obj[i].length; j++) {
                if ((index - 1) == j) {
                    if (obj[i][j] != null && !"".equals(obj[i][j])) {
                        targetChar += obj[i][j] + ",";
                    }
                } else {
                    if (obj[i][j] != null && !" ".equals(obj[i][j].toString())) {
                        result += obj[i][j];
                    }
                }
            }
        }
        targetChar = targetChar.substring(0,targetChar.length() - 1);
        return result + " " + targetChar;
    }


}


