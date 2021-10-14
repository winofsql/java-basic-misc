public class Main {

    public static void main(String[] args) {
        print("日本語");
        print("プレースホルダ");

        String 文字列 = "こんにちは";
        print(文字列);

        var num = 3.14;
        print(((Object) num).getClass().getSimpleName());

        var yen = 1;
        print(((Object) yen).getClass().getSimpleName());

        var name = "日本語";
        print(name.getClass().getSimpleName());

        String str = "Good Morning Morning Everyone.";
        print(str.replace("Morning", "Bye"));

        // 置換
        StringBuilder sb = new StringBuilder();
        sb.append("bye");
        print( sb.toString() );
        print(str.replace("Morning", sb));

        // テキストブロックの置き換え
        String html = """
        <HTML>
          <BODY>
            <H1>$01</H1>
          </BODY>
        </HTML>""";
        html = html.replace( "$01", str );
        print(html);

    }

    private static void print(String out) {
        System.out.println(out);
    }

}