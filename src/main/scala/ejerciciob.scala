import scala.io.Source

class ejercicioB {

}

object ejercicioB extends App {
  def countWords(file: String): Array[(String, Int)] = Source.fromFile(this.song)
    .getLines.flatMap(line => line.split(" "))
    .filter(word => word.trim.length > 0 && word != " ") // quita vacios
    .toList.groupBy(identity) // agrupa por palabra per-se
    .mapValues(_.size) // les saca el conteo a los grupos

  def mostRepeated(): String = maxedWordCounted()._1

  def mostRepeatedWordCounted(): (String, Int) = countWords().maxBy(_._2)
}
