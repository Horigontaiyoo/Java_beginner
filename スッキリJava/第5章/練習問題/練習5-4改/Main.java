public class Main{

 public static void main(String[] args){
//変数を用意して、その中にメソッドの呼び出したものを入れようとしている。
  calcTriangleArea(10.0,5.0);

//上記と同じ
  calcCircleArea(5.0);


 }
 //戻り値を使用したいときは、戻る値の型　メソッド名といった書き方になる。
 public static void calcTriangleArea(double bottom,double height){
//ここではmainから取ってきた値を使って計算している
  double area =(bottom*height)/2;
  //計算したものを変数に入れてmainに戻す動作をしている。
  System.out.println("三角形の面積:"+area+"㎡");
}

 public static void calcCircleArea(double radius){
  double area = radius*radius*3.14;
  System.out.println("円の面積:"+area+"㎡");
}

}
