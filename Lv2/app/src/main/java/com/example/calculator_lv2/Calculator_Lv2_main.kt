package com.example.calculator_lv2

fun main(){

    println("첫번째 숫자를 입력하시오")
    val num1:Int = readLine()!!.toInt()

    println("두번째 숫자를 입력하시오")
    val num2:Int = readLine()!!.toInt()

    println("연산기호를 입력하시오(+,-,*,/,%)")
    val operator:String = readLine()!!.toString()

    //println("${num1},${num2},${operator}")

    val calculator = Calculator(num1, num2, operator)
    calculator.result()
}
class Calculator(private val num1:Int, private val num2:Int, private val operator:String){

    fun result(){
        when(operator){
            "+" -> {
                val sum:Int = num1 + num2
                println("결과는 ${sum}입니다.")
            }
            "-" -> {
                val sum:Int = num1 - num2
                println("결과는 ${sum}입니다.")
            }
            "*" -> {
                val sum:Int = num1 * num2
                println("결과는 ${sum}입니다.")
            }
            "/" -> {
                if(num2!=0) {
                    val sum: Int = num1 / num2
                    println("결과는 ${sum}입니다.")
                }
                else{
                    println("0으로 나눌 수 없습니다.")
                }
            }
            "%" -> {
                if(num2!=0) {
                    val sum: Int = num1 % num2
                    println("결과는 ${sum}입니다.")
                }
                else{
                    println("0으로 나눌 수 없습니다.")
                }
            }
            else->{
                println("지원하지 않는 연산자입니다.")
            }
        }
    }



}