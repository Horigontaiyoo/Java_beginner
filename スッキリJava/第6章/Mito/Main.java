import comment.Zenhan;
//Mainクラスはパッケージに属していないため、フォルダにまとめる必要はない。

//最初にMainクラスが実行される。Mainクラスのmainメソッドが実行され、それぞれのメソッドを呼び出している。
public class Main{
 public static void main(String[] args) throws Exception{
 Zenhan.doWarusa();
 Zenhan.doTogame();
 //import文によりFQCNの入力を省略することが出来る。ここでimport文を使用しているのはZenhan部分のみ。
 comment.Kouhan.callDeae();
 comment.Kouhan.showMondokoro();

 }

}
