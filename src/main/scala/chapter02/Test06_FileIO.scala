package chapter02

import java.io.{File, PrintWriter, Writer}

import scala.io.Source

object Test06_FileIO {
  def main(args: Array[String]): Unit = {
    // 1.通过Source读取文件
    Source.fromFile("src/main/resources/test.txt").foreach(print)

    // 2.写入数据到文件，Scala没有专门的方法写入，可以使用Java的方式
    val writer = new PrintWriter(new File("src/main/resources/output.txt"))
    writer.write("hello scala from java")
    writer.close()
  }
}
