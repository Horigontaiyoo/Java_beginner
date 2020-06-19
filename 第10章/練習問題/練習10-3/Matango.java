public class Matango{
  int = 50;
  //一つの文字が入る変数suffixを定義。
  char suffix;
  //コンストラクタ定義。引数受け取る。
  public Matango(char suffix){
   //自分のクラスにあるsuffixを指定。
   this.suffix = suffix;
  }
  public void attack(Hero h){
    System.out.println("キノコ"+this.suffix+"の攻撃");
    System.out.println("10のダメージ");
    //HeroのHPを10減らす。
    h.hp -= 10;
  }
}
