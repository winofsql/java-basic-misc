import java.util.*;

public class Third {

    public int cnt;

    public Third() {
        super();
    }

    public void javaTest_1() {
        print("-----------------------\n整数 <=> 文字列");

        String su = "123";

        int result = Integer.parseInt(su);
        result++;
        result += 2;
        result = result + 2;
        print(result);

        // 整数を文字列に変換
        String text = String.format("%d", result);
        print(text);

        // 簡易的な方法
        text = result + "";
        print(text);

    }
    public void javaTest_2() {
        print("-----------------------\n配列");

        // 5つぶんのメモリを確保しました
        int[] data = new int[5];
        data[0] = 1;
        data[4] = 5;
        print( data.length );
        
        // 初期化
        int[] data2 = { 10, 11, 12 };
        // 通常 for
        for (int i = 0; i < data2.length; i++) {
            print( data2[i] );
        }
        // 拡張 for
        for (int i : data2) {
            print( i );
        }

    }
    public void javaTest_3() {
        print("-----------------------\nList を使う");

        List<String> list = new ArrayList<String>();
        list.add("Java");
        list.add("Scala");
        list.add("Ruby");
        String str = list.get(0);
        print( str );

        for (String string : list) {
            print( string );
        }

        print("-----------------------\nforEach を使う");
        
        cnt = 0;
        // forEach メソッド
        list.forEach( (item) ->
            { 
                cnt++;
                print(cnt); 
                System.out.println(item); 
            }
        );

    }
    
    private void print( String str ) {
        System.out.println(str);
    }
    private void print( int num ) {
        System.out.println(num);
    }
}
