//プログラミングを便利にする様々なクラス群をインポート。
import java.util;

public class Cleric{
 String name;
 int hp = 50;
 final int max_hp = 50;
 int mp = 10;
 final int max_mp = 10;

 public void selfAid(){
   System.out.println(this.name+"はセルフエイドを唱えた！");
   //thisをつけ忘れないように！
   this.hp = this.max_hp;
   //5を代入するときマイナスにしてください。
   this.mp -=5;
   System.out.println(this.name+"はHPが最大まで回復した！");
 }
//ここでは仮引数を記述
 public void pray(int sec){
   System.out.println(this.name+"は"+sec+"秒間天に祈った！");
   //0~2のランダムな数字を生成。そこに変数secを足す。
   int recover = new Randon().nextInt(3) +sec;
   //実際の回復寮を計算。
   //Math.minは渡された引数の値を比較して、小さいほうを選ぶ関数。
   //this.max_mp - this.mp⇒mp回復可能量。
   //recoverの方が値が大きければ、回復可能量をオーバーしてしまう。
   int recoverActual = Math.min(this.max_mp - this.mp,recover);
   this.mp += recoverActual;
   System.out.println("MPが"+recoverActual+"回復した！");
   //this.mpに値を戻す。
   return recoverActual;
 }

}
