package chapter02

object Test04_String {
  def main(args: Array[String]): Unit = {
    // 1.字符串，通过+号拼接
    var name = "alice"
    val age = 18
    println(age + "岁的" + name + "正在大杀特杀")
    // * 将字符串复制多次拼接
    println(name * 3)

    // 2.prindf用法：字符串，通过%传值
    printf("%d岁的%s正在大杀特杀", age, name)
    println()

    // 3. 字符串模板（插值字符串），通过${}获取变量值  模板字符串 s""
    println(s"${age}岁的${name}正在大杀特杀")

    // 数值类型默认是Double，可通过在数值后面加f转为Float
//    val num: Float = 2.3456f
    val num: Double = 345.3456
    // f"" 格式化模板字符串
    println(f"The num is ${num}%2.2f")    // 2.2f  f标识结果是一个浮点数值，第一个2是整数位，第二个是保留几位小数
    println(raw"The num is ${num}%2.2f")  // raw""  只填充变量，其他计算字符原样输出

    // 三引号标识字符串，保持多行字符串的原格式输出
    val sql = s"""
      |select *
      |from sutdent
      |where name = ${name}
      |   and age = ${age}
      |""".stripMargin
    println(sql)
  }
}
