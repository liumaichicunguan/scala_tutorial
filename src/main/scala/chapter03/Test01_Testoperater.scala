package chapter03

object Test01_Testoperater {

  def main(args: Array[String]): Unit = {
    // 整数相除，得到的结果是整数
    val result = 10 / 3
    println(result)

    // 可将其中一个值变为浮点类型
    val result2: Double = 10.0 / 3
    println(result2)

    // 保留小数
    println(result2.formatted("%.2f"))

    // 取模
    val result3 = 10 % 3
    println(result3)

    // 比较运算符
    val s1: String = "hello"
    val s2: String = new String("hello")
    // 以下两个方式都是值比较
    println(s1 == s2)
    println(s1.equals(s2))
    // 保留原先引用地址比较，使用eq()方法
    println(s1.eq(s2))

  }
}
