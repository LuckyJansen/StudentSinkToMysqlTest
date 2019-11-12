import org.apache.flink.streaming.api.scala.{StreamExecutionEnvironment, _}

object StudentSinkToMysqlTest {
  def main(args: Array[String]): Unit = {

    //1.创建流执行环境
    val env = StreamExecutionEnvironment.getExecutionEnvironment

    val s1 = new  Student(1, "dahua")
    //2.准备数据
    val dataStream:DataStream[Student] = env.fromElements(
      s1,
      new Student(6, "aa")
    )

    //3.将数据写入到自定义的sink中（这里是mysql）
    dataStream.addSink(new StudentSinkToMysql)

    //4.触发流执行
    env.execute()
  }
}
