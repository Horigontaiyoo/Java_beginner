public class Main{
  public static void main(String[] args) {
    String address = "uso800@gmail.com";
    String text = "今度飲みに行きませんか";
    //メソッドの呼び出し
    email(address,text);
  }
  //メソッド作成。自作関数。
  public static void email(String address,String text){
   System.out.println(address+"に、以下のメールを送信しました。");
   System.out.println("件名:無題");
   System.out.println("本文:"+text);
   //mainメソッドでしか出力はされない。つまり呼び出されなければ出力はされない。
  }

//オーバーロード。同じ名前のメソッドでも区別できれば大丈夫。
  public static void email(String title,String address,String text){
   System.out.println(address+"に、以下のメールを送信しました。");
   System.out.println("件名:"+title);
   System.out.println("本文:"+text);
  }
//同じメソッド名だが、mainメソッドは引数の数が同じである上のメソッドを取得。


}
