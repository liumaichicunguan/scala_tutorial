package chapter02

object Test03_identifer {
  def main(args: Array[String]): Unit = {
    // 标识符以字母或下划线开头，后面接数字、字母和下划线
    var hello = ""
    val Hello = ""
    var _hello = ""
    // 以下都是不合法的
//    var 1abc = ""
//    var h-b = ""

    // 可以使用操作符，但是后面必须全都是操作符
    var +-*/ = "hello"
    println(+-*/)

    // 可以是关键字，但是必须用``包起来
//    var if = ""
    var `if` = "if"
    println(`if`)
  }

}
