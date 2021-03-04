import java.util.*;

public class Test {

    public static void main(String[] args) {

   /*     long time1 = System.currentTimeMillis();
        System.out.println(permute(10));
        long time2 = System.currentTimeMillis();
        System.out.println("time---"+(time2-time1));

        System.out.println(permute(20));
        long time3 = System.currentTimeMillis();
        System.out.println("time---"+(time3-time2));

        System.out.println(permute(40));
        long time4 = System.currentTimeMillis();
        System.out.println("time---"+(time4-time3));

        System.out.println(permute(45));
        long time5 = System.currentTimeMillis();
        System.out.println("time---"+(time5-time4));*/

        List<Object> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);//11111111111111222
        list.add(4);
        ListIterator<Object> iterator = list.listIterator();
        int count = 0;
        while (iterator.hasNext() && count < 2) {
            Object nextElement = iterator.next();
            System.out.println("nextElement:" + nextElement);
            if (iterator.hasPrevious()) {
                System.out.println("Previous:" + iterator.previous());
            }
            System.out.println(count);//1111
            count++;
        }


    }

    //Selection Problem 设有1组N个数，要确定其中第k个最大者  k=N/2
    public static int findMaxK(int[] arr) {
        int k = arr.length / 2;
        for (int i = 1; i <= arr.length - 1; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if (arr[i] > arr[j]) {
                    int m = arr[j];
                    arr[j] = arr[i];
                    arr[i] = m;
                    i--;
                }
            }
        }
        return arr[k];
    }


    //puzzle 字谜游戏 找出水平 垂直 斜线方向上的英文单词
    public static String[] decryptPuzzle(int line, int column) {

        for (int i = 0; i < line; i++) {
            for (int j = 0; j < column; j++) {
                if (i < line - 1 && i > 0 && j < column - 1 && j > 0) {
                    //表示节点为内部节点
                } else {
                    //表示节点为边缘节点
                }

            }

        }
        return null;
    }

    //递归表示数二进制写法中1的个数
    //为奇数时，f(N)=f(N/2)+1
    public static int getBitOne(int number) {

        if (number == 1 || number == 2) {
            return 1;
        }
        if (number % 2 != 0) {
            //奇数
            return getBitOne(number / 2) + 1;
        } else {
            //偶数
            return getBitOne((number + 1) / 2);
        }
    }


    //显示字符串所有的字符排列方式
    public static void permute(String str) {

        //将数组转换为集合
        char[] chars = str.toCharArray();
        StringBuilder builder = new StringBuilder(str.length());

        ArrayList<Character> charList = new ArrayList<>();
        for (int i = 0; i < chars.length; i++) {
            charList.add(chars[i]);
        }
        //便历集合
        for (int i = 0; i < charList.size(); i++) {
            builder.append(charList.get(i));
            for (int j = 0; j < charList.size(); j++) {
                if (builder.toString().contains(charList.get(j).toString())) {
                    break;
                } else {
                    builder.append(charList.get(j));
                }
            }//11111111

        }

    }

    //递归查找
    private static long permute(int n) {
        if (n <= 1) {
            return 1;
        }
        return permute(n - 1) + permute(n - 2);

    }
}
