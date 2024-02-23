fun main(){
   nameA("Casey")
    remainder(50 , 2)
    sumOfIntegers(1,2,3,4)
    factsAboutCasey("She is resilent ")
    factsAboutCasey("She is assertive ")
}
fun nameA(name:String){
    println("Hello ${name}")
}

fun remainder(a: Int, b:Int): Int {
    var outcome  = (b % a )
    println("outcome = $outcome")
    return outcome
}
fun  sumOfIntegers(num1:Int, num2:Int,num3:Int, num4:Int):Int{
    var sum1 = num1 + num2
    var sum2 = num3 + num4
    var result = (sum1 + sum2)
    println(result)
    return result
}
fun factsAboutCasey(facts:String){
  println(facts)
}
