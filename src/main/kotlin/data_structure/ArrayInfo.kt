package data_structure

import java.util.*
import kotlin.Array

class ArrayInfo {

    fun arrayInitial(){

        // inline of 메서드 사용 방식
        val array: Array<Int> = arrayOf(1,2,3,4,5,6) //Int 배열
        val string: Array<String> = arrayOf("apple","banana","cherry") //String 배열
        val mixed: Array<*> = arrayOf("apple",1,"banana") // 전부 포함
        val intArray: IntArray = intArrayOf(1,2,3,4,5) // 원시형 배열
        val booleanArray: BooleanArray = booleanArrayOf(true,true,true)

        /*
            Array<T> 와 intArray 의 차이점

            - Array<T> 는 Boxing 형태 (객체)
            - IntArray 는 원시형

            따라서 메모리 사용 측면과 접근 속도 면에서 IntArray 가 좀더 효율적

        */

        //크기와 기본값 지정 방식
        val arrayDefaultOne = IntArray(5){1}
        println("1로 초기화 된 Array ${arrayDefaultOne.contentToString()}") // Arrays.toString()

        val arrayDefaultZero = IntArray(5){0}
        println("0으로 초기화 된 Array ${arrayDefaultZero.contentToString()}") //Arrays.toString()

        //람다식 사용
        val arrayLambda1 = IntArray(5){it}
        println("람다 Array 1 ${arrayLambda1.contentToString()}")

        val arrayLambda2 = IntArray(5){it + 2}
        println("람다 Array 2 ${arrayLambda2.contentToString()}")

        val arrayLambda3 = IntArray(5){it * it}
        println("람다 Array 3 ${arrayLambda3.contentToString()}")

        val arrayLambdaString = Array(5){""} // 증감식은 int, double, float 등등 숫자 자료형에만 가능

        val arrayLambda4 = arrayLambda1.sortedArrayDescending()
        println("람다 Array 4 ${arrayLambda4.contentToString()}")

        val array2D: Array<Array<Int>> = Array(5){Array(5){10}}

        println(array2D[0][0])

    }

}


fun main() {

    val arrayInfo = ArrayInfo()

    arrayInfo.arrayInitial()
}