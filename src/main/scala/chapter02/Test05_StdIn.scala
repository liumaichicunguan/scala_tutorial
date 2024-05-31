package chapter02

import scala.io.StdIn

object Test05_StdIn {
  def main(args: Array[String]): Unit = {
    println("请输入您的姓名：")
    val name: String = StdIn.readLine()
    println("请输入您的年龄：")
    val age: Int = StdIn.readInt()
    println(s"欢迎${age}的${name}注册用户")
  }
}
