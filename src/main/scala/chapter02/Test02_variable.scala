package chapter02

object Test02_variable {
  def main(args: Array[String]): Unit = {
    // 声明一个变量或常量的通用方法
    var a1: Int = 20
    val b1: Int = 30

    // 声明变量时，类型可以省略，编译器会自动推导，即类型推导
    var a2 = 20
    val b2 = 30

    // 类型确定后，不能修改，说明Scala是强数据类型语言
//    a2 = "hello"

    // 声明变量时，必须有初始值
//    var a3: Int

    // var修饰变量、val修改常量，不能修改
    a1 = 15
//    b1 = 25
  }
}
